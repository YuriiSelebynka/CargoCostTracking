package edu.yurii.form;

/*
  @author   Yurii Selebynka
  @project   CargoCostTracking
  @class  ChauffeurCreateForm
  @version  1.0.0 
  @since 27.07.21 - 16.17
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChauffeurCreateForm {
    private String surname;
    private String firstname;
    private String patronymic;
    private double experience;
}
