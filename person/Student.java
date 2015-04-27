public class Student extends Person{
    private String StudentID;
    
    public Student(String setName, String setID){
        super(setName);
        StudentID = setID;
    }
    
    public void setStudentID(String setID){
        StudentID = setID;
    }
    
    public String getStudentID(){
        return StudentID;
    }
    
    public void learn(){
        System.out.println("Student learning");
    }
    
    @Override
    public void sleep(){
        System.out.println("People sleep 6 hour(s)");
    }
    
    @Override
    public void sleep(int newDuration){
        System.out.println("Student sleep " + newDuration + " hour(s)");
    }
}
