package com.yc.LinklistType;

public class MyLinkType<T> {
	private Object t;
	private MyLinkType nextNode;
	public void add(T t) {
		if(t==null){
			throw  new IllegalArgumentException("the param is not be null");
		}
		MyLinkType linkNode=new MyLinkType();
		MyLinkType p=new MyLinkType();
		p=this;
		linkNode.t=t;
		if(linkNode==null){
			throw  new RuntimeException("the memery space is full");
		}
		while(p.nextNode!=null){
			p=p.nextNode;
		}
		p.nextNode=linkNode;
	}
	
	public void addFrist(T t){
		if(t==null){
			throw  new IllegalArgumentException("the param is not be null");
		}
		MyLinkType linkNode=new MyLinkType();
		linkNode.t=t;
		if(linkNode==null){
			throw  new RuntimeException("the memery space is full");
		}
		linkNode.nextNode=this.nextNode;
		this.nextNode=linkNode;
	}
	
	public int size(){
		int i=0;
		if(this.nextNode==null){
			return 0;
		}
		MyLinkType p=new MyLinkType();
		p=nextNode;
		while(p!=null){
			p=p.nextNode;
			i++;
		}
		return i;
	}
	
	public T delete(int i){
		int j=1;
		if(this.nextNode==null){
			throw new NullPointerException("this linklist is null");
		}
		MyLinkType p=new MyLinkType();
		p=this;
		while(p!=null){
			if(j==i){
				T value= (T) p.nextNode.t;
				p.nextNode=p.nextNode.nextNode;
				return value;
			}
			p=p.nextNode;
			j++;
		}
		
		return null;
	}
	
	public void insert(T t,int index){
		int i=0;
		if(this.nextNode==null){
			return ;
		}
		MyLinkType p=new MyLinkType();
		MyLinkType linkNode=new MyLinkType();
		linkNode.t=t;
		p=this;
		if(index>size()){
			throw new IndexOutOfBoundsException("index out bounds");
		}
		while(i<index){
			
			p=p.nextNode;
			i++;
		}
		linkNode.nextNode=p.nextNode;
		p.nextNode=linkNode;
	}
	
	public T get(int index){
		
		int i=0;
		if(this.nextNode==null){
			return null;
		}
		MyLinkType p=new MyLinkType();
		p=this;
		if(index>size()){
			throw new IndexOutOfBoundsException("index out bounds");
		}
		while(i<index){
			p=p.nextNode;
			i++;
		}
		return (T) p.t;
	}
	
	public void show(){
		MyLinkType p=new MyLinkType();
		p=this.nextNode;
		while(p!=null){
			System.out.print(p.t+"\t");
			p=p.nextNode;
		}
		
	}
	public static void main(String[] args){
		MyLinkType<Integer> head=new MyLinkType<Integer>();
		head.add(1);
		head.add(2);
		head.add(3);
		//head.show();
		//head.insert(4,2);
		head.addFrist(4);
		/*head.delete(2);
		head.delete(1);*/
		head.show();
	}
}
