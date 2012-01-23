
import javax.swing.SwingUtilities;




public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VLogin inst = new VLogin();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

}
