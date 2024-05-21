package OOP_1;

public class Program2 {
    public static void main(String[] args){
    Circle cir1 = new Circle(10, "red" );
    System.out.println("Первый круг: ");
    cir1.toString(cir1);

    Circle cir2 = new Circle(5.5, "blue" );
    System.out.println("Второй круг: ");
    cir2.toString(cir2);

    Circle cir3 = new Circle(17.7, "yellow" );
    System.out.println("Третий круг: ");
    cir3.toString(cir3);
    }
}

class Circle {
    double radius;
    String colour;

    double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    double perimeter() {
        return 2*Math.PI*radius;
    }

    Circle(double r, String s) {
        this.radius = r;
        this.colour = s;
    }

    void toString(Circle a) {
        System.out.print("Радиус: "+ a.radius);
        System.out.print(" Цвет: " + a.colour);
        System.out.print(" Площадь: " + a.area());
        System.out.println(" Периметр: " + a.perimeter());
    }
}
