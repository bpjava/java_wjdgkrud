# 쓰레드

## 프로세스와 쓰레드

1. 개념과 특징

   #### 프로세스: 실행 중인 프로그램. 둘 이상의 쓰레드를 가진 프로세스를 '멀티쓰레드 프로세스'.
    #### 쓰레드: 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것. 따라서 모든 프로세스에는 최소한 하나 이상의 쓰레드가 존재.

<br>

2. 멀티태스킹과 멀티쓰레딩

    #### 멀티쓰레딩: 하나의 프로세스 내에서 여러 쓰레드가 동시에 작업을 수행하는 것.

    ** 프로세스의 성능이 단순히 쓰레드의 개수에 비례하는 것은 아니다.

<br>

3. 멀티쓰레딩의 장단점

    #### 장점
    cpu의 사용률을 향상시킨다.<br>
    자원을 보다 효율적으로 사용할 수 있다.<br>
    사용자에 대한 응답성이 향상된다.<br>
    작업이 분리되어 코드가 간결해진다.


    #### 단점
    동기화문제<br>
    교착상태문제

<br>

## 쓰레드의 구현과 실행

1. 구현방법
    #### Thread클래스 상속
    > class MyThread extends Thread{
    <br>public void run(){ /* 작업내용 */ }<br>}// Thread클래스의 run() 오버라이딩

    #### Runnable인터페이스 구현
    > class MyThread implements Runnable{
    <br>public void run(){ /* 작업내용 */ }<br>}// Runnable 인터페이스의 추상메서드 run() 구현

    **어느 쪽을 선택해도 별 차이는 없지만 Thread클래스를 상속받으며 다른 클래스를 상속받을 수 없기 때문에, Runnable인터페이스를 구현하는 방법이 일반적. 또한, Runnable방식이 재사용성이 더 높고 코드의 일관성을 유지해줌.

<br>

2. 실행 - start():<br>
    start()를 호출해야만 쓰레드가 실행됨. 바로 시작되는 것은 아니고, 일단 실행대기 상태에 있다가 자신의 차례가 되어야 실행. 하나의 쓰레드에 대해 start()가 한 번만 호출가능.

    예제13-1(page.205)

<br>

## start()와 run()

1. 개념

    #### run() : 생성된 쓰레드를 실행시키는 것이 아니라 단순히 클래스에 선언된 메서드를 호출.

    #### start() : 새로운 쓰레드가 작업을 실행하는데 필요한 호출스택을 생성한 후 run()을 호출해서, 생성된 호출스택에 run()이 첫 번째로 올라가게 함.


    그림13-3, 13-4 참고(page.209)

2. main쓰레드

    #### 여태까지 main메서드의 작업을 수행하는 것도 쓰레드.
    #### 실행 중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료.

    예제13-2, 13-3(page.211)

<br>

## 싱글쓰레드와 멀티쓰레드

1. 싱글쓰레드 : 싱글코어에서 단순히 cpu만을 사용하는 계산작업이라면 멀티쓰레드보다 나음.

2. 멀티쓰레드 : 두 쓰레드가 서로 다른 자원을 사용하는 작업의 경우에는 싱글쓰레드 프로세스보다 멀티쓰레드 프로세스가 더 효율적임.

3. 예제

    예제13-5(page.214), 그림13-7
    
    #### 싱글코어와 멀티코어의 결과가 다른이유
    싱글코어인 경우 멀티쓰레드라도 하나의 코어가 번갈아가면서 작업을 수행하는 것으로, 두 작업이 절대 겹치치 않는다. 하지만 멀티 코어에서는 멀티쓰레드로 두 작업을 수행하면, 동시에 두 쓰레드가 수행될 수 있음.

    #### 예제13-5의 결과는 실행할때마다 다른 결과를 얻을 수 있는데, 그 이유는
    실행 중인 예제프로그램이 OS의 프로세스 스케쥴러의 영향을 받기 때문.

     <br>

    예제13-6, 13-7(page.217)

    <br>

## 쓰레드의 우선순위

1. 개념
    #### 우선순위: 쓰레드의 속성(멤버변수). 이 우선순위의 값에 따라 쓰레드가 얻는 실행시간이 달라짐.

