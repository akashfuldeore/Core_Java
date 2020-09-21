import java.util.Scanner;
class table{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number");
int n = sc.nextInt();
int i;
for(i=1;i<=10;i++)
{
int table = i*n;
System.out.println(table);
}
}}