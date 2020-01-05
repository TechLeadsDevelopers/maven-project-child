package com.maven.project.child.app;

public class EqualHashCode {

	public static void main(String[] args) {
		Student st=new Student();
		st.setId(12L);
		st.setName("test");
		Student st1=new Student();
		st1.setId(12L);
		st1.setName("test");
		boolean flag = st.equals(st1);
		
		if(st==st1) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		System.out.println(flag);
		System.out.println(st.hashCode()+" "+st1.hashCode());
		


	}

}
