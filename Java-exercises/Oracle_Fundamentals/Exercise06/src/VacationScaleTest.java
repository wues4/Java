public class VacationScaleTest {
   
  public static void main (String args[]) {
 
  VacationScale myVacationScale = new VacationScale();
  
  myVacationScale.setVacationScale();
  myVacationScale.yearsOfService = -1;
  myVacationScale.displayVacationDays();
  
  myVacationScale.yearsOfService = 3;
  myVacationScale.displayVacationDays();
  
  myVacationScale.yearsOfService = 8;
  myVacationScale.displayVacationDays();
  } 
}
