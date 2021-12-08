package self.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		//변수 선언 위치 예제
		
		int v1 = 15; 
		
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			
		}

		int v2 = 10;//내가 컴파일 에러 때문에 예제에 추가한 코드
		
		int v3 = v1 + v2 + 5;
		
	}

}
