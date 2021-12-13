package part11.api01;

public class HashCodeKey {
	public int number;
	
	public HashCodeKey(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCodeKey) {
			HashCodeKey compareKey = (HashCodeKey) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override//이 부분 추가 했더니 홍길동 나옴, 필드 값 리턴해서.
	public int hashCode() {
		return number;
	}
}
