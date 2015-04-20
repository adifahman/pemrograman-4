public class Demo {
    public static void main(String[] args){
        Departement dept1 = new Departement();
        Departement dept2 = new Departement("A1");
        Departement dept3 = new Departement("A2", "Keuangan");
        
        Divison div1 = new Divison("A3", "Tata Usaha", "Lieur");
        Divison div2 = new Divison();
        
        dept1.tampilkanInfo();
        dept2.tampilkanInfo();
        dept3.tampilkanInfo();
        
        div1.tampilkanInfo();
        div1.hitungGaji(2000000);
        div2.tampilkanInfo();
        div2.hitungGaji(3000000);
    }
}
