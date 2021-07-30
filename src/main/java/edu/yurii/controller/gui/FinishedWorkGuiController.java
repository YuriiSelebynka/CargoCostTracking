package edu.yurii.controller.gui;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkGuiController
  @version  1.0.0 
  @since 27.07.21 - 17.02
*/

import edu.yurii.form.FinishedWorkCreateForm;
import edu.yurii.form.FinishedWorkUpdateForm;
import edu.yurii.model.FinishedWork;
import edu.yurii.service.finishedwork.impls.FinishedWorkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/gui/finishedwork")
public class FinishedWorkGuiController {

    @Autowired
    FinishedWorkServiceImpl finishedWorkService;

    @RequestMapping("/all")
    public String getAll(Model model) {
        List<FinishedWork> finishedWorks = finishedWorkService.getAll();
        model.addAttribute("finishedworks", finishedWorks);
        return "finishedworks";
    }

    //===========================================================
    @RequestMapping("/{id}")
    public FinishedWork get(@PathVariable("id") String id) {
        return finishedWorkService.get(id);
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable("id") String id) {
//        List<Route> routeList = routeService.getAll();
//        model.addAttribute("routes", routeList);
        finishedWorkService.delete(id);
        return "redirect:/gui/finishedwork/all";
    }

    @GetMapping("/create")
    public String create(Model model) {
        FinishedWorkCreateForm finishedWorkToCreate = new FinishedWorkCreateForm();
        model.addAttribute("form", finishedWorkToCreate);
        return "finishedwork-create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("form") FinishedWorkCreateForm form) {
        FinishedWork finishedWork = new FinishedWork();
        finishedWork.setRoute(form.getRoute());
        finishedWork.setChauffeur(form.getChauffeur());
        finishedWork.setCoChauffeur(form.getCoChauffeur(), null);
//        finishedWork.setDepartureDate(form.getDepartureDate());
//        finishedWork.setReturnDate(form.getReturnDate());

        finishedWork.setInputDepartureDate(form.getInputDepartureDate());
        finishedWork.setInputReturnDate(form.getInputReturnDate());
        finishedWork.setFee(finishedWork.getFee());
        finishedWorkService.create(finishedWork);

        return "redirect:/gui/finishedwork/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") String id) {
        FinishedWork finishedWork = finishedWorkService.get(id);
        FinishedWorkUpdateForm finishedWorkToUpdate = new FinishedWorkUpdateForm();

        finishedWorkToUpdate.setId(finishedWork.getId());
        finishedWorkToUpdate.setRoute(finishedWork.getRoute());
        finishedWorkToUpdate.setChauffeur(finishedWork.getChauffeur());
        finishedWorkToUpdate.setCoChauffeur(finishedWork.getCoChauffeur());

//        finishedWorkToUpdate.setDepartureDate(finishedWork.getDepartureDate());
//        finishedWorkToUpdate.setReturnDate(finishedWork.getReturnDate());

        finishedWorkToUpdate.setInputDepartureDate(finishedWork.getInputDepartureDate());
        finishedWorkToUpdate.setInputReturnDate(finishedWork.getInputReturnDate());

        finishedWorkToUpdate.setFee(finishedWork.getFee());

        model.addAttribute("form", finishedWorkToUpdate);
        return "finishedwork-update";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("form") FinishedWorkUpdateForm form) {
        FinishedWork finishedWork = new FinishedWork();
        finishedWork.setId(form.getId());
        finishedWork.setRoute(form.getRoute());
        finishedWork.setChauffeur(form.getChauffeur());
        finishedWork.setCoChauffeur(form.getCoChauffeur(), null);
        finishedWork.setInputDepartureDate(form.getInputDepartureDate());
        finishedWork.setInputReturnDate(form.getInputReturnDate());
        finishedWork.setFee(form.getFee());
        finishedWorkService.update(finishedWork);

        return "redirect:/gui/finishedwork/all";
    }
}
