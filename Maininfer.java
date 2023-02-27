import java.util.Scanner;
class infer
{
int num1;
int num2;
infer();
{
Scanner st=new Scanner(System.in);
Sytem.out.println("enter the num1");
num1=st.nexrInt();
Sytem.out.println("enter the num2");
num2=st.nextInt();
}
int calculator() 
{
 int a=num1*num2;
Sytem.out.println("mul"+a);
return a;
}
}
class Maininfer
{
public static void main(Strings[]args)
{
infer a1=new infer();
infer a2=new infer();
{
 int result=a1.calculator();
 Sytem.out.println("result");
 int result=a2.calculator();
 Sytem.out.println("result");
}
}
}