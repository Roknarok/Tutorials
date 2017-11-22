package FileManagement;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {


        try {
            File f1 = new File("loremipsum.txt");
            File f2 = new File("target.txt");

            InputStream in = new FileInputStream(f1);
            OutputStream out = new FileOutputStream(f2);

            byte[] buf = new byte[1024];

            int len;

            while((len = in.read(buf)) > 0){
                out.write(buf,0,len);
            }

            in.close();
            out.close();
            System.out.println("File was copied");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

