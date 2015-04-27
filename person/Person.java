public class Person {
    private String name;
    
    public Person(String setName) {
        name = setName;
    }
    
    public void setName(String iName){
        name = iName;
    }
    
    public String getName(){
        return name;
    }
    
    public void eat(){
        System.out.println("Person eating food");
    }
    
    public void sleep(){
        System.out.println("People sleep 8 hour(s)");
    }
    
    public void sleep(int setDuration){
        System.out.println("People sleep" + setDuration + " hour(s)");
    }
}
