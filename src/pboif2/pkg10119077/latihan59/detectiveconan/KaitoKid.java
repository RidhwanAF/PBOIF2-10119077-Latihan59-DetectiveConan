/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan59.detectiveconan;

/**
 *
 * @author RAF
 */
public class KaitoKid extends ManusiaKartun{
    private String nama;

    public KaitoKid(String profesi, String kelemahan, String namaAyah, String wanitaYangDisukai, String hobi) {
        super(profesi, kelemahan, namaAyah, wanitaYangDisukai, hobi);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
