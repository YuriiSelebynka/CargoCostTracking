package edu.yurii.controller.gui;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  ChauffeurGuiController
  @version  1.0.0 
  @since 27.07.21 - 15.32
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.service.chauffeur.impls.ChauffeurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
