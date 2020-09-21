import java.util.Scanner;
class reverse{
public static void main(String argc[]){
Scanner sc =  new Scanner(System.in);
System.out.println("Enteh the Number");
int n  = sc.nextInt();
int  rev=0, rem;
while (n != 0)
{
rem = n%10;
rev = rev*10 + rem;
n /= 10;
}
System.out.println(rev);
}}