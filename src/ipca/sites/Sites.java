
package ipca.sites;

import ipca.utils.Url;


abstract class Sites {
    protected Url url;
    protected String html;

    public Sites(String pUrl) {
        this.url = new Url(pUrl);
        this.html = url.getContents();
    }
    
    abstract public String getIPCA();
}
