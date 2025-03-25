public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1.0, "red");  // Call the two-parameter constructor
    }

    public Circle(double radius) {
        this(radius, "red");  // Call the two-parameter constructor
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Radius: " + circle1.radius);
        System.out.println("Color: " + circle1.color);

        Circle circle2 = new Circle(2.0);
        System.out.println("Radius: " + circle2.radius);
        System.out.println("Color: " + circle2.color);

        Circle circle3 = new Circle(3.0, "blue");
        System.out.println("Radius: " + circle3.radius);
        System.out.println("Color: " + circle3.color);

    }
}

