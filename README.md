
+ 대문자 시작 class / 소문자 시작 keyword

### 자바 프로그래밍 키워드

-public :
-class : 
-static : 나중에
-void : 메소드 리턴값이 없음
-throws :

### 자바의 특징
- 패키지 : 클래스들을 모아놓은 그룹 , 클래스를 만들 때 패키지를 정하고
해당 패키지 안에서 클래스를 생성함
    + 패키지 이름의 예시 : 우리 회사 도메인명이 himedia.com 라고 하면
    +           ㄴ com.himedia.xxx
    + 수업 중에는 basoc.day01

### 자바 연산의 특징 
- 2개의 데이터가 형식이 같을 시 연산 하면 결과도 같은 타입임
    +int , int 연산하면 결과는 int
    +long , long 연산하면 결과는 long 
    +double 와 double 연산하면 결과는 double

- 2개의 데이터가 형식이 다를 시 연산 하면 결과는 "데이터의 범위" 가 큰쪽으로 형식 결정 
    +long , int 연산하면 결과는 long
    +double , int 연산하면 결과는 double 
    +double 와 long 연산하면 결과는 double

- 결론 : 데이터 형식이 같은 2개를 연산하고 결과를 다른 데이터 형식으로 받고싶다면 
         2개중 하나는 형변환을 하자 ex: return(long)x*y 

### 메소드의 유형

- 1. 클래스 이름으로 클래스에 포함된 static 메소드 또는 속성 호출
    -System.out     :System 클래스의 static 속성
    -A04Quiz.dollarToWon()

- 2. message 또는 sc 는 변수. String message 또는 Scanner sc 로 선언된 변수 
     : message 와 sc는 메모리 주소 참조하는 변수(참조형 변수). '인스턴스 메소드'
     -message.length()
     -sc.nextLine()

- 3. println() 은 out 의 메소드. => 인스턴스 메소드 

### Escape 문자 : \ 기호로 시작하는 문자.

    : 출력문에서 특정 기능을 갖는 문자.

    -\"
    -\n : 줄바꿈
    