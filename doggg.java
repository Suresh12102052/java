import java.util.*;
class dog
{
	protected String name;
	String speak;
	
	dog()
	{
		Scanner kl=new Scanner(System.in);
		name=kl.nextLine();
		speak=kl.nextLine();
		
	}
     void  name_p()
	{
		System.out.print(name);
	}
	void speak_p()
	{
		System.out.print(speak);
	}
}
class labrador extends dog
{
	private String color;
	private int weight;
	labrador(String name,String color,int weight)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
	void print_data()
	{
		System.out.print(name);
		System.out.print(color);
		System.out.print(weight);
	}
}
class doggg
{
	public static void main(String[] args)
	{
	labrador l1=new labrador("oo","white",0);
	l1.print_data();
		
	}
}