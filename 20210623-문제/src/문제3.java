import java.util.Scanner;
public class 문제3 {
	
// 1.입력
static int input(String year1) {
	Scanner scan = new Scanner(System.in);
	System.out.printf("%s 입력:",year1);
	int year=scan.nextInt();
	return year;
}

// 2.처리
static String a(int year) {
	if((year%4)==0 && (year%100)!=0 || (year%400)==0 )
		return year+"년도는 윤년입니다";
	else
		return year+"년도는 윤년이 아닙니다";
}

// 3.출력
static void output(String a1) {
	System.out.println(a1);
}
	public static void main(String[] args) {
		int year=input("년도");
		String a=a(year);
		output(a);
	}

}
