import java.util.Scanner;
public class ����3 {
	
// 1.�Է�
static int input(String year1) {
	Scanner scan = new Scanner(System.in);
	System.out.printf("%s �Է�:",year1);
	int year=scan.nextInt();
	return year;
}

// 2.ó��
static String a(int year) {
	if((year%4)==0 && (year%100)!=0 || (year%400)==0 )
		return year+"�⵵�� �����Դϴ�";
	else
		return year+"�⵵�� ������ �ƴմϴ�";
}

// 3.���
static void output(String a1) {
	System.out.println(a1);
}
	public static void main(String[] args) {
		int year=input("�⵵");
		String a=a(year);
		output(a);
	}

}
