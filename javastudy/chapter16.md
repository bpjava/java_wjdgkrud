# 네트워킹

## 네트워킹

: 두 대 이상의 컴퓨터를 케이블로 연결하여 네트워크를 구성하는 것.

1. 클라이언트/서버

-  #### 클라이언트: 서비스를 사용하는 컴퓨터.
- #### 서버: 서비스를 제공하는 컴퓨터.
-    #### 서비스: 서버가 클라이언트로부터 요청받은 작업을 처리하여 그 결과를 제공하는 것.

 - 클라이언트와 서버, 각자의 프로그램이 있어야 한다.

- 서버에 접속하는 클라이언트의 수에 따라 하나의 서버가 여러 가지 서비스를 제공하기도 하고 하나의 서비스를 여러 대의 서버로 제공하기도 한다.

- 서버가 제공하는 서비스의 종류에 따라 파일서버, 메일서버, 어플리케이션 서버 등이 있다.

- 서버에 따라 달라지는 모델

    | 서버기반 모델 | P2P 모델 |
    | :--------: | :--------: |
    | 네트워크를 구성할 때 전용 서버를 두는 것 | 전용서버없이 각 클라이언트가 서버역할을 동시에 수행하는 것 |
    | - 안정적인 서비스의 제공이 가능하다. <br> - 공유 데이터의 관리와 보안이 용이하다. <br> - 서버구축비용과 관리비용이 든다. | - 서버구축 및 운용비용을 절감할 수 있다. <br> - 자원의 활용을 극대화 할 수 있다. <br> - 자원의 관리가 어렵다. <br> - 보안이 취약하다.

<br>

2. IP주소

- 컴퓨터를 구별하는데 사용되는 고유한 값
- 4byte 정수로 구성
- 4개의 정수가 마침표를 구분자로, a,b,c,d로 표현. 여기서 a,b,c,d는 부호없는 1byte값, 즉, 0~255사이의 정수.
- 네트워크주소+호스트주소
- IP주소 & 서브넷 마스크 = 네트워크 주소(참고 그림 16-2(page.430))

<br>

3. InetAddress

- IP주소를 다루기 위한 클래스
- 제공하는 메서드

    | 메서드 | 설명 |
    | :--------: | :--------: |
    | byte[] getAddress() | IP주소를 byte배열로 반환한다. |
     static InetAddress[] <br> getAllByName(String host) |도메인명(host)에 지정된 모든 호스트의 IP주소를 배열에 담아 반환한다. | 
     static InetAddress getByAddress(byte[] addr) | byte배열을 통해 IP주소를 얻는다. |
     static InetAddress getByName(String host) | 도메인명(host)을 통해 IP주소를 얻는다. |
     String getCanonicalHostName() |FQDN(fully qualified domain name)을 반환한다. |
     String getHostAddress() |호스트의 IP주소를 반환한다. |
     String getHostName() | 호스트의 이름을 반환한다. |
     static InetAddress getLocalHost() | 지역호스트의 IP주소를 반환한다. |
     boolean isMulticastAddress() | IP주소가 멀티캐스트 주소인지 알려준다. |
     boolean isLoopbackAddress() | IP주소가 loopback 주소인지 알려준다.

     
      참고 예제16-1(page.431)

    <br>

4. URL

- 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접근할 수 있는 주소를 표현하기 위한 것.
- 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링#참조

