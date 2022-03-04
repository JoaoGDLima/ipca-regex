package ipca;

public class Ibge {
    private Url url;
    private String html = "";
    private final String URL = "https://www.ibge.gov.br/explica/inflacao.php";
    
    public Ibge() {
        this.url = new Url(URL);
        this.html = url.getContents();
    }
    
    public String getIPCA(){
        String aux = "";
        RegEx rx= new RegEx(this.html, "<ul id=\"dadoBrasil\"[\\s\\w\\d\\W]*/header>");
        aux = rx.findAll();

        RegEx x = new RegEx(aux, "[0-9\\,]+\\%");
        aux = x.findAt(2);
        return aux;
    }
}
