package task1.subtask2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        paint(car);
        System.out.println(car.getColor());
    }

    public static void paint(Car auto) {
        auto.setColor("red");
    }
}
