package FileCode;

import java.util.Scanner;

public class FileChoice {
	private static String fileName;
	private static String fileName1;
	private static String fileFormat;
	private static Scanner sc=new Scanner(System.in);
	public static  String getFileName() {
		System.out.println("请输入文件名:");
		fileName=sc.nextLine();
		return fileName;
	}
	public void setFileName(String fileName) {
		FileChoice.fileName = fileName;
	}
	public static String getFileName1() {
		System.out.println("请问要覆盖原文件吗?y/n");
		String choice=sc.nextLine();
		if("Y".equalsIgnoreCase(choice)){
			fileName1=fileName;
		}else{
			System.out.println("请输入转化后的文件名：");
			fileName1=sc.nextLine();
		}
		return fileName1;
	}
	public void setFileName1(String fileName1) {
		FileChoice.fileName1 = fileName1;
	}
	public static String getFileFormat() {
		System.out.println("请选择文件格式：");
		System.out.println("1：mp3");
		System.out.println("2：mp4");
		int choice=CheckString.getRightNum();
		switch (choice) {
		case 1:fileFormat=".mp3";
			break;
		case 2:fileFormat=".mp4";
		break;
		default:System.out.println("没有这个选项，瞎啊");
		    getFileFormat();
			break;
		}
		return fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		FileChoice.fileFormat = fileFormat;
	}
	
}
