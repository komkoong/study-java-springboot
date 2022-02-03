### 학습목표

1. 웹에 대한 기본이해를 한다.
2. 웹클라이언트와 웹백엔드의 역할을 안다.
3. HTML 구조화 설계를 할 수 있다
4. CSS 기본 스타일을 꾸밀 수 있다.
5. JAVA기반의 웹 백엔드 환경을 구성할 수 있다.
6. 서블릿을 이해하고 기본 구성을 할 수 있다

##### FE: HTML, CSS 개발, 레이아웃 작업
##### BE: Client-Server, Req -> Res


<h5> 1. 웹에 대한 기본이해를 한다. </h5>
1) 웹 프로그래밍을 위한 프로그램 언어들
- 다양한 프로그래밍 언어의 종류에 대하여 알아본다.
- 웹 프로그래밍에 좀 더 최적화된 프로그래밍 언어의 장단점에 대하여 알아본다.
  * 웹 관련 인기언어
    : Python, PHP, JavaScript, JAVA, Ruby
- 핵심개념: 저급언어, 고급언어, 컴파일러

참조
+ https://octoverse.github.com/
+ https://www.tiobe.com


2) 웹의 동작 (HTTP 프로토콜 이해)
- HTTP 프로토콜의 작동방식에 대하여
    * 웹에서 서버와 클라이언트가 통신하기 위한 프로토콜
    * 어떤 종류의 데이터도 전송할 수 있음
    * HTTP/2 버전까지 등장함 (교육: HTTP/1.1)
    * 서버-클라이언트 모델을 따름
    * 무상태(Stateless): 정보유지x, 많은 연결 가능
- HTTP 프로토콜의 요청/응답 데이터 포맷에 대하여 알아본다.
    * 요청헤더/바디 -> 요청메서드 + 요청URI + HTTP프로토콜버전 | 요청바디는 POST, PUT 메서드인 경우 있음
    * 응답헤더/바디 -> 응답HTTP버전 + 응답코드 + 응답메시지 | 실제 응답 리소스 데이터
- 핵심개념: HTTP, Request형식, Request Method, Response형식, 응답코드

- URL: Uniform Resource Locator
  - 웹 상에서 문서 등 자원의 위치를 나타냄
  - 프로토콜 종류            http://
  - 자원 ip 주소, 포트번호    sunnyvale.com.kr/
  - 자원이 위치(경로)        docs/index.html
  - ex) http://www.sunnyvale.co.kr/docs/index.html

- HTTPS: HTTP + S: SSL/TLS를 이용하여 암호화하여 보안성을 강화시킨 것


3) 웹 프론트앤드와 백엔드



