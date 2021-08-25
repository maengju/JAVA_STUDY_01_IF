/*
월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000 만원 이상이면 3% 아니면 2%로 한다 (조건연산자 - 조건 ? 참 : 거짓)

급여 = 기본급 + 수당
세금 = 급여(pay) * 세율
월급(salary) = 급여 - 세금

세금은 calcTax() 메소드 구하여 가져온다 (return)
월급은 calcSalary()  메소드 구하여 가져온다 (return)

[실행결과]
이름 입력  : 홍길동
직급 입력  : 부장
기본급 입력 : 4500000
수당 입력 : 200000

         *** 홍길동 월급 명세서 ***
직급 : 부장
기본급          수당         급여         세율      세금      월급
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

		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("직급 입력 : ");
		String position = br.readLine();
		System.out.print("기본급 입력 : ");
		int base = Integer.parseInt(br.readLine());
		System.out.print("수당 입력 : ");
		int extra = Integer.parseInt(br.readLine());
		

		int pay = base + extra;
		double tax = pay>=4000000 ? 0.03 : 0.02 ;
		int calcTax = (int)sl.calcTax(pay,tax);
		int salary = sl.salary(pay,calcTax);

		System.out.println("\t\t ***" + name + " 월급 명세서 ***");
		System.out.println("직급 : " + position);
		System.out.println("기본급\t\t 수당\t\t급여\t\t세율\t세금 \t월급");
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
