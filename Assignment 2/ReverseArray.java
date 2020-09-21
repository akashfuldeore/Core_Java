import java.util.Scanner;
class ReverseArray{
public static void main(String argc[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Number of element=");
int n= sc.nextInt();


int ar[] = new int[n];
System.out.println("Enter all the element=");

for (int i = 0; i < ar.length; i++) 
{  
ar[i] = sc.nextInt();
  
}
//System.out.println(ar[i]);
System.out.println("Array in reverse order: ");
  
for(int i = ar.length-1; i >= 0; i--) 
{  
System.out.println(ar[i]);  
}

}
} 