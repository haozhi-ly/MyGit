package com.sf.bean.sort.imp;

import com.sf.bean.sort.Sortable;

public class MergeSorter implements Sortable {
	
	private int[] a;
	@Override
	
	public void sort() {
		if(a.length<=1){
			return;
		}
		int[] one=new int[a.length/2];
		int[] two=new int[a.length-one.length];
		System.arraycopy(a, 0, one, 0, one.length);
		System.arraycopy(a, one.length, two, 0, two.length);
		MergeSorter m1=new MergeSorter(one);
		MergeSorter m2=new MergeSorter(two);
		m1.sort();
		m2.sort();
		mergeArr(one,two);
		
		
	}
	
	public void mergeArr(int[] frist,int[] second){
		int ifrist=0,isecond=0,j=0;
		while(ifrist<frist.length && isecond<second.length){
			if(frist[ifrist]>second[isecond]){
				a[j]=second[isecond];
				isecond++;
			}else{
				a[j]=frist[ifrist];
				ifrist++;
			}
			j++;
		}
		System.arraycopy(frist,ifrist,a,j,frist.length-ifrist);
		System.arraycopy(second,isecond,a,j,second.length-isecond);
	}
	
	public MergeSorter(int[] a) {
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
