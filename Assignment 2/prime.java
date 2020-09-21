import java.util.Scanner;
class prime{
public static void main(String argc[]){
Scanner sc = new  Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
int i,j,m=0;
for(i=2; i<=num-1;i++)
{
if(num%i==0)
{
System.out.println("Number is not Prime");
m=1;
break;
} }
if(m==0)
System.out.println("Number is Prime");
}}