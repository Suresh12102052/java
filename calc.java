interface cal
{
void Add(int a);
void Sub(int a);
void div(int a);
void mul(int a);
}
class Add implements cal
{
int a;
int b;
public void Add();
{
System.out.print(a+b);
}
public void Sub();
{
System.out.print(a-b);
}
public void mul();
{
System.out.print(a*b);
}
public void div();
{
System.out.print(a/b);
}
}

class calc
{
public static void main (String[]args)
{
add c = new c();
int a ;int b;
c.Add(2,2);
c.Sub(2,2);
c.mul(2,2);
c.div(2,2);
}
}