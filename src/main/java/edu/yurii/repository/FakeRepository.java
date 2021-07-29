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
//            Arrays.asList(                                 //wants only chauffeur with id 8, but written 4!
//                    new FinishedWork("9", routeList.get(0), chauffeurList.get(3), chauffeurList.get(4), date, date,120),
//                    new FinishedWork("10", routeList.get(1), chauffeurList.get(3), chauffeurList.get(4), date, date,140),
//                    new FinishedWork("11", routeList.get(2), chauffeurList.get(4), chauffeurList.get(3), date, date,120),
//                    new FinishedWork("12", routeList.get(3), chauffeurList.get(0), chauffeurList.get(3), date, date,90)
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

//==============================================================================================
//    public Route create(Route route) {
//        String id = UUID.randomUUID().toString();
//        route.setId(id);
//        System.out.println("Route has been accepted - " + route.toString() + ".");
//        routeList.add(route);
//
//        return route;
//    }
//
//    public Route get(String id) {
//        Route route = routeList.stream().filter(el -> el.getId().equals(id))
//                .findAny().get();
//        return route;
//    }
//
//    public Route update(Route route) {
//        String id = route.getId();
//        Route routeToUpdate = this.get(id);
//        int index = routeList.indexOf(routeToUpdate);
//        routeList.remove(routeToUpdate);
//        routeList.add(index, route);
//
//        return route;
//    }
//
//    public Route delete(String id) {
//        Route route = this.get(id);
//        routeList.remove(route);
//        return route;
//    }
//
//    public List<Route> getAll() {
//        return routeList;
//    }
//
//
//
//    public Chauffeur create(Chauffeur chauffeur) {
//        String id = UUID.randomUUID().toString();
//        chauffeur.setId(id);
//        chauffeurList.add(chauffeur);
//        return chauffeur;
//    }
//
//    public Chauffeur get(String id) {
//        Chauffeur chauffeur = chauffeurList.stream().filter(el -> el.getId().equals(id))
//                .findAny().get();
//        return chauffeur;
//    }
//
//    public Chauffeur update(Chauffeur chauffeur) {
//        String id = chauffeur.getId();
//        Chauffeur chauffeurToUpdate = this.get(id);
//        int index = chauffeurList.indexOf(chauffeurToUpdate);
//        chauffeurList.remove(chauffeurToUpdate);
//        chauffeurList.add(index, chauffeur);
//
//        return chauffeur;
//    }
//
//    public Chauffeur delete(String id) {
//        Chauffeur chauffeur = this.get(id);
//        chauffeurList.remove(chauffeur);
//        return chauffeur;
//    }
//
//    public List<Chauffeur> getAll() {
//        return chauffeurList;
//    }
//
//    public FinishedWork create(FinishedWork finishedWork) {
//        String id = UUID.randomUUID().toString();
//        finishedWork.setId(id);
//        finishedWorkList.add(finishedWork);
//        return finishedWork;
//    }
//
//    public FinishedWork get(String id) {
//        FinishedWork finishedWork = finishedWorkList.stream().filter(el -> el.getId().equals(id))
//                .findAny().get();
//        return finishedWork;
//    }
//
//    public FinishedWork update(FinishedWork finishedWork) {
//        String id = finishedWork.getId();
//        FinishedWork finishedWorkToUpdate = this.get(id);
//        int index = finishedWorkList.indexOf(finishedWorkToUpdate);
//        finishedWorkList.remove(finishedWorkToUpdate);
//        finishedWorkList.add(index, finishedWork);
//
//        return finishedWork;
//    }
//
//    public FinishedWork delete(String id) {
//        FinishedWork finishedWork = this.get(id);
//        finishedWorkList.remove(finishedWork);
//        return finishedWork;
//    }
//
//    public List<FinishedWork> getAll() {
//        return finishedWorkList;
//    }
}
