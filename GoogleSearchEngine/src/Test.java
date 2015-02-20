import java.io.*;
import java.net.*;
import java.util.*;

public class Test {

    public static void main (String args[]) {

    	URL url;
        InputStream is = null;
        DataInputStream dis;
        String line;
        URLConnection c;
        
        String urlString  = "http://www.google.com/search?q=" ; 
        String searchString = "test" ; 

        try {
            url = new URL(urlString + searchString);
            c = url.openConnection();
            c.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.168");
            c.connect();
            is = c.getInputStream();
            dis = new DataInputStream(new BufferedInputStream(is));
            while ((line = dis.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException mue) {
             mue.printStackTrace();
        } catch (IOException ioe) {
             ioe.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException ioe ) {
                // nothing to see here
            }
        }
    }
} 