/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipca;

import ipca.sites.DicionarioFinanceiro;
import ipca.sites.Ibge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ibge ibge = new Ibge();
        DicionarioFinanceiro melhorCambio = new DicionarioFinanceiro();
        
        System.out.println("IPCA IBGE: " + ibge.getIPCA());
        System.out.println("IPCA Dicionario Financeiro: " + melhorCambio.getIPCA());
    }
}
