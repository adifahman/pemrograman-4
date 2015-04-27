public class Teacher extends Person{
    private String FacultyID;
    
    public Teacher(String setName, String setID){
        super(setName);
        FacultyID = setID;
    }
    
    public void setFacultyID(String setID){
        FacultyID = setID;
    }
    
    public String getFacultyID(){
        return FacultyID;
    }
    
    public void lecture(){
        System.out.println("Teacher lecturing student");
    }
}
