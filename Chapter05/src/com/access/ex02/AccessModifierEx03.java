package com.access.ex02;

import com.access.ex01.MyParent;

class MyChild extends MyParent{

	
	public void printMembers() {
		//System.out.println(prv); Error
		//System.out.println(dft); Error
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class AccessModifierEx03 {
	public static void main(String []args){
		
		MyParent p = new MyParent(); 
		//System.out.println(p.prv); Error 
		//System.out.println(p.dft); Error
		//System.out.println(p.prt); Error
		System.out.println(p.pub);
	}
}
