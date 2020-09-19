class exp{
public static void main(String argc[]){
int x=10;
int y1 = 20;
 
//Condation 1
//int y= x*x +3*x -7;
//System.out.println("y = "+ y);

// Condation 2
//int y = x++ + ++x;
//System.out.println("y = "+ y + "\nx= " +x);


// Condation 3
int z= x++ - --y1 - --x  +  x++;
System.out.println("\n z =" + z + "\n y =" + y1 +"\n x =" +x);
}}