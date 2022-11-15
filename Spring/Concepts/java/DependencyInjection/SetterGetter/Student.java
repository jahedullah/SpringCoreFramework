package DependencyInjection.SetterGetter;
public class Student {
    private String studentName;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void displayStudentInfo() {
        System.out.println("Hi my name is : " + studentName);
    }
}
