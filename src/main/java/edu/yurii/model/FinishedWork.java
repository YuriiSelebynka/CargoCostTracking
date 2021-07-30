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
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWork {
    //Код маршруту, Код водія, Дата відправлення, Дата повернення, Премія
    @Id
    private String id;
    private Route route;
    private Chauffeur chauffeur;
    //@Value("${coChauffeur:#{null}}")

    @Nullable
    private Chauffeur coChauffeur;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private double fee;

    public Chauffeur emptyChauffeur = new Chauffeur(null, "null"
            , "null", "null", 0);

    public FinishedWork(Route route, Chauffeur chauffeur, Chauffeur coChauffeur, double fee) {
        this.route = route;
        this.chauffeur = chauffeur;
        this.coChauffeur = coChauffeur;
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

    //@DefaultValue("${finishedWork.coChauffeur:@null}")
    @Nullable
    public void setCoChauffeur(Chauffeur coChauffeur, Object o) {
        //if ("@null".equals(coChauffeur)) {
        if (coChauffeur == null) {
            this.coChauffeur = null;
        } else
            this.coChauffeur = coChauffeur;
    }

//    public LocalDate getDepartureDate() {
//        return departureDate;
//    }
//
//    public void setDepartureDate(LocalDate departureDate) {
//        this.departureDate = departureDate;
//    }
//
//    public LocalDate getReturnDate() {
//        return returnDate;
//    }
//
//    public void setReturnDate(LocalDate returnDate) {
//        this.returnDate = returnDate;
//    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        //this.fee = fee;
        if (coChauffeur!=null) {
            this.fee = (chauffeur.getExperience() * 0.1 + 1) * (coChauffeur.getExperience() * 0.1 + 1) * route.getPayment();
        }
        else{
            this.fee = (chauffeur.getExperience() * 0.1 + 1) * route.getPayment();
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

