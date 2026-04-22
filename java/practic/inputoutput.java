
import java.util.*;
import java.io.*;
public class inputoutput {
    public static void main(String[] args) {
       File inputFile = new File ("studentdetails.csv");
        File outfile = new File ("studentdetailscopy.csv");


 try {
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outfile);

            int data;

            // read byte by byte
            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("\nFile copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
