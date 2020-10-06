import java.util.Scanner;
import java.lang.Math;
class Tile{
    private int tlenght;
    
    Tile(int tlenght){
        this.tlenght=tlenght;
    }

    int getTLength(){
        return tlenght;
    }
}

class Que42{
    private int length;
    private int width;

    Que42(int length,int width){
        this.length=length;
        this.width=width;
    }
    
    int totalTiles(Tile t){
        int tiles = Math.round((length*width)/(t.getLength()*t.getLength()));
		return tiles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the edge of tile : ");
        int edge = sc.nextInt();
        Tile t = new Tile(edge);
        System.out.print("Enter the Length of floor : ");
        int length = sc.nextInt();
        System.out.print("Enter the Width of floor : ");
        int width = sc.nextInt();
       Que42 f= new Que42(length,width);

        System.out.print("Total tiles required is : "+f.totalTiles(t));
    }
}