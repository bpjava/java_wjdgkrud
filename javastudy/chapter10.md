#제목
##제목작게
##제목더작게
**굵게**
_기울이기_
*기울이기2*

1. 사과
2. 바나나
3. 오렌지

*사과
*바나나

>인용문

<http://www.naver.com>

구글 로고입니다:
(http://www.google.co.kr/images/srpr/logo11w.png)

쿠키 한 입 베어 물고 녹차. 녹차 한 입 마시고 쿠키. 바사삭 바사삭 느낌도 좋지만 촉촉한 느낌도 좋아. 컵 케이크 마카롱 젤리 먹고 후식으로는 티라미수. 연하고 부드러운 수플레 치즈 케이크에 초콜릿 푸딩.

---

마크다운(Markdown)은 일반 텍스트 문서의 양식을 편집하는 문법이다. README 파일이나 온라인 문서, 혹은 일반 텍스트 편집기로 문서 양식을 편집할 때 쓰인다. 마크다운을 이용해 작성된 문서는 쉽게 HTML 등 다른 문서형태로 변환이 가능하다.




#날짜와 시간

##Calendar와 Date

1. Calendar

-추상클래스
-Calendar을 상속받아 완전히 구현한 클래스:
    -GregorianCalendar(태국 외의 국가)
    -BuddhistCalendar(태국)

> Calendar cal = new Calendar();    //에러! 추상클래스이기 때문에 인스턴스를 생성할 수 없음
> Calendar cal = CAlendar.getInstance();    //getInstance()메서드는 Calendar 클래슬르 구현한 클래스의 인스턴스를 반환


2. Date와 Calendar

-Calendar클래스가 추가되면서 Date는 잘 사용되지 않음.
-Calendar->Date, Date->Calendar 로 변환할 일이 생기기도 함.

>1. Calendar->Date