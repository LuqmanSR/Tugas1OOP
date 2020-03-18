/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //membuat objek
        Mahasiswa mhs = new Mahasiswa();

        //memberi nilai atau value
        mhs.nama = "Luqman Syafi Rabbani";
        mhs.kelas = "4B";
        mhs.nim = "18090075";

        //memanggil data
        System.out.println("Nama: "+mhs.nama);
        System.out.println("Kelas: "+mhs.kelas);
        System.out.println("NIM: "+mhs.nim);
    }
    
}
