package proxy;

import java.util.concurrent.atomic.AtomicLong;

import aop.AopProxy;
import aop.IAopBrowser;

/**
 * Proxy Pattern
 * 
 * Proxy는 대리인이라는 뜻으로 뭔가를 대신 처리하는 것
 * Proxy class를 통해 대신 전달하는 형태로 설계되며,
 * 실제 Client는 Proxy로 부터 결과를 받는다.
 * Cache의 기능으로도 활용이 가능
 * 
 * SOLID 중에서 OCP(개방폐쇄원칙)와 DIP(의존역전원칙)을 따른다.
 * 
 * @author Komkoong
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// 캐시기능이 전혀 없어 매번 로딩이 필요함
//		Browser browser = new Browser("www.naver.com");		
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
		
//		BrowserProxy browser = new BrowserProxy("www.naver.com");
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
		
		//동시성문제
		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();

		IAopBrowser aopBrowser = new AopProxy("www.naver.com",
				()->{
					System.out.println("before");
					start.set(System.currentTimeMillis());
					
				},
				()->{
					long now = System.currentTimeMillis();
					end.set(now - start.get());
				}
				);	
		
		aopBrowser.show();
		System.out.println("loading time: " + end.get());
		

		aopBrowser.show();
		System.out.println("loading time: " + end.get());
	}

}
