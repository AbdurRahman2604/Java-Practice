package com.java.practice;

class Encap{
	private String nmae="Naailah";
	private int no=123456;
	public String getNmae() {
		return nmae;
	}
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}

public class D6_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap e1=new Encap();
		e1.setNmae("Naailah Abdur Rahman");
		e1.setNo(1234567890);
		System.out.println(e1.getNmae()+" "+ e1.getNo());

	}

}
