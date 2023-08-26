package org.example.chapter5.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {

	// 타입 토큰을 키로 가지는 맵 인스턴스
	// 즐겨찾기를 추가하거나 조회할 수 있음
	private final Map<Class<?>, Object> favorites = new HashMap<>();


	// .class는 로타입을 써야하는 케이스 : 로타입 클래스 사용으로 인한 타입 불안전성이 존재
	// <T> 제네릭 타입을 반환하는 메소드 사용으로 -> 컴파일 타임에서 타입 안전성을 제공
	// Class.cast 메서드를 통해 런타임 타입 안정성을 제공(처음에는 적용 X)
	public <T> void putFavorites(Class<T> type, T instance){

//		favorites.put(type, instance);
		favorites.put(Objects.requireNonNull(type), type.cast(instance));
	}

	// 기존에 타입 안전성을 확보한 상태에서 Map에 data를 넣었기 때문에
	// 해당 메소드에서는 그냥 가져오기만 해도 타입이 안전하다는걸 알 수 있음 그래서(명시적 형변환으로 사용)
	// 타입 토큰으로 맵에 등록된 인스턴스를 조회
	// 타입 토큰의 타입 매개변수와 도일한 타입<T>의 인스턴스를 반환환

	public <T> T getFavorites(Class<T> type){

//		return (T)favorites.get(type);
		return type.cast(favorites.get(type));
	}

}
