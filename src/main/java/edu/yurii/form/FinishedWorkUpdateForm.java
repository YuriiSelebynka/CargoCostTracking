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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinishedWorkUpdateForm {
    private String id;
    private Route route;
    private Chauffeur chauffeur;
    //@Value("${coChauffeur:#{null}}")
    @Nullable
    private Chauffeur coChauffeur = null;
    private LocalDateTime departureDate;
    private LocalDateTime returnDate;
    private double fee;
}
