import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of circle objects
        int n = scanner.nextInt();

        // Create an array of Circle objects
        Circle[] circles = new Circle[n];

        // Read the radius values for each circle object
        for (int i = 0; i < n; i++) {
            double radius = scanner.nextDouble();

            // Treat negative radius values as 0.0
            if (radius < 0.0) {
                radius = 0.0;
            }

            // Create a new Circle object with the given radius
            circles[i] = new Circle(radius);
        }

        // Display the area of circle objects with area greater than 30.0
        for (int i = 0; i < n; i++) {
            double area = circles[i].getArea();

            if (area > 30.0) {
                System.out.print(String.format("%.4f", area) + " ");
            }
        }
    }
}
