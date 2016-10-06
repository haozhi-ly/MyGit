package com.sf;

import com.sf.bean.sort.Sortable;
public class MyShellSorter implements Sortable {
	
	private int[] a;
	@Override
	
	//8,3,6,2,1,5,9,7
	
	public void sort(){
		for(int r=a.length/2;r>=1;r=r/2){
			for(int i=r;i<a.length;i=i+r){
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
	public MyShellSorter(int[] a) {
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
