
public class ����Ǯ��_������ {
	// ������ ó��
	static void binary(int[] arr, int value) {
		int index=15;
		while(true) {
			arr[index]=value%2;
			value/=2;
			if(value==0) break;
			index--;
		}
	}
	// ���
	static void print() {
		int num=�ڹٸ޼ҵ�����.input("0~32767���� ����");
		int[] arr=new int[16]; // call by reference => �迭(�ּ�) �ּҸ� �Ѱ��ְ� ���� ä���޶�
		binary(arr,num);
		// ���
		for(int i=0; i<16; i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		print();
	}

}
