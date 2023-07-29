package org.example.chapter2.Item16;

// 16-1[필드접근] 캡슐화의 이점을 제공하지 못하는 public 필드
public class Point1 {
    public double x;
    public double y;

    public static void main(String[] args) {
        Point1 point = new Point1();
        point.x = 10;
        point.y = 12;

        access(point); // 만약, 특정 메서드를 실행한다면 point.x, point.y의 값을 보장할수 없음

        System.out.println(point.x);
        System.out.println(point.y);
    }


    // public 필드를 사용한다면, 불필요하게 아래와 같이 방어적 복사를 해서 사용
    private static void access(Point1 point) {
        // point.x = 30; point.y = 40;  필드값을 임의로 변경, 불변보장할수 없음

        // 방어적 복사 사용 - 생성자의 인자로 받은 객체의 복사본을 만들어 내부필드를 초기화 하는 방식, 불필요한 인스턴스를 생성하게됨
        Point1 localPoint = new Point1();
        localPoint.x = point.x;
        localPoint.y = point.y;
    }

}

/*
    16-1[필드접근] 캡슐화의 이점을 제공하지 못하는 public 필드
    : 필드에 직접 접근하기 때문에 불변을 보장할수 없고, 외부에서 필드에 값이 들어올때 부수 작업(검증,입력값의 제한등)을 수행할수 없음
      이처럼 객체 내부의 속성이나 행위를 외부에서 직접 접근 할수 없게하는 캡슐화의 이점을 제공하지 못함
      또한, 필드를 공개하면 이를 사용할 클라이언트가 생겨날것이므로 내부 표현 방식을 마음대로 바꿀수 없다는 단점이 존재
      public클래스 에서는 public필드를 사용하지 말고, private필드를 사용해서 메소드를 이용해서 접근하는것이 좋음


      * 방어적 복사? 내부의 값을 안전하게 보장하기 위해 사용 (p.303 : 아이템 50 - 적시에 방어적 복사본을 만들라)
      생성자의 인자로 받은 객체의 복사본을 만들어 내부필드를 초기화 or getter메서드에서 내부의 객체를 반환할때, 객체의 복사본을 만들어 반환하는것
*/
