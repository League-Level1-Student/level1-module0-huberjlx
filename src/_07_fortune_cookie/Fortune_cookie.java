package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookie implements ActionListener {
	
	JFrame frame = new JFrame();
    public void showButton() {
        System.out.println("Button clicked");
        frame.setVisible(true);
        
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
   }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WOOHOO!");
		int rand = new Random().nextInt(5);
		
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will have a great day in the coming week");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will have a horrible day in the coming week");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will have candy in the coming week");
		}
		else if (rand == 4){
			JOptionPane.showMessageDialog(null, "You will have a good time seeing your friends in the coming week");
		} else {
			JOptionPane.showMessageDialog(null, "You will have a horrible fortune in the coming week");
		}
	}
}
