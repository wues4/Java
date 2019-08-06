public class Editor extends SkilledEmployee {
    private boolean prefersPaperEditing;
    
    public void setPrefersPaperEditing(boolean pref){
        prefersPaperEditing = pref;
    }
    
    public String getEditingPreference(){
        if(prefersPaperEditing){
            return "Paper";
        }
        else {
            return "Electronic";
        }
    }
    
    public void print(){
        super.print();
        System.out.println("Editing preference: " + this.getEditingPreference());
    }
}
