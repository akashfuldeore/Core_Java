import java.util.Scanner;
class Circle{
    private double R;
    private double A;
    void init(double R){
        this.R =R;
    }
    void calArea(){
      A = 3.14*R*R;
      
    }
    void display(){
        System.out.println("Area of the Circle="+A);
    }
}
class Que34{
    public static void main(String argc[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius of circle");
     double r = sc.nextDouble();
     Circle c = new Circle();
     c.init(r);
     c.calArea();
     c.display();
    }
}