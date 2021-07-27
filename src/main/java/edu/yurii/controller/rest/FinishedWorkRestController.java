package edu.yurii.controller.rest;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkRestController
  @version  1.0.0 
  @since 27.07.21 - 16.59
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.model.FinishedWork;
import edu.yurii.service.finishedwork.impls.FinishedWorkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/finishedwork")
public class FinishedWorkRestController {

    @Autowired
    FinishedWorkServiceImpl finishedWorkService;

    @RequestMapping("/all")
    public List<FinishedWork> getAll() {
        return finishedWorkService.getAll();
    }

    @RequestMapping("/{id}")
    public FinishedWork get(@PathVariable("id") String id) {
        return finishedWorkService.get(id);
    }

    @RequestMapping("/delete/{id}")
    public FinishedWork delete(@PathVariable("id") String id) {
        return finishedWorkService.delete(id);
    }

    @PostMapping("/create")
    public FinishedWork create(@RequestBody FinishedWork finishedWork) {
        return finishedWorkService.create(finishedWork);
    }

    @PostMapping("/update")
    public FinishedWork update(@RequestBody FinishedWork finishedWork) {
        return finishedWorkService.update(finishedWork);
    }
}
