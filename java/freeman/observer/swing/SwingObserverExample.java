package freeman.swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class SwingObserverExample{
    JFrame frame;
    public static void main(String [] args){
        SwingObserverExample example=new SwingObserverExample();
        example.go();
    }
    public void go(){
        frame=new JFrame();
        JButton button=new JButton("Shadows or Blessed Light?");
        button.addActionListener(new AngelListner());
        button.addActionListener(new DevilListner());
        frame.getContentPane().add(BorderLayout.CENTER,button);
        // Set frame properties 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(BorderLayout.CENTER, button);
	frame.setSize(300,300);
	frame.setVisible(true);
    }
    class AngelListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Light comes with you");
        }
    }
    class DevilListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Life for Ner'Zul");
        }
    }
}
	