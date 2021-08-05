package edu.yurii.repository;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FakeFinishedWorkRepository
  @version  1.0.0 
  @since 27.07.21 - 17.11
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.model.FinishedWork;
import edu.yurii.model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Repository
public class FakeRepository {

    @Autowired
    ChauffeurMongoRepository chauffeurMongoRepository;

    @Autowired
    RouteMongoRepository routeMongoRepository;

    @Autowired
    FinishedWorkMongoRepository finishedWorkMongoRepository;

    private LocalDate date = LocalDate.now();

//    private List<Route> routeList = new LinkedList<>(
//            Arrays.asList(
//                    new Route("0", "Bratislava-Trnava", 57, 1, 100),
//                    new Route("1", "Bratislava-Preshov", 403, 1, 500),
//                    new Route("2", "Bratislava-Berlin", 667, 1, 700),
//                    new Route("3", "Bratislava-London", 1562, 2, 2100)
//            )
//    );
//
//    private List<Chauffeur> chauffeurList = new LinkedList<>(
//            Arrays.asList(
//                    new Chauffeur("4", "Washington", "George", "First", 12),
//                    new Chauffeur("5", "Adams", "John", "Second", 9),
//                    new Chauffeur("6", "Jefferson", "Thomas", "Third", 11),
//                    new Chauffeur("7", "Madison", "James", "Forth", 9),
//                    new Chauffeur("8", "Monroe", "James", "Fifth", 4)
//            )
//    );
//
//    private List<FinishedWork> finishedWorkList = new LinkedList<>(
//            Arrays.asList(
//                    new FinishedWork("9", routeList.get(0), chauffeurList
//                    .get(3), chauffeurList.get(4), date, date,120),
//                    new FinishedWork("10", routeList.get(1), chauffeurList
//                    .get(3), chauffeurList.get(4), date, date,140),
//                    new FinishedWork("11", routeList.get(2), chauffeurList
//                    .get(4), chauffeurList.get(3), date, date,120),
//                    new FinishedWork("12", routeList.get(3), chauffeurList
//                    .get(0), chauffeurList.get(3), date, date,90)
//            )
//    );

//    @PostConstruct
//    public void init(){
//        chauffeurMongoRepository.deleteAll();
//        chauffeurMongoRepository.saveAll(chauffeurList);
//        routeMongoRepository.deleteAll();
//        routeMongoRepository.saveAll(routeList);
//        finishedWorkMongoRepository.deleteAll();
//        finishedWorkMongoRepository.saveAll(finishedWorkList);
//    }

}
