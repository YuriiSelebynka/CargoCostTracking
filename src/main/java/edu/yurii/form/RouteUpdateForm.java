package edu.yurii.form;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteUpdateForm
  @version  1.0.0 
  @since 26.07.21 - 16.38
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteUpdateForm {
    private String id;
    private String name;
    private double distance;
    private double daysInRoute;
    private double payment;
}
