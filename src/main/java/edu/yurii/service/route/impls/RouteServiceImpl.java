package edu.yurii.service.route.impls;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteServiceImpl
  @version  1.0.0 
  @since 26.07.21 - 14.48
*/

import edu.yurii.model.Route;
import edu.yurii.repository.FakeRepository;
import edu.yurii.repository.RouteMongoRepository;
import edu.yurii.service.route.interfaces.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class RouteServiceImpl implements IRouteService {

    @Autowired
    FakeRepository fakeRepository;

    @Autowired
    RouteMongoRepository routeMongoRepository;

//    @PostConstruct
//    void init(){
//        List<Route> routeList = fakeRepository.getAll();
//        routeMongoRepository.saveAll(routeList);
//    }

    @Override
    public Route create(Route route) {
        return routeMongoRepository.save(route);
    }

    @Override
    public Route get(String id) {
        return routeMongoRepository.findById(id).orElse(null);
    }

    @Override
    public Route update(Route route) {
        return routeMongoRepository.save(route);
    }

    @Override
    public Route delete(String id) {
        Route route = this.get(id);
        routeMongoRepository.deleteById(route.getId());
        return route;
    }

    @Override
    public List<Route> getAll() {
        return routeMongoRepository.findAll();
    }
}
