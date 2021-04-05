package Unit_8;

import java.util.ArrayList;

public class AbstractPetsProject {
    public static abstract class Pet{
        private String myName;
        public Pet(String name){
            myName = name;
        }
        public String getName(){
            return myName;
        }
        public abstract String speak();
    }
    public static class Cat extends Pet{
        public Cat(String name){
            super(name);
        }
        public String speak(){
            return "meow";
        }
    }
    public static class Dog extends Pet{
        public Dog(String name){
            super(name);
        }
        public String speak(){
            return "dog-sound";
        }
    }
    public static class LoudDog extends Dog{
        public LoudDog(String name){
            super(name);
        }
        public String speak(){
            return super.speak() + " " + super.speak();
        }
    }
    public static class Kennel{
        private ArrayList<Pet> petList;
        public Kennel(){
            petList = new ArrayList<Pet>();
        }
        public void addPet(Pet item){
            petList.add(item);
        }
        public void allSpeak(){
            for (Pet i : petList){
                System.out.println(i.speak());
            }
        }
    }
    public static void main(String[] args) {
        Kennel pound = new Kennel();
        pound.addPet(new Dog("Bozo"));
        pound.addPet(new Cat("codman"));
        pound.addPet(new LoudDog("Brutous"));
        pound.allSpeak();
    }
}
