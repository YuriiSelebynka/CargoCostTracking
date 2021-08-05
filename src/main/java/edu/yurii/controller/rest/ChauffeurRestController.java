package edu.yurii.controller.rest;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  ChauffeurRestController
  @version  1.0.0 
  @since 27.07.21 - 15.31
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.service.chauffeur.impls.ChauffeurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chauffeur")
public class ChauffeurRestController {

    @Autowired
    ChauffeurServiceImpl chauffeurService;

    @RequestMapping("/all")
    public List<Chauffeur> getAll() {
        return chauffeurService.getAll();
    }

    @RequestMapping("/{id}")
    public Chauffeur get(@PathVariable("id") String id) {
        return chauffeurService.get(id);
    }

    @RequestMapping("/delete/{id}")
    public Chauffeur delete(@PathVariable("id") String id) {
        return chauffeurService.delete(id);
    }

    @PostMapping("/create")
    public Chauffeur create(@RequestBody Chauffeur chauffeur) {
        return chauffeurService.create(chauffeur);
    }

    @PostMapping("/update")
    public Chauffeur update(@RequestBody Chauffeur chauffeur) {
        return chauffeurService.update(chauffeur);
    }
}
