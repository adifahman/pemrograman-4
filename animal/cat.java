public class cat extends pet{

    public cat(String name) {
        super(name);
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void play(){
        System.out.println("Cat is playing");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
}