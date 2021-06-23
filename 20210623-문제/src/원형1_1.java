import java.util.Scanner;
public class 원형1_1 {
static boolean IdCheck(String id) {
	
	boolean IdCheck=false;
	if(id.equals(id))
		IdCheck=true;
	return IdCheck;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력:");
		String ID=scan.next();
		IdCheck(ID);
	}

}
