import java.util.Scanner;
class Product{
    int pid;
    int price;
    int quanity;
    Product(int pid, int price, int quanity){
        this.pid=pid;
        this.price=price;
        this.quanity=quanity;
    }

    static void highestPriceProduct(Product arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
			 
				if(arr[i].price > arr[j].price) {
					
					int temp = arr[i].price;
					arr[i].price = arr[j].price;
					arr[j].price = temp;
				}
			}
		}
		
		int len = arr.length-1;
		System.out.println("=========================================");
		System.out.println("Highest price product is " +arr[len].price);
		System.out.println("=========================================");
    }
    
    static void totalAmountSpentOnProduct(Product arr[]) {
		
		for(Product a : arr) {
			
			int total = a.price * a.quanity;
		
			System.out.println("total amount spent by pId "+a.pid+" is : "+total);
			System.out.println("================================================");
			
			total = 0; 
		}
		
	}
	
    void show(){
        System.out.println(pid +" "+ price + " "+quanity );
    }
}

class Que39{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Product arr[] = new Product[2];
    
    for(int i=0; i<arr.length ; i++){
        System.out.println("Enter ID");
        int pid = sc.nextInt();
        System.out.println("Enter price");
        int price = sc.nextInt();
        System.out.println("Enter Quantity");
        int quanity = sc.nextInt();
        
        
        Product e = new Product(pid,price,quanity);
        arr[i]=e;
       
    }
    for(Product a : arr){
        a.show();
    }
    Product.highestPriceProduct(arr);
    Product.totalAmountSpentOnProduct(arr);
		
    }
}