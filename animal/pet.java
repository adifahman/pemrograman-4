public abstract class pet{
    protected String name;
    
    public pet(String name){
        //super();
        System.out.println("Adopting pet");
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void play(){
        System.out.println("Pet is playing right now");
    }
}
