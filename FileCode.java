package FileCode;

import java.io.IOException;

public class FileCode {

	public FileCode() throws IOException {
		printMain();
	}

	public void printMain() throws IOException {
		System.out.println("��л��ʹ�ñ�ϵͳ����ѡ������ʹ�õĹ���");
		System.out.println("1������  2������  3���˳�ϵͳ");
		int choice = CheckString.getRightNum();
		switch (choice) {
		case 1:System.out.println("��ǰ�Ǽ��ܹ���");
		    new JiaMi();
			break;
		case 2:System.out.println("��ǰ�ǽ��ܹ���");
			new JieMi();
			break;
		case 3:System.out.println("ϵͳ���˳�����ӭ�����´�ʹ��");
		    return;
		default:
			break;
		}
		printMain();
	}

	public static void main(String[] args) throws IOException {
		new FileCode();
	}
}
