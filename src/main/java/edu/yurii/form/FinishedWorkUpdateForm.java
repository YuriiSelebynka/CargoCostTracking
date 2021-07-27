package edu.yurii.form;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkUpdateForm
  @version  1.0.0 
  @since 27.07.21 - 16.58
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.model.Route;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWorkUpdateForm {
    private String id;
    private Route route;
    private Chauffeur chauffeur;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private double fee;
}
