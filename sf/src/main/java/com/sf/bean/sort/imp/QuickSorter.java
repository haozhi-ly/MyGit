package com.sf.bean.sort.imp;

import com.sf.bean.sort.Sortable;

public class QuickSorter implements Sortable {
	
	private int[] a;
	
	
	/*public void sort(int start,int end) {
		if(a)
	}
	
	public int sort(int start,int end){ 
		int j=0;
		int temp;
		while(start<=end){
			if(a[end]<a[j]){
				temp=a[j];
				a[j]=a[end];
				a[end]=temp;
			}
			j=end;
			end--;
			if(a[start]>a[j]){
				temp=a[j];
				a[j]=a[start];
				a[start]=temp;
			}
			j=start;
			start++;
			
		}
		return j;
	}*/
	
	public QuickSorter(int[] a) {
		super();
		this.a = a;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	@Override
	public void sort() { 
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[] ){
		
		
	}
	

}
