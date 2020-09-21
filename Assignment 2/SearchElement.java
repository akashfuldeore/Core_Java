import java.util.*;
 
 class SearchElement {
    public static void main(String args[]) {
        int num, i;
       
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int inputArray[] = new int[500];
   
        System.out.println("Enter " + n + " elements");
        for(i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
 
        System.out.println("Enter element to search");
        num = sc.nextInt();
        // Compare each element of array with num
        for (i = 0; i < n; i++) {
            if(num == inputArray[i]){
               System.out.println(num+" is present at index "+i);
               break;
            }
        }
   
        if(i == n)
           System.out.println(num + " not present in input array");
    }
}