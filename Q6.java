import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener {

	static JFrame;
	static JTextField1;
	String s0, s1, s2;

	Calculator() {

		s0 = s1= s2 = "";

	}

	public static void main (String args []) {

	f = new JFrame ("calculator");
	try {
		UIManager.setLookAndFeel (UIManager.getSystemLookAndFeelClassName());
	}

	catch (Exeception e) {
	     System.out.println (e.getMessage());
	}

	calculator c = new calculator();
	JTextField1 = new JTextField (16);

	JTextField1.setEditable (false);

	JButton a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, aa, as, ad, am, ae, aeq, aeq1, api, aexp;

	a0 = new JButton("0");
        a1 = new JButton("1");
        a2 = new JButton("2");
        a3 = new JButton("3");
        a4 = new JButton("4");
        a5 = new JButton("5");
        a6 = new JButton("6");
        a7 = new JButton("7");
        a8 = new JButton("8");
        a9 = new JButton("9");
 
        aeq1 = new JButton("=");
 
        aa = new JButton("+");
        as = new JButton("-");
        ad = new JButton("/");
        am = new JButton("*");
        aeq = new JButton("C");
	api = new JButton("pi");
	aexp = new JButton("exp");
 
        ae = new JButton(".");

        JPanel p = new JPanel();
	
	am.addActionListener(c);
        ad.addActionListener(c);
        as.addActionListener(c);
        aa.addActionListener(c);
        a9.addActionListener(c);
        a8.addActionListener(c);
        a7.addActionListener(c);
        a6.addActionListener(c);
        a5.addActionListener(c);
        a4.addActionListener(c);
        a3.addActionListener(c);
        a2.addActionListener(c);
        a1.addActionListener(c);
        a0.addActionListener(c);
        ae.addActionListener(c);
        aeq.addActionListener(c);
        aeq1.addActionListener(c);
	api.addActionListener(c);
	aexp.addActionListener(c);
 
        p.add(l);
        p.add(aa);
        p.add(a1);
        p.add(a2);
        p.add(a3);
        p.add(as);
        p.add(a4);
        p.add(a5);
        p.add(a6);
        p.add(am);
        p.add(a7);
        p.add(a8);
        p.add(a9);
        p.add(ad);
        p.add(ae);
        p.add(a0);
        p.add(aeq);
        p.add(aeq1);
	p.add(api);
	p.add(aexp);

        p.setBackground(Color.yellow);

	f.add(p);
 
        f.setSize(200, 220);
        f.show();

    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();
 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
        
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            
            l.setText(s0 + s1 + s2);
        }

        else if (s.charAt(0) == 'C') {

            s0 = s1 = s2 = "";
 
            l.setText(s0 + s1 + s2);
        }

        else if (s.charAt(0) == '=') {
 
            double te;

            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));

            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));

            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));

            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            l.setText(s0 + s1 + s2 + "=" + te);

            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }

        else {

            if (s1.equals("") || s2.equals(""))
                s1 = s;

            else {

                double te;
 
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));

                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));

                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));

                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                s0 = Double.toString(te);
 

                s1 = s;

                s2 = "";
            }

            l.setText(s0 + s1 + s2);
	}
}