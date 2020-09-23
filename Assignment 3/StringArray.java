import java.util.Scanner;
class StringArray{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the how many element in string");
int n = sc.nextInt();

String arr[] = new String[n];
System.out.println("Enter the string");
for (int i=0; i<n ;i++){
arr[i] = sc.nextLine();
}
for(String a : arr){
System.out.println(a);
}
}
}