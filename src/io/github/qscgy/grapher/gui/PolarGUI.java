package io.github.qscgy.grapher.gui;

import java.awt.Color;
import javax.swing.*;
import io.github.qscgy.grapher.plotters.*;
public class PolarGUI {
	public static void main(String[] args){
		JFrame app=new JFrame();
		//String eq=readEquation(app);
		//System.out.println(eq);
		app.setTitle("Polar Graph");
		GenericPolar gp=new GenericPolar(Color.green);
		app.add(gp);
		app.setSize(1000,800);
		app.setVisible(true);
	}
	
	public static String readEquation(JFrame frame){
		String eq=(String)JOptionPane.showInputDialog(frame,"Equation:\n","Input Equation",JOptionPane.PLAIN_MESSAGE,
				null,null, "");
		return eq;
	}
}
