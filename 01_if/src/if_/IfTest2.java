/*
3����(a,b,c)�� ������ �Է¹޾Ƽ� �հ����� ���հ����� ����Ͻÿ�
�հ��� ����� 60�� �̻��̾�� �ϰ� �� ������ 40�� �̻��̾�� �Ѵ�

[������]
ù��° ���� ���� : 85
�ι�° ���� ���� : 80
����° ���� ���� : 65
�հ�

ù��° ���� ���� : 100
�ι�° ���� ���� : 90
����° ���� ���� : 35
�������� ���հ�

ù��° ���� ���� : 62
�ι�° ���� ���� : 60
����° ���� ���� : 45
���հ�
*/

package if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class  IfTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		IfTest2 itt= new IfTest2();

		System.out.print("ù��° ���� ���� : ");
		int f = Integer.parseInt(br.readLine());
		System.out.print("�ι�° ���� ���� : ");
		int s = Integer.parseInt(br.readLine());
		System.out.print("����° ���� ���� : ");
		int t = Integer.parseInt(br.readLine());

		double avg = itt.avg(f,s,t);

		if (avg < 60){
			System.out.println("���հ�");
			}
		else if (avg >= 60 && f < 40){
			System.out.println("�������� ���� ���հ�");
		}
		else if (avg >= 60 && s <40){
			System.out.println("�������� ���� ���հ�");
		}
		else if (avg >= 60 && t <40){
			System.out.println("�������� ���� ���հ�");
		}
		else 
			System.out.println("�հ�");


		
	}
	public double avg (int f,int s, int t){
		return ((double)(f+s+t)/3);
	}
}
