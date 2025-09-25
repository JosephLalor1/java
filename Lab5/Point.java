// Author 			: Joseph Lalor
// Date 			: 25/09/2025
// Purpose 		:

public class Point 
{
    private int x;
    private int y;

    public Point()
        {
            this(0, 0);
        }

    public Point(int x, int y)
        {
            setX(x);
            setY(y);
        }
    
    public int getX()
        {
            return x;
        }
    public void setX(int x) 
        {
            this.x = x;
        }
    public int getY() 
        {
            return y;
        }
    public void setY(int y) 
        {
            this.y = y;
        }
    public String toString()
        {
            return "X coord: " + getX() + ", Y coord: " + getY();
        }
}
