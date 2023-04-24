import java.util.Scanner;
class Address;
{
String city,state;
Address(String city,String state)
{
this.city=city;    this.state=state;
}
}

class Student
{
int roll;
String name;
Address add;
Student(int roll,String name,Address=add)
{
this.roll= roll;  this.name=name;  this.add;
}
void show()
{
System.out.println(roll+ "  "+name);
System.out.println(add.city+ "  "+add.stste);
}
public ststic void main(Strings[] args)
{
Add obj1=new Add("pulparthi"  ,"yellamanchli");
Student obj2=new student(10, "aa" , obj1);  obj2.show();
}
}
