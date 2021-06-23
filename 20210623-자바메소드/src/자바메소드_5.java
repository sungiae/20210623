import java.util.Arrays;

public class 자바메소드_5 {
	static void display() {
		int a = 10; // 지역변수 => {} 블록에서만 유지 / 전역변수 => 프로그램 종료시까지 메모리 유지
		System.out.println("a=" + a);
		++a;
		// 다른 메소드는 사용할 수 없다
		// 사용할 때는 리턴형, 매개변수로 이동
	} // 지역 변수는 한번 사용하면 다시 초기화된다

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap:a=" + a + "b=" + b);
	}

	static void disp(int[] arr) {  // 배열 주소를 넘겨주고 해당 주소에 값을 채워라 (주소에 의한 전달)
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println("disp:arr=" + Arrays.toString(arr));
	}

	static void swap(String s1,String s2) {
		System.out.println("변경 전 s1="+s1+"   s2="+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("변경 후s1="+s1+"   s2="+s2);
	}
	
	public static void main(String[] args) {
//		display(); // a=10 => a++ => a=11 ====> a는 사라진다
//		display();
//		display();
//		------------------------------------------------------
		int a = 10;
		int b = 20;
		System.out.println("main:a=" + a + "  b=" + b);
		swap(a, b);
		System.out.println("main:a=" + a + "  b=" + b);
//		swap를 실행해도 main의 a,b는 그대로이다
//		원본은 그대로, 전송된 데이터만 변경 ====> Call by Value (값만 넘기는 방식)
//		main의 a,b 메모리와 swap의 a,b메모리는 다르다
//		Call by Reference - 주소를 넘겨, 원본 자체를 변경 시킨다 (<-> Call by Value)
//			기본형은 사용이 안된다 / 배열, 클래스(String클래스는 제외)에서만 사용 가능
		
		
//		배열 - Call by Reference
//		int[] nums=new int[5];
		int[] nums= {1,2,3,4,5};
		System.out.println(Arrays.toString(nums));
		System.out.println("1."+nums); // nums = I@5d22bbb7 (주소값)
/*		static void disp(int[] arr) {  // 배열 주소를 넘겨주고 해당 주소에 값을 채워라 (주소에 의한 전달)
			for (int i = 0; i < 5; i++) {
				arr[i] = (int) (Math.random() * 100) + 1;
			}
			System.out.println("disp:arr=" + Arrays.toString(arr));
		}
*/
		
		disp(nums);
//		>> 주소 자체를 넘겨 값을 아예 바꾸었다 (배열, 클래스만 가능 / String클래스는 불가능)
		System.out.println("nums="+Arrays.toString(nums));
		
		
		
		
// 문자열은 바꾸기 불가능
		String s1="Hello";
		String s2="Java";
		swap(s1,s2);
		System.out.println("s1="+s1+"  s2="+s2);
		
		
		int[] aaa=new int[5];
		int[] bbb=aaa; // aaa와 bbb는 같다 (주소도 같음)
		
		int aa=10;
		int bb=aa;
//		배열과 달리 주소를 이용한게 아닌 값만 이용한 것이므로 bb와 aa는 다르다
//		주소값을 이용한 값만 같이 바뀐다
		
		bb=20;
		System.out.println(aa);
		System.out.println(bb);
	}
}
