package com.sf;

import java.io.File;

public class Test {
	//1,1,2,3,5,8,13,
	private static int[] temp=new int[1024*1024];
	public static void main(String[] args){  
		/*System.out.println(fibmathsquence(7));
		System.out.println(justifyhuwen("abcba",0,"abcba".length()-1));*/
		System.out.println(filelength("G:\\test"));
	}
	private static int fibmathsquence(int n){
		if(temp[n]!=0){
			return temp[n];
		}
		if(n==1){
			return 1;
		}
		if(n==2){
			return 1;
		}
		return fibmathsquence(n-1)+fibmathsquence(n-2);
	}
	
	private static void sayHello(int n){
		if(n==0){
			return;
		}else{
			System.out.println("");
		}
		
	}
	
	private static boolean justifyhuwen(String str){
		if(str=="" || str.length()==1){
			return true;
		}else{
			if(str.charAt(0)==str.charAt(str.length()-1)){
				
				return justifyhuwen(str.substring(1,str.length()-1));
			}else{
				return false;
			}
			
		}
	}
	private static boolean justifyhuwen(String str,int row,int high){ 
		if(row>=high){
			return true;
		}else{
			if(str.charAt(row)==str.charAt(high)){
				
				return justifyhuwen(str,row+1,high-1);
			}else{
				return false;
			}
			
		}
	}
	
	private static long filelength(String path){
		long totatlength=0;
		File file=new File(path);
		if(!file.isDirectory()){
			//System.out.println("yes");
			
			return file.length();
		}else{
			File[] files=file.listFiles();
			if(files.length>0){
				for(File f:files){
					totatlength+=filelength(f.getAbsolutePath());
				}
			}
			return totatlength;
		}
	}
	
}
