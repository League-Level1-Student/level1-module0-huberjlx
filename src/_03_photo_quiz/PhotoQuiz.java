package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String cat = "https://images.theconversation.com/files/350865/original/file-20200803-24-50u91u.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=1200&h=675.0&fit=crop\n";
		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(cat);
		// 4. add the image to the quiz window
		quizWindow.add(comp);
		comp.addMouseMotionListener(this);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		int score = 0;
		String cats = JOptionPane.showInputDialog("Do you like cats? ");
		// 7. print "CORRECT" if the user gave the right answer
		if (cats.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score += 1;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
		String moreCats = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQUSgHbQIRWnuhBxCt3wxqJn9B9XdFtYp2CBg&usqp=CAU";
		comp = createImage(moreCats);
		// 11. add the second image to the quiz window
		quizWindow.add(comp);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question = JOptionPane.showInputDialog("How about more cats? ");
		
		if (question.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score += 1;
		}
		else if (question.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "Not acceptable answer");
		}
			
		// 14+ check answer, say if correct or incorrect, etc.
		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Cute, right?");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Cute, right?");
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener();)
}
