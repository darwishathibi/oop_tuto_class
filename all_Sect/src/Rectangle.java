public class Rectangle {
    double height;
    double width;

    public Rectangle(){
        height = 1.0;
        width = 1.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * height + 2 * width;
    }


    //accesser
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }

    //mutator
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(10.0);
        rectangle.setWidth(10.0);

        System.out.println(rectangle.getArea());

//        Rectangle rect1 = new Rectangle(2.0,3.0);
//        Rectangle rect2 = new Rectangle();
//
//        rect1.height = 4.0;
//        rect1.width = 40.0;
//        rect2.height = 3.5;
//        rect2.width = 35.9;
//
//        System.out.printf("%.3f%n", rect1.getArea());
//        System.out.printf("%.3f%n", rect2.getArea());
//        System.out.println(rect1.getPerimeter());
//        System.out.println(rect2.getPerimeter());
    }

}