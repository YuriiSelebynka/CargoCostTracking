package edu.yurii.form;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteCreateForm
  @version  1.0.0 
  @since 26.07.21 - 16.34
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteCreateForm {
    private String name;
    private double distance;
    private double daysInRoute;
    private double payment;

//    public RouteCreateForm() {
//    }
}
