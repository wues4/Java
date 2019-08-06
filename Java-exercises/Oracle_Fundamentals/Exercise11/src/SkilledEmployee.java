import java.util.ArrayList;

public class SkilledEmployee extends Employee{
    public ArrayList skillList = new ArrayList();
    
    public void setSkill(String skill) throws InvalidSkillException{
        boolean valid = true;
        if (skill == null || skill.length() < 5) {
            valid = false;
        } else {
            valid = true;
        }
        if (!valid) {
            throw new InvalidSkillException(skill + " skill is not valid for the " + this.getJobTitle() + " job.");
        } else {
            skillList.add(skill);
        }
    }
    
    public ArrayList getSkills(){
        return skillList;
    }
    public void print(){   
    	  super.print();
        System.out.println("Employee has the following skills: ");
        for(Object obj : skillList){
            System.out.println("\t"+ obj);
        }
    }

}
