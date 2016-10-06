package com.sf.bean.sort.imp;

import com.sf.bean.sort.Sortable;

public class shellSorter implements Sortable {
	
	private int[] a;
	@Override
	
	public void sort() {
		
		for(int r=a.length/2;r>=1;r=r/2){
			for(int i=r;i<a.length;i++){
				int j=i-r;
				int next=a[i];
				while(j>=0 && a[j]>next){
					a[j+r]=a[j];
					j=j-r;
				}
				a[j+r]=next;
			}
		}
	}
	public shellSorter(int[] a) {
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
