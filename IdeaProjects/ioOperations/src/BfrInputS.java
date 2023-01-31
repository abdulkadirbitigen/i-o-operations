import java.io.*;

public class BfrInputS {

    public static void main(String[] args) {

        File dosya=new File("C:\\Users\\Pc\\Desktop\\input.txt");

        byte[] dizi=new byte[(int)dosya.length()];

        try {

            FileInputStream fs=new FileInputStream(dosya);

            BufferedInputStream bs=new BufferedInputStream(fs);

            int okunan=0;

            while ((okunan=bs.read(dizi))!=-1) {

                String data=new String (dizi,0,okunan);

                System.out.print(data);

            }

            bs.close();

        }

        catch (IOException e) {

            e.printStackTrace();

        }



        File f=new File("C:\\Users\\Pc\\Desktop\\output.txt");

        String text="Bu bir bufferedStream Örneğidir. eger bu yazı output.txt içindeyse sıkıntı yok.";

        try {

            FileOutputStream fs=new FileOutputStream(f,true);

            BufferedOutputStream bs=new BufferedOutputStream(fs);

            bs.write(text.getBytes());

            //Bufferda bulunan verilerin dosyaya yazılmasını sağlar.

            bs.flush();

            bs.close();

        }

        catch (IOException e) {

            e.printStackTrace();

        }

    }

}