package part09.exam03;
//중첩 인터페이스
public class Button {

	OnClickListener listener;//인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {//매개변수의 다형성
		this.listener = listener;
	}
	
	void touch() {//구현 객체의 onClick() 메소드 호출
		listener.onClick();
	}
	
	static interface OnClickListener{//중첩인터페이스
		void onClick();
	}
}
