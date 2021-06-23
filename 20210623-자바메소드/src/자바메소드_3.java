// �޼ҵ� ���� (���� � ������ ����ϴ���)
/*
 *   ������ / �Ű�����
 * 1.  O       O  (���̾�) ==> ���̵��ߺ�üũ => true/false
 * 2.  O       X         ==> ��� => ������ ���� (����)
 * 3.  X       O  (���̾�) ==> ������(�� ��) => �޼ҵ� ��ü ���
 * 4.  X       X  (�幰��) ==> ������ ����
 */
import java.util.Scanner;
public class �ڹٸ޼ҵ�_3 {
	
//	1. ������ / �Ű�����
//       O       O  (���̾�) ==> ���̵��ߺ�üũ => true/false
	static String input(String id) {
		Scanner scan=new Scanner(System.in);
		System.out.printf("%s�Է�:",id);
		String input=scan.next();
		return input;
	}
	
	static boolean isIdCheck(String id) {
		boolean bCheck=false;
		String[] ids= {"admin","hong","shim","park","lee","kim"};
		for(String s:ids) { // �迭, �÷����� �������� for-each�� ���
			if(id.equals(s)) // equalsIgnoreCase : ��ҹ��� ��о���
				bCheck=true;
		}
		return bCheck;	
	}
	static void yesno(boolean check) {
		if(check==true) {
			System.out.println("�ߺ��� ���̵��Դϴ�");
		}
		else
			System.out.println("��� ������ ���̵��Դϴ�");
	}
	
	
	
// 2. ������ / �Ű�����
//	    O       X         ==> ��� => ������ ���� (����)
	static int rand() {
		return (int) (Math.random() * 100) + 1;
	}
	
	
// 3. ������ / �Ű�����
//      X       O  (���̾�) ==> ������(�� ��) => �޼ҵ� ��ü ���
// �޼ҵ� ��ü���� ó�� (���, ����Ŭ ����, ����, ���� ��û ...)
	static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, dan*i);
		}
	}
	
// 4. ������ / �Ű�����
//      X       X  (�幰��) ==> ������ ����
// ������ ���� ==> insert, XML... (���)
	static void dataFind()
	{
		String[] ids= {"admin","hong","shim","park","lee","kim"};
		for(String s:ids) { // �迭, �÷����� �������� for-each�� ���
			System.out.println(s);
		}
	}
// -------------------------------------------------------------------------
	public static void main(String[] args) {
//		1. ������ / �Ű�����
//      O       O  (���̾�) ==> ���̵��ߺ�üũ => true/false
		String id=input("���̵�");
		boolean check=isIdCheck(id);
		yesno(check);
		
		
		
// 2. ������ / �Ű�����
//	    O       X         ==> ��� => ������ ���� (����)
		int a=rand();
		System.out.println("������ ����:"+a);

		
// 3. ������ / �Ű�����
//      X       O  (���̾�) ==> ������(�� ��) => �޼ҵ� ��ü ���
		gugudan(5);

// 4. ������ / �Ű�����
//      X       X  (�幰��) ==> ������ ����
// ������ ���� ==> insert, XML... (���)
		dataFind();
	}
}
