package ASSIGNMENT;

import java.util.Scanner;
public class Que52 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name of a person");
        String a = in.next();
        System.out.println("Vowels in the name="+count_Vowels(a));
        
     }


public static int count_Vowels(String str)
{
    int count = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
            || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' 
            || str.charAt(i) == 'E' || str.charAt(i) == 'O' || str.charAt(i) == 'I' 
            || str.charAt(i) == 'U')
        {
            count++;
        }
    }
    return count;
}
}
