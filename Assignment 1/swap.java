import java.util.Scanner;
class swap{
public static void main(String argc[]){
Scanner sc = new  Scanner (System.in);
System.out.println("Enter the First number");
int a = sc.nextInt();
System.out.println("Enter the Second number");
int b = sc.nextInt();
System.out.println("Before Swapping");
System.out.println(a);
System.out.println(b);
int c;
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping");
System.out.println(a);
System.out.println(b);
}
}


