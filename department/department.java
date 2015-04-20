public class department{
    protected String id;
    protected String nama_dept;
    
    public department(){
        id = "(id)";
        nama_dept = "(nama dept)";
    }
    
    public department(String newID){
        id = newID;
    }
    
    public department(String newID, String newNm_dept){
        id = newID;
        nama_dept = newNm_dept;
    }
    
    public void tampilkanInfo(){  
        System.out.println("ID : " + id);
        System.out.println("Departemen : " + nama_dept);
    }
}