package ApacheFilesUtils;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {


        try {
            File f1 = new File("loremipsum.txt");
            File f2 = new File("target.txt");

            FileUtils.copyFile(f1,f2);


            System.out.println("File was copied");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

