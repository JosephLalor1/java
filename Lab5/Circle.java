// Author 			: Joseph Lalor
// Date 			: 25/09/2025
// Purpose 		:

public class Circle extends Point
{
    private int rad;

    public Circle()
        {
            this(0, 0 ,0);
        }

    public Circle(int x, int y, int rad)
        {
            super(x, y);
            setRad(rad);
        }

    public int getRad() 
        {
            return rad;
        }

    public void setRad(int rad) 
        {
            this.rad = rad;
        }
    public String toString()
        {
            return super.toString() + ", Radius: " + getRad();
        }
}
