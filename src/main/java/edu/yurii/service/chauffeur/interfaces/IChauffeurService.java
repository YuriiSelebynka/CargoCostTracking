package edu.yurii.service.chauffeur.interfaces;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  IChauffeurService
  @version  1.0.0 
  @since 27.07.21 - 15.28
*/

import edu.yurii.model.Chauffeur;

import java.util.List;

public interface IChauffeurService {
    Chauffeur create(Chauffeur chauffeur);
    Chauffeur get(String id);
    Chauffeur update(Chauffeur chauffeur);
    Chauffeur delete(String id);
    List<Chauffeur> getAll();
}
