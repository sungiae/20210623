import java.util.Scanner;
public class ����1_1 {
static boolean IdCheck(String id) {
	
	boolean IdCheck=false;
	if(id.equals(id))
		IdCheck=true;
	return IdCheck;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���̵� �Է�:");
		String ID=scan.next();
		IdCheck(ID);
	}

}
