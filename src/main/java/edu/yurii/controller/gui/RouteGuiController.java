package edu.yurii.controller.gui;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteGuiController
  @version  1.0.0 
  @since 26.07.21 - 16.23
*/

import edu.yurii.form.RouteCreateForm;
import edu.yurii.form.RouteUpdateForm;
import edu.yurii.model.Route;
import edu.yurii.service.route.impls.RouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/gui/route")
public class RouteGuiController {

    @Autowired
    RouteServiceImpl routeService;

    @RequestMapping("/all")
    public String getAll(Model model) {
        List<Route> routeList = routeService.getAll();
        model.addAttribute("routes", routeList);

        return "routes";
    }

    @RequestMapping("/{id}")
    public Route get(@PathVariable ("id") String id) {

        return routeService.get(id);
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable("id") String id) {
        routeService.delete(id);

        return "redirect:/gui/route/all";
    }

    @GetMapping("/create")
    public String create(Model model) {
        RouteCreateForm routeToCreate = new RouteCreateForm();
        model.addAttribute("form", routeToCreate);

        return "route-create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("form") RouteCreateForm form) {
        Route route = new Route();
        route.setName(form.getName());
        route.setDistance(form.getDistance());
        route.setDaysInRoute(form.getDaysInRoute());
        route.setPayment(form.getPayment());
        routeService.create(route);

        return "redirect:/gui/route/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") String id) {
        Route route = routeService.get(id);
        RouteUpdateForm routeToUpdate = new RouteUpdateForm();
        routeToUpdate.setId(route.getId());
        routeToUpdate.setName(route.getName());
        routeToUpdate.setDistance(route.getDistance());
        routeToUpdate.setDaysInRoute(route.getDaysInRoute());
        routeToUpdate.setPayment(route.getPayment());
        model.addAttribute("form", routeToUpdate);

        return "route-update";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("form") RouteUpdateForm form) {
        Route route = new Route();
        route.setId(form.getId());
        route.setName(form.getName());
        route.setDistance(form.getDistance());
        route.setDaysInRoute(form.getDaysInRoute());
        route.setPayment(form.getPayment());
        routeService.update(route);

        return "redirect:/gui/route/all";
    }
}
