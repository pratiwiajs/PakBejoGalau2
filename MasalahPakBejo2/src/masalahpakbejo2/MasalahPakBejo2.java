/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masalahpakbejo2;
/* Pak Bejo ingin memasang keramik untuk lantai rumahnya yang berukuran luas total 100 m2 .
Sesampainya di toko keramik, Pak Bejo kebingungan dikarenakan ada 3 pilihan keramik yang menurutnya bagus, yaitu:
• Keramik A:
Ukuran: 30 cm x 30 cm
Harga per box (isi 10 pcs): Rp 54.000
• Keramik B:
Ukuran: 40 cm x 40 cm
Harga per box (isi 5 pcs): Rp 65.000
• Keramik C:
Ukuran: 30 cm x 40 cm
Harga per box (isi 8 pcs): Rp 60.000 */

/**
 *
 * @author pratiwiajs
 */
public class MasalahPakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Keramik A*/
        Keramik2 luasnyaA = new Keramik2 (30, 30, 10);
        luasnyaA.macam = 'A';
        System.out.println(("Luas Keramik " + luasnyaA.macam + " satu boxnya adalah " + luasnyaA.luasKeramikPerBox() ));
        
        Keramik2 boxA = new Keramik2 (1000000, 30*30*10);
        boxA.macam = 'A';
        System.out.println(("Jumlah box keramik " + boxA.macam + " yang diperlukan untuk mencukupi kebutuhan Pak Budi adalah " + boxA.jumlahBox()));
    
        Keramik2 hargaA = new Keramik2(54000);
        hargaA.macam = 'A';
        hargaA.keramiknya = 30*30*10;
        System.out.println(("Uang yang harus dikeluarkan untuk membeli keramik ") + hargaA.macam + (" totalnya adalah " + hargaA.harganya() ));
        
        
        /*Keramik B*/
        Keramik2 luasnyaB = new Keramik2 (40, 40, 5);
        luasnyaB.macam = 'B';
        System.out.println(("Luas Keramik " + luasnyaB.macam + " satu boxnya adalah " + luasnyaB.luasKeramikPerBox() ));
        
        Keramik2 boxB = new Keramik2 (1000000, 40*40*5);
        boxB.macam = 'B';
        System.out.println(("Jumlah box keramik " + boxB.macam + " yang diperlukan untuk mencukupi kebutuhan Pak Budi adalah " + boxB.jumlahBox()));
    
        Keramik2 hargaB = new Keramik2(65000);
        hargaB.macam = 'B';
        hargaB.keramiknya = 40*40*5;
        System.out.println(("Uang yang harus dikeluarkan untuk membeli keramik ") + hargaB.macam + (" totalnya adalah " + hargaB.harganya() ));
    
        
        /*Keramik C*/
        Keramik2 luasnyaC = new Keramik2 (30, 40, 8);
        luasnyaC.macam = 'C';
        System.out.println(("Luas Keramik " + luasnyaC.macam + " satu boxnya adalah " + luasnyaC.luasKeramikPerBox() ));
        
        Keramik2 boxC = new Keramik2 (1000000, 30*40*8);
        boxC.macam = 'C';
        System.out.println(("Jumlah box keramik " + boxC.macam + " yang diperlukan untuk mencukupi kebutuhan Pak Budi adalah " + boxC.jumlahBox()));
    
        Keramik2 hargaC = new Keramik2(60000);
        hargaC.macam = 'C';
        hargaC.keramiknya = 30*40*8;
        System.out.println(("Uang yang harus dikeluarkan untuk membeli keramik ") + hargaC.macam + (" totalnya adalah " + hargaC.harganya() ));
    }
}
        
        
        