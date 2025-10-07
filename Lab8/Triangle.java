class Triangle extends TwoDShape 
{
    private double base;
    private double height;
    public Triangle(String name, String colour, double base, double height)
        { 
            super(name, colour); 
            setBase(base);
            setHeight(height);
        }
    
    public double area()
        {
            return 0.5 * (getBase() * getHeight());
        }

    public String toString()
        {
            return (super.toString() + "\nBase " + getBase() + "\nHeight " + getHeight() + "\nArea: " + area());
        }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

