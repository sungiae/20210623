/*
 * 3���� ������ �Է� �޾Ƽ� ==> �Է� �޼ҵ� - ������ int[]
 * ���� ==> �޼ҵ� => ������ int
 * ��� ==> �޼ҵ� => ������ double
 * ���� ==> �޼ҵ� => ������ char
 * ��� �޼ҵ� => ������ void (����� ���� void)
 * �� 5��
 * ============= ȣ�� ���� -> main()
 */
import java.util.Scanner;
public class �ڹٸ޼ҵ�_2 {
static int input (String subject) {
	int input=0;
	Scanner scan=new Scanner(System.in);
	System.out.printf("%s:",subject);
	input=scan.nextInt();
	
	return input;
}

static int total(int a, int b, int c) {
	int total=a+b+c;
	return total;
}

static double avg(int total) {
	return total/3.0;
}

static char ch(double avg) {
	char ch=' ';
	switch((int)(avg/10)) {
	case 10: case 9: ch='A'; break;
	case 8: ch='B'; break;
	case 7: ch='C'; break;
	case 6: ch='D'; break;	
	default: ch='F'; break;
	}
	return ch;
	}

	public static void main(String[] args) {
		int kor=input("����");
		int eng=input("����");
		int math=input("����");
	
		int total=total(kor, eng, math);
		double avg=avg(total);
		char ch=ch(avg);
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		System.out.printf("����:%d\n",total);
		System.out.printf("���:%.2f\n",avg);
		System.out.printf("����:%c\n",ch);
	}

}
