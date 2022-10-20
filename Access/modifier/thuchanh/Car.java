package Access.modifier.thuchanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    void display(){
        System.out.println(this.name + " " + this.engine );
    }
}
class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        car1.display();
        car2.display();
        System.out.println(Car.numberOfCars);

    }

}
