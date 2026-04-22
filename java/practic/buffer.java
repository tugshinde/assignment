import java.util.*;
import java.io.*;

public class buffer {
    


    public static void main(String[] args) {
       File inputFile = new File ("studentdetails.csv");
        File outfile = new File ("studentdetailscopy.csv");


 try {
            // FileInputStream fis = new FileInputStream(inputFile);
            // FileOutputStream fos = new FileOutputStream(outfile);
            BufferedInputStream bis = new BufferedInputStream( new FileInputStream(inputFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream (outfile));

            int data;

            // read byte by byte
            while ((data = bis.read()) != -1) {
                System.out.print((char)data);
                bos.write(data);
            }

            // fis.close();
            bis.close();
            bos.flush();
            // fos.close();
            bos.close();

            System.out.println("\nFile copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

