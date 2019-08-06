import java.util.ArrayList;

class SkilledEmployee extends Employee {

    private ArrayList<String> skillList = new ArrayList<>();

    void setSkill(String skill) {
        skillList.add(skill);
    }

    ArrayList<String> getSkill() {
        return skillList;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Employee skills: " );
        for (String str : skillList){
            System.out.println("\t" + str);
        }
    }
}
