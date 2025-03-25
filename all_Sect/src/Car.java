public class Car {
    String model = "Porsche 911";
    double distance = 1000.0;
    double time= 2.0;

    public double Speed(){
        return distance/time;
    }

    public String Model(){
        return model;
    }

    public static void main(String[] args) {
        Car mycar = new Car();
        double speed = mycar.Speed();
        String model = mycar.Model();

        System.out.println(model);
        System.out.println(speed);
    }

}
