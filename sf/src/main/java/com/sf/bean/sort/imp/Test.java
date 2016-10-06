package com.sf.bean.sort.imp;

import java.util.Arrays;

import com.sf.MyMergeSorter;
import com.sf.bean.sort.Sortable;

public class Test {
	public static void main(String[] args){
		int[] a={10,9,6,47,99,54,100,234,885};
		
		/*BubbleSort bs=new BubbleSort(a);
		bs.sort();
		System.out.println(Arrays.toString(a));*/
		Sortable bs=new MyMergeSorter(a);
		bs.sort();
		
		System.out.println(Arrays.toString(a));
	}
	
	
}
