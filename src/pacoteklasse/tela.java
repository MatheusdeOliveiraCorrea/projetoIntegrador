package pacoteklasse;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class tela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.setTitle("Detector de Covid");
		frame.setSize(500,500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	    ImageIcon image = new ImageIcon("/projetoIntegrador2/src/imagens/icone.jpg");
	    frame.setIconImage(image.getImage());
	     
	    
	    
	}

}
