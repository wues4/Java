class Sequence {

    private int first = 0;
    private int second = 1;

    void displaySequence() {
        int next = first + second;
        int LIMIT = 100;

        while (next <= LIMIT){
            System.out.print(next + "/");
            first = second;
            second = next;
            next = first+second;
        }
    }
}
