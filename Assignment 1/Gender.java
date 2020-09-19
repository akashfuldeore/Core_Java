import java.util.Scanner;
class Gender{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Gender");
String G = sc.next();
System.out.println("Enter age");
int A = sc.nextInt();

if(G == "M" || G == "F" && A < 18){
System.out.println("eligible for marriage ");
}
else{
System.out.println(" not eligible for marriage ");
}
}
}