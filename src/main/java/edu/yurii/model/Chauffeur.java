package edu.yurii.model;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  Chauffeur
  @version  1.0.0 
  @since 26.07.21 - 17.24
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chauffeur {
    @Id

    private String id;
    private String surname;
    private String firstname;
    private String patronymic;
    private double experience;

    public Chauffeur(String surname, String firstname, String patronymic, double experience) {
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        if ("@null".equals(surname)) {
            return "";
        } else
        return surname;
    }
//"@null".equals(surname)
    public void setSurname(String surname) {
        if ("@null".equals(surname)) {
            this.surname = getSurname();
        } else
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chauffeur chauffeur = (Chauffeur) o;
        return getId().equals(chauffeur.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
