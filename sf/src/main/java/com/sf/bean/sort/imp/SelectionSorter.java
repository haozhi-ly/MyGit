package com.sf.bean.sort.imp;

import com.sf.bean.sort.Sortable;

public class SelectionSorter implements Sortable {
	private int[] a;
	@Override
	
	public void sort() {
		for(int i=0;i<a.length;i++){
			int index=i;
			for(int j=i+1;j<a.length;j++){
				int temp;
				if(a[j]<a[index]){
					index=j;
				}
				temp=a[index];
				a[j+1]=a[index];
				a[index]=temp; 
			}
		}
	}
	
	public void insertSorter(){
		for(int i=1;i<a.length;i++){
			int j=i;
			int temp;
			while(j>0 && a[j-1]>a[j]){
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				j--;
			}
			a[j]=a[i];
				
		}
	}
	
	
	
	
	public SelectionSorter(int[] a) {
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
