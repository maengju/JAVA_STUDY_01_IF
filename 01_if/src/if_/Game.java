/*
���� ���� �� ����

����(1), ����(2), ��(3)���� �ν��Ѵ�.
��ǻ�ʹ� 1~3������ ������ �߻��Ѵ�.

[������]
����(1), ����(2), ��(3) �� ��ȣ�� �Է� : 2 (System.in.read() ���)
���� �ݾ� �Է� : 200 (BufferedReader ���)

����� ������ �ƹ�Ű�� ��������

��ǻ�� : ���� , �� : ����
�̰���ϴ�.
���� �ݾ��� 1,200�� �Դϴ�.

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

		//����
		com = (int)(Math.random()*3)+1;

		System.out.print("����(1), ����(2), ��(3) �� ��ȣ�� �Է� : ");
		user = System.in.read();
		System.in.read();
		System.in.read();

		System.out.print("���ñݾ� �Է� : ");
		int bm = Integer.parseInt(br.readLine());
		
		System.out.println("����� ������ ����Ű�� ��������......");
		System.in.read();
		System.in.read();
		
		


		if (user=='1')
		{	if (com==1)
				{System.out.println("��ǻ�� : ����, �� : ���� \n�����ϴ�.\n����ݾ���" + df.format(money) + "�� �Դϴ�.");
			}
			else if (com==2)
				{System.out.println("��ǻ�� : ����, �� : ���� \n�����ϴ�.\n����ݾ���" + df.format(money-bm) + "�� �Դϴ�.");
			}
			else System.out.println("��ǻ�� : ��, �� : ���� \n�̰���ϴ�.\n����ݾ���" + df.format(money+bm) + "�� �Դϴ�.");
		}
		else if (user=='2')
		{	if (com==1)
				{System.out.println("��ǻ�� : ����, �� : ���� \n�̰���ϴ�.\n����ݾ���"+ df.format(money+bm) + "�� �Դϴ�.");
			}
			else if (com==2)
				{System.out.println("��ǻ�� : ����, �� : ���� \n�����ϴ�.\n����ݾ���" + df.format(money) + "�� �Դϴ�.");
			}
			else System.out.println("��ǻ�� : ��, �� : ���� \n�����ϴ�.\n����ݾ���"+ df.format(money-bm) + "�� �Դϴ�.");
		}
		else if (user=='3')
		{	if (com==1)
				{System.out.println("��ǻ�� : ����, �� : �� \n�����ϴ�.\n����ݾ���"+ df.format(money-bm) + "�� �Դϴ�.");
			}
			else if (com==2)
				{System.out.println("��ǻ�� : ����, �� : �� \n�̰���ϴ�.\n����ݾ���"+ df.format(money+bm) + "�� �Դϴ�.");
			}
			else {System.out.println("��ǻ�� : ��, �� : �� \n�����ϴ�.\n����ݾ���" + df.format(money) + "�� �Դϴ�.");
			}
		}
		else System.out.println("error ���� �߸��Է��߽��ϴ�.");
	}
}
