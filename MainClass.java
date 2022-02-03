/*
Q.2] Concept of method implementation
Write a program to create ‘Square’ and ‘Rectangle’ class.
i. Implement methods to calculate area and perimeter of square and rectangles.
These two methods are going to take side as argument in square and length and breadth in case of rectangle.
ii. Create a ‘MainClass’ in which define main method ,in which create two object for each Square and Rectangle class, Now calculate then show area and perimeter in the console after providing appropriate values for side , length & breadth using methods of these classes.
 */
package Assignment1;
class Square
{
    public void Area(double side)
    {
        double calArea = side * side;
        System.out.println("Area of Square is:\t"+calArea);
    }
    public void Perimeter(double side)
    {
        double calPerimeter = 4 * side;
        System.out.println("Perimeter of Square is:\t"+calPerimeter);
    }
}
class Rectangle
{
    public void Area(double length, double breadth)
    {
        double calArea = length * breadth;
        System.out.println("Area of Rectangle is:\t"+calArea);
    }
    public void Perimeter(double length,double breadth)
    {
        double calPerimeter = 2 * (length + breadth);
        System.out.println("Area of Rectangle is:\t"+calPerimeter);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();

        s1.Area(2.5);
        s1.Perimeter(3.0);
        r1.Area(5.5,3.5);
        r1.Perimeter(7.5,2);
    }
}


/* output:
Area of Square is:	6.25
Perimeter of Square is:	12.0
Area of Rectangle is:	19.25
Area of Rectangle is:	19.0

 */


