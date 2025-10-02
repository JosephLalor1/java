/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Cylinder extends ThreeDShape
{
    private double radius;
    private double height;
    public Cylinder(String name, String colour, double radius, double height)
        { 
            super(name, colour); 
            setRadius(radius);
            setHeight(height);
        }

    public double volume()
        {
            return getHeight() * Math.PI * Math.pow(getRadius(), 2);        
        }
    
    public double area()
        {
            return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
        }

    public String toString()
        {
            return (super.toString() + "\nRadius: " + getRadius() + "\nHeight: " + getHeight() + "\nArea: " + area() + "\nVolume: " + volume());
        }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
