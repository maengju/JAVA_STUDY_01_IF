package if_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Game2 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      DecimalFormat df = new DecimalFormat();
      int com, user;
      int money = 1000;
      int batting;

      //����
      com = (int)(Math.random()*3) + 1; //0 ~ 2  ->  1 ~ 3
      
      System.out.print("����(1), ����(2), ��(3) �� ��ȣ�� �Է� : ");
      user = System.in.read()-48;
      System.in.read();
      System.in.read();
      System.out.print("���� �ݾ� �Է� : ");
      batting = Integer.parseInt(br.readLine());
      
      System.out.println("����� ������ �ƹ�Ű�� ��������......");
      System.in.read();
      System.in.read();
      
      if(com==1) {//��:����
         if(user==1) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�����ϴ�");
         }else if(user==2) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�̰���ϴ�");
            money += batting; //money = money+batting
         }else if(user==3) {
            System.out.println("��ǻ�� : ����, �� : ���ڱ�");
            System.out.println("�����ϴ�..�Ф�");
            money -= batting; //money = money-batting
         }
      
      }else if(com==2) {//��:����
         if(user==1) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�����ϴ�..�Ф�");
            money -= batting; //money = money-batting
         }else if(user==2) {
            System.out.println("��ǻ�� : ����, �� : ����");
            System.out.println("�����ϴ�");
         }else if(user==3) {
            System.out.println("��ǻ�� : ����, �� : ���ڱ�");
            System.out.println("�̰���ϴ�");
            money += batting; //money = money+batting
         }
         
      }else if(com==3){//��:���ڱ�
         if(user==1) {
            System.out.println("��ǻ�� : ���ڱ�, �� : ����");
            System.out.println("�̰���ϴ�");
            money += batting; //money = money+batting
         }else if(user==2) {
            System.out.println("��ǻ�� : ���ڱ�, �� : ����");
            System.out.println("�����ϴ�..�Ф�");
            money -= batting; //money = money-batting
         }else if(user==3) {
            System.out.println("��ǻ�� : ���ڱ�, �� : ���ڱ�");
            System.out.println("�����ϴ�");
         }
      }//if
      
      System.out.println("���� �ݾ��� "+df.format(money)+"�� �Դϴ�.");
   }
}