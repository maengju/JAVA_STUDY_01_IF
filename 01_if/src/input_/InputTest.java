package input_;

import java.io.IOException;

class InputTest {
	public static void main(String[] args) throws IOException
	//throws 는 반드시 함수 바로 뒤에 써야한다.
		{
		System.out.print("데이터를 입력하세요 : ");
		int a = System.in.read(); // 1개만 그것도 문자만 입력 받는다.
		
		System.in.read(); //flush
		System.in.read(); /* 엔터는 2가지 동작을 같이하는데 다음칸으로 이동과
							맨 앞으로 이동하는 역할을 한다.
						*/	

		System.out.print("데이터를 입력하세요 : \n");
		int b = System.in.read(); // 1개만 그것도 문자만 입력 받는다.

		System.out.println("결과 : " + a +" , " + b);

	}
}
