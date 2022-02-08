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

