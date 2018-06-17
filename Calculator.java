import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Calculator extends JFrame {

	private JButton num0;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;
    private JButton solve;
    private JButton clear;
    private double TEMP;
    private double SolveTEMP;
    private JTextField result;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean multiBool = false;

    String dis = "";

    public Calculator() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        p1.add(num1 = new JButton("1"));
        p1.add(num2 = new JButton("2"));
        p1.add(num3 = new JButton("3"));
        p1.add(num4 = new JButton("4"));
        p1.add(num5 = new JButton("5"));
        p1.add(num6 = new JButton("6"));
        p1.add(num7 = new JButton("7"));
        p1.add(num8 = new JButton("8"));
        p1.add(num9 = new JButton("9"));
        p1.add(num0 = new JButton("0"));
        p1.add(clear = new JButton("CLEAR"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(result = new JTextField(20));
        result.setHorizontalAlignment(JTextField.RIGHT);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        p3.add(add = new JButton("+"));
        p3.add(subtract = new JButton("-"));
        p3.add(multiply = new JButton("*"));
        p3.add(divide = new JButton("/"));
        p3.add(solve = new JButton("="));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);

        add(p);

        num1.addActionListener(new ListenToOne());
        num2.addActionListener(new ListenToTwo());
        num3.addActionListener(new ListenToThree());
        num4.addActionListener(new ListenToFour());
        num5.addActionListener(new ListenToFive());
        num6.addActionListener(new ListenToSix());
        num7.addActionListener(new ListenToSeven());
        num8.addActionListener(new ListenToEight());
        num9.addActionListener(new ListenToNine());
        num0.addActionListener(new ListenToZero());

        add.addActionListener(new ListenToAdd());
        subtract.addActionListener(new ListenToSubtract());
        multiply.addActionListener(new ListenToMultiply());
        divide.addActionListener(new ListenToDivide());
        solve.addActionListener(new ListenToSolve());
        clear.addActionListener(new ListenToClear());
    } 

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dis = result.getText();
            result.setText(dis + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(result.getText());
            result.setText("");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(result.getText());
            result.setText("");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(result.getText());
            result.setText("");
            multiBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(result.getText());
            result.setText("");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(result.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( multiBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                            SolveTEMP = SolveTEMP / TEMP;
            result.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            multiBool = false;
            divBool = false;
        }
    }
    
    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            result.setText("");
            addBool = false;
            subBool = false;
            multiBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

} 