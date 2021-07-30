package edu.yurii.form;
/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  FinishedWorkCreateForm
  @version  1.0.0 
  @since 27.07.21 - 16.57
*/

import edu.yurii.model.Chauffeur;
import edu.yurii.model.Route;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWorkCreateForm {
    private Route route;
    private Chauffeur chauffeur;
    //@Value("null")
    //@Value("${coChauffeur:#{null}}")
    //@Value("${coChauffeur:0}")
    @Nullable
    private Chauffeur coChauffeur = null;
//    private LocalDate departureDate;
//    private LocalDate returnDate;
    private double fee;
}
