package com.sf.bean.sort.imp;

import com.sf.bean.sort.Sortable;

public class SelectSorter implements Sortable {
	
	private int[] a;
	@Override
	
	public void sort() {
		for(int i=1;i<a.length;i++){
			int j=i;
			int next=a[i];
			while(j>0 && a[j-1]>next){
				a[j]=a[j-1];
			}
			a[j]=next;
			
		}
	}
	public SelectSorter(int[] a) {
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
