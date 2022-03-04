package ipca.sites;

import ipca.utils.Url;


public class DicionarioFinanceiro extends Sites {
    private static final String URL_DICIONARIO_FINANCEIRO = "https://www.dicionariofinanceiro.com/ipca/";
    
    public DicionarioFinanceiro() {
        super(URL_DICIONARIO_FINANCEIRO);
    }

    @Override
    public String getIPCA() {
        return this.html;
    }    
}