2. 쓰레드의 우선순위 지정하기

    쓰레드가 가질 수 있는 우선순위의 범위는 1~10.<br>
    쓰레드의 우선순위는 쓰레드를 생성한 쓰레드로부터 상속받는다.

    > void setPriority(int newPriority) //쓰레드의 우선순위를 지정한 값으로 변경.<br>
    > int getPriority() //쓰레드의 우선순위를 반환.<br>
    > public static final int MAX_PRIORITY=10 //최대우선순위<br>
    > public static final int MIN_PRIORITY=1 //최소우선순위<br>
    > public static final int NORM_PRIORITY=5 //보통우선순위

     <br>

    예제13-8(page.219)
    
<br>

## 쓰레드 그룹

1. 개념

    서로 관련된 쓰레드를 그룹으로 다루기 위한 것.

    | 생성자 / 메서드 | 설명 |
    | :--------: | :--------: |
    | ThreadGroup(String name) | 지정된 이름의 새로운 쓰레드 그룹 생성 |
    | ThreadGroup(TreadGroup parent, String name) | 지정된 쓰레드 그룹에 포함되는 새로운 쓰레드 그룹을 생성 | 
    | int activeCount() | 쓰레드 그룹에 포함된 활성상태에 있는 쓰레드의 수를 반환 |
    | int activeGroupCount() | 쓰레드 그룹에 포함된 활성상태에 있는 쓰레드 그룹의 수를 반환 |
    | void checkAccess() | 현재 실행중인 쓰레드가 쓰레드 그룹을 변경할 권한이 있는 지 체크. 만일 권한이 없다면 SecurityException을 발생 |
    | void destory() | 쓰레드 그룹과 하위 쓰레드 그룹까지 모두 삭제. 단, 쓰레드 그룹이나 하위 쓰레드 그룹이 비어있어야 함. |
    | int enumerate(Tread[] list)<br>int emnumerate(Tread[] list, boolean recurse)<br>int enumerate(TreadGroup[] list)<br>int enumerate(TreadGroup[] list, boolean recurse) | 쓰레드 그룹에 속한 쓰레드 또는 하위 쓰레드 그룹의 목록을 지정된 배열에 담고 그 개수를 반환함. 두 번째 매개변수인 recurse의 값을 true로 하면 쓰레드 그룹에 속한 하위 쓰레드 그룹에 쓰레드 또는 쓰레드 그룹까지 배열에 담는다. |
    | int getMaxPriority() | 쓰레드 그룹의 최대우선순위를 반환한다. |
    | String getName() | 쓰레드 그룹의 이름을 반환함. |
    | ThreadGroup getParent() | 쓰레드 그룹의 상위 쓰레드그룹을 반환 | 
    | void interrupt() | 쓰레드 그룹에 속한 모든 쓰레드를 interrupt함. |
    | boolean isDaemon() | 쓰레드 그룹이 데몬 쓰레드그룹인지 확인함. |
    | boolean isDestroyed() | 쓰레드 그룹이 삭제되었는지 확인함. |
    | void list() | 쓰레드 그룹에 속한 쓰레드와 하위 쓰레드그룹에 대한 정보를 출력함. | 
    | boolean parentOf(TreadGroup g) | 지정된 쓰레드 그룹의 상위 쓰레드그룹인지 확인함. |
    | void setDaemon(boolean daemon) | 쓰레드 그룹을 데몬 쓰레드그룹으로 설정/해제함. |
    void setMaxPriority(int pri) | 쓰레드 그룹의 최대우선순위를 설정함. |

2. 쓰레드 그룹에 포함시키기

    > Thread(TreadGroup group, String name)<br>
    Thread(TreadGroup group, Runnable target)<br>
    Thread(TreadGroup group, Runnable target, String name)<br>
    Thread(TreadGroup group, Runnable target, String name, long stackSize)

     ***모든 쓰레드는 반드시 쓰레드 그룹에 포함되어 있어야함. 쓰레드 그룹을 지정하는 생성자를 사용하지 않은 쓰레드는 기본적으로 자신을 생성한 쓰레드와 같은 쓰레드 그룹에 속하게 됨.

     예제13-9(page.223)


<br>

## 데몬 쓰레드

1. 개념

    다른 일반 쓰레드의 작업을 돕는 보조적인 역할을 수행하는 쓰레드. 일반 쓰레드가 모두 종료되면 데몬 쓰레드는 강제적으로 자동 종료. 이 점을 제외하고 일반 쓰레드와 같음.

    > boolean isDaemon() <br>//쓰레드가 데몬 쓰레드인지 확인. 데몬 쓰레드이면 true.
    > <br><br> void setDaemon(boolean on) <br>//쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경. on의 값을 true로 지정하면 데몬 쓰레드. 쓰레드를 생성한 다음 실행하기전 호출해야지만 데몬 쓰레드 생성.

    예제13-10(page.22)

