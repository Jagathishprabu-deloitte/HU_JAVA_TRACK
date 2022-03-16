package oops_assignment2;

public class Animal {
    private int speed;
    private int height;
    private int weight;

    public Animal() {

    }

    public Animal(int speed, int height, int weight) {
        this.speed = speed;
        this.height = height;
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
