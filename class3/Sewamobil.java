/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author dell
 */
import java.io.*;
class Sewamobil {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
        static void sewa() throws IOException{
        String nama, merk, nomob;
int nomobil, lama, harga, bayar;
int telat, denda, total,n;
String tanggal, kembali;
int[] mobil = new int[10];
int i;

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
while(true)
{

          
System.out.print("Masukkan Jumlah data yang akan di input : "); n=Integer.parseInt(in.readLine());
for( i=1; i<=n; i++ )
{
System.out.print("=========RENTAL MOBIL===========\n");
System.out.print("Masukkan Data-data berikut ini :\n");
System.out.print("Nama : ");nama=in.readLine();
System.out.print("No Mobil N <XXXX> ?? : ");nomob= in.readLine();
System.out.print("Tanggal pinjam : ");tanggal=in.readLine();
System.out.print("Tanggal Kembali : ");kembali=in.readLine();
System.out.print("Lama Peminjaman : ");lama= Integer.parseInt(in.readLine());
System.out.print("Terlambat Kembali(Hari) : ");telat= Integer.parseInt(in.readLine());
System.out.println("===========================================\n ");
    switch (nomob) {
        case "N 1234 AZ":
            merk = "Mini Cooper";
            harga = 500000;
            break;
        case "N 2345 ZA":
            merk = "Toyota Xenia";
            harga = 350500;
            break;
        case "N 9098 ZX":
            merk = "Suzuki APV";
            harga = 700000;
            break;
        default:
            merk = "Nomor Mobil Tidak Terdaftar";
            harga = 0;
            break;
    }

bayar = telat*100000;
total = harga*lama+bayar;
System.out.println("===========================================\n ");
System.out.println("======MESIN KASIR RENTAL MOBIL =======\n ");
System.out.print("Nama: \t" + nama + "\n");
System.out.print("No Mobil: \t" + nomob + "\n");
System.out.print("Merk Mobil: \t" + merk + "\n");
System.out.print("Lama Pinjam: \t" + lama + "\n");
System.out.print("Tanggal pinjam: \t" + tanggal + "\n");
System.out.print("Tanggal pengembalian: \t" + kembali + "\n");
System.out.print("Harga: \t" + harga + "\n");
System.out.print("Terlambat Mengembalikan: \t" + telat + "\n");
System.out.print("Denda: \t" + bayar + "\n");
System.out.print("Total bayar: \t" + total + "\n");
}
System.out.println("=================TERIMA KASIH===============\n ");
System.out.println("\n ");
System.out.print("Tekan Y untuk memulai program atau T untuk keluar ");
            String respon = in.readLine();
            if(respon.equals("t")||respon.equals("T"))
            {
                        System.exit(0);
            }
}
}
            public static void main(String[] args) throws IOException{
                sewa();
            }
}