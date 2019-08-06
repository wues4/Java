package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;

        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        Pet p;

        // test a fish with a fish reference
        Fish f = new Fish();
        f.setName("Bobby");
        f.eat();
        f.walk();
        f.play();
        // test a fish with a animal reference
        a = new Fish();
        a.eat();
        a.walk();

        // test a cat with a cat reference
        Cat c = new Cat("Scrappy");
        c.eat();
        c.walk();
        c.play();
        // test a cat with a animal reference
        a = new Cat();
        a.eat();
        a.walk();
        // test a cat with pet reference
        p = new Cat();
        p.setName("Kitty");
        p.play();

        playWithAnimal(s);
        playWithAnimal(f);
        playWithAnimal(c);
    }
    
    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            ((Pet) a).play();
        } else {
            System.out.println("Danger ! Wild Animal !");
        }
    }
    
}