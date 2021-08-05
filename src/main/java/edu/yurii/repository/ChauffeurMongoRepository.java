package edu.yurii.repository;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  ChauffeurMongoRepository
  @version  1.0.0 
  @since 27.07.21 - 15.48
*/

import edu.yurii.model.Chauffeur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChauffeurMongoRepository extends
        MongoRepository<Chauffeur, String> {
}
