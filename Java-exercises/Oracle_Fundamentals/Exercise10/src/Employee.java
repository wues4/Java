class Employee implements Printable {

    private String name;
    private String jobTitle;
    private int level;
    private int employeeID;
    protected static int employeeIDCounter = 0;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    String getJobTitle(){
        return jobTitle;
    }

    void setLevel(int level){
        this.level = level;
    }

    int getLevel(){
        return level;
    }

    void calculateEmployeeID(){
        employeeIDCounter++;
        employeeID = employeeIDCounter;
    }
    
    int getEmployeeID(){
        return employeeID;
    }

    public void print(){
        System.out.println("Name: " + getName());
        System.out.println("Job title: " + getJobTitle());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Level: " + getLevel());
    }
}
