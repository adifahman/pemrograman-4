public class Divison extends Departement{
    private String kepalaDivisi;
    
    public Divison(){
        super();
    }
    public Divison(String id){
        super(id);
    }
    public Divison(String id, String nm_dept){
        super(id, nm_dept);
    }
    public Divison(String id, String nm_dept, String new_kd){
        super(id, nm_dept);
        kepalaDivisi = new_kd;
    }
    
    public void tampilkanInfo(){
        System.out.println("ID : " + id);
        System.out.println("Departemen : " + nm_dept);
        System.out.println("Kepala divisi : " + kepalaDivisi);
    }
    public void tampilkanInfo(int gaji){
        System.out.println("ID : " + id);
        System.out.println("Departemen : " + nm_dept);
        System.out.println("Kepala divisi : " + kepalaDivisi);
    }
    
    
    public void hitungGaji(int gj){
        System.out.println("Gaji : Rp." + gj);
    }
}
