/*
3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
첫번째 과목 점수 : 85
두번째 과목 점수 : 80
세번째 과목 점수 : 65
합격

첫번째 과목 점수 : 100
두번째 과목 점수 : 90
세번째 과목 점수 : 35
과락으로 불합격

첫번째 과목 점수 : 62
두번째 과목 점수 : 60
세번째 과목 점수 : 45
불합격
*/

package if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class  IfTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		IfTest2 itt= new IfTest2();

		System.out.print("첫번째 과목 점수 : ");
		int f = Integer.parseInt(br.readLine());
		System.out.print("두번째 과목 점수 : ");
		int s = Integer.parseInt(br.readLine());
		System.out.print("세번째 과목 점수 : ");
		int t = Integer.parseInt(br.readLine());

		double avg = itt.avg(f,s,t);

		if (avg < 60){
			System.out.println("불합격");
			}
		else if (avg >= 60 && f < 40){
			System.out.println("과락으로 인해 불합격");
		}
		else if (avg >= 60 && s <40){
			System.out.println("과락으로 인해 불합격");
		}
		else if (avg >= 60 && t <40){
			System.out.println("과락으로 인해 불합격");
		}
		else 
			System.out.println("합격");


		
	}
	public double avg (int f,int s, int t){
		return ((double)(f+s+t)/3);
	}
}
