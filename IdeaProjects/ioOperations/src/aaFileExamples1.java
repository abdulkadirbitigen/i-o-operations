import java.io.*;
public class aaFileExamples1 {

    public static void main (String[] args) {

        File dosya=new File("C:\\Users\\PC\\Desktop\\Kitap.txt");

       try {
            dosya.createNewFile();//Yeni dosya oluşturmak
            System.out.println("Dosya oluşturuldu.");
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        //--------------------------------------------------------------------

        File klasor=new File("C:\\Users\\PC\\Desktop\\Yeni klasör");

        try {
            klasor.mkdir();//Yeni klasör açmak
           System.out.println("Klasör oluşturuldu.");
        }

       catch (Exception e) {
            e.printStackTrace();
        }

       if(dosya.canRead()==true && dosya.canWrite()==true)

           System.out.println("Dosya okunabilir ve yazılabilir");

       // System.out.println(dosya.getName());
        //System.out.println(dosya.getPath());
       // System.out.println(dosya.getUsableSpace());

         File degismis=new File("C:\\Users\\PC\\Desktop\\degismis.txt");
         dosya.renameTo(degismis);
         //dosya.delete();
    }

}



