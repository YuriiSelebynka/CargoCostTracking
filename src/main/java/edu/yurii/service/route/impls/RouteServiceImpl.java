package edu.yurii.service.route.impls;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  RouteServiceImpl
  @version  1.0.0 
  @since 26.07.21 - 14.48
*/

import edu.yurii.model.Route;
import edu.yurii.repository.FakeRouteRepository;
import edu.yurii.service.route.interfaces.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements IRouteService {

    @Autowired
    FakeRouteRepository fakeRouteRepository;

    @Override
    public Route create(Route route) {
        return fakeRouteRepository.create(route);
    }

    @Override
    public Route get(String id) {
        return fakeRouteRepository.get(id);
    }

    @Override
    public Route update(Route route) {
        return fakeRouteRepository.update(route);
    }

    @Override
    public Route delete(String id) {
        return fakeRouteRepository.delete(id);
    }

    @Override
    public List<Route> getAll() {
        return fakeRouteRepository.getAll();
    }
}
