package org.example.chapter5.item33;

import java.util.Arrays;
import java.util.List;

public class Main {
//1 타입 안정 이종 컨테이러
	/**
	 * 타입 안전 이종 컨테이너?
	 *
	 * 타입 안정성이 보장된 서로 다른 타입의 원소를 가지는 자료구조
	 * 타입 안정성 -> 제네릭을 통해서 컴파일 타임 때 확인
	 * 런타인 -> 명시적으로 타입을 확인하면서 보장
	 *
	 * 서로 다른 타입의 원소를 가지는 자료구조 -> Map
	 */

	/**
	 * 타입 안전 이종 컨테이너의 예시
	 * DB
	 * 각 colum 서로 다른 타입의 원소를 가질 수 있음
	 * DB는 신뢰도와 타입 안정성을 가지고 있음
	 *
	 * 따라서 타입 안정 이종 컨테이너라고 볼 수 있음
	 **/

	/**
	 * Java의 타입 안정 이종 컨테이너 패턴
	 *
	 * annotation API
	 * 컨테이너 대신 키를 매개변수화
	 * 컨테이너에 값을 넣거나 뺄 때 매개변수화한 키를 함께 제공
	 * */

//2 타입 안전 이종 컨테이너 구현 방법

	/**
	 * Favorites 클래스 구현
	 * 순서
	 * 1. 타입 토큰 (class객체)를 키로 가지는 맵 인스턴스 생성 : 다양한 타임을 지원할 수 있게  key를 와일드카드 타입의 class로 설정,
	 * 2. 값을 추가할 수 있는 putFavorite 메서드 구현 : class.cast 메서드의 동적 형변환을 통해 런타임 타입 안정성 확보
	 * 3. 값을 조회할 수 있는 getFavorite 메서드 구현 : class.cast 메서드 활용용
	 */

	/**
	 * 한정적 타입 토큰 적용
	 * 한정적 타입 토큰을 사용한 API
	 * Favorites 클래스에 한정적 타입 토큰 적용
	 * 1. 한정적 와일드 카드 타입을 키로 가지도록 Map 인스턴스 변경
	 * 2. put 메서드에 한정적 제네릭 타입 적용
	 * 3. getFavorite 메서드에 한정적 제네릭 타입 적용
	 */
//3 타입 안전 이종 컨테이너의 한계점

	/**
	 * 실체화 불가 타입 사용 불가 이유 제네릭 타입은 동일한 로타입의 class
	 * 객체를 공유 List<String> Class 객체를 얻을 수 없음 => List의
	 *
	 * Class 객체는 매개 변수 타입과 상관없이 동일하게 List.class
	 * 다른 방법 : 슈퍼 타입 토큰 -> 제네릭 클래스를 상속하여 사용하는 케이스
	 */

	public static void main(String[] args){

		/**
		 * favorites 클래스의 메소드를 사용하여 여러 타입의 데이터를 추가/조회 확인
		 */

//		Favorites favorites = new Favorites();
//		favorites.putFavorites(Integer.class, 1);
////		favorites.putFavorites((Class)Integer.class, "1");
//		Integer favorites1 = favorites.getFavorites(Integer.class);
//		favorites.putFavorites(String.class, "effective java");
//		String favorites2 = favorites.getFavorites(String.class);
//
//		System.out.println("favorites1 = " + favorites1);
//		System.out.println("favorites2 = " + favorites2);

		/**
		 * 한정적 타입 토큰 적용
		 */

//		FavoritesBoundedTypeToken favoritesBoundedTypeToken = new FavoritesBoundedTypeToken();
//		favoritesBoundedTypeToken.putFavorites(Integer.class, 1);
//		favoritesBoundedTypeToken.putFavorites(Double.class, 1.3);
//		favoritesBoundedTypeToken.putFavorites(Integer.class, "1");
//		favoritesBoundedTypeToken.putFavorites(String.class, "이펙티브 자바");
//		Integer favorites3 = favoritesBoundedTypeToken.getFavorites(Integer.class);
//		Double favorites4 = favoritesBoundedTypeToken.getFavorites(Double.class);
//		System.out.println("favorites3 = " + favorites3);
//		System.out.println("favorites4 = " + favorites4);

		/**
		 * 와일드 카드 타입의 타입 토큰을 타입 안전성을 보장하기(런타임 시)
		 * (클라이언트 수준에서 동적 형변환)
		 */

//		Class<?> clasS = Integer.class;
//		Number number = favoritesBoundedTypeToken.getFavorites(clasS.asSubclass(Number.class));
//		System.out.println("number = " + number);

		/**
		 * 제네릭 타입의 타입 토큰
		 * 매개변수 타입이 실체화 불가
		 */

//		Class<List<String>> listClass1 = List<String>.class;
//		Class<List<String>> listClass2 = List.class;
//		Class<List> listClass3 = List.class;
//		Favorites favorites1 = new Favorites();
//		favorites1.putFavorites(List.class, Arrays.asList("일", "이", "삼"));
//		favorites1.putFavorites(List.class, Arrays.asList(1, 2, 3));
//		List favorites = favorites1.getFavorites(List.class);
//		System.out.println("favorites = " + favorites);

		/**
		 * 슈퍼 타입 토큰
		 */

		// 익명 클래스
		// 해당 클래스를 상속한 익명클래스
		// 따라서 제네릭 타입을 상속했다고 볼 수 있음

		// 로타입 슈퍼타입 토큰 생성
//		new TypeRef() {};

		// type 매개변수로 주어진, 매개변수화 된 타입, 다른 기타 제레닉 타입 클래스를 사용했을 때 오류 방지
//		new TypeRef<List>() {};

//		new TypeRef<List<String>>() {};

		/**
		 * 슈퍼 타입 토큰을 사용
		 * 제네릭 타입의 타입 안정 이중 컨테이너 사용
		 */

		FavoritesSuperTypeToken favoritesSuperTypeToken = new FavoritesSuperTypeToken();
		favoritesSuperTypeToken.putFavorites(
				new TypeRef<List<String>>() {
				},
				Arrays.asList("하나", "둘", "셋")
		);

		favoritesSuperTypeToken.putFavorites(
				new TypeRef<List<Integer>>() {},
				Arrays.asList(1, 2, 3)
		);

		System.out.println(
				"List<String> = " + favoritesSuperTypeToken.getFavorites(new TypeRef<List<String>>() {}));
		System.out.println("List<Integer> = " + favoritesSuperTypeToken.getFavorites(new TypeRef<List<Integer>>() {}));

	}


}
