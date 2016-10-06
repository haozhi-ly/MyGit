package com.sf;

import java.util.Arrays;

import com.sf.bean.sort.Sortable;




public class MyMergeSorter  implements Sortable {
	private int[] a;

	
	public MyMergeSorter(int[] a) {
		
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
		if(a.length<=1){
			return;
		}
		int[] m1=new int[a.length/2];
		int[] m2=new int[a.length-a.length/2];
		
		System.arraycopy(a, 0, m1, 0, m1.length);
		System.arraycopy(a, a.length/2, m2, 0, m2.length);
		
	
		MyMergeSorter ms1=new MyMergeSorter(m1);
		MyMergeSorter ms2=new MyMergeSorter(m2);
		ms1.sort();
		ms2.sort();
		merge(m1,m2);
		
	}
	
	public void merge(int[] m1,int[] m2){
		int i=0;
		int startm1=0;
		int startm2=0;
		
		
		while(startm1<m1.length && startm2<m2.length){
			
			if(m1[startm1]<m2[startm2]){
				a[i]=m1[startm1];
				startm1++;
			}else{
				a[i]=m2[startm2];
				startm2++;
			}
			i++;
		}
		if(startm1==0){
			System.arraycopy(m1, 0, a, m2.length, m1.length);
		}
		if(startm2==0){
			System.arraycopy(m2, 0, a, m1.length, m2.length);
		}
		if(startm1==m1.length){
			System.arraycopy(m2, startm2, a, m1.length+startm2, m2.length-startm2);
		}
		if(startm2==m2.length){
			System.arraycopy(m1, startm1, a, m2.length+startm1, m1.length-startm1);
		}
		
	}
	public static void main(String[] args){
		int[] a={10,9,6,47,99,54,100,234,885};
		
		/*BubbleSort bs=new BubbleSort(a);
		bs.sort();
		System.out.println(Arrays.toString(a));*/
		MyMergeSorter bs=new MyMergeSorter(a);
		bs.sort();
		
		System.out.println(Arrays.toString(a));
	}
}
