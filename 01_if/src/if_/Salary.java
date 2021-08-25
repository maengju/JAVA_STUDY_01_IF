/*
���� ��� ���α׷�
�̸�, ����, �⺻��, ������ �Է��Ͽ� �޿�, ����, ������ ����Ͻÿ�
������ �޿��� 4,000,000 ���� �̻��̸� 3% �ƴϸ� 2%�� �Ѵ� (���ǿ����� - ���� ? �� : ����)

�޿� = �⺻�� + ����
���� = �޿�(pay) * ����
����(salary) = �޿� - ����

������ calcTax() �޼ҵ� ���Ͽ� �����´� (return)
������ calcSalary()  �޼ҵ� ���Ͽ� �����´� (return)

[������]
�̸� �Է�  : ȫ�浿
���� �Է�  : ����
�⺻�� �Է� : 4500000
���� �Է� : 200000

         *** ȫ�浿 ���� ���� ***
���� : ����
�⺻��          ����         �޿�         ����      ����      ����
4,500,000     200,000     4,700,000   3%      xxxxx   xxxxxxx

*/

package if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.DecimalFormat;

class  Salary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat();

		Salary sl = new Salary();

		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("���� �Է� : ");
		String position = br.readLine();
		System.out.print("�⺻�� �Է� : ");
		int base = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int extra = Integer.parseInt(br.readLine());
		

		int pay = base + extra;
		double tax = pay>=4000000 ? 0.03 : 0.02 ;
		int calcTax = (int)sl.calcTax(pay,tax);
		int salary = sl.salary(pay,calcTax);

		System.out.println("\t\t ***" + name + " ���� ���� ***");
		System.out.println("���� : " + position);
		System.out.println("�⺻��\t\t ����\t\t�޿�\t\t����\t���� \t����");
		System.out.println(df.format(base) + " \t " + df.format(extra) + "\t" + df.format(pay) 
							+ "\t" + (int)(tax*100)+"%" + "\t" + df.format(calcTax) + "\t" + df.format(salary));

	}

	public double calcTax(int pay, double tax){
		return pay*tax;
	}

	public int salary(int pay , int calcTax){
		return pay-calcTax;	
	}
}
