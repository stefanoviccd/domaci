package square;

import shape.Shape;

public class Square implements Shape {
	private double a;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	@Override
	public double calculateO() {
		// TODO Auto-generated method stub
		return 4*a;
	}
	@Override
	public double calculateP() {
		// TODO Auto-generated method stub
		return a*a;
	}
	@Override
	public void ispisi() {
		// TODO Auto-generated method stub
		System.out.println("Square:\ta="+a+"\tP= "+calculateP()+"\tO= "+calculateO());
		
	}
	
	
	

}
