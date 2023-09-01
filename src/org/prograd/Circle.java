package org.prograd;

    class Circle{
        double radius;
        final double PI_VALUE = 3.14;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        double calculateArea(){
            return PI_VALUE * radius * radius;
        }

        double calculateCircumference(){
            return 2 * PI_VALUE * radius;
        }
    }

