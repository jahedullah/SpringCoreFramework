package DependencyInjection.Constructor;

public class Student {
    private String studentName;
    private int Id;
    public Student(String studentName){
        this.studentName = studentName;
    }
    public Student(String studentName, int Id){
        this.studentName = studentName;
        this.Id = Id;
    }
    public void displayStudentInfo(){
        System.out.println("Hi My name is : "+studentName+". My id : "+Id);
    }
}
