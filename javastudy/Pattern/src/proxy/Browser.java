package proxy;

/**
 * Chrome, Explorer 등 브라우저를 의미함
 * @author Komkoong
 *
 */
public class Browser implements IBrowser {

    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("Browser loading html from " + url);
        // 새로운 HTML 파일을 return 함
        return new Html(url);
    }
}
