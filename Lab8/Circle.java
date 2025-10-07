class Circle extends TwoDShape 
{
    private double radius;
    public Circle(String name, String colour, double radius)
        { 
            super(name, colour); 
            setRadius(radius);
        }
    
    public double area()
        {
            return Math.PI * (getRadius() * getRadius());
        }

    public String toString()
        {
            return (super.toString() + "\nRadius: " + getRadius() + "\nArea: " + area());
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
