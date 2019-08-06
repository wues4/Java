public class Game {
    public static void main(String[] args) {
        int randomNum = 0;
        int guess = 0;

        if (args.length == 0 || args[0].compareTo("help")==0 ){
            System.out.println("Usage: Java GuessingGame [argument]");
            System.out.println();
            System.out.println("Please input number between 1 and 5 as your guess.");
        } else {
            randomNum = ((int)(Math.random()*5)+1);
            guess = Integer.parseInt(args[0]);
        }

        if (guess<1 || guess>5){
            System.out.println("Invalid argument: Enter a number from 1 to 5");
        }else {
            if (guess == randomNum){
                System.out.println("Great ! You hit that right !");
            }else{
                System.out.println("Ooops you missed ! The number was: " + randomNum + " Try again.");
            }
        }
    }
}