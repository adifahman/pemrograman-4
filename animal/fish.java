public class fish extends animal implements pet{
    protected String name;
    public fish() {
        System.out.println("Fish adopted");
    }
    public fish(String name) {
        //super(this.name);
        System.out.println("This fish called " + name);
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String newName){
        name = newName;
    }
    @Override
    public void play(){
        System.out.println("Fish is playing");
    }
    public void walk(){
        System.out.println("Fish is swimming");
    }
    public void eat(){
        System.out.println("Fish is eating");
    }
}