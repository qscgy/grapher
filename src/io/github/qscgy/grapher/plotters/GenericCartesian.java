package io.github.qscgy.grapher.plotters;

import io.github.qscgy.grapher.util.Point;

import javax.swing.*;

import java.awt.*;

public class GenericCartesian extends JPanel {
	Color color;
	final int ZOOM=100;
	public GenericCartesian(Color c){
		super();
		color=c;
		setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(color);
		Point origin=new Point(getWidth()/2,getHeight()/2);
		Point last=null;
		
		for(double x=0;x<getWidth();x++){
			double y=ZOOM*getY(x/ZOOM);
			Point now=new Point((int)x,(int)y);
			if(last!=null)
				g.drawLine((int)(origin.x+last.x), (int)(origin.y+last.y), (int)(origin.x+now.x), (int)(origin.y+now.y));
			last=now;
		}
	}
	
	public double getY(double x){
		return x;
	}
}