- url 메서드

    | 메서드 | 설명 |
    | :--------: | :--------: |
    | URL(String spec) | 지정된 문자열 정보의 URL객체를 생성한다.
    | URL(String protocol, String host, Strin file) | 지정된 값으로 구성된 URL객체를 생성한다.
    | URL(String protocol, String host, int port, String file) | 지정된 값으로 구성된 URL객체를 생성한다. |
    | String getAuthority() | 호스트명과 포트를 문자열로 반환한다. |
    | Object getContent() | URL의 Content객체를 반환한다. |
    | Obejct getContent(Class[] classses) | URL의 Content객체를 반환한다. |
    | int getDefaultPort() | URL의 기본 포트를 반환한다. |
    | String getFile() | 파일명을 반환한다. |
    | String getHost() | 호스트명을 반환한다. |
    | String getPath() | 경로명을 반환한다. |
    | int getPort() | 포트를 반환한다. |
    | String getProtocol() | 프로토콜을 반환한다. |
    | String getQuery() | 쿼리를 반환한다. |
    | String getRef() | 참고를 반환한다. |
    | URLConnection openConnection() | URL과 연결된 URLConnection을 얻는다. |
    | URLConnection openConnection(Proxy proxy) | url과 연결된 URLConnection을 얻는다. |
    | InputStream openStream() | URL과 연결된 URLConnection의 InputStream을 얻는다. |
    | boolean sameFile(URL other) | 두 URL이 서로 같은 것인지 알려준다. |
    | void set(String protocol, String host, int port, String file, String ref) | URL객체의 속성을 지정된 값으로 설정한다. |
    |  void set(String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) | URL객체의 속성을 지정된 값으로 설정한다. |
    | String toExternalForm() | URL을 문자열로 변환하여 반환한다. |
    | URL toURI() | URL을 URI로 변환하녀 반환한다.

        참고 예제 16-2(page 434)

    <br>

5. URLConnection

- 어플리케이션과 URL간의 통신연결을 나타내는 클래스의 최상위 추상클래스.
- 연결하고자 하는 자원에 접근하고 읽고 쓰기를 할 수 있다.
- 상속받아 구현한 클래스 : HttpURLConnection과 JarURLConnection
- URLConnection 메서드
참고 표16-4, 예제 16-3, 16-4 (page 436)

<br>

## 소켓 프로그래밍

: 소켓을 이용한 통신 프로그래밍. 소켓이란 프로세스간의 통신에 사용되는 양쪽 끝단.

<br>

1. TCP와 UDP

- TCP/IP 프로토콜은 이기종 시스템간의 통신을 위한 표준 프로토콜로 프로토콜의 집합. TCP와 UDP 모두 TCP/IP 프로토콜에 포함

- OSI 7계층의 전송계층

- TCP와 UDP의 전송방식

    | 항목 | TCP | UDP |
    | :--------: | :--------: | :--------: |
    | 연결방식 | 연결기반 <br>- 연결 후 통신(전화기) <br> - 1:1 통신방식 | 비연결기반<br>- 연결없이 통신(소포) <br> - 1:1, 1:n, n:n 통신방식 |
    |  특징  | 데이터의 경계를 구분안함<br>신뢰성 있는 데이터 전송<br>- 데이터의 전송순서가 보장됨<br>- 데이터의 수신여부를 확인함<br>- 패킷을 관리할 필요가 없음<br>- UDP보다 전송속도가 느림 | 데이터의 경계를 구분함.<br>신뢰성 없는 데이터 전송<br>- 데이터의 전송순서가 바뀔 수 있음.<br>- 데이터의 수신여부를 확인안함. <br>- 패킷을 관리해주어야 함<br>TCP보다 전송속도가 빠름. 


<br>

2. TCP 소켓 프로그래밍

- 서버 프로그램과 클라이언트 프로그램간의 통신과정<br>
(1) 서버 프로그램에서는 서버소켓을 사용해서 서버 컴퓨터의 특정 포트에서 클라이언트의 연결요청을 처리할 준비를 한다.<br>
(2) 클라이언트 프로그램은 접속할 서버의 IP주소와 포트 정보를 가지고 소켓을 생성해서 서버에 연결을 요청한다.<br>
(3) 서버소켓은 클라이언트의 연결요청을 받으며 서버에서 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다.<br>
(4) 이제 클라이언트의 소켓과 새로 생성된 서버의 소켓은 서버소켓과 관계없이 일대일 통신을 한다.

- 여러 소켓이 하나의 포트를 공유해서 사용할 수 있음. 하지만 서버소켓은 포트를 독점함.

- 소켓들이 데이터를 주고받는 연결통로가 입출력스트림.(참고 그림16-3(page 442))

참고 예제 16-6, 16-7, 16-10, 16-11, 16-12

? 예제 16-13, 16-14

<br>

3. UDP소켓 프로그래밍

- TCP과 다르게 soket대신 DatagramSocket과 DatagramPacket

- DatagramPacket <br>= 헤더( DatagramPacket을 수신할 호스트의 정보 ) + 데이터

참고 예제 16-15, 16-16