class Person {
  String name;
  int age;

  Person() {
    this("AAA",21);
    //   name="AkASH";
    // age=22;
    System.out.println("No arg cons");
  }

  Person(String name) {
    this();
    // this.name=name;
    //age=24;
    System.out.println("ONE arg cons");
  }

  Person(String name, int age) {
    //this.name=name;
    //this.age=age;
    System.out.println("TWO arg cons");
  }
}

class Que41{

  public static void main(String[] args) {
    //   Person p1=new Person();
    Person p2 = new Person("Akash");
    // Person p3=new Person("Parag",25);
  }
}