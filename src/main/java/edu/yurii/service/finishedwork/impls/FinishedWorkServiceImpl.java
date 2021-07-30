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
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    public FinishedWork create(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") FinishedWork finishedWork) {
//        finishedWork.setDepartureDate(LocalDateTime.now());
//        finishedWork.setReturnDate(LocalDateTime.now());

        String str1 = finishedWork.getInputDepartureDate();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        finishedWork.setDepartureDate(LocalDateTime.parse(str1, formatter1));

        String str2 = finishedWork.getInputReturnDate();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        finishedWork.setReturnDate(LocalDateTime.parse(str2, formatter2));

        return finishedWorkMongoRepository.save(finishedWork);
    }

    @Override
    public FinishedWork get(String id) {
        return finishedWorkMongoRepository.findById(id).orElse(null);
    }

    @Override
    public FinishedWork update(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") FinishedWork finishedWork) {
        FinishedWork finishedWorkToUpdate = this.get(finishedWork.getId());

//        LocalDateTime departure = finishedWorkToUpdate.getDepartureDate();
//        finishedWork.setDepartureDate(departure);
//        finishedWork.setReturnDate(LocalDateTime.now());

        String str3 = finishedWork.getInputDepartureDate();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        finishedWork.setDepartureDate(LocalDateTime.parse(str3, formatter3));

        String str4 = finishedWork.getInputReturnDate();
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        finishedWork.setReturnDate(LocalDateTime.parse(str4, formatter4));



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
