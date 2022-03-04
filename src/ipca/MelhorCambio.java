package ipca;


public class MelhorCambio {
    private Url url;
    private String html = "";
    private final String URL = "http://www.idealsoftwares.com.br/indices/ipca_ibge.html";
                  
    public MelhorCambio() {
        this.url = new Url(URL);
        this.html = url.getContents();
    }
    
    public String getIPCA(){
//        String aux = "";
//        RegEx rx= new RegEx(this.html, "<ul id=\"dadoBrasil\"[\\s\\w\\d\\W]*/header>");
//        aux = rx.findAll();
//
//        RegEx x = new RegEx(aux, "[0-9\\,]+\\%");
//        aux = x.findAt(2);
        return this.html;
    }
    
}
