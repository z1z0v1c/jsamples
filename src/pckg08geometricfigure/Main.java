package pckg08geometricfigure;

/**
 * Create the Geometric Figures project as follows:
 * <p>
 * - Abstract class Geometric Figure
 * - Three basic classes Circle, Square, Triangle
 * - Derived classes Ellipse, Rectangle and Inequilateral Triangle
 * - Classes have an overlaid method toString() in which the perimeter and area are printed
 * - Each class should contain 3 constructors
 * - The Triangle class defines an equilateral Triangle
 * - The perimeter of the ellipse is calculated as aPI(9-sqrt35)/2, and the area as abPI
 * <p>
 * Create the Main class and in it create instances of the Geometry class and create objects
 * of all base and derived classes with arbitrary arguments.
 * Print the String representation of the object - toString()
 *
 * @author Aleksandar Zizovic
 */
public class Main {
    public static void main(String[] args) {
        GeometricFigure circle = new Circle("blue", true, 5.5);
        GeometricFigure square = new Square("yellow", false, 4.36);
        GeometricFigure triangle = new Triangle("red", true, 7.04);
        GeometricFigure ellipse = new Ellipse("black", false, 8.3, 5.7);
        GeometricFigure rectangle = new Rectangle("green", true, 4.84, 9.56);
        GeometricFigure inequilateralTriangle =
                new InequilateralTriangle("white", false, 4.5, 4.0, 3.5);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(ellipse);
        System.out.println(rectangle);
        System.out.println(inequilateralTriangle);
    }
}
