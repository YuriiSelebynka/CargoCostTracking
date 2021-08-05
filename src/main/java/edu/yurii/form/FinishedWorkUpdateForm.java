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
import org.springframework.lang.Nullable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWorkUpdateForm {
    private String id;
    private Route route;
    private Chauffeur chauffeur;
    @Nullable
    private Chauffeur coChauffeur = null;
    private LocalDateTime departureDate;
    private LocalDateTime returnDate;
    private String inputDepartureDate;
    private String inputReturnDate;
    private double fee;
}
