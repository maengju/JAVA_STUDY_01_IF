
/*
3���� ����(a,b,c)�� �Է¹޾Ƽ� ������� ����Ͻÿ�
��) if�� ������

[������]
ù��° �Է� : 85
�ι�° �Է� : 80
����° �Է� : 65
65  80  85

ù��° �Է� : 62
�ι�° �Է� : 60
����° �Է� : 80
60  62  80
 */

package if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class  IfTest3{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("ù��° �Է� : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("�ι�° �Է� : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("����° �Է� : ");
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
