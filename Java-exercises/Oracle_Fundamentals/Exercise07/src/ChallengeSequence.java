class ChallengeSequence {

    private int first = 0;
    private int second = 1;

    void displaySequence() {
        int next = first + second;
        int seqLimit = 10;

        for (int count = 0; count < seqLimit; count++) {
            System.out.print(next + "/");
            first = second;
            second = next;
            next = first + second;
        }
    }
}
