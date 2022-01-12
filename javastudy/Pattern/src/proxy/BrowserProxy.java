package proxy;

public class BrowserProxy implements IBrowser {

    private String url;
    private Html html;

    public BrowserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {
    	// for caching
        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from " + url);
        }
        // caching 되어있는 html 사용
        System.out.println("BrowserProxy use cache html");
        return html;
    }
}