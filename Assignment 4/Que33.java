class stud{
  private int RollNo;
  private String Name;
  void set(int RollNo, String Name){
      this.RollNo =RollNo;
      this.Name =Name;
  } 
  void show(){
      System.out.println(RollNo + " " + Name);
  }  
}

class Que33{
    public static void main(String argc[]) {
     stud s = new stud();
     s.set(111,"Akash");
     s.show();
        
    }
}