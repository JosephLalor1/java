class Sphere extends ThreeDShape
{
    private double radius;
    public Sphere(String name, String colour, double radius)
        { 
            super(name, colour); 
            setRadius(radius);
        }

    public double volume()
        {
            return (4.0 / 3.0) * Math.PI * (getRadius() * getRadius() * getRadius());
        }
    
    public double area()
        {
            return 4 * Math.PI * (getRadius() * getRadius());
        }

    public String toString()
        {
            return (super.toString() + "\nRadius: " + getRadius() + "\nArea: " + area() + "\nVolume: " + volume());
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
