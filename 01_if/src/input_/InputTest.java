package input_;

import java.io.IOException;

class InputTest {
	public static void main(String[] args) throws IOException
	//throws �� �ݵ�� �Լ� �ٷ� �ڿ� ����Ѵ�.
		{
		System.out.print("�����͸� �Է��ϼ��� : ");
		int a = System.in.read(); // 1���� �װ͵� ���ڸ� �Է� �޴´�.
		
		System.in.read(); //flush
		System.in.read(); /* ���ʹ� 2���� ������ �����ϴµ� ����ĭ���� �̵���
							�� ������ �̵��ϴ� ������ �Ѵ�.
						*/	

		System.out.print("�����͸� �Է��ϼ��� : \n");
		int b = System.in.read(); // 1���� �װ͵� ���ڸ� �Է� �޴´�.

		System.out.println("��� : " + a +" , " + b);

	}
}
