import java.util.Arrays;

public class ����Ǯ��_���� {
static int[] rand() {
	int[] arr=new int[5];
	for(int i=0; i<arr.length;i++) {
		arr[i]=(int) (Math.random() * 100) + 1;
	}
	return arr;
	
}
// ����
static int[] sortDesc(int[] arr) {
	for(int i=0; i<arr.length-1;i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) //DESC
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	return arr;
}
static int[] sortAsc(int[] arr) {
	for(int i=0; i<arr.length-1;i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]>arr[j]) //DESC
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	return arr;
}


// ���
static void print() {
	int[] arr=rand();
	System.out.println("���� ��:");
	System.out.println(Arrays.toString(arr));
	System.out.println("�������� ����");
	System.out.println(Arrays.toString(sortAsc(arr)));
	System.out.println("�������� ����");
	System.out.println(Arrays.toString(sortDesc(arr)));
}
	public static void main(String[] args) {
		print();
	}

}
