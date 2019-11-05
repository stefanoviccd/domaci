package circle;

import shape.Shape;

public class Circle implements Shape {
	private double r;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double calculateO() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}
	@Override
	public double calculateP() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
	@Override
	public void ispisi() {
		// TODO Auto-generated method stub
		System.out.println("Circle:\tr="+r+"\tP= "+calculateP()+"\tO= "+calculateO());
		
	}
	

	

}
