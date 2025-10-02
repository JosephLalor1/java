class Rectangle extends TwoDShape
{
    private double height;
    private double width;
    public Rectangle(String name, String colour, double height, double width)
        { 
            super(name, colour); 
            setHeight(height);
            setWidth(width);
        }
    
    public double area()
        {
            return getHeight() * getWidth();
        }

    public String toString()
        {
            return (super.toString() + "\nHeight: " + getHeight() + "\nWidth: " + getWidth() + "\nArea: " + area());
        }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
