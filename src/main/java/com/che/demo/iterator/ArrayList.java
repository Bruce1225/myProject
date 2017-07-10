package com.che.demo.iterator;

public class ArrayList {
	
	private int size = 0;
	private Object[] os = new Object[3];

	public Object[] add(Object o){
		if(size >= os.length){
			Object[] newO = new Object[os.length * 2];
			System.arraycopy(os, 0, newO, 0, os.length);
			os = newO;
		}
		os[size] = o;
		size ++;
//		print(os);
		return os;
	}
	
//	private void print(Object[] os){
//		StringBuilder sb = new StringBuilder("");
//		for(Object o : os){
//			if(o == null) continue;
//			sb.append(o.toString());
//		}
//		System.out.println(sb);
//	}
//	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("hello01");
		al.add("hello02");
		al.add("hello03");
		al.add("hello04");
		
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Object[] getOs() {
		return os;
	}

	public void setOs(Object[] os) {
		this.os = os;
	}

}
