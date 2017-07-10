package com.che.demo.iterator;

public interface Conllection {
	
	//interface中的方法不用加public，因为默认就是public
	int size();
	void add(Object o);
	Iterator getIterator();

}
