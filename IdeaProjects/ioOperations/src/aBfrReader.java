import java.io.*;

import java.util.Scanner;

public class aBfrReader{

    public static void main(String[] args) {

        File dosya = new File("C:\\Users\\Pc\\Desktop\\Kitap.txt");

        try {//Veri okuma

            FileReader fr = new FileReader(dosya);

            BufferedReader br = new BufferedReader(fr);

            String satir;

            while ((satir = br.readLine()) != null) {

                System.out.println(satir);

            }

            br.close();
        } catch (Exception e) {

            System.err.println(e.toString());

        }

        Scanner s=new Scanner(System.in);

        System.out.println("Bir ifade giriniz.");

        String line=s.nextLine();

        File dosya2=new File("C:\\Users\\Pc\\Desktop\\Kitap.txt");

        try {

            FileWriter fw=new FileWriter(dosya2);

            BufferedWriter bw=new BufferedWriter(fw);

            bw.write(line.toString());

            //Bufferda bulunan verilerin dosyaya yazılmasını sağlar.

            bw.flush();

            bw.close(); //BufferedWriter nesnesi kapatılıyor

            System.out.println("Dosya yazıldı");

        }catch (IOException e) {

            e.printStackTrace();

        }

    }

}
