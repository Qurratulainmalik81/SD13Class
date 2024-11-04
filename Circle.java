public class Circle{
    ///attributes
private double radius;
private String color;
private static double pi;
private static int count;

static{
    pi = 3.14;
    count = 0;
}
//double Area;
//comments
// Constructor is a method with no return type, nit even void
//and has same name as that of the class
//no-argument constructor
public Circle()
{
this.radius = 1.0;
this.color = "red";
this.count++;
}
//parameterized constructor
public Circle(double radius, String c)
{
    this.radius = radius;
    this.color = c;
    this.count++;
}
public Circle(double radius)
{
    this.radius = radius;
    this.color = "Transparent";
    this.count++;
}
public Circle(Circle C)
{
    this.radius = C.getRadius();
    this.color = C.getColor();
    this.count++;
}
//
//getter and setter methods

public void setRadius(double radius)
{
this.radius = radius;
}
public double getRadius()
{
    return this.radius;
}
public void setColor(String color) {

   
    this.color = color;
}
public String getColor() {
    return color;
}

    //methods behavour

    public void display()
    {
       System.out.println(this.radius + " has color =  " + this.color + " total Circles = " + this.count );

     }
     public void display(int flag)
     {
        if(flag == 1)
        System.out.println("hello");
        else
        System.out.println("bye");

     }
    public double Area()
    {
   
        displayStaticData();
        return (pi * this.radius * this.radius);

    }
    public Circle newCircle()
    {
        return this;
    }
public static void displayStaticData()
{
    
    System.out.println(pi + count);
}

public String toString()
{
 return ("Circle " + count + " has radius = " + this.radius + " has color =  " + this.color );
   
}
}
