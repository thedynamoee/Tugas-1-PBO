public class VirtualDemo {
    public static void main(String[]args){
        Gaji s = new Gaji ("Wahyu","KUBAR", 3, 5000.00);
        Pegawai e = new Gaji ("Ini nama", "Samarinda", 2, 2500.00); //Merupakan upcasting 
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();

    }
}

/* Menghasilkan output "Menyusun Pegawai" double karena terdapat constructor pada class Gaji 
 * yang merupakan subclass dari class Pegawai yang dapat mengakses method dari class Pegawai
 */
