package ipca.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx {
    Pattern p;
    Matcher m;

    public RegEx(String target, String pattern) {
        this.p = Pattern.compile(pattern, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        this.m = p.matcher(target);
    }
    
    public String findAll(){
        String output = "";
        while (m.find()) {
            output = output + m.group().toString();
        } 
        
        return output;
    }
    
    public  String findAt(int position){
        for (int j = 0; j < position; j++) {
            m.find();
                   
            if (j==position-1) {
               return m.group();
            }
        }
        
        return "";
    }
    
}
