import java.util.Scanner;

abstract class Shape{
 double one;
 double two;

 void GetData(double one,double two)
  {
     this.one=one;
     this.two=two;
 }
 abstract void display();
}     
  
class Triangle extends Shape{
double base;
double height;   

Triangle(double b,double h)
{
  GetData(b,h);
  base=b;
  height=h;
}
 
void display(){
  double area;
  area=height*base*0.5;
  System.out.println("the area of the triangle is" + area);
}
}

class Rectangle extends Shape{
double length;
double width;   

Rectangle(double l,double w)
{
  GetData(l,w);
  length=l;
  width=w;
}
 
void display(){
  double area;
  area=length * width;
  System.out.println("the area of the rectangle is" + area);
}
}

public class q2{
public static void main(String []args){
Scanner in=new Scanner(System.in);
double length,width,base,height;
System.out.println("enter the dimensions of the rectangle");
length=in.nextDouble();
width=in.nextDouble();
System.out.println("enter the dimensions of the triangle");
height=in.nextDouble();
base=in.nextDouble();

Rectangle r=new Rectangle(length,width);
Triangle t=new Triangle(base,height);
t.display();
r.display();
}
}
