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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeFinishedWorkRepository {

    @Autowired
    ChauffeurMongoRepository chauffeurMongoRepository;

    @Autowired
    RouteMongoRepository routeMongoRepository;

    private LocalDateTime time = LocalDateTime.now();
    private List<Route> routeList = new ArrayList<>(
            Arrays.asList(
                    new Route("0", "Bratislava-Trnava", 57, 1, 100),
                    new Route("1", "Bratislava-Preshov", 403, 1, 500),
                    new Route("2", "Bratislava-Berlin", 667, 1, 700),
                    new Route("3", "Bratislava-London", 1562, 2, 2100)
            )
    );

    private List<Chauffeur> list = new ArrayList<>(
            Arrays.asList(
                    new Chauffeur("4", "Washington", "George", "First", 12),
                    new Chauffeur("5", "Adams", "John", "Second", 9),
                    new Chauffeur("6", "Jefferson", "Thomas", "Third", 11),
                    new Chauffeur("7", "Madison", "James", "Forth", 9),
                    new Chauffeur("8", "Monroe", "James", "Fifth", 4)
            )
    );

    private List<FinishedWork> finishedWorkList = new ArrayList<>(
            Arrays.asList(
                    new FinishedWork("9", routeList.get(0), list.get(4), LocalDate.now(), LocalDate.now(),120)
//                    new FinishedWork("10", routeList.get(3), list.get(8), LocalDate.now(), LocalDate.now(),140),
//                    new FinishedWork("11", routeList.get(1), list.get(7), LocalDate.now(), LocalDate.now(),90),
//                    new FinishedWork("12", routeList.get(2), list.get(5), LocalDate.now(), LocalDate.now(),120)
            )
    );

    public FinishedWork create(FinishedWork finishedWork) {
        String id = UUID.randomUUID().toString();
        finishedWork.setId(id);
        finishedWorkList.add(finishedWork);
        return finishedWork;
    }

    public FinishedWork get(String id) {
        FinishedWork finishedWork = finishedWorkList.stream().filter(el -> el.getId().equals(id))
                .findAny().get();
        return finishedWork;
    }

    public FinishedWork update(FinishedWork finishedWork) {
        String id = finishedWork.getId();
        FinishedWork finishedWorkToUpdate = this.get(id);
        int index = finishedWorkList.indexOf(finishedWorkToUpdate);
        finishedWorkList.remove(finishedWorkToUpdate);
        finishedWorkList.add(index, finishedWork);

        return finishedWork;
    }

    public FinishedWork delete(String id) {
        FinishedWork finishedWork = this.get(id);
        finishedWorkList.remove(finishedWork);
        return finishedWork;
    }

    public List<FinishedWork> getAll() {
        return finishedWorkList;
    }
}
