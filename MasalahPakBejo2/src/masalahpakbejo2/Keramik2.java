/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masalahpakbejo2;

/**
 *
 * @author pratiwiajs
 */
public class Keramik2 {
    /* membuat atribut */
    int panjang, lebar, butuh, perBox, harga, keramiknya;
    char macam;
 
    
    
    /* membuat constructor */
    Keramik2 (int p, int l, int b){
        this.panjang = p;
        this.lebar = l;
        this.perBox = b;
    }
    
    Keramik2 (int b, int k){
        this.butuh = b;
        this.keramiknya = k;
    }
    
    Keramik2 (int h) {
        this.harga = h;
        this.butuh = 1000000;
        this.keramiknya = this.panjang * this.lebar * this.perBox;
    }
    
    
    
    /* membuat method */
    int luasKeramikPerBox(){
        int luasKeramik;
        luasKeramik = this.panjang * this.lebar * this.perBox;
        return luasKeramik;
    }
    
    int jumlahBox(){
        int totalBox;
        totalBox = butuh / keramiknya;
        return totalBox;
    }
    
    int harganya() {
        int hargaTotal;
        hargaTotal = ((this.butuh / this.keramiknya) * this.harga );
        return hargaTotal;
    }
}