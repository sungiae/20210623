/*
 *  �޼ҵ�
 *  =====
 *    �޼ҵ� <==========> �޼ҵ�
 *           ������ ����
 *             = 1) ������
 *             = 2) �Ű�����
 *             => �ƹ��ų� �����ص� ������
 *    ����ó�� Ŭ������ 1���� �ƴ� ������ ����ؾ��ϹǷ� �̷��� ����� ����ؾ��Ѵ�
 */
public class �ڹٸ޼ҵ�_6 {
//	���������� �ٸ� ������ ������ �� �� ����
	static void data() {
		String[] name = { "ȫ�浿", "��û��", "�ڹ���", "������", "�����" };
		process(name);
//	�� ����ϴ� ���
//	1. �������� ������ ���
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
