package ReadNetworkFile;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadNetworkFile {

    public static void main(String[] args) {

        StringBuilder sb = null;
        try {
            URL url = new URL("http://services.explorecalifornia.org/rss/tours.php");


            InputStream stream = url.openStream();

            BufferedInputStream buf = new BufferedInputStream(stream);

            sb = new StringBuilder();

            while (true){
                int data = buf.read();

                if (data == -1){
                    break;
                }
                else{
                    sb.append((char)data);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb);





    }
}
