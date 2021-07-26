package edu.yurii.controller.rest;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteRestController
  @version  1.0.0 
  @since 26.07.21 - 15.11
*/

import edu.yurii.model.Route;
import edu.yurii.service.route.impls.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route")
public class RouteRestController {

    @Autowired
    RouteServiceImpl routeService;

    // CRUD - create, read, update, delete; get all

    @RequestMapping("/all")
    public List<Route> getAll() {
        return routeService.getAll();
    }

    @RequestMapping("/{id}")
    public Route get(@PathVariable("id") String id) {
        return routeService.get(id);
    }

    @RequestMapping("/delete/{id}")
    public Route delete(@PathVariable("id") String id) {
        return routeService.delete(id);
    }

    @PostMapping("/create")
    public Route create(@RequestBody Route route) {
        return routeService.create(route);
    }

    @PostMapping("/update")
    public Route update(@RequestBody Route route) {
        return routeService.update(route);
    }
}
