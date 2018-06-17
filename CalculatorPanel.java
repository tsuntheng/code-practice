import javax.swing.JFrame;

public class CalculatorPanel {
	 public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        calc.pack();
	        calc.setLocationRelativeTo(null);
	                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        calc.setVisible(true);
	    }
}
