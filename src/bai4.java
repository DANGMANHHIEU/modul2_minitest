import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu_dent = new Student("Hiếu",27,"C0223G1");

        System.out.println("Họ và tên: "+stu_dent.getName()+"\n"+"Tuổi: "+stu_dent.getAge()+"\n"+"Lớp: "+stu_dent.getNameClass());
        //nhập lại họ tên, tuổi , lớp
        System.out.println("Nhập lại tên, tuổi, lớp!!!");
        System.out.println("Họ và tên:");
        String na_me = sc.nextLine();
        stu_dent.setName(na_me);

        System.out.println("Lớp:");
        String name_class = sc.nextLine();
        stu_dent.setNameClass(name_class);

        System.out.println("Tuổi:");
        int ag_e = sc.nextInt();
        stu_dent.setAge(ag_e);


        System.out.println("Họ và tên: "+stu_dent.getName()+"\n"+"Tuổi: "+stu_dent.getAge()+"\n"+"Lớp: "+stu_dent.getNameClass());
    }
}
  class Student{
    private String name;
    private int age ;
    private String nameClass;
    public Student(String name,int age, String nameClass){
        this.name = name;
        this.age = age;
        this.nameClass= nameClass;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getNameClass(){
        return this.nameClass;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setNameClass(String nameClass){
        this.nameClass = nameClass;
    }
}