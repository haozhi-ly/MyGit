package com.sf;

import java.util.Arrays;

import com.sf.bean.sort.Sortable;




public class MyQuickSorter  implements Sortable {
	private int[] a;

	
	public MyQuickSorter(int[] a) {
		
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
		sort(0,a.length-1);
		
	}
	
	public void sort(int from,int to){
	
		if(from>=to){
			return;
		}
		int flag=flagNode(from,to);
		sort(from,flag-1);
		sort(flag+1,to);
	}
	
	
	
	public int flagNode(int from,int to){
		
		int flag=a[from];
	
		int i=from;
		int j=to;
		
		
		while(i<j){
			while(j>from&&a[j]>flag){
				j--;
			}
			if(i<j){ 
				swap(i,j);
			}else{
				break;
			}
			i++;
			while( i<to && flag>a[i]){
				i++;
			}
			if(i<j){ 
				swap(i,j);
			}else{
				break;
			}
			j--;
		}
		
		return j;
	}
	
	
	
	
	private int swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return i;
		
	}



	public static void main(String[] args){
		int[] a={10,6,9,47,99,54,100,11,34,234,65,67,4,2,87,23};
		
		/*BubbleSort bs=new BubbleSort(a);
		bs.sort();
		System.out.println(Arrays.toString(a));*/
		MyQuickSorter bs=new MyQuickSorter(a);
		/*System.out.println(Arrays.toString(a));
		int temp=bs.flagNode(0, a.length-1);
		System.out.println(temp);*/
		//System.out.println(Arrays.toString(a));
		bs.sort();
		System.out.println(Arrays.toString(a));
	}
}
