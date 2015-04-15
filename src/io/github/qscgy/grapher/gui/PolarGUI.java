package io.github.qscgy.grapher.gui;
//test
import java.awt.Color;
import javax.swing.*;
import io.github.qscgy.grapher.plotters.*;
import io.github.qscgy.grapher.util.*;
public class PolarGUI {
	public static void main(String[] args){
		JFrame app=new JFrame();
		String eq=readEquation(app);
		//System.out.println(eq);
		app.setTitle("Polar Graph");
		//GenericPolar gp=new GenericPolar(Color.green);
		GenericCartesian gc=new GenericCartesian(Color.green);
		app.add(gc);
		app.setSize(1000,800);
		app.setVisible(true);
	}
	
	public static String readEquation(JFrame frame){
		String eq=(String)JOptionPane.showInputDialog(frame,"Equation:\n","Input Equation",JOptionPane.PLAIN_MESSAGE,
				null,null, "");
		return eq;
	}
}