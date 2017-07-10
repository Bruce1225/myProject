package com.che.demo.iterator;

public class ArrayList implements Conllection{
	
	private int size = 0;
	private Object[] os = new Object[3];

	public void add(Object o){
		if(size >= os.length){
			Object[] newO = new Object[os.length * 2];
			System.arraycopy(os, 0, newO, 0, os.length);
			os = newO;
		}
		os[size] = o;
		size ++;
	}
	
	public int size(){
		return size;
	}
	
	public boolean hasNext(){
		return size > os.length;
	}
	
	public Object next(){
		return null;
	}

	public Iterator getIterator(){
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator {
		private int currentIndex = 0;
		
		public boolean hasNext(){
			return currentIndex <size;
		}
		
		public Object next(){
			return os[currentIndex++];
		}
	}

}