<br>

## 쓰레드의 실행제어

1. 쓰레드의 스케쥴링과 관련된 메서드

    | 메서드 | 설 명 |
    | :--------: | :--------: |
    static void sleep(long millis),<br> static void sleep(long millis, int nanos) | 지정된 시간동안 쓰레드를 일시정지시킨다. 지정된 시간이 지나고 나면, 자동적으로 다시 실행대기상태가 된다.|
    void join(),<br>void join(long miilis),<br>void join(long ) | 지정된 시간동안 쓰레드가 실행되도록 한다. 지정된 시간이 지나거나 작업이 종료되면 join()을 호출한 쓰레드로 다시 돌아와 실행을 계속한다. |
    void interrupt() | sleep()이나 join()에 의해 일시정지상태인 쓰레드를 깨워서 실행 대기상태로 만든다. 해당 쓰레드에서는 InterruptedException이 발생함으로써 일시정지상태를 벗어나게 된다. |
    void stop() | 쓰레드를 즉시 종료시킨다. |
    void suspend() | 쓰레드를 일시정지시진다. resume()을 호출하면 다시 실행대기상태가 된다. |
    void resume() | suspend()에 의해 일시정지상태에 있는 쓰레드를 실행대기상태로 만든다. |
    static void yield() | 실행 중에 자신에게 주어진 실행시간을 다른 쓰레드에게 양보하고 자신은 실행대기상태가 된다. |

2. 쓰레드의 상태

    | 상 태 | 설 명 |
    | :--------: | :--------: |
    NEW | 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태 |
    RUNNABLE | 실행 중 또는 실행 가능한 상태 |
    BLOCKED | 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태) | 
    WAITING, TIMED_WAITING | 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은 일시정지상태. TIMED_WAITING은 일시정지시간이 지정된 경우를 의미한다. |
    TERMINATED | 쓰레드의 작업이 종료된 상태

<br>

위의 1,2 설명 -> 그림13-10(page.230)

<br>

3. 쓰레드의 스케쥴링과 관련된 메서드 설명

    (1) sleep(long millis): 일정시간동안 쓰레드를 멈추게 한다.

    sleep()에 의해 일시정지 상태가 된 쓰레드는 지정된 시간이 다 되거나 interrupt()가 호출되면, InterruptedException이 발생되어 잠에서 깨어나 실행대기상태로 변함. 따라서, 항상 try-catch문으로 예외처리필요.

    예제13-12(page.231)
    
    <br>

    (2) interrupt()와 interrupted(): 쓰레드의 작업을 취소한다. 
    
    interrupt() = 단지 멈추라고 하는 것일 뿐 쓰레드를 강제로 종료시키지는 못한다.<br>
    interrupted() = 쓰레드에 대해 interrupt()가 호출되었는지 알려준다. 호출되었다면 true, 아니면 false 반환.

    쓰레드가 sleep(), wait(), join()에 의해 일시정지상태(WAITING)에 있을 때, 해당 쓰레드에 대해 interrupt()를 호출하면, sleep(), wait(), join()에서 InterruptedException이 발생하고 쓰레드는 실행대기상태(RUNNABLE)로 바뀐다. 

    예제13-13, 14(page.234)

    <br>

    (3) suspend(), resume(), stop() :<br> suspend() = sleep()처럼 쓰레드를 멈춤.
    <br> resume() = suspend()에 의해 정지된 쓰레드를 다시 실행대기 상태로 만들어줌.
    <br> stop() = 호출되는 즉시 쓰레드가 종료.

    *** 이 메서드들 모두 'deprecated'. 사용이 권장되지 않음.

    예제13-15(page.237)

    <br>

    (4) yield(): 다른 쓰레드에게 양보한다.

    예제13-18(page.241)
    
    <br>

    (5) join(): 다른 쓰레드의 작업을 기다린다.

    시간을 지정하지 않으면, 해당 쓰레드가 작업을 모두 마칠 때까지 기다리게 된다. 작업 중에 다른 쓰레드의 작업이 먼저 수행되어야할 필요가 있을 때 사용.<br>
    interrupt()에 의해 대기상태에서 벗어남.<br>
    static메서드가 아님.

    예제13-19,20(page.244)