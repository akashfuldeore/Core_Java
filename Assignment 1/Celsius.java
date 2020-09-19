import java.util.Scanner;
public class Celsius {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the temperature in Fahrenheit");
float f=sc.nextFloat();
float c = 5*(f-32)/9;
System.out.println("temperature from Fahrenheit to Celsius=" + c);
}}