package edu.yurii.service.chauffeur.impls;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  ChauffeurServiceImpl
  @version  1.0.0 
  @since 27.07.21 - 15.30
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.repository.ChauffeurMongoRepository;
import edu.yurii.repository.FakeChauffeurRepository;
import edu.yurii.service.chauffeur.interfaces.IChauffeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ChauffeurServiceImpl implements IChauffeurService {

    @Autowired
    FakeChauffeurRepository fakeChauffeurRepository;

    @Autowired
    ChauffeurMongoRepository chauffeurMongoRepository;

//    @PostConstruct
//    void init() {
//        List<Chauffeur> list = fakeChauffeurRepository.getAll();
//        System.out.println(list);
//        chauffeurMongoRepository.saveAll(list);
//    }

    @Override
    public Chauffeur create(Chauffeur chauffeur) {
        return chauffeurMongoRepository.save(chauffeur);
    }

    @Override
    public Chauffeur get(String id) {
        return chauffeurMongoRepository.findById(id).get();
    }

    @Override
    public Chauffeur update(Chauffeur chauffeur) {
        Chauffeur chauffeurToUpdate = this.get(chauffeur.getId());
        return chauffeurMongoRepository.save(chauffeur);
    }

    @Override
    public Chauffeur delete(String id) {
        Chauffeur chauffeur = this.get(id);
        chauffeurMongoRepository.deleteById(id);
        return chauffeur;
    }

    @Override
    public List<Chauffeur> getAll() {
        return chauffeurMongoRepository.findAll();
    }
}
