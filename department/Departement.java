public class Departement{
    protected String id;
    protected String nm_dept;
    
    public Departement(){
        id = "(id)";
        nm_dept = "(nama dept)";
    }
    
    public Departement(String newID){
        id = newID;
    }
    
    public Departement(String newID, String newNm_dept){
        id = newID;
        nm_dept = newNm_dept;
    }
    
    public void tampilkanInfo(){  
        System.out.println("ID : " + id);
        System.out.println("Departemen : " + nm_dept);
    }
    
//    public void tampilkanInfo(String newID){
//        id = newID;
//        System.out.println("ID : " + id);
//        System.out.println("Departemen : " + nm_dept);
//    }
//    
//    public void tampilkanInfo(String newID, String newNm_dept){
//        id = newID;
//        nm_dept = newNm_dept;
//        System.out.println("ID : " + id);
//        System.out.println("Departemen : " + nm_dept);
//    }
}
