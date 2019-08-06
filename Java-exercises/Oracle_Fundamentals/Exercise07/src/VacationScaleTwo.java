import java.util.ArrayList;

class VacationScaleTwo {
    private ArrayList vacationDays;
    
    void setVacationScale(){
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }

    void displayVacationDays(){

        for (int years = 0; years < vacationDays.size(); years++) {
            System.out.println("Vacation days for " + years + " years of service: " + vacationDays.get(years));
        }
    }
}
