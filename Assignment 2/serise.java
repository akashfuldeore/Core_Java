'import java.util.Scanner;
class serise{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number=");
int N = sc.nextInt();
int sum=0;
for(int i=0;i<=N;i++){
sum = sum+(i*i);
}
System.out.println(sum);
}
}
