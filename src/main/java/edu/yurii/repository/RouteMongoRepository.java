package edu.yurii.repository;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteMongoRepository
  @version  1.0.0 
  @since 26.07.21 - 17.05
*/

import edu.yurii.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteMongoRepository extends
        MongoRepository<Route, String> {
}
