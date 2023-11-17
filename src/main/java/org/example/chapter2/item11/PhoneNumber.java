package org.example.chapter2.item11;

import java.util.Objects;
import lombok.EqualsAndHashCode;

//@EqualsAndHashCode
public class PhoneNumber {

	private final short areaCode, prefix, lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum){
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}

	private static short rangeCheck(int val, int max, String arg){
		if (val < 0 || val > max) {
			throw new IllegalArgumentException(arg + ": " + val);
		}
		return (short) val;
	}

	@Override
	public boolean equals(Object o){
		if (o == this) {
			return true;
		}
		if (!(o instanceof PhoneNumber)) {
			return false;
		}
		PhoneNumber pn = (PhoneNumber) o;
		return pn.lineNum == lineNum && pn.prefix == prefix
				&& pn.areaCode == areaCode;
	}






	/**
	 * 1. 31?
	 * 소수, 해시 충돌이 가장 적게 나는 숫자
	 *
	 */

//		@Override public int hashCode() {
//			int result = Short.hashCode(areaCode); // 1
//			result = 31 * result + Short.hashCode(prefix); // 2
//			result = 31 * result + Short.hashCode(lineNum); // 3
//			return result;
//		}







//	/**
//	 * 해시 코드가 같을 때
//	 */
//
//	@Override
//	public int hashCode() {
//		return 42;
//	}










	/**
	 * 지연 초기화 (성능 개선)
	 *
	 *
	 */
//	private int hashCode;
//	@Override public int hashCode() {
//		int result = hashCode;
//		if (result == 0) {
//			result = Short.hashCode(areaCode);
//			result = 31 * result + Short.hashCode(prefix);
//			result = 31 * result + Short.hashCode(lineNum);
//			this.hashCode = result;
//		}
//		return result;
//	}

	/**
	 * 대안 1
	 */
//	@Override public int hashCode() {
//		return Objects.hash(lineNum, prefix, areaCode);
//	}
}
