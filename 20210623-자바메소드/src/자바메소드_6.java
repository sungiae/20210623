/*
 *  메소드
 *  =====
 *    메소드 <==========> 메소드
 *           데이터 전송
 *             = 1) 리턴형
 *             = 2) 매개변수
 *             => 아무거나 선택해도 괜찮다
 *    지금처럼 클래스가 1개가 아닌 여러개 사용해야하므로 이러한 방식을 사용해야한다
 */
public class 자바메소드_6 {
//	지역변수는 다른 곳에서 가져다 쓸 수 없다
	static void data() {
		String[] name = { "홍길동", "심청이", "박문수", "춘향이", "김두한" };
		process(name);
//	값 출력하는 방법
//	1. 지역변수 내에서 출력
//	2. static String[] data() - return name
	}
	
	static void process(String[] name) {
		for(String n:name) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		data();
	}

}
