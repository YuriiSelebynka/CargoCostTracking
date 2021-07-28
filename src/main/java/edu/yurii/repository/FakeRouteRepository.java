//package edu.yurii.repository;
///*
//  @author   Yurii Selebynka
//  @project   CargoCostTracking
//  @class  FakeRouteRepository
//  @version  1.0.0
//  @since 26.07.21 - 14.50
//*/
//
//import edu.yurii.model.Route;
//import org.springframework.stereotype.Repository;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.UUID;
//
//@Repository
//public class FakeRouteRepository {
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
//}
