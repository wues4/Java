// Write a Java program to insert a word in the middle of the another string. Go to the editor
// Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0

public class Main {
    public static void main(String[] args) {
        String sentence = "Python 3.0";
        System.out.println(sentence.substring(0,7) + "Tutorial " + sentence.substring(7));
    }
}
