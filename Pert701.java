package pert701;

/**
 *
 * @author 20103207 Mita Diani
 */
public class Pert701 {
    
    public static void main(String[] args) {
        mahasiswa MHS = new mahasiswa();
        
        // Overloading
        MHS.datamhs(); //Tanpa Parameter
        MHS.datamhs("23232323"); //Menggunakan 1 Parameter
        MHS.datamhs("12121212","Susanti"); //Menggunakan 2 Parameter
        
    }
}