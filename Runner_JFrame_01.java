import javax.swing.JFrame;

public class Runner_JFrame_01 {

	public static void main(String[] args) {
		
		String title = "My first window";
		int height = 600;
		int width = 800;
		
		createJFrame(title,width,height);
		

	}

	

	private static void createJFrame(String topTitle, int w, int h) {
		
		JFrame frame = new JFrame(topTitle);
		
		frame.setSize(w, h);
		frame.setVisible(true);
		
	}

}
