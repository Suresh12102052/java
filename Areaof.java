class Shape
{
double dim1,dim2;
//double dim2;
//double dim3;
 public Shape(double dim1, double dim2)
{
this.dim1 = dim1;
 this.dim2 = dim2;
}
public void printArea() 
	{
		//area=dim1*dim2;
		System.out.println("area:" );
	}
}
 class rectangle extends Shape
{
 public rectangle(double dim1,double dim2)
{
super(dim1,dim2);
}
public void printArea() 
{
	 double area=dim1*dim2*10;
	System.out.println("area of rectangle:" +area);
}

}
 class triangle extends Shape
{
 public triangle(double dim1,double dim2 )
{	
super(dim1,dim2);
}
public void printArea()
{
	 double area= 0.5*dim1*dim2;
	System.out.println("area of triangle:" +area);
}
}
class Areaof
{
	public static void main(String args[])
	{
		Shape s1 = new Shape(10, 20);
        s1.printArea();
		triangle t1 = new triangle(10,20);
		t1.printArea();
		//d1.print();
		rectangle r1 = new rectangle(10,5);
		r1.printArea();
	}
}