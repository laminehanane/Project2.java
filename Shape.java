package Project2;


interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    double side;

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

    class TestingCircle{
public static void main(String[]args){


        Circle circle=new Circle();
        circle.radius=5;
        System.out.println("Circle Area: "+circle.calculateArea());
        System.out.println("Circle Perimeter: "+circle.calculatePerimeter());

        Square square=new Square();
        square.side=4;
        System.out.println("Square Area: "+square.calculateArea());
        System.out.println("Square Perimeter: "+square.calculatePerimeter());
        }
        }