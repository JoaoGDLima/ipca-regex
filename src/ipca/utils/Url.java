
package ipca.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Url {
    private final String url;
    
    public Url(String url) {
        this.url = url;
    }
    
    public String getContents() {
        StringBuilder content = new StringBuilder();

        try {
            URL aux = new URL(this.url);
            URLConnection urlConnection = aux.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
