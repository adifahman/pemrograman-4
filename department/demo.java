public class demo {
    public static void main(String[] args){
        department dept1 = new department();
        department dept2 = new department("A1");
        department dept3 = new department("A2", "Keuangan");
        
        divison div1 = new divison("A3", "Tata Usaha", "Mr. X");
        divison div2 = new divison();
        
        dept1.tampilkanInfo();
        dept2.tampilkanInfo();
        dept3.tampilkanInfo();
        
        div1.tampilkanInfo();
        div1.hitungGaji(2000000);
        div2.tampilkanInfo();
        div2.hitungGaji(3000000);
    }
}
