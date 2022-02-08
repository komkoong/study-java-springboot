### p.126 JAX-RS란?

#### 1. JAX-RS 코드

<pre>
<code>
@Path("/addrbook")
public class RestApiService {
  Logger logger = Logger.getLogger("RestApiService");
  AddrBookDAO dao = new AddrBookH2DAO();
  
  @GET
  @Path("list")
  @Produces(MediaType.APPLICATION_JSON)
  public List<AddrBook> getList() {
    List<AddrBook> datas = dao.getAll();
    logger.info("API call: /list ");
    return datas;
   }
}
</code>
</pre>

* @Path("/addrbook"): 현재 클래스에서 처리할 URL의 진입점 .../addrbook
* @Get: 지정된 URL 요청을 GET 방식으로 호출했을 때 동작하도록 함
* @Path("list"): 메서드가 실행될 URI 요청 .../addrbook/list
* Produces(MediaType.APPLICATION_JSON): 리턴되는 데이터 형식을 JSON 형식으로 지정
  
 
#### 2. 스프링 프레임워크의 RestController 코드

<pre>
<code>
@RestController
@RequestMapping("/addrbook")
public class RestApiService {
  Logger logger = Logger.getLogger("RestApiService");
  AddrBookDAO dao = new AddrBookH2DAO();
  
  @GetMapping("list")
  public List<AddrBook> getList() {
    List<AddrBook> datas = dao.getAll();
    logger.info("API call: /list ");
    return datas;
   }
}
</code>
</pre>


### p.130 스프링 부트란

![image](https://user-images.githubusercontent.com/87292447/152904454-b7b741ed-3bbd-44c9-8980-a5068462ed88.png)

이미지출처: spring.io

* 스프링 부트 2의 주요 특징은 리액티브 스택과 서블릿 스택으로 구분하고 있다는 점
  - 서블릿 스택: 서블릿 API에 기반한 동기 방식의 블로킹 I/O 구조를 사용하며 요청은 하나의 스레드로 처리됨
  - 리액티브 스택: 새로운 비동기 논블로킹 I/O 구조를 사용하며 멀티코어 시스템의 장점을 살리고 대규모 사용자 접속을 처리하는데 유용한 구조로 설계됨 ex. Netty, Undertow, Spring WebFlux라고 하는 새로운 프레임워크를 사용해 개발함


### p. 294 JDBC 프로그래밍 과정
![image](https://user-images.githubusercontent.com/87292447/152921422-621bbeaa-24c6-46ad-b37b-009a3c95b709.png)

  - JDBC 프로그래밍의 기본 단계와 사용 클래스
  - 이미지출처: JSP 웹 프로그래밍과 스프링 프레임워크 / 황희정 지음
  
