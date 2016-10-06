package com.yc.bittree;

import java.util.Scanner;

public class MyBitTree {
	private int data;
	private MyBitTree leftchildren;
	private MyBitTree rightchildren;
	private int leaves;
	private int treeHeight;
	
	public MyBitTree(int data) {
		super();
		this.data=data;
	}
	public MyBitTree() {
		
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public MyBitTree getLeftchildren() {
		return leftchildren;
	}
	public void setLeftchildren(MyBitTree leftchildren) {
		this.leftchildren = leftchildren;
	}
	public MyBitTree getRightchildren() {
		return rightchildren;
	}
	public void setRightchildren(MyBitTree rightchildren) {
		this.rightchildren = rightchildren;
	}
	
	
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public int getTreeHeight() {
		return treeHeight;
	}
	public void setTreeHeight(int treeHeight) {
		this.treeHeight = treeHeight;
	}
	public MyBitTree createTree(MyBitTree treenode){
		Scanner sc=new Scanner(System.in);
		System.out.println("节点的值");
		int value=sc.nextInt();
		if(value!=0){
			treenode=new MyBitTree();	
			treenode.data=value;
			treenode.setLeftchildren(createTree(treenode.leftchildren));
			treenode.setRightchildren(createTree(treenode.rightchildren));
			return treenode;
		}else{
			return null;
		}
	}
	
	public void preOrderTravler(MyBitTree treenode){
		if(treenode!=null){
			//System.out.println("yes");
			System.out.print(treenode.data+"\t");
			preOrderTravler(treenode.leftchildren);
			preOrderTravler(treenode.rightchildren);
		}
	}
	public void InOrderTravler(MyBitTree treenode){
		if(treenode!=null){
			
			InOrderTravler(treenode.leftchildren);
			System.out.print(treenode.data+"\t");
			InOrderTravler(treenode.rightchildren);
		}
	}
	public void postOrderTravler(MyBitTree treenode){
		if(treenode!=null){
			
			postOrderTravler(treenode.leftchildren);
			postOrderTravler(treenode.rightchildren);
			System.out.print(treenode.data+"\t");
		}
	}
	
	public void leavesCount(MyBitTree treenode){
		if(treenode!=null){
			leaves++;		
			postOrderTravler(treenode.leftchildren);
			postOrderTravler(treenode.rightchildren);
			
		}
	}
	
	public int treeHeight(MyBitTree treenode){
		if(treenode!=null){
			int leftheight;
			int rightheight;
			leftheight=treeHeight(treenode.leftchildren)+1;
			rightheight=treeHeight(treenode.rightchildren)+1;
			return leftheight>rightheight?leftheight:rightheight;
		}else{
			return 0;
		}
	}

	
	
	public static void main(String[] args){
		MyBitTree root=new MyBitTree(); 
		root=root.createTree(root);
		root.preOrderTravler(root);
	/*	root.InOrderTravler(root);
		root.postOrderTravler(root);*/
		root.leavesCount(root);
		System.out.println(root.getLeaves());
		System.out.println(root.treeHeight(root));
	}
	
	
	
}
