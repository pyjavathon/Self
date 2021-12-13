package part11.api01;

public class SubstringEx {//문자열 추출하기

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);//0~6(제외)
		System.out.println(firstNum);
		
		String seconNum = ssn.substring(7);
		System.out.println(seconNum);

	}

}
