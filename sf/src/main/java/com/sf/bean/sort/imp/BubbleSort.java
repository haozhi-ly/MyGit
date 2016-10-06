package com.sf.bean.sort.imp;

import com.sf.bean.sort.Sortable;

public class BubbleSort implements Sortable {

	private int[] a;
	@Override
	
	public void sort() {
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				int temp;
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public BubbleSort(int[] a) {
		super();
		this.a = a;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	
	

}
