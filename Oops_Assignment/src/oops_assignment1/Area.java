package oops_assignment1;

public class Area extends Find{
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of Circle : "+area.find(10F));
        System.out.println("Area of Square : "+area.find(10));
        System.out.println("Area of Rectangle : "+area.find(10,20));
        System.out.println("Area of Triangle : "+area.find(10F,20F));
    }
}
