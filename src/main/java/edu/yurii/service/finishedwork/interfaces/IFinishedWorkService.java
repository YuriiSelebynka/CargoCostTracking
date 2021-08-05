package edu.yurii.service.finishedwork.interfaces;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  IFinishedWorkService
  @version  1.0.0 
  @since 27.07.21 - 16.53
*/

import edu.yurii.model.FinishedWork;

import java.util.List;

public interface IFinishedWorkService {
    FinishedWork create(FinishedWork finishedWork);
    FinishedWork get(String id);
    FinishedWork update(FinishedWork finishedWork);
    FinishedWork delete(String id);
    List<FinishedWork> getAll();
}
