// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class Rectangle 

{
    private int length = 1;
    private int width = 1;

    public void setLength (int length)
        {
            if (length > 0 && length < 40)
                {
                    this.length = length;
                }
            else
                {
                    System.out.println("Input invalid");
                }
        }

    public void setWidth (int width)
        {
            if (width > 0 && width < 40)
                {
                    this.width = width;
                }
            else
                {
                    System.out.println("Input invalid");
                }
        }
    public int getLength()
        {
            return length;
        }
    public int getWidth()
        {
            return width;
        }
    public String toString()
        {
            String sentence;
            sentence = "Length = " + length + ", Width = " + width;
            return sentence;
        }
    public int getArea()
        {
            int area;
            area = length * width;
            return area;
        }
    public int getPerimeter()
        {
            int perimeter;
            perimeter = (2 * length) + (2 * width);
            return perimeter;
        }
    public void printRectangle()
        {
            int index;
            int i2;
            for (index = 0; index < width; index++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            for (index = 0; index < length - 2; index++)
                {
                    System.out.print("*");
                    for (i2 = 0; i2 < width - 2; i2++)
                        {
                            System.out.print(" ");
                        }
                    System.out.println("*");
                }
            for (index = 0; index < width; index++)
                {
                    System.out.print("*");
                }
        }
}
