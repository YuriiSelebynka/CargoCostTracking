package edu.yurii.model;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  Route
  @version  1.0.0 
  @since 26.07.21 - 14.38
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    @Id
    private String id;
    private String name;
    private double distance;
    private double daysInRoute;
    private double payment;

    public Route(String name, double distance
            , double daysInRoute, double payment) {
        this.name = name;
        this.distance = distance;
        this.daysInRoute = daysInRoute;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDaysInRoute() {
        return daysInRoute;
    }

    public void setDaysInRoute(double daysInRoute) {
        this.daysInRoute = daysInRoute;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return getId().equals(route.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
