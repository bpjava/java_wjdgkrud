# 날짜와 시간

## Calendar와 Date

1. Calendar

    - 추상클래스
    - Calendar을 상속받아 완전히 구현한 클래스:
        - GregorianCalendar(태국 외의 국가)
        - BuddhistCalendar(태국)
    - 사용방법
    > Calendar cal = new Calendar();    //에러! 

    추상클래스이기 때문에 인스턴스를 생성할 수 없음

    > Calendar cal = CAlendar.getInstance();    //getInstance
    
    ()메서드는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환


2. Date와 Calendar

    - Calendar클래스가 추가되면서 Date는 잘 사용되지 않음.
    - Calendar->Date, Date->Calendar 로 변환할 일이 생기기도 함.

    > 1. Calendar->Date:<br>
    >    Calendar cal = Calendar.getInstance();<br>
    >    Date d = new Date(cal.getTimeInMillis()); 또는 Date d = cal.getTime();
    
    > 2. Date->Calendar:<br>
    >    Date d = new Date;<br>
    >    Calendar cal = Calendar.getInstance();
    >    cal.setTime(d);

    - get메서드: Calendar의 int상수를 가져와서 날짜와 시간에 대한 정보를 알려줌(예제 10-1(page13))
    - set메서드: 원하는 날짜나 시간으로 설정(예제 10-2(page14))
    - 시간 차이 구하기: (예제 10-3(page15))
    - add메서드: 지정한 필드의 값을 원하는 만큼 증가 또는 감소시켜줌(예제 10-3(page17))
    - roll메서드: add메서드와 유사하나. 다른 필드에 영향을 미치지 않는다.(예제 10-5(page16))



## 형식화 클래스

- ***형식화에 사용될 패턴을 정의***: 데이터를 정의된 패턴에 맞춰 형식화할 수 있을 뿐만 아니라 역으로 형식화된 데이터에서 원래의 데이터를 얻어낼 수도 있다.

