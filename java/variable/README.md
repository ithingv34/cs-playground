# Variable

변수란 값을 저장할 수 있는 메모리의 주소에 붙이는 이름이다. 프로그램은 변수를 통해 
메모리의 특정 번지에 값을 저장하고 읽을 수 있다. 메모리의 어떤 주소, 어떤 방식으로 저장할지는 자바의 경우 JVM이 담당한다.
Java에서 변수는 다양한 타입의 값을 저장할 수 있으며 이를 자료형이라 한다.

- 변수명을 지을 때는 어떤 값을 저장하고 있는지 쉽게 알 수 있도록 하는 것이 좋다. 

**예약어**
Java 언어에서 의미를 가지고 사용되는 단어로 이 이름은 변수를 위한 이름으로 사용될 수 없으며 사용 시 컴파일에러가 발생한다.

| 분류 | 예약어|
|:--|:--|
|기본형(primitive)| byte, char, short, int, long, float, double|
|접근제한자| private, protected, public |
|클래스 관련| class, extends, abstract, interface, implements, enum|
|객체 관련| new, instanceof, this, super, null|
|메소드 관련| void, return|
|제어문 관련| if, else, switch, case, default, for, do, while, break, continue|
|논리형| true, false|
|예외처리 관련| try, catch, finally, throw, throws|
|기타| package, import, synchronized, final, static|


**정수형**
  - byte(1 byte, -128 ~ 127)
  - char(2 byte, -32,768 ~ 32.768) 
  - short(2 byte, unsigned, 0 ~ 65,535)
  - int intNum(4 byte, -2,147,483,648 ~ 2,147,483,647)
  - long longNum(8 byte, -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807)
**실수형**
  - 메모리에 여유가 있고 특별한 이유가 업는 경우 실수 리터널을 저장할 때는 double 타입을 사용하는 것이 좋다(소수점 이하 더욱 정확한 값을 저장).
  - float(4 byte)
  - double(8 byte)
  - [실수형 정밀도](https://devlog-wjdrbs96.tistory.com/254)
**2진수, 8진수, 16진수**
  - 10진수 11을 2진수, 8진수, 16진수로 나타내기
  - 2진수: int numBase2 = 0b1011;
  - 8진수: int numBase8 = 013; => 1x8^1 + 3x8^0
  - 16진수: int numBase16 = 0xb;
**부울**
  - true, false
**문자형**
  - `char`
  - 작은 따옴표로 감싼 문자
  - [유니코드로 변환되어 저장]()
  - 유니코드는 정수이므로 char 타입도 정수 타입에 속한다.
  - char(2 byte)
    ```java
    char var1 = 'A'; // 유니코드 65
    char var2 = 65; // 10진수
    char var3 = '가'; // 유니코드 44032
    ```
  - `String`
  - 문자들로 이루어진 집합
  - 큰 따옴표로 감싼 문자들을 문자열이라 부른다.
  - 작은 따옴표와 큰 따옴표는 컴파릴러가 문자 리터럴(char)과 문자열 리터럴을 구별하는 기호로 사용된다.

---

## String, StringBuffer, StringBuilder

https://ifuwanna.tistory.com/221