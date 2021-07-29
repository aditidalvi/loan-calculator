package com.company;
import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener {



        JTextField tf1,tf2,tf3,tf4;
        JButton b1,b2;
        JLabel l1,l2,l3;
    Main(){
            l1 = new JLabel("Loan Amount");
            l1.setBounds(50,50,100,30);
            l2 = new JLabel("Interest Rate");
            l2.setBounds(50,100,100,30);
            l3 = new JLabel("Months to Pay");
            l3.setBounds(50,150,100,30);
            JFrame f= new JFrame();
            tf1=new JTextField();
            tf1.setBounds(150,50,150,   30);
            tf2=new JTextField();
            tf2.setBounds(150,100,150,30);
            tf4=new JTextField();
            tf4.setBounds(150,150,150,30);
            tf3=new JTextField();
            tf3.setBounds(150,200,150,30);
            tf3.setEditable(false);
            b1=new JButton("Calculate Monthly Payment");
            b1.setBounds(50,250,250,30);

            b1.addActionListener(this);

            f.add(l1);f.add(tf1);f.add(l2);f.add(tf2);f.add(l3);f.add(tf4);f.add(tf3);f.add(b1);
            f.setSize(500,500);
            f.setLayout(null);
            f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            String s1=tf1.getText();
            String s2=tf2.getText();
            String s3 = tf4.getText();
            double a=Integer.parseInt(s1);
            double b=Integer.parseInt(s2);
            double d = Integer.parseInt(s3);
            double c = 0;
            double g = 0;
            if(e.getSource()==b1){
                double z = (b/12)/100;

                double m = 1/Math.pow((1+z),d);


                double k = (1-m);

                c  = (a*z)/k;
                g = (double)Math.round(c*100)/100;

            }
            String result = String.valueOf(g);
            tf3.setText(result);
        }
        public static void main(String[] args) {
            new Main();
        } }


