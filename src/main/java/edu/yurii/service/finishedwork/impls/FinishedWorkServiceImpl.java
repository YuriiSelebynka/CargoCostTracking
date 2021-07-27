package edu.yurii.service.finishedwork.impls;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkServiceImpl
  @version  1.0.0 
  @since 27.07.21 - 16.56
*/

import edu.yurii.model.FinishedWork;
import edu.yurii.repository.FakeFinishedWorkRepository;
import edu.yurii.repository.FinishedWorkMongoRepository;
import edu.yurii.service.finishedwork.interfaces.IFinishedWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinishedWorkServiceImpl implements IFinishedWorkService {

    @Autowired
    FakeFinishedWorkRepository fakeFinishedWorkRepository;

    @Autowired
    FinishedWorkMongoRepository finishedWorkMongoRepository;

//    @PostConstruct
//    void init() {
//        List<FinishedWork> list = fakeFinishedWorkRepository.getAll();
//        System.out.println(list);
//        finishedWorkMongoRepository.saveAll(list);
//    }

    @Override
    public FinishedWork create(FinishedWork finishedWork) {
        return finishedWorkMongoRepository.save(finishedWork);
    }

    @Override
    public FinishedWork get(String id) {
        return finishedWorkMongoRepository.findById(id).get();
    }

    @Override
    public FinishedWork update(FinishedWork finishedWork) {
        FinishedWork finishedWorkToUpdate = this.get(finishedWork.getId());
        return finishedWorkMongoRepository.save(finishedWork);
    }

    @Override
    public FinishedWork delete(String id) {
        FinishedWork finishedWork = this.get(id);
        finishedWorkMongoRepository.deleteById(id);
        return finishedWork;
    }

    @Override
    public List<FinishedWork> getAll() {
        return fakeFinishedWorkRepository.getAll();
    }
}
