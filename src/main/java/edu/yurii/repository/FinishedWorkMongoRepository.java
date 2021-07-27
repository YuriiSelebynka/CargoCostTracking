package edu.yurii.repository;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkMongoRepository
  @version  1.0.0 
  @since 27.07.21 - 17.22
*/

import edu.yurii.model.FinishedWork;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinishedWorkMongoRepository extends MongoRepository<FinishedWork, String> {
}
