package shapelist;

import circle.Circle;
import cvor.Cvor;
import shape.Shape;
import square.Square;

public class ShapeList {
Cvor first=null;
Cvor last=null;
public void addShape(Shape shape) {
	Cvor novi=new Cvor();
	novi.setInfo(shape);
	if(first==null) {
		first=novi;
		last=novi;
	}
	else {
		last.setNext(novi);
		last=novi;
	}
	
}


public void writeList() {
	Cvor tek=new Cvor();
	tek=first;
	while(tek!=null) {
		tek.getInfo().ispisi();
		tek=tek.getNext();
	}
}
public void getCircles() {
	Cvor tek=new Cvor();
	tek=first;
	while(tek!=null) {
		if(tek.getInfo() instanceof Circle) {
		tek.getInfo().ispisi();}
		tek=tek.getNext();
	}
	
}
public void getSquares() {
	Cvor tek=new Cvor();
	tek=first;
	while(tek!=null) {
		if(tek.getInfo() instanceof Square) {
		tek.getInfo().ispisi();}
		tek=tek.getNext();
	}
	
}






}
