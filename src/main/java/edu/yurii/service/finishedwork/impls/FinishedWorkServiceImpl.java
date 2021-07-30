package edu.yurii.service.finishedwork.impls;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkServiceImpl
  @version  1.0.0 
  @since 27.07.21 - 16.56
*/

import edu.yurii.model.FinishedWork;
import edu.yurii.repository.FakeRepository;
import edu.yurii.repository.FinishedWorkMongoRepository;
import edu.yurii.service.finishedwork.interfaces.IFinishedWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FinishedWorkServiceImpl implements IFinishedWorkService {

    @Autowired
    FakeRepository fakeRepository;

    @Autowired
    FinishedWorkMongoRepository finishedWorkMongoRepository;

//    @PostConstruct
//    void init() {
//        List<FinishedWork> finishedWorkList = fakeRepository.getAll();
//        System.out.println(finishedWorkList);
//        finishedWorkMongoRepository.saveAll(finishedWorkList);
//    }

    @Override
    public FinishedWork create(FinishedWork finishedWork) {
        finishedWork.setDepartureDate(LocalDate.now());
        finishedWork.setReturnDate(LocalDate.now());
        return finishedWorkMongoRepository.save(finishedWork);
    }

    @Override
    public FinishedWork get(String id) {
        return finishedWorkMongoRepository.findById(id).orElse(null);
    }

    @Override
    public FinishedWork update(FinishedWork finishedWork) {
        FinishedWork finishedWorkToUpdate = this.get(finishedWork.getId());

        LocalDate departure = finishedWorkToUpdate.getDepartureDate();
        finishedWork.setDepartureDate(departure);
        finishedWork.setReturnDate(LocalDate.now());

        return finishedWorkMongoRepository.save(finishedWork);
    }

    @Override
    public FinishedWork delete(String id) {
        FinishedWork finishedWork = this.get(id);
        finishedWorkMongoRepository.deleteById(finishedWork.getId());
        return finishedWork;
    }

    @Override
    public List<FinishedWork> getAll() {
        //return fakeRepository.getAll();
        return finishedWorkMongoRepository.findAll();
    }
}
