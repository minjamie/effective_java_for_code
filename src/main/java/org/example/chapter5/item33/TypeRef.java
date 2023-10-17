package org.example.chapter5.item33;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Objects;

public abstract class TypeRef<T> {

	// 클래스 정보와 함께 제네릭 정보를 담고 있는 필드 변수
	Type type;

	protected TypeRef(){

		// 런타인 타입 안전성을 확보하기 위해서

		// 슈퍼 타입 토큰이(TypeRef) 로타입 확인

		// 슈퍼 타입 토큰에서 제네릭 타입의 정보를 추출
		ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
		type = superclass.getActualTypeArguments()[0];

		// 슈퍼타입 토큰의 매개변수 (type) 로타입 확인인
		if (type instanceof Class) {
			throw new RuntimeException("로 타입입니다.");
		}

		// 슈퍼 토큰 타입의 제네릭 타입의 매개변수 타입을 확인
		ParameterizedType paramType = ParameterizedType.class.cast(type);
		if (paramType.getActualTypeArguments()[0] instanceof TypeVariable) {
			throw new RuntimeException("타입 변수의 타입 토큰을 만들 수 없습니다.");
		}
	}

	// 이전과의 차이점 생성자에서 해당 부분을 모두 검증


	@Override
	public boolean equals(Object o){
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TypeRef<?> typeRef = (TypeRef<?>) o;
		return Objects.equals(type, typeRef.type);
	}

	@Override
	public int hashCode(){
		return Objects.hash(type);
	}

	public Type getType() {
		return type;
	}
}
