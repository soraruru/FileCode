package FileCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JiaMi {
	
	
	public void jiaMi(String srcFile,String destFile) throws IOException{
		File file=new File(srcFile);
		FileInputStream fis=new FileInputStream(file);		
		int mima=(int)(file.length()/1024/1024+1);
		System.out.println("请在以下范围选择加密码：1~"+mima);
		int num=CheckString.getRightNum();
		int num2=(int)(file.length()/1024/1024/num+1);
		int total=0;
		byte[] bs=new byte[1024*1024*num2];
		int count=1;
		while((total=fis.read(bs))!=-1){
			FileOutputStream fos=new FileOutputStream("第"+count+"个");
			count++;
			fos.write(bs,0,total);
			fos.close();
		}
		total=0;
		fis.close();
		FileOutputStream fos1=new FileOutputStream(destFile);
		for(int i=0;i<count-1;i++){
			FileInputStream fis1=new FileInputStream("第"+(i+1)+"个");
			while((total=fis1.read(bs))!=-1){
				if((i+1)%2==1){
					byte[] mi=new byte[1024*1024*num2];
					fos1.write(mi);
				}
				fos1.write(bs,0,total);
			}
			fis1.close();
			new File("第"+(i+1)+"个").delete();
		}
		fos1.close();
		System.out.println("加密已完成,请保管好您的解密码："+num2);
	}
	public JiaMi() throws IOException{
		String fileName=FileChoice.getFileName();
		String fileName1=FileChoice.getFileName1();
		String fileFormat=FileChoice.getFileFormat();
		jiaMi(fileName+fileFormat,fileName1+fileFormat);
	}
}
