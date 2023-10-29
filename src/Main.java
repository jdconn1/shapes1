import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length;
        float width;
        float perimeter;
        float area;
        float radius;
        float circumference;
        while (true){

            System.out.println("""
                
                Choose a shape you would like to calculate.
                1.) Square
                2.) Rectangle
                3.) Triangle (Equilateral)
                4.) Circle
                5.) Exit
                """);
            int userInput = Integer.parseInt(sc.nextLine());

            switch (userInput){
                case 1:
                    System.out.println("What is the length of the each side?");
                    length = Float.parseFloat(sc.nextLine());
                    Square square = new Square();
                    perimeter = square.calculatePerimeter(length, length);
                    area = square.calculateArea(length, length);
                    System.out.println(MessageFormat.format("The perimeter of the square is {0}, and the area of the square is {1}.", perimeter, area));
                    break;
                case 2:
                    System.out.println("What is the length of the rectangle?");
                    length = Float.parseFloat(sc.nextLine());
                    System.out.println("What is the width of the rectangle?");
                    width = Float.parseFloat(sc.nextLine());
                    Rectangle rectangle = new Rectangle();
                    perimeter = rectangle.calculatePerimeter(length, width);
                    area = rectangle.calculateArea(length, width);
                    System.out.println(MessageFormat.format("The perimeter of the rectangle is {0}, and the area of the rectangle is {1}.", perimeter, area));
                    break;
                case 3:
                    System.out.println("Enter the length of the triangle");
                    length = Float.parseFloat(sc.nextLine());
                    Triangle triangle = new Triangle();
                    perimeter = triangle.calculatePerimeter(length, length);
                    area = triangle.calculateArea(length, length);
                    System.out.println(MessageFormat.format("The perimeter of the triangle is {0}, and the area of the triangle is {1}.", perimeter, area));
                    break;
                case 4:
                    System.out.println("Enter the radius of the circle.");
                    radius =  Float.parseFloat(sc.nextLine());
                    Circle circle = new Circle();
                    circumference = circle.calculateCircumference(radius);
                    area = circle.calculateArea(radius, radius);
                    System.out.println(MessageFormat.format("The circumference of the circle is {0}, and the area of the circle is {1}.", circumference, area));
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
            }
        }

    }
}