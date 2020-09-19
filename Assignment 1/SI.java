import java.util.Scanner;
class SI{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value p=");
int p =sc.nextInt();
System.out.println("Enter the value N=");
int n =sc.nextInt();
System.out.println("Enter the value R=");
int r =sc.nextInt();
int SI = (p*n*r)/100;
System.out.println("Simple Intrest =" +SI);
}}