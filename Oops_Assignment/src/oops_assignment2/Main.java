package oops_assignment2;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Animal();

        animal.setHeight(200);
        animal.setSpeed(50);
        animal.setWeight(100);

        System.out.println(animal.getHeight());
        System.out.println(animal.getSpeed());
        System.out.println(animal.getWeight());
    }
}
