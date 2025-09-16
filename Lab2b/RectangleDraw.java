
// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
class RectangleDraw 
{
    public static void main(String[] args) 
        {
            Rectangle rectangle1 = new Rectangle();
            rectangle1.setLength(4);
            rectangle1.setWidth(10);

            System.out.println(rectangle1.toString() + ", Area: " + rectangle1.getArea() + ", Perimeter: " + rectangle1.getPerimeter());
            rectangle1.printRectangle();
        }
}
