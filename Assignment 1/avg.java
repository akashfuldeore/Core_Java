import java.util.Scanner;
class avg{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Marks of 5 Subject");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int e = sc.nextInt();


int avg = ((a+b+c+d+e)/5);

System.out.println("percentage marks =" + avg + "%" );
}}