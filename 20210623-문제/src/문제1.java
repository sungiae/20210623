import java.util.Scanner;

public class ����1 {
// 1.�Է�
static int num() {
	Scanner scan = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int num=scan.nextInt();
	return num;
}
// 2.ó��
static int[] binary(int num) {
	int[] binary=new int[16];
	int index=15;
	while(true) {
		binary[index]=num%2;
		num=num/2;
		
		if(num==0) {
			break;
		}
		index--;
	}
	return binary;
}
// 3.���
static void num(int[] binary) {
	for (int i=0; i<binary.length;i++) {
		if(i%4==0 && i!=0) 
			System.out.print(" ");
		System.out.print(binary[i]);
	}
}
public static void main(String[] args) {
	
	int num=num();
	int binary[]=binary(num);
	num(binary);
	}

}