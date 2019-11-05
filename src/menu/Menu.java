package menu;

import java.util.Scanner;

import circle.Circle;
import shapelist.ShapeList;
import square.Square;

public class Menu {
public void showMenu() {
	System.out.println("MENU\n1. New circle\n2. New square\n3. Show list\n4. Get circles\n5. Get squares\n0. End\nYour choice__");
	
}
public void choose() {
	Circle c=new Circle();
	Square s=new Square();
	ShapeList sh=new ShapeList();
	int ch=-1;
	while(ch!=0) {
	Scanner in=new Scanner(System.in);
	ch=in.nextInt();
	switch (ch) {
	case 1:
		double r;
		System.out.println("R:");
		Scanner s1=new Scanner(System.in);
		r=s1.nextDouble();
		c.setR(r);
		sh.addShape(c);
		break;
	case 2:
		double a;
		System.out.println("A:");
		Scanner s2=new Scanner(System.in);
		a=s2.nextDouble();
		s.setA(a);
		sh.addShape(s);
		break;
	case 3:
		sh.writeList();
		break;
	case 4: sh.getCircles();
	break;
	case 5: sh.getSquares();
	break;	
	}
	if(ch!=0)System.out.println("Next choice__");
	
	
	}
	
}
}
