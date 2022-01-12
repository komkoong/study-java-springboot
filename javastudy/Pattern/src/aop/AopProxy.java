package aop;

import proxy.Html;

/**
 * AOP: Aspect Oriented Programming 관점 지향 프로그래밍 (Spring) * 
 * 특정 패키지의 실행시간이나 전, 후로 작업하고 싶은 부분
 * 요청에 대한 request나 response 정보를 남기는 것을
 * 코드에 개별적으로 진행하는 것이 아닌 일괄적으로 모든 메서드에 기능을 넣을수 있는 것을 의미함
 * 즉, 여러군데 사용되는 중복되는 코드를 떼어내서 분리하고 자신이 해야할 작업만 갖고 있자는 개념
 * - 유사한 기능을 proxy 패턴을 이용하여 구현할 수 있음
 * 
 * @author Komkoong
 *
 */

public class AopProxy implements IAopBrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopProxy(String url){
        this.url = url;
    }

    public AopProxy(String url, Runnable before,  Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() throws InterruptedException {
        before.run();

        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from : " + url);
            Thread.sleep(2000);
        }
        
        System.out.println("BrowserProxy use cache html : " + url);
        after.run();
        return html;
    }
}
