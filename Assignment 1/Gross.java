import java.util.Scanner;
class Gross{
public static void main(String argc[]){
System.out.println("Enter basic salary of Employee");
Scanner sc = new Scanner(System.in);
double salary = sc.nextDouble();
double HRA,DA;
if (salary<10000)
{
HRA=0.1*salary;
DA=0.9*salary;
}
else
{	
HRA=2000;
DA=0.98*salary;
}
double GC = salary+HRA+DA;
System.out.println("Gross salary is : " + GC);
}}