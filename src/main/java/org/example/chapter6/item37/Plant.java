package org.example.chapter6.item37;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Plant {

	/**
	 * Plant 클래스는 lifeCycle 열거 타입을 맴버 변수로 가지고 있습니다.
	 */
	final String name;
	final LifeCycle lifeCycle;

	public Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * 열거 타입의 ordinal을 배열의 인덱스로 사용하는 코드 Set 배열을 생성해 생애주기별로 관리
	 */

	public static void usingOrdinalArray(List<Plant> garden) {

		/**
		 * 길이가 3인 Set 배열을 만듭니다.
		 */
		Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[LifeCycle.values().length];

		/**
		 * 배열을 순회하여 빈 HashSet 으로 초기화
		 */
		for (int i = 0; i < plantsByLifeCycle.length; i++) {
			plantsByLifeCycle[i] = new HashSet<>();
		}

		/**
		 * plant가 가지고 있는 LifeCycle 열거타입의 ordinal로 배열의 인덱스를 결정합니다.
		 * 따라서 LifeCycle 별로 Set 배열의 Hash에 추가 됩니다.
		 */
		for (Plant plant : garden) {
			plantsByLifeCycle[plant.lifeCycle.ordinal()].add(plant);
		}

		for (int i = 0; i < plantsByLifeCycle.length; i++) {
			System.out.printf("%s : %s%n",
					LifeCycle.values()[i], plantsByLifeCycle[i]);
		}
	}


	/**
	 * EnumMap을 사용한 코드
	 */
	public static void usingEnumMap(List<Plant> garden) {

		/**
		 * 이전 ordinal을 사용한 코드와 다르게 안전하지 않은 형변환을 사용하지 않습니다.
		 *
		 * EnumMap의 생성자는 한정적 타입 토큰의 키 타입의 Class를 객체로 받습니다.
		 * 이는 제네릭 타입 정보가 런타임시에 소거 -> 런타임 제네릭 타입 정보를 제공하기 위해 Key 타입의 Class 객체를 받도록 구현
		 */
		Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);

		/**
		 * ordinal을 이용한 배열 인덱스를 사용하지 않기 때문에 인덱스 계산을 하는 과정에서 오류가 날 가능성이 없어짐
		 */
		for (LifeCycle lifeCycle : LifeCycle.values()) {
			plantsByLifeCycle.put(lifeCycle, new HashSet<>());
		}

		for (Plant plant : garden) {
			plantsByLifeCycle.get(plant.lifeCycle).add(plant);
		}

		/**
		 * EnumMap은 toString을 재정의하였기 때문에 결과를 출력하기 위해 번거로운 과정을 간소화
		 */
		System.out.println(plantsByLifeCycle);


	}

	/**
	 * stream + HashMap
	 */
	public static void streamV1(List<Plant> garden) {
		Map<LifeCycle, List<Plant>> plantsByLifeCycle = garden.stream()
				.collect(Collectors.groupingBy(plant -> plant.lifeCycle));
		System.out.println(plantsByLifeCycle);
	}

	/**
	 * stream + HashSet
	 */
	public static void streamV2(List<Plant> garden) {
		Map<LifeCycle, Set<Plant>> plantsByLifeCycle = garden.stream()
				.collect(Collectors.groupingBy(plant -> plant.lifeCycle,
						() -> new EnumMap<>(LifeCycle.class), Collectors.toSet()));
		System.out.println(plantsByLifeCycle);
	}

	public static void main(String[] args) {

		Plant corn = new Plant("옥수수", LifeCycle.ANNUAL);
		Plant pea = new Plant("완두", LifeCycle.ANNUAL);
		Plant potato = new Plant("감자", LifeCycle.PERNNIAL);
		Plant alcearosea = new Plant("접시꽃", LifeCycle.PERNNIAL);

		List<Plant> garden = Arrays.asList(corn, pea, potato, alcearosea);

		usingEnumMap(garden);

		streamV1(garden);

	}
}

