package csis.weyrauch.org;


import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
  public static void main(String[] args) {
	  
	// Create and initialize the window variable while  
	// setting the window border name
    JFrame frame = new JFrame("HelloWorldFromSwing");
    
    // Create a bit a text to be shown
    final JLabel text = new JLabel("Hello World");
    
    // Add the text to the windows pane
    frame.getContentPane().add(text);

    // Tell the window to close when the exit button is pressed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Size the window the the specified layout
    frame.pack();
    
    // Finally display the windows to the user
    frame.setVisible(true);
  }
}