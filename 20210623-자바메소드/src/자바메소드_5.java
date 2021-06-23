import java.util.Arrays;

public class �ڹٸ޼ҵ�_5 {
	static void display() {
		int a = 10; // �������� => {} ��Ͽ����� ���� / �������� => ���α׷� ����ñ��� �޸� ����
		System.out.println("a=" + a);
		++a;
		// �ٸ� �޼ҵ�� ����� �� ����
		// ����� ���� ������, �Ű������� �̵�
	} // ���� ������ �ѹ� ����ϸ� �ٽ� �ʱ�ȭ�ȴ�

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap:a=" + a + "b=" + b);
	}

	static void disp(int[] arr) {  // �迭 �ּҸ� �Ѱ��ְ� �ش� �ּҿ� ���� ä���� (�ּҿ� ���� ����)
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println("disp:arr=" + Arrays.toString(arr));
	}

	static void swap(String s1,String s2) {
		System.out.println("���� �� s1="+s1+"   s2="+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("���� ��s1="+s1+"   s2="+s2);
	}
	
	public static void main(String[] args) {
//		display(); // a=10 => a++ => a=11 ====> a�� �������
//		display();
//		display();
//		------------------------------------------------------
		int a = 10;
		int b = 20;
		System.out.println("main:a=" + a + "  b=" + b);
		swap(a, b);
		System.out.println("main:a=" + a + "  b=" + b);
//		swap�� �����ص� main�� a,b�� �״���̴�
//		������ �״��, ���۵� �����͸� ���� ====> Call by Value (���� �ѱ�� ���)
//		main�� a,b �޸𸮿� swap�� a,b�޸𸮴� �ٸ���
//		Call by Reference - �ּҸ� �Ѱ�, ���� ��ü�� ���� ��Ų�� (<-> Call by Value)
//			�⺻���� ����� �ȵȴ� / �迭, Ŭ����(StringŬ������ ����)������ ��� ����
		
		
//		�迭 - Call by Reference
//		int[] nums=new int[5];
		int[] nums= {1,2,3,4,5};
		System.out.println(Arrays.toString(nums));
		System.out.println("1."+nums); // nums = I@5d22bbb7 (�ּҰ�)
/*		static void disp(int[] arr) {  // �迭 �ּҸ� �Ѱ��ְ� �ش� �ּҿ� ���� ä���� (�ּҿ� ���� ����)
			for (int i = 0; i < 5; i++) {
				arr[i] = (int) (Math.random() * 100) + 1;
			}
			System.out.println("disp:arr=" + Arrays.toString(arr));
		}
*/
		
		disp(nums);
//		>> �ּ� ��ü�� �Ѱ� ���� �ƿ� �ٲپ��� (�迭, Ŭ������ ���� / StringŬ������ �Ұ���)
		System.out.println("nums="+Arrays.toString(nums));
		
		
		
		
// ���ڿ��� �ٲٱ� �Ұ���
		String s1="Hello";
		String s2="Java";
		swap(s1,s2);
		System.out.println("s1="+s1+"  s2="+s2);
		
		
		int[] aaa=new int[5];
		int[] bbb=aaa; // aaa�� bbb�� ���� (�ּҵ� ����)
		
		int aa=10;
		int bb=aa;
//		�迭�� �޸� �ּҸ� �̿��Ѱ� �ƴ� ���� �̿��� ���̹Ƿ� bb�� aa�� �ٸ���
//		�ּҰ��� �̿��� ���� ���� �ٲ��
		
		bb=20;
		System.out.println(aa);
		System.out.println(bb);
	}
}
