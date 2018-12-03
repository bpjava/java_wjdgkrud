# 날짜와 시간

## Calendar와 Date

1. Calendar

    - 추상클래스
    - Calendar을 상속받아 완전히 구현한 클래스:
        -GregorianCalendar(태국 외의 국가)
        -BuddhistCalendar(태국)

    > Calendar cal = new Calendar();    //에러! 추상클래스이기 때문에 인스턴스를 생성할 수 없음
    > Calendar cal = CAlendar.getInstance();    //getInstance()메서드는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환


2. Date와 Calendar

    - Calendar클래스가 추가되면서 Date는 잘 사용되지 않음.
    - Calendar->Date, Date->Calendar 로 변환할 일이 생기기도 함.

    >1. Calendar->Date