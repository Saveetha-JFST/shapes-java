package org.prograd;

class Main{
    public static void main(String[] args) {
        Circle circle5 = new Circle(5);
        Circle circle8 = new Circle(8);

        System.out.println(circle5.calculateArea() );
        System.out.println(circle5.calculateCircumference());;
        System.out.println(circle8.calculateArea());
        System.out.println(circle8.calculateCircumference());
    }
}

