public class Student {
    String name;
    int id;
    String classNo;
    String dept;
    int phNumber;
    public void talk(){
        System.out.println("students are talking");
    }
    public void makeNoise(){
        System.out.println("students are making noise");
    }
    public void coding(){
        System.out.println("students are coding");
    }
}

public class Test {
  public static void main(String[] args) {
    //  int[] arr=new int[5];
    Student std1 = new Student();
      
      System.out.println(std1.name);
       std1.name="varshini";
       std1.id=88;
     std1.classNo="g2";
      std1.dept="cse";
       std1.phNumber=12;
  }
  }
