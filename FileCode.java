package FileCode;

import java.io.IOException;

public class FileCode {

	public FileCode() throws IOException {
		printMain();
	}

	public void printMain() throws IOException {
		System.out.println("感谢您使用本系统，请选择你想使用的功能");
		System.out.println("1：加密  2：解密  3：退出系统");
		int choice = CheckString.getRightNum();
		switch (choice) {
		case 1:System.out.println("当前是加密功能");
		    new JiaMi();
			break;
		case 2:System.out.println("当前是解密功能");
			new JieMi();
			break;
		case 3:System.out.println("系统已退出，欢迎您的下次使用");
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
