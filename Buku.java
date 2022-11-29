package com.mycompany.ujianpraktekobjek;

public class Buku {
    public String judul,kelas,penulis,penerbit;
    public int harga;
    
    public Buku(String judul,String kelas,String penulis,String penerbit,int harga){
        this.judul = judul;
        this.kelas = kelas;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.harga = harga;
       
    }
    public void getInfo(){
        System.out.println("Judul: " + judul);
        System.out.println("Kelas: " + kelas);
        System.out.println("Penulis: " + penulis);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Harga: " + "Rp." + harga);
    }
    public static void main(String[]args){
        Buku Buku1 = new Buku("Pemograman Berorientasi Objek", "XII RPL", "Teguh Purnomo", "Erlangga", 95000);
        Buku1.getInfo();
    }
}
