import java.util.Scanner;
class student_enroll{
    Scanner s=new Scanner(System.in);
    String name;
    String Course;
    int ph;

    void register(){
        System.out.println("Enter student name: ");
        name=s.nextLine();
        System.out.println("Enter student course: ");
        Course=s.nextLine();
        System.out.println("Enter student mobile number: ");
        ph=s.nextInt();
    }

    void display(){
        System.out.println("Student details are: ");
        System.out.println("Student name: "+name);
        System.out.println("Student course: "+Course);
        System.out.println("Student ph.no: "+ph);
        System.out.println("Student register id is: "+"183cs23033");
    }
    public static void main(String[] args){
        student_enroll se=new student_enroll();
        se.register();
        se.display();
    }
}
