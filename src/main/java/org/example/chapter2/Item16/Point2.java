package org.example.chapter2.Item16;

// 16-2[메소드접근] 접근자와 변경자 메서드를 활용해 데이터를 캡슐화
public class Point2 {

    private double x;
    private double y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        // 입력값제한, 검증등에 대한 조건 설정 가능함
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point2 point2 = new Point2(10.2, 13.4);
        System.out.println("x="+point2.getX());
        System.out.println("y="+point2.getY());

    }

}

/*
   16-2[메소드접근] private 접근자와 변경자 메서드를 활용해 데이터를 캡슐화
   : private 접근제어자를 사용해 외부클래스, 패키지에서 직접 접근하지 못하도록하고,
     setter, getter 메서드를 통해 필드에 접근하는 방식을 사용
     이렇게 메서드를 통해서 접근하기 때문에 특정조건(검증, 제한)을 설정하여 부가적인 작업이 가능함
     패키지 바깥에서 접근할 수 있는 클래스라면 접근자를 제공하기 때문에
     해당클래스 값이 변경되어도 메서드를 통해 값을 가져오기때문에 내부표현방식을 유연하게 변경할수 있다는 장점이 있음

*/