package com.lang;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		Clang cl=new Clang();
		JavaLang jl=new JavaLang();
		Scanner sc=new Scanner(System.in);
		
		String in=sc.next();
		
		if (in.equals("C")) {
			cl.setPriority(1);
			jl.setPriority(10);
			cl.start();
			jl.start();
		}
		else{
			cl.setPriority(10);
			jl.setPriority(1);
			cl.start();
			jl.start();
		}

	}

}
