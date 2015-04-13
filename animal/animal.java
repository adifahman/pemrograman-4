public class animal{
    protected int legs;
    
    public animal(){
        
    }
    protected animal(int legs){
        System.out.println("Animal spawned");
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Animal can walk");
    }

    public void eat(){
        System.out.println("Animal can eat");
    }
}
