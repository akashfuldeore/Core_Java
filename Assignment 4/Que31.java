class student{
    private int rno;
    private String name;
   
    void setData( int no, String sname){
        rno = no;
        name  = sname;

    }
    void showData(){
       System.out.println(rno + " " +name);
    }
}

class Que31{
     public static void main(String[] args) {
        student s =new student();
        s.setData(101,"Akash");
     
        s.showData();
        student s1 =new student();
        s1.setData(102,"Akash");
     
        s1.showData();
    }
}