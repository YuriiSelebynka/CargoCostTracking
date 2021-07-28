//package edu.yurii.repository;
///*
//  @author   Yurii Selebynka
//  @project   CargoCostTracking
//  @class  FakeChauffeurRepository
//  @version  1.0.0
//  @since 27.07.21 - 15.36
//*/
//
//import edu.yurii.model.Chauffeur;
//import edu.yurii.model.Route;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//
//@Repository
//public class FakeChauffeurRepository {
//
//
//
//    @Autowired
//    RouteMongoRepository routeMongoRepository;
//
//    private LocalDateTime time = LocalDateTime.now();
//    private List<Route> routeList = new ArrayList<>(
//            Arrays.asList(
//                    new Route("0", "Bratislava-Trnava", 57, 1, 100),
//                    new Route("1", "Bratislava-Preshov", 403, 1, 500),
//                    new Route("2", "Bratislava-Berlin", 667, 1, 700),
//                    new Route("3", "Bratislava-London", 1562, 2, 2100)
//            )
//    );
//
//    private List<Chauffeur> list = new ArrayList<>(
//            Arrays.asList(
//                    new Chauffeur("4", "Washington", "George", "First", 12),
//                    new Chauffeur("5", "Adams", "John", "Second", 9),
//                    new Chauffeur("6", "Jefferson", "Thomas", "Third", 11),
//                    new Chauffeur("7", "Madison", "James", "Forth", 9),
//                    new Chauffeur("8", "Monroe", "James", "Fifth", 4)
//            )
//    );
//
//    public Chauffeur create(Chauffeur chauffeur) {
//        String id = UUID.randomUUID().toString();
//        chauffeur.setId(id);
//        list.add(chauffeur);
//        return chauffeur;
//    }
//
//    public Chauffeur get(String id) {
//        Chauffeur chauffeur = list.stream().filter(el -> el.getId().equals(id))
//                .findAny().get();
//        return chauffeur;
//    }
//
//    public Chauffeur update(Chauffeur chauffeur) {
//        String id = chauffeur.getId();
//        Chauffeur chauffeurToUpdate = this.get(id);
//        int index = list.indexOf(chauffeurToUpdate);
//        list.remove(chauffeurToUpdate);
//        list.add(index, chauffeur);
//
//        return chauffeur;
//    }
//
//    public Chauffeur delete(String id) {
//        Chauffeur chauffeur = this.get(id);
//        list.remove(chauffeur);
//        return chauffeur;
//    }
//
//    public List<Chauffeur> getAll() {
//        return list;
//    }
//}
