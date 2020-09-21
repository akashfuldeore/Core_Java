import java.util.Scanner;
class primeB{
public static void main(String argc[]){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Number");
int num =sc.nextInt();
int n, m;
for(int i=1; i<=num;i++)
{
n=i;
m=0;
for(int j=2;j<= n-1;j++)
{
if(n%j==0)
{
m=1;
break;
}
}
if (m==0)
System.out.println(n);
}
}
}

