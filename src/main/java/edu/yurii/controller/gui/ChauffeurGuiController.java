package edu.yurii.controller.gui;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  ChauffeurGuiController
  @version  1.0.0 
  @since 27.07.21 - 15.32
*/

import edu.yurii.form.ChauffeurCreateForm;
import edu.yurii.form.ChauffeurUpdateForm;
import edu.yurii.form.RouteCreateForm;
import edu.yurii.form.RouteUpdateForm;
import edu.yurii.model.Chauffeur;
import edu.yurii.model.Route;
import edu.yurii.service.chauffeur.impls.ChauffeurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/gui/chauffeur")
public class ChauffeurGuiController {

    @Autowired
    ChauffeurServiceImpl chauffeurService;

    @RequestMapping("/all")
    public String getAll(Model model) {
        List<Chauffeur> chauffeurs = chauffeurService.getAll();
        model.addAttribute("chauffeurs", chauffeurs);
        return "chauffeurs";
    }
//===========================================================
    @RequestMapping("/{id}")
    public Chauffeur get(@PathVariable("id") String id) {
        return chauffeurService.get(id);
    }

    @RequestMapping("/delete/{id}")
    public String delete(Model model, @PathVariable("id") String id) {
//        List<Route> routeList = routeService.getAll();
//        model.addAttribute("routes", routeList);
        chauffeurService.delete(id);
        return "redirect:/gui/chauffeur/all";
    }

    @GetMapping("/create")
    public String create(Model model) {
        ChauffeurCreateForm chauffeurToCreate = new ChauffeurCreateForm();
        model.addAttribute("form", chauffeurToCreate);
        return "chauffeur-create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("form") ChauffeurCreateForm form) {
        Chauffeur chauffeur = new Chauffeur();
        chauffeur.setSurname(form.getSurname());
        chauffeur.setFirstname(form.getFirstname());
        chauffeur.setPatronymic(form.getPatronymic());
        chauffeur.setExperience(form.getExperience());
        chauffeurService.create(chauffeur);

        return "redirect:/gui/chauffeur/all";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") String id) {
        Chauffeur chauffeur = chauffeurService.get(id);
        ChauffeurUpdateForm chauffeurToUpdate = new ChauffeurUpdateForm();

        chauffeurToUpdate.setId(chauffeur.getId());
        chauffeurToUpdate.setSurname(chauffeur.getSurname());
        chauffeurToUpdate.setFirstname(chauffeur.getFirstname());
        chauffeurToUpdate.setPatronymic(chauffeur.getPatronymic());
        chauffeurToUpdate.setExperience(chauffeur.getExperience());

        model.addAttribute("form", chauffeurToUpdate);
        return "chauffeur-update";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute("form") ChauffeurUpdateForm form) {
        Chauffeur chauffeur = new Chauffeur();
        chauffeur.setId(form.getId());
        chauffeur.setSurname(form.getSurname());
        chauffeur.setFirstname(form.getFirstname());
        chauffeur.setPatronymic(form.getPatronymic());
        chauffeur.setExperience(form.getExperience());
        chauffeurService.update(chauffeur);

        return "redirect:/gui/chauffeur/all";
    }
}
