package org.example.chapter1.item6;

public class Main {

	/**
	 * 문자열
	 *
	 * new String() 사용 X
	 * 메모리 낭비를 줄이기 위해서
	 *
	 * JVM은 내부적으로 문자열을 constant pool에 캐싱합니다.
	 * 동일한 문자열을 참조하는 방법으로 재사용하게 됩니다.
	 *
	 * 따라서 동일한 문자열임을 판단하는 경우에는 equals 사용
	 */

	/**
	 * 정규 표현식
	 *
	 * effective java 예제코드 6-1, 6-2
	 *
	 * 첫 생성시 비용이 비쌈 -> CPU 자원을 많이 사용함
	 * JIT 컴파일러를 이용해 (native code) 필드로 선언하고 재사용하는 방식을 권장
	 *
	 * 정규 표현식이 쓰일만한 곳
	 * 1. String.matches
	 * 2. String.split -> Pattern.compile(regex).split(str)
	 * 3. String.replace -> Pattern.compile(regex).matcher(str).replaceAll(repl)
	 */

	/**
	 * 오토박싱
	 *
	 * 기본 데이터 타입 -> 참조, 래퍼(wrapper class) 객체로 자동 변환하는 과정을 의미
	 * 따라서 오토박싱 -> 인스턴스가 생성
	 */

	/**
	 * GC
	 *
	 * Reachable : 객체가 참조되고 있는 상태
	 * Unreachable : 객체가 참조되고 있지 않은 상태
	 *
	 * 1. marking : Unreachable 상태인 객체를 마킹
	 * 2. sweep : marking 된 객체(가비지)를 제거
	 * 3. compacting : 파편화 된 객체를 모아서 메모리를 최적화
	 *
	 * Java의 heap 메모리
	 * 1. Young Generation : 객체가 처음 생성 될 때, 몇 번 사용하는지 count 함
	 * 2. Old Generation : Yong 영역에서 오랬동안 살아남은 객체들이 이동하는 곳
	 * 3. Permanent Generation/Metaspace : 클래스 또는 메소드의 메타 데이터를 저장
	 *
	 *
	 * Minor GC : Young Generation 있는 객체를 청소 (비교적 자주)
	 * Major GC : Old Generation 있는 객체를 청소
	 *
	 * GC 관점
	 *
	 * Throughput : 애플리케이션의 작업 처리량, GC가 일어나면 Throughput 감소, 가능한 높은
	 * 	처리량을 유지하면서 GC를 수행하는 것이 중요
	 * Stop-The-World (Latency) : GC가 수행하는 동안 JVM이 애플리케이션 실행을 중단
	 * 	이로 인해 Latency(지연시간)에 영향을 줄 수 있음
	 * Footprint : 프로그램 실행에 필요한 메모리 양, GC가 메모리를 재활용하지 않으면 Footprint(메모리 사용량)
	 * 	이 증가, 반면 너무 많이 GC가 실행되면 CPU 사용률이 증가
	 *
	 * 	적절한 GC 전략을 선택
	 *
	 */

	public static void main(String[] args){

		String name = "juwon";
		String name2 = new String("juwon");
		String name3 = "juwon";
//		System.out.println(name == name2);
		System.out.println(name == name3);
	}

}