1. DeciamlFormat

    - 숫자를 형식화
    - 숫자 데이터 -> 정수, 부동소수점, 금액 등 다양한 형식
    - 텍스트 데이터 -> 숫자 데이터
    - 자주 사용되는 패턴<br>
   
    | 기호 | 의미 | 패턴 | 결과(1234567.89) |
    | :--------: | :--------: | :--------: | :--------: |
    | 0 | 10진수(값이 없을 때는 0) | 0<br>0.0<br>0000000000.0000 | 1234568<br>1234567.9<br>0001234567.8900 |
    | # | 10진수 | #<br>#.#<br>##########.#### | 1234568<br>1234567.9<br>1234567.89<br> |
    | . | 소수점 | #.# | 1234567.9 |
    | - | 음수부호 | #.#-<br>-#.# | 1234567.9-<br>-1234567.9 |
    | , | 단위 구분자 | #,###.##<br>#,####.## | 1,234,567.89<br>123,4567.89 |
    | E | 지수기호 | #E0<br>0E0<br>##E0<br>00E0<br>####E0<br>0000E0<br>#.#E0<br>0.0E0<br>0,000000000E0<br>00.00000000E0<br>000.00000000E0<br>#.#########E0<br>##.########E0<br>###.#######E0<br> | .1E7<br>1E6<br>1.2E6<br>12E5<br>123.4E4<br>1235E3<br>1.2E6<br>1.2E6<br>1.234567890E6<br>12.34567890E5<br>123.4567890E4<br>1.23456789E6<br>1.23456789E6<br>1.23456789E6<br> |
    | ; | 패턴구분자 | #,###.##+;#,###.##- | 1,234,567.89+(양수일 때)<br>1,234,567.89-(음수일 때) |
    | % | 퍼센트 | #.#% | 123456789% |
    | \u2030 | 퍼밀(퍼센트x10) | #.#\u2030 | 1234567890% |
    | \u00A4 | 통화 | \u00A4 #,### | \ 1,234,568 |
    | ` | escape문자 | '#'#,###<br>''#,### | #1,234,568<br>'1,234,568 |
   
    - 사용방법(예제10-10(page25))<br>
    > double number = 1234567.89<br>
    > Decimal Format df = new DecimalFormat("#.#E0");<br>
    > String result = df.format(number);

    *Numberformat의 parse(String)메서드: 기호나 문자가 포함된 문자열을 숫자로 쉽게 변환(예제10-11(page 26))

2. SimpleDateFormat

    - Date와 Calendar을 원하는 형태로 쉽게 출력할 수 있도록 해줌
    - SimpleDateFormat의 패턴에 사용되는 기호(page27 참고)
    - format 메서드는 Date인스턴스만 사용가능하기 때문에 Calendar인스턴스는 Date인스턴스로 변환해야함
    - 사용방법(예제10-12(page28))

    > Date today = new Date();
    > SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    >
    >String result = df.format(today);
    >//오늘 날짜를 yyyy-MM-dd 형태로 변환하여 반환

    *SimpleDateFormat의 parse(String)메서드: 문자열을 날짜로 쉽게 변환(예제10-14(page 29))

3. ChoiceFormat

    - 특정 범위에 속하는 값을 문자열로 변환
    - if문과 switch문을 대신해서 다양한 용도로 유용하게 쓰임
    - 사용방법(예제10-16(page31), 예제10-17(page31))

4. MessageFormat

    - 데이터를 정해진 양식에 맞게 출력할 수 있도록 도와줌
    - 사용방법(예제10-18(page32))
## java.time 패키지

| 패키지 | 설명 |
| :--------: | :--------: |
| java.time | 날짜와 시간을 다루는데 필요한 핵심 클래스들을 제공 |
| java.time.chrono | 표준(ISO)이 아닌 달력 시스템을 위한 클래스들을 제공 |
| java.time.format | 날짜와 시간을 파싱하고, 형식화하기 위한 클래스들을 제공 |
| java.time.temporal | 날짜와 시간의 필드와 단위를 위한 크래스들을 제공 | 
| java.time.zone | 시간대와 관련된 클래스들 제공 |

- 위 패키지의 클래스들은 String클래스와 마찬가지로 불변. 따라서, 기존의 객체를 변경하는 대신 변경된 새로운 객체를 반환

1. java.time패키지의 핵심 클래스

- 날짜와 시간을 별도의 클래스로 분리
- 기본 클래스
    > 시간을 표현할 때: LocalTime클래스
    >
    > 날짜를 표현할 때: LocalDateTime클래스
    >
    > 날짜와 시간이 모두 필요할 때: LocalDateTime클래스
    > 날짜와 시간과 시간대: ZonedDateTime클래스
    > 날짜 사이의 간격: Period클래스
    > 시간 사이의 간격: Duration클래스
- 사용방법 : now()와 of()을 사용한 객체 생성
    > LocalDate date = LocalDate.now(); //2018-12-04
    > LocalTime time = LocalTime.now(); //14:04:01.875
    > LocalDateTome dateTime = LocalDateTime.now(); //2018-12-04T14:04:01.875
    > ZonedDateTime dateTimeInKr = zonedDateTime.now(); //2018-12-04T14:04:01.875+09:00[Asia/Seoul]

    > LocalDate date = LocalDate.of(); //2018년12월04일
    > LocalTime time = LocalTime.of(); //14시04분01초
    > LocalDateTome dateTime = LocalDateTime.of(date,time);
    > ZonedDateTime dateTimeInKr = zonedDateTime.of(dateTime, ZondeId.of("Aisa/Seoul"));
- Temporal과 TemporalAmount
    > Temporal, TemporalAccessor, TemporalAdjuster를 구현한 클래스:
    > 一 LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant 등
    > TemporalAmount를 구현한 클래스
    > 一 Period, Duration
- TemporalUnit과 TemporalField
    - TemporalUnit인터페이스: 날짜와 시간의 단위를 정의
        - 위 인터페이스를 구현한 것이 ChronoUnit
    - TemporalField인터페이스: 년, 월, 일 등 날짜와 시간의 필드를 정의해 좋은 것
        - 위 인터페이스를 구현한 것이 ChronoField
    - 사용방법
    > LocalTime now = LocalTime.now();
    > int minute = now.getMinute();
    > // 위 두문장과 동일
    > int minute = now.get(ChronoField.MUNOTE_OF_HOUR);

    > LocalDate today = LocalDate.now();
    > LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
    > // 위 두문장과 동일
    > LocaDate tomorrow = today.plusDay(1);

2. LocalDate와 LocalTime
    - java.time패키지의 가장 기본이 되는 클래스
    - 사용방법: 현재의 날짜와 시간을 LocalDate와 LocalTime으로 각각 반환하는 **now()** 와 지정된 날짜와 시간으로 LocalDate와 LocalTime객체를 생성하는 **of()** 가 있음
    > LocalDate today = LocalDate.now(); //오늘의 날짜
    > LocalTime now = LocalTime.now(); //현재 시간
    > LocalDate birthDate = LocalDate.of(1999,12,31); // 1999년 12월 31일
    > LocalTime birthTime = LocalTime.of(23,59,59);
    - 특정 필드값 가져오기(해당 메서드들이 사용할 수 있는 매개변수는 page39참고)

    | 클래스 | 메서드 | 설명 |
    | :--------: | :--------: | :--------: |
    | LocalDate | int getYear() | 년도(2018) |
    |  | int getMonthValue() | 월(12) |
    |  | Month getMonth() | 월(DECEMBER) |
    |  | int getDayOfMonth() | 일(31) |
    |  | int getDayOfYear() | 같은 해의 1월 1일부터 몇번쨰 일(365) |
    |  | DayOfWeek getDayOfWeek() | 요일(FRIDAY) |
    |  | int lengthOfMonth() | 같은 달의 총 일수(31) |
    |  | int lengthOfYear() | 같은 해의 총 일수(365), 윤년이면 366 |
    |  | booelan isLeapYear() | 윤년여부 확인(false) |
    | LocalTime | int getHour() | 시(23) |
    |  | int getMinute() | 분(59) |
    |  | int getSecond() | 초(59) |
    |  | int getNAno() | 나노초(0) |

    - with(), plus(), minus(): 필드값 변경하기
        - 사용방법
        > LocalDate withYear(int year), LocalDate withMonth(int month)....
        > LocalDate plusYears(long yearsToAdd), Date plusDays....
        > LocalDate minusYears(long yearsToAdd), Date plusDays....
    - truncatedTo() : 지정된 필드보다 작은 단위의 필드 값을 0으로 만듬
        > LocalTime time = LocalTime.of(12, 34, 56); //12시 34분 56초
        > time = time.truncatedTo(ChronoUnit.HOURS);
        > System.out.println(time); // 12:00
    - isAfter(), isBefore(), isEqual() : 날짜와 시간의 비교. compareTo()로 비교할 수도 있지만 더 편리하게 비교 가능
        > boolean isAfter(ChronoLocalDate other)
        > boolean isBefor(ChronoLocalDate other)
        > boolean isEqual(ChronoLocalDate other) //날짜만 비교

3. Instant

- 에포크 타임(EPOCH TIME, 1970-01-01 00:00:00 UTC)부터 경과된 시간을 나노초 단위로 표현.
- 계산에 편리
- 사용방법: now()와 ofEpochSecond()를 사용하여 Instant 생성
    > Instant now = Instant.now();
    > Instant now2 = Instant.ofEpochSecond();
    > long epochSec = now.getEpochSecond(); //초단위
    > int nano = now.getNano(); //나노초단위

4. LocalDateTime과 ZonedDateTime

- LocalDate + LocalTime = LocalDateTime
- LocalDatetime + 시간대 = ZonedDateTime
- LocalDateTime 사용방법:
    > LocalDate date = LocalDate.of(2015,12,31);
    > LocalTime time = LocalTime.of(12,34,56);
    >
    > LocalDateTime dt = LocalDateTime.of(date, time);
    > LocalDateTime dt2 = date.atTime(time);
    > LocalDateTime dt3 = time.atDate(date);
    > LocalDateTime dt4 = date.atTime(12,34,56);
    > LocalDateTime dt5 = time.atDate(LocalDate.of(2015,12,31));
    > LocalDateTime dt6 = date.atStartOfDay();
- LocalDateTime -> LocalDate 또는 LocalTime
    > LocalDateTime dt = LocalDateTime.of(2015,12,31,12,34,56);
    > LocalDate date = dt.toLocalDate();
    > LocalDate time = dt.toLocalTime();
- ZonedDateTime
    - ZoneId클래스 : 일광 절약시간을 자동적으로 처리
    - LocalDateTime의 atZone메서드 : 시간대 정보 추가
    - 사용방법:
    > ZondId zid = ZoneId.of("Asia/Seoul");
    > ZonedDateTime zdt = dateTime.atZone(zid);
    > System.out.println(zdt); //2015-11-27T17:47:50:.451+09:00[Asia/Seoul]
    - ZoneOffset: UTC로부터 얼마만큼 떨어져 있는지
    > ZoneOffset krOffset = ZonedDateTime.now().getOffset();
    > int krOffsetInSEc = krOffset.get(ChronoField.OFFSET_SECONDS); //32400초 = 60 * 60 * 9(서울은 9)
    - OffsetDateTime :  zoneId 대신 ZondOffset를 사용하여 구역을 표현. 시간대를 시간의 차이로만 구분. 서로 다른 시간대에 존재하는 컴퓨터간의 통신에 필요.
        - 사용방법:
        > ZonedDateTime zdt = ZonededDateTime.of(date, time, zid);
        > OffsetDateTime odt = OffsetDateTime.of(date, time, krOffset);
        >> //ZonedDateTime->OffsetDateTime
        > OffsetDateTime odt = zdt.toOffsetDateTime();
    - ZonedDateTime의 변환 : 날짜와 시간에 관련된 다른 클래스로 변환가능
        > LocalDate    =    toLocalDate()
        > LocalTime    =    toLocalTime()
        > LocalDateTime    =    toLocalDateTime()
        > OffsetDateTime   =    toOffsetDateTime()
        > long         =    toEpochSecond()
        > Instant      =    toInstant()
        - GregorianClandar과 ZonedDateTime간의 변환방법
        > GregorianCalendar from(ZonedDateTime zdt); //ZonedDateTime-> GregorianCalendar
        > ZonedDateTime toZonedDateTime(); //GregorianCalendar->ZonedDateTime
    5. TemporalAdjusters
    
    - 자주 쓰일만한 날짜 계산들을 대신 해주는 메서드를 정의
    - 사용방법:
        > LocalDate today = LocalDate.now();
        > LocalDate nextMonday = today.with(TemporalAdjusters.next(DatOfWeek.MONDAY));

    6. Period와 Duration
    
    - Period: 날짜 차이
    - Duration: 시간 차이

    - between()
        > LocalDate date1 = LocalDate.of(2014, 1, 1);
        > LocalDate date2 = LocalDate.of(2015, 12, 31);
        > Period pe = Period.between(date1, date2);

        > LocalTime time1 = LocalTime.of(00,00,00);
        > LocalTime time2 = LocalTime.of(12,34,56);
        > Duration du = Duration.between(time1, time2);
    - get() : 특정 필드의 값을 얻을 때
    - until() : between과 유사하나 between은 static메서드, until은 인스턴스메서드
        - Duration에서는 사용불가
        > Period pe = today.until(myBirthDay);
        > long dday = today.until(myBirthDay, ChronoUnit.DAYS);
    - plus(), minus() : 곱셈과 나눗셈을 위한 메서드
        > pe = pe.minusYears(1).multipliedBy(2); //1년을 빼고, 2배를 곱한다.
        > du = du.plusHours(1).divideBy(60); //1시간을 더하고 60으로 나눈다.
    - isNegative() : 음수인지 확인
        > boolean isBefore = Duration.between(time1, time2).isNegative();
    - isZero(): 0인지 확인
        > boolean sameDate = Peroid.between(date1, date2).isZero();
    - negate() : 부호를 반대로 변경
    - abs() : 부호를 없앰
    - normalized() : Period에만 존재. 월의 값이 12을 넘지 않게, 즉 1년 13개월을 2년 1개월로 바꿔줌
    
    - 날짜 및 시간 지정 메서드(사용방식은 앞의 LocalTime,LocalDate와 같음)
        - Peroid 메서드: of(), ofYears(), ofMonths(), ofWeeks(), ofDays()
        - Duration 메서드: of(), ofDays(), ofHours(), ofMinutes(), ofSeconds()...

    - toTotalMonths(), toDays(), toHours(), toMinutes() : 다른 단위로 변환
    
    | 클래스 | 메서드 | 설명 |
    | ------  | ------ | ------ |
    | Period | long toTotalMonths() | 년월일을 월단위로 변환해서 반환 |
    | Duration | long toDays() | 일단위로 변환해서 반환 |
    |          | long toHours() | 시간단위로 변환해서 반환 |
    |          | long toMinutes() | 분단위로 변환해서 반환 |
    |          | long toMillis() | 천분의 일초 단위로 변환해서 반환 |
    |          | long toNanos() | 나노초 단위로 변환해서 반환 |


    7. 파싱과 포맷

    - 날짜와 시간을 원하는 형식으로 출력하고 해석하는 방법
    - DateTimeFormatter가 핵심. 이 클래스에는 자주 쓰이는 다양한 형식들을 기본적으로 정의.(표10-9참고(page55)) 그외의 형식이 필요하다면 직접 정의해서 사용가능
        > LocalDate date = LocalDate.of(2018,12,5);
        > String yyyymmdd = DateTimeFormatter.ISO_LOCAL_DATE.format(date); //2018-12-05
        > String yyyymmdd = date.format(DateTimeFormatter.ISO_LOCAL_DATE); //2018-12-05
    - ofLocalizedDate(), toLocallizedTime(), toLocalizedDateTime() : 로케일에 종속적인 포멧터를 생성
        > DateTimeFormatter formatter = DateTimeFormatter.ofLocalizeDate(FormatStyle.SHORT);
        > String shortFormat = formatter.format(LocalDate.now());
    
        | FormatStyle | 날짜 | 시간 |
        | ------  | ------ | ------ |
        | FULL | 2018년 12월 5일 수요일 | N/A |
        | LONG | 2018년 12월 5일 (수) | 오후 9시 15분 13초 |
        | MEDIUM | 2018.12.05 | 오후 12:53:13 |
        | SHORT | 18.12.05 | 오후 9:15 |
    
    - DateTimeFormatter의 ofPattern() : 출력형식 직접 정의(표10-11(page56참고))
        > DateTimeFormatter의 formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    - 문자열을 날짜와 시간으로 파싱
        - 기본
        > LocalDate date = LocalDate.parse("2018-12-05",DateTimeFormatter.ISO_LOCAL_DATE); //ISO_LOCAL_DATE는 기본적인 형식의 문자열이라 생략가능
        
        - 패턴으로 정의하여 파싱
        > DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       
        > LocalDateTime endOfYear = LocalDateTime.parse("2018-12-05 12:57:58", pattern)
