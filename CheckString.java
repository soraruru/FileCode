package FileCode;

import java.util.Scanner;

public class CheckString {
	private static Scanner sc=new Scanner(System.in);
	static String str;
	public static int getRightNum(){
		str=sc.nextLine();
		if(!(check(str))){
			System.out.println("您输入的格式有有误，请重新输入");
			getRightNum();
		}
		int num=Integer.parseInt(str);
		return num;
	}
	public static boolean check(String str){
		if("".equals(str)){
			return false;
		}
		char[] cs=str.toCharArray();
		for(char c:cs){
			if(!(c>='0'&&c<='9')){
				return false;
			}
		}
		return true;
	}
}
