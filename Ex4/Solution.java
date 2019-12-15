import java.lang.Math;
abstract class Shape{
	abstract void computearea();
}
abstract class TwoDimensionnalShape extends Shape{
	abstract void  getlocation();
}
abstract class ThreeDimensionnalShape extends Shape{
	abstract void  getlocation();
}
class Circle extends TwoDimensionnalShape{
	int x,y,r;
	Circle(int x,int y){
		this.x=x;
		this.y=y;
		r=x+y;
	}
	void getlocation(){
		
	}
	void computearea(){
		System.out.println("Circle is a TwoDimensionnalShape with center at ("+x+","+y+")");
		System.out.println("Area of Circle with center at ("+x+","+y+") is = "+(Math.PI*r*r));
	}
}
class Square extends TwoDimensionnalShape{
	int x,y;
	Square(int x,int y){
		this.x=x;
		this.y=y;
	}
	void getlocation(){
		
	}
	void computearea(){
		System.out.println("Square is a TwoDimensionnalShape with edge = "+x);
		System.out.println("Area of Square with edge "+x+" is = "+(x*x));
	}
}
class Sphere extends ThreeDimensionnalShape{
	int x,y,z,r;
	Sphere(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
		r=x+y+z;
	}
	void getlocation(){
		
	}
	void computearea(){
		System.out.println("Sphere is a ThreeDimensionnalShape with center at ("+x+","+y+","+z+")");
		System.out.println("Surface Area of Sphere with center at ("+x+","+y+","+z+") is = "+(4*Math.PI*r*r));
	}
}
class Cube extends ThreeDimensionnalShape{
	int x,y,z;
	Cube(int x,int y,int r){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void getlocation(){
		
	}
	void computearea(){
		System.out.println("Cube is a ThreeDimensionnalShape with edge = "+x);
		System.out.println("Surface Area of Cube with edge "+x+" is = "+(6*x*x));
	}
}		
public class Solution{
	public static void main(String args[]){
		Shape s[] = new Shape[4];
		s[0] = new Circle(2,3);
		s[1] = new Sphere(1,2,3);
		s[2] = new Square(4,4);
		s[3] = new Cube(6,6,6);
		for(int i=0;i<4;i++){
			s[i].computearea();
			System.out.println();
		}
	}
}