package edu.yurii.model;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWork
  @version  1.0.0 
  @since 26.07.21 - 17.29
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWork {
    @Id
    private String id;
    private Route route;
    private Chauffeur chauffeur;
    @Nullable
    private Chauffeur coChauffeur;
    private String inputDepartureDate;
    private LocalDateTime departureDate;
    private String inputReturnDate;
    private LocalDateTime returnDate;
    private double fee;

    public Chauffeur emptyChauffeur = new Chauffeur(null, "null"
            , "null", "null", 0);

    public FinishedWork(Route route, Chauffeur chauffeur, Chauffeur coChauffeur
            , String inputDepartureDate, String inputReturnDate, double fee) {
        this.route = route;
        this.chauffeur = chauffeur;
        this.coChauffeur = coChauffeur;
        this.inputDepartureDate = inputDepartureDate;
        this.inputReturnDate = inputReturnDate;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur() {
        this.chauffeur = chauffeur;
    }

    public Chauffeur getCoChauffeur() {
        if (coChauffeur == null) {
            return emptyChauffeur;
        } else
        return coChauffeur;
    }

    @Nullable
    public void setCoChauffeur(Chauffeur coChauffeur, Object o) {
        if (coChauffeur == null) {
            this.coChauffeur = null;
        } else
            this.coChauffeur = coChauffeur;
    }

    public String getInputDepartureDate() {
        return inputDepartureDate;
    }

    public void setInputDepartureDate(String inputDepartureDate) {
        this.inputDepartureDate = inputDepartureDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(@DateTimeFormat(
            pattern="yyyy-MM-dd HH:mm:ss") LocalDateTime departureDate) {
        String str = getInputDepartureDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd HH:mm:ss");
        this.departureDate = LocalDateTime.parse(str, formatter);
    }

    public String getInputReturnDate() {
        return inputReturnDate;
    }

    public void setInputReturnDate(String inputReturnDate) {
        this.inputReturnDate = inputReturnDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(@DateTimeFormat(
            pattern="yyyy-MM-dd HH:mm:ss") LocalDateTime returnDate) {
        String str = getInputReturnDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd HH:mm:ss");
        this.returnDate = LocalDateTime.parse(str, formatter);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if (coChauffeur!=null) {
            this.fee = (chauffeur.getExperience() * 0.1 + 1) * (coChauffeur
                    .getExperience() * 0.1 + 1) * route.getPayment();
        }
        else{
            this.fee = (chauffeur.getExperience() * 0.1 + 1) * route
                    .getPayment();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinishedWork that = (FinishedWork) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

