
/*
3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오
단) if만 쓰세요

[실행결과]
첫번째 입력 : 85
두번째 입력 : 80
세번째 입력 : 65
65  80  85

첫번째 입력 : 62
두번째 입력 : 60
세번째 입력 : 80
60  62  80
 */

package if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class  IfTest3{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("첫번째 입력 : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("두번째 입력 : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("세번째 입력 : ");
		int c = Integer.parseInt(br.readLine());


		if(a<b && a<c){
			if (b<c)System.out.printf("%d, %d, %d",a,b,c);
			else System.out.printf("%d, %d, %d",a,c,b);
		}
		else if (b<a && b<c){
			if(a<c)System.out.printf("%d, %d, %d",b,a,c);
			else System.out.printf("%d, %d, %d",b,c,a);
		}
		else{
			if(b<a)System.out.printf("%d, %d, %d",c,b,a);
			else System.out.printf("%d, %d, %d",c,a,b);
		}
		
		
	}
}
