/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aodebasedids;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
   public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
        try
  	{
            UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
  	}
  	catch (Exception ex)
  	{
   		
  	}
        AODEFrame af=new AODEFrame();
        af.setVisible(true);
        af.setTitle("AODEBasedIDS");
        af.setResizable(false);
        
        /*AODEReceiver ar=new AODEReceiver(af);
        ar.start();*/
        
    } 
}
