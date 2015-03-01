package io.github.qscgy.grapher.plotters;
import io.github.qscgy.grapher.util.Point;

import java.awt.*;

import javax.swing.*;

public class GenericPolar extends JPanel {
	Color color;
	final int SCALE=100;
	public GenericPolar(Color c){
		super();
		color=c;
		setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(color);
		Point origin=new Point(getWidth()/2,getHeight()/2);
		Point last=null;
		for(double t=0;t<=2*Math.PI;t+=(Math.PI/180)){
			double r=SCALE*getR(t);
			Point now=new Point((int)Math.round(r*Math.cos(t)),(int)Math.round(r*Math.sin(t)));	//Cartesian point
			if(last!=null)
				g.drawLine((int)(origin.x+last.x), (int)(origin.y+last.y), (int)(origin.x+now.x), (int)(origin.y+now.y));
			last=now;
		}

	}
	
	public double getR(double t){
		return Math.cos(4*t);
	}
}
