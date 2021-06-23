// 메소드 유형 (언제 어떤 유형을 써야하는지)
/*
 *   리턴형 / 매개변수
 * 1.  O       O  (많이씀) ==> 아이디중복체크 => true/false
 * 2.  O       X         ==> 목록 => 임의의 정수 (난수)
 * 3.  X       O  (많이씀) ==> 구구단(한 단) => 메소드 자체 출력
 * 4.  X       X  (드물다) ==> 데이터 수집
 */
import java.util.Scanner;
public class 자바메소드_3 {
	
//	1. 리턴형 / 매개변수
//       O       O  (많이씀) ==> 아이디중복체크 => true/false
	static String input(String id) {
		Scanner scan=new Scanner(System.in);
		System.out.printf("%s입력:",id);
		String input=scan.next();
		return input;
	}
	
	static boolean isIdCheck(String id) {
		boolean bCheck=false;
		String[] ids= {"admin","hong","shim","park","lee","kim"};
		for(String s:ids) { // 배열, 컬렉션이 나왔을때 for-each문 사용
			if(id.equals(s)) // equalsIgnoreCase : 대소문자 고분없이
				bCheck=true;
		}
		return bCheck;	
	}
	static void yesno(boolean check) {
		if(check==true) {
			System.out.println("중복된 아이디입니다");
		}
		else
			System.out.println("사용 가능한 아이디입니다");
	}
	
	
	
// 2. 리턴형 / 매개변수
//	    O       X         ==> 목록 => 임의의 정수 (난수)
	static int rand() {
		return (int) (Math.random() * 100) + 1;
	}
	
	
// 3. 리턴형 / 매개변수
//      X       O  (많이씀) ==> 구구단(한 단) => 메소드 자체 출력
// 메소드 자체에서 처리 (출력, 오라클 저장, 수정, 삭제 요청 ...)
	static void gugudan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, dan*i);
		}
	}
	
// 4. 리턴형 / 매개변수
//      X       X  (드물다) ==> 데이터 수집
// 데이터 수집 ==> insert, XML... (출력)
	static void dataFind()
	{
		String[] ids= {"admin","hong","shim","park","lee","kim"};
		for(String s:ids) { // 배열, 컬렉션이 나왔을때 for-each문 사용
			System.out.println(s);
		}
	}
// -------------------------------------------------------------------------
	public static void main(String[] args) {
//		1. 리턴형 / 매개변수
//      O       O  (많이씀) ==> 아이디중복체크 => true/false
		String id=input("아이디");
		boolean check=isIdCheck(id);
		yesno(check);
		
		
		
// 2. 리턴형 / 매개변수
//	    O       X         ==> 목록 => 임의의 정수 (난수)
		int a=rand();
		System.out.println("임의의 정수:"+a);

		
// 3. 리턴형 / 매개변수
//      X       O  (많이씀) ==> 구구단(한 단) => 메소드 자체 출력
		gugudan(5);

// 4. 리턴형 / 매개변수
//      X       X  (드물다) ==> 데이터 수집
// 데이터 수집 ==> insert, XML... (출력)
		dataFind();
	}
}
