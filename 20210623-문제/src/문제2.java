import java.util.Arrays;

public class ����2 {
static int[] intput(int[] a) {
	
	for(int i=0; i<5; i++) {
		a[i]=(int) (Math.random() * 100) + 1;
	}
	System.out.println("������:");
	System.out.println(Arrays.toString(a));
	return a;
}

static void up(int[] a) {
	for(int i=0; i<a.length-1; i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			// ���ڸ� ���ؼ� ��ȯ 
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("�������� ����:");
	System.out.println(Arrays.toString(a));
}

static void down(int[] a) {
	for(int i=0; i<a.length-1; i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			// ���ڸ� ���ؼ� ��ȯ 
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("�������� ����:");
	System.out.println(Arrays.toString(a));
}
	public static void main(String[] args) {
		int[] arr=new int[5];
		intput(arr);
		up(arr);
		down(arr);
	}

}
