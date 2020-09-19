import java.util.*;
public class large2
{
public static void main(String[] args) {
int a,b,c;
System.out.print("Enter three numbers: ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
int max = 0;
max = ((a > b) && (a > c)) ? a : ((b > a) && (b > c)) ? b : c;
System.out.println("The largest among three numbers is " + max);
}
}