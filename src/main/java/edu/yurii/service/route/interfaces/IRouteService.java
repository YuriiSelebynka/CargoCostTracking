package edu.yurii.service.route.interfaces;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  IRouteService
  @version  1.0.0 
  @since 26.07.21 - 14.43
*/

import edu.yurii.model.Route;

import java.util.List;

public interface IRouteService {

    Route create(Route route);
    Route get(String id);
    Route update(Route route);
    Route delete(String  id);
    List<Route> getAll();
}
