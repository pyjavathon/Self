package part11.api01;

import java.util.HashMap;

public class HashCodeKeyEx {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<HashCodeKey, String> hashMap = new HashMap<HashCodeKey,String>();
		
		//식별키 new Key(1)로 "홍길동"을 저장함
		hashMap.put(new HashCodeKey(1), "홍길동");
		
		//식별키 new Key(1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new HashCodeKey(1));
		System.out.println(value);
		
		
	}

}
