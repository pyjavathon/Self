package part05.exam01;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		String[] oldStrArray = {"java","array","copy"};
		
		String[] newStrArray = new String[5];
		
		
		//System.arracopy(원본배열,복사할 항목 시작 인덱스, 새 배열, 붙여넣을 시작 인덱스);
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
		}
		
		
	}

}
