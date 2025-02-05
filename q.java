package project_java;

public class q {
  // int num; // 재선언이 안됨
  static int num; // 전역변수
  // -> 1-1
  String name;

  // 변수의 재선언이 안됨.
  // int num;

  // 변수 선언 후 초기화는 메서든 안에서 가능
  // num = 100;

  // 변수의 할당(선언과 초기화)시에는 초기화 가능
  int sum = 0;

  public static void main(String[] args) {
    int tot = 10;
    num = 1000; // -> 이렇게 쓸거면 1-1에 선언후 해야한다.
    q e = new q(); // 사용하는 시점은 여기에 초기화가 됨
    // e.num = 10; 타입이 안맞아서 오류 문자열로 처리해야합
    e.name = "10";
    // java 10부터 지역 변수에서만 var 사용
    var input = true;

    // 변수 선언시에는 왼쪽은 type 변수명, 오른쪽은 값 (실제값, 주소값)
    // 타입은 프로그램이 끝나기까지 해당 영역에서 사용. 다른 타입의 값 할당 불가
    boolean power = false;
  }
}


