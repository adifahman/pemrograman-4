interface iBuku{
    void setJudul(String judul);
    String getJudul();
}

class Buku implements iBuku{
    private String judul;
    
    public void setJudul(String input){
        judul = input;
    }
    
    public String getJudul(){
        return judul;
    }
}

public class BukuTest3{
    public static void main(String args[]){
        Buku bk1 = new Buku();
        bk1.setJudul("Matilda");
        System.out.println("Judul : " + bk1.getJudul());
    }
}