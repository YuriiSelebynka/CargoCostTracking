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

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
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
