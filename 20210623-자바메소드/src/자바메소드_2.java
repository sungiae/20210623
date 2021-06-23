/*
 * 3개의 정수를 입력 받아서 ==> 입력 메소드 - 리턴형 int[]
 * 총점 ==> 메소드 => 리턴형 int
 * 평균 ==> 메소드 => 리턴형 double
 * 학점 ==> 메소드 => 리턴형 char
 * 출력 메소드 => 리턴형 void (출력은 거의 void)
 * 총 5개
 * ============= 호출 조립 -> main()
 */
import java.util.Scanner;
public class 자바메소드_2 {
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
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
	
		int total=total(kor, eng, math);
		double avg=avg(total);
		char ch=ch(avg);
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.printf("총점:%d\n",total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.printf("학점:%c\n",ch);
	}

}
