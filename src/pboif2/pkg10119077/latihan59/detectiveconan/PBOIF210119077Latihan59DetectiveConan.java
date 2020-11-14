/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan59.detectiveconan;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Detective Conan inheritance dan polymophism
 */
public class PBOIF210119077Latihan59DetectiveConan {


    public static void main(String[] args) {
        ShinichiKudo objShinchiKudo = new ShinichiKudo("Detektif", "Bernyanyi", "Yusaku Kudo", "Ran Mouri", "Sepak bola dan olahraga lainnya");
        objShinchiKudo.setNama("Shinchi Kudo");
        KaitoKid objKaitoKid = new KaitoKid("Pesulap, Pencuri baik hati", "Takut ikan", "Touchi Kuroba", "Aoko Nakamori", "Bermain papan ski");
        objKaitoKid.setNama("Kaito Kuroba");
        
        System.out.println("======Karakter Kartun dalam Anime Detective Conan======");
        System.out.println("Nama                : "+objShinchiKudo.getNama());
        objShinchiKudo.tampilHasil();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama                : "+objKaitoKid.getNama());
        objKaitoKid.tampilHasil();
    }
    
}
