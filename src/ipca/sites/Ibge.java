package ipca.sites;

import ipca.utils.Url;
import ipca.utils.RegEx;

public class Ibge extends Sites {
    private static final String URL_IBGE = "https://www.ibge.gov.br/explica/inflacao.php";
    
    public Ibge() {
        super(URL_IBGE);
    }

    @Override
    public String getIPCA() {
        String aux = "";
        RegEx rx= new RegEx(this.html, "<ul id=\"dadoBrasil\"[\\s\\w\\d\\W]*/header>");
        aux = rx.findAll();

        RegEx x = new RegEx(aux, "[0-9\\,]+\\%");
        aux = x.findAt(2);
        return aux;
    }
}
