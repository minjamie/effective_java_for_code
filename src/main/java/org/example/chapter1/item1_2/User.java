package org.example.chapter1.item1_2;

public class User {

	/**
	 * 생성자 대신 정적 팩터리 메서드를 고려하자.
	 *
	 * 무조건 쓰는 것이 아니라 고려하는 것 입니다.
	 */

	private String name;
	private String country;
	private Integer age;
	private Boolean sex;
	private Boolean vaccine;

	public User(String name, String country, Integer age, Boolean sex, Boolean vaccine){
		this.name = name;
		this.country = country;
		this.age = age;
		this.sex = sex;
		this.vaccine = vaccine;
	}

	public User(){

	}

	/**
	 * 동일한 시그니처의 생성자를 가질 수 없습니다.
	 */

	/**
	 * 백신을 맞았는지 저장하기 싫은 경우
	 */
//	public User(String name, String country, Integer age, Boolean sex){
//		this.name = name;
//		this.country = country;
//		this.age = age;
//		this.sex = sex;
//	}

	/**
	 * 성별을 저장하기 싫은 경우
	 */
//	public User(String name, String country, Integer age, Boolean vaccine){
//		this.name = name;
//		this.country = country;
//		this.age = age;
//		this.vaccine = vaccine;
//	}

	public static User UserWithoutVaccine(String name, String country, Integer age, Boolean sex) {
		User user = new User();
		user.name = name;
		user.country = country;
		user.age = age;
		user.sex = sex;

		return user;
	}

	public static User UserWithoutSex(String name, String country, Integer age, Boolean vaccine) {
		User user = new User();
		user.name = name;
		user.country = country;
		user.age = age;
		user.vaccine = vaccine;

		return user;
	}
	
}
