package com.che.demo.iterator;

public class Main {
	public static void main(String[] args) {

		Conllection ll = new LinkedList();
//		Conllection ll = new ArrayList();
		for(int i = 0; i< 15; i ++){
			ll.add(new Cat(i));
		}
		System.out.println(ll.size());
		
		Iterator i = ll.getIterator();
		
		while(i.hasNext()){
			System.out.print(i.next() + " ");
		}
	}
}
