class Editor extends SkilledEmployee{

    private boolean paperEditing;

    private String paper = "Editing preference: Paper-based editing";
    private String electronic = "Editing preference: Electronic-base editing";

    void setPrefersPaperEditing(boolean paperEditing){
        this.paperEditing = paperEditing;
    }

    String getPrefersPaperEditing(){
        if (paperEditing == true){
            return paper;
        } else {
            return electronic;
        }
    }

    @Override
    public void print(){
        super.print();
        System.out.println(getPrefersPaperEditing());
    }
}
