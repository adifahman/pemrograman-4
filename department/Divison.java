public class divison extends department{
    private String kepalaDivisi;
    
    public divison(){
        super();
    }
    
    public divison(String id){
        super(id);
    }
    
    public divison(String id, String nm_dept){
        super(id, nm_dept);
    }
    
    public divison(String id, String nm_dept, String new_kd){
        super(id, nm_dept);
        kepalaDivisi = new_kd;
    }
    
    public void tampilkanInfo(){
        System.out.println("ID : " + id);
        System.out.println("Departemen : " + nama_dept);
        System.out.println("Kepala divisi : " + kepalaDivisi);
    }
    public void tampilkanInfo(int gj){
        System.out.println("ID : " + id);
        System.out.println("Departemen : " + nama_dept);
        System.out.println("Kepala divisi : " + kepalaDivisi);
        System.out.println("Gaji : Rp. 2.000.000" + gj);
    }
    
    public void hitungGaji(int gj){
        System.out.println("Gaji : Rp. 2.000.000");
    }
}