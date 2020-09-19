import java.util.Scanner;
class circle{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius=");
float r = sc.nextFloat();
float A = 3.14f*r*r;
System.out.println("Area of Circle="+A);
float C = 2*3.14f*r;
System.out.println("Circ of Circle="+C);
}}