package org.example.chapter2.Item16;
/*
아이템16 핵심정리
    1. public클래스는 절대 가변 필드를 직접 노출하지말자 -> 접근자와 변경자 메서드를 통해 캡슐화하자
    2. final 불변 필드라면 노출해도 덜 위험하지만 완전히 안심할수 없다
    3. package-private(default)나 private 중첩 클래스에서는 (불변이든 가변인던) 필드를 노출하는 편이 나을때도 있다. ex) 필드를 가져올때
*/

// 16-3 [불변 필드 노출한 public 클래스]
public final class Time {

    private static final int HOURS_PER_DAY= 24;
    private static final int MINUTES_PER_DAY= 60;

    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {

        if(hour<0 || hour >= HOURS_PER_DAY){
            throw new IllegalArgumentException("시간 : " + hour);
        }if(minute<0 || minute >= MINUTES_PER_DAY){
            throw new IllegalArgumentException("분 : " + minute);
        }
        this.hour = hour;
        this.minute = minute;
    }


    public static void main(String[] args) {
        Time time = new Time(3,10);
        // time.minute = 1; 변경불가
        System.out.println("time.hour="+time.hour + ", time.minite="+ time.minute);
    }

}

/*

16-3 [불변 필드 노출한 public 클래스]
fianl 필드를 사용하면, 직접 노출할때의 단점이 줄어들긴하지만 좋은 방법은 아님
결론적으로 public필드는 가변적이기 때문에 동일하게 부수작업 역시 수행X, api 변경하지 않고 내부 표현방식 변경하지 못함
*/


