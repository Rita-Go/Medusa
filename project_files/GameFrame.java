import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame(){

		this.add(new GamePanel()); // add a new panel
		this.setTitle("Snake"); // title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit program when point exit
		this.setResizable(false);
		this.pack();
		this.setVisible(true); // show the window
		this.setLocationRelativeTo(null); //the window in the middle
		
	}
}
