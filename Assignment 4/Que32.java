class student{
    private int rno;
    private String name;
    private static int  count;
    void setData( int no, String sname, int c){
        rno = no;
        name  = sname;
        count =c ;

    }
    void showData(){
       System.out.println(rno + " " +name  + " " +count);
    }
}

class Que32{
     public static void main(String[] args) {
        student s =new student();
        s.setData(101,"Akash",1);
     
        s.showData();
        student s1 =new student();
        s1.setData(102,"Akash",2);
     
        s1.showData();
    }
}