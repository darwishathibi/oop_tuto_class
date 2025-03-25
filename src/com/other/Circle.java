package com.other;

public class Circle {

    public String colour;
    public double radius;

    public Circle(){
        this("Red", 10.0);
    }

    public Circle(String colour){
        this(colour, 30.0);
    }

    public Circle(String colour, double radius) {
        this.colour = colour;
        this.radius = radius;
    }

    //method chaining fluent interface
    public Circle setColour(String colour){
        this.colour = colour;
        return this; //returning the current object for chaining
    }

    //print
    public void print(){
        System.out.println("Colour: " + colour + ", Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.print();

        Circle circle2 = new Circle("Blue");
        circle2.print();

        Circle circle3 = new Circle("Green", 50.0);
        circle3.print();

        //method chaining
        new Circle().setColour("Yellow").print();
    }
}



