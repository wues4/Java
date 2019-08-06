class ClassMap{

    private String[][] deskArray;
    String name;

    void setClassMap(){ deskArray = new String[3][4]; }

    void setDesk(){
        boolean flag = false;
        for (int row=0; row<3; row++) {
            for (int col=0; col<4; col++) {
                if (deskArray[row][col] == null) {
                    deskArray[row][col] = name;
                    System.out.println(name + " desk position: Row: " + row + " Column: " + col);
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                break;
            }
        }
        if (flag == false) {
            System.out.println("There is no desk left");
        }
    }

    void displayDeskMap(){
        for (int row=0; row<3;row++) {
            for (int col=0; col<4; col++) {
                System.out.print(" " + deskArray[row][col] + " ");
            }
            System.out.println();
        }
    }

    void searchDesk(){
        boolean flag = false;
        for (int row=0; row<3;row++) {
            for (int col=0; col<4; col++) {
                if (deskArray[row][col] != null && deskArray[row][col].equals(name)) {
                    System.out.println("Position of " + name + " are on row: " + row + " column: " + col);
                    flag = true;
                    break;
                }
            }
            if (flag == true){ break; }
        }
        if (flag == false){
            System.out.println("There is no " + name + " in this class !");
        }
    }
}