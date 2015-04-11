public class Animal{
   protected int legs;

   protected Animal(int legs){
      System.out.println("Breeding an Animal");
      this.legs = legs;
   }
   public void walk(){
     System.out.println("Animal can walk");
   }
   
   public void eat(){
     System.out.println("Animal can eat");
   }
}