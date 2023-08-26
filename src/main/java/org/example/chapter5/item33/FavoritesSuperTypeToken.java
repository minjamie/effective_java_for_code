package org.example.chapter5.item33;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FavoritesSuperTypeToken {

	private Map<TypeRef<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorites(TypeRef<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), instance);
	}

	@SuppressWarnings("unchecked")
	public <T> T getFavorites(TypeRef<T> type) {
		return (T) favorites.get(type);
	}



//	public <T> List<T> favoriteList() {
//
//		TypeRef<List<T>> ref = new TypeRef<List<T>>() {};
//
//		List<T> result = (List<T>) favorites.get(ref);
//		if (result == null) {
//
//		}
//	}

}
