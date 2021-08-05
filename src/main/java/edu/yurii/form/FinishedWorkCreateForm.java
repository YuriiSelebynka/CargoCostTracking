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
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWorkCreateForm {
    private Route route;
    private Chauffeur chauffeur;
    @Nullable
    private Chauffeur coChauffeur = null;
    private String inputDepartureDate;
    private String inputReturnDate;
    private double fee;
}
