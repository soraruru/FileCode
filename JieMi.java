package FileCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JieMi {
	
	public void jieMi(String srcFile,String destFile) throws IOException{
		File file=new File(srcFile);
		FileInputStream fis=new FileInputStream(file);
		System.out.println("����������룺");
		int mima=CheckString.getRightNum();
		byte[] bs=new byte[1024*1024*mima];
		int total=0;
		int count=1;
		while((total=fis.read(bs))!=-1){
			FileOutputStream fos=new FileOutputStream("��"+count+"��");
			count++;
			fos.write(bs,0,total);
			fos.close();
		}
		fis.close();
		FileOutputStream fos1=new FileOutputStream(destFile);
		for(int i=0;i<count-1;i++){
			FileInputStream fis1=new FileInputStream("��"+(i+1)+"��");
			while((total=fis1.read(bs))!=-1){
				if((i+1)%3!=1){
					fos1.write(bs,0,total);
				}
			}
			fis1.close();
			new File("��"+(i+1)+"��").delete();
		}
		fos1.close();
		System.out.println("��������ɣ���л����ʹ��");
	}
	public JieMi() throws IOException{
		String fileName=FileChoice.getFileName();
		String fileName1=FileChoice.getFileName1();
		String fileFormat=FileChoice.getFileFormat();
		jieMi(fileName+fileFormat,fileName1+fileFormat);
	}
}
