package site.itwill.lang;


import java.util.Scanner;

//Ű����� ��Ģ ������� �Է¹޾� �������� ����ϴ� ���α׷�
//ex) ����� �Է� >> 20 + 10
//	  [���] 30
// => �Է� ����Ŀ� ���� �����ڴ� ��Ģ�����ڸ� ����
// => �Է� ������� �߸� �Է��� ��� �����޼��� ��� �� ���α׷� ����
// => �Է� ����Ŀ� ������ �ԷµǾ ó��
public class ConsoleCalculateApp_ys {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		String formula;
		
		System.out.print("����ϰ� ���� ���� �Է��ϼ���. \n���� : ����1 ������(+,-,*,/ �� ����) ����2 \nex) 3 + 4  \n>> ");
		formula = scanner.nextLine().trim();
				
		double z=0;
				for(int i=0;i<formula.length();i++) {
					if(formula.charAt(i)=='+')
						z=Double.parseDouble(formula.substring(0,i))+Double.parseDouble(formula.substring(i+1));
					else if(formula.charAt(i)=='-')
						z=Double.parseDouble(formula.substring(0,i))-Double.parseDouble(formula.substring(i+1));
					else if(formula.charAt(i)=='*')
						z=Double.parseDouble(formula.substring(0,i))*Double.parseDouble(formula.substring(i+1));
					else if(formula.charAt(i)=='/')
						z=Double.parseDouble(formula.substring(0,i))/Double.parseDouble(formula.substring(i+1));
					else if(i==formula.length())
						System.out.println("[����] �����ڰ� �������� �ʽ��ϴ�.");
				}
				System.out.println("\n[���]"+z);  
					scanner.close();
		
		
		//������ ã�Ƽ� ������ ��ġindex ã�Ƽ� substring���� �� ��  �и�
	}
}
