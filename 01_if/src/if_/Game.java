/*
가위 바위 보 게임

가위(1), 바위(2), 보(3)으로 인식한다.
컴퓨터는 1~3사이의 난수를 발생한다.

[실행결과]
가위(1), 바위(2), 보(3) 중 번호를 입력 : 2 (System.in.read() 사용)
배팅 금액 입력 : 200 (BufferedReader 사용)

결과를 보려면 아무키나 누르세요

컴퓨터 : 가위 , 나 : 바위
이겼습니다.
현재 금액은 1,200원 입니다.

*/

package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat();
		
		int com, user;
		int money = 1000;

		//난수
		com = (int)(Math.random()*3)+1;

		System.out.print("가위(1), 바위(2), 보(3) 중 번호를 입력 : ");
		user = System.in.read();
		System.in.read();
		System.in.read();

		System.out.print("배팅금액 입력 : ");
		int bm = Integer.parseInt(br.readLine());
		
		System.out.println("결과를 보려면 엔터키를 누르세요......");
		System.in.read();
		System.in.read();
		
		


		if (user=='1')
		{	if (com==1)
				{System.out.println("컴퓨터 : 가위, 나 : 가위 \n비겼습니다.\n현재금액은" + df.format(money) + "원 입니다.");
			}
			else if (com==2)
				{System.out.println("컴퓨터 : 바위, 나 : 가위 \n졌습니다.\n현재금액은" + df.format(money-bm) + "원 입니다.");
			}
			else System.out.println("컴퓨터 : 보, 나 : 가위 \n이겼습니다.\n현재금액은" + df.format(money+bm) + "원 입니다.");
		}
		else if (user=='2')
		{	if (com==1)
				{System.out.println("컴퓨터 : 가위, 나 : 바위 \n이겼습니다.\n현재금액은"+ df.format(money+bm) + "원 입니다.");
			}
			else if (com==2)
				{System.out.println("컴퓨터 : 바위, 나 : 바위 \n비겼습니다.\n현재금액은" + df.format(money) + "원 입니다.");
			}
			else System.out.println("컴퓨터 : 보, 나 : 바위 \n졌습니다.\n현재금액은"+ df.format(money-bm) + "원 입니다.");
		}
		else if (user=='3')
		{	if (com==1)
				{System.out.println("컴퓨터 : 가위, 나 : 보 \n졌습니다.\n현재금액은"+ df.format(money-bm) + "원 입니다.");
			}
			else if (com==2)
				{System.out.println("컴퓨터 : 바위, 나 : 보 \n이겼습니다.\n현재금액은"+ df.format(money+bm) + "원 입니다.");
			}
			else {System.out.println("컴퓨터 : 보, 나 : 보 \n비겼습니다.\n현재금액은" + df.format(money) + "원 입니다.");
			}
		}
		else System.out.println("error 값을 잘못입력했습니다.");
	}
}
