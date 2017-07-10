package com.che.demo.iterator;

public class LinkedList implements Conllection, Iterator {
	
	private int size;
	
	private Node head = null;
	
	private Node tail = null;
	
	public void add(Object o){
		Node node = new Node(o, null);
		if(size == 0){
			head = node;
			tail = node;
		}
		tail.setNext(node);
		tail = node;
		size ++;
	}

	public int size(){
		return size;
	}
	
	public boolean hasNext(){
		return false;
	}
	
	public Object next(){
		return null;
	}
	public Iterator getIterator(){
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator{
		private Node currentNode = head;
		
		public boolean hasNext(){
			if(currentNode.getNext() != null) return true;
			return false;
		}
		
		public Object next(){
			Node temp = currentNode;
			currentNode = temp.getNext();
			return temp.getNext().getData();
		}
	}
	
}
