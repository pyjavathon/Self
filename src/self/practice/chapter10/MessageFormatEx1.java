package self.practice.chapter10;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {

		String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
		
		Object[] arguments = {
			"윤아연","02-608-5948","28","08-30"	
		};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
		
	}

}
