import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class CurrencyConverter {
        private JFrame frame;
        private JTextField textField;
        private JTextField textField_1;
        private JTextField textField_2;
        // main method
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        CurrencyConverter window = new CurrencyConverter();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        // creating method or application
        public CurrencyConverter() {
            Convert(); // calling Convert
        }
        // writing logic for conversion
        private void Convert() {
            frame = new JFrame();
            frame.getContentPane().setBackground(new Color(175, 238, 238));
            frame.setBackground(new Color(255, 250, 250));
            frame.setBounds(100, 100, 550, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setLayout(null);

            JLabel lblNewLabel = new JLabel("Currency Converter");
            lblNewLabel.setBounds(152, 1, 235, 42);
            lblNewLabel.setFont(new Font("Lable", Font.BOLD, 24));
            frame.getContentPane().add(lblNewLabel);

            JLabel lblNewLabel_1 = new JLabel(" Select what you want");
            lblNewLabel_1.setBounds(152, 53, 200, 26);
            lblNewLabel_1.setFont(new Font("label1", Font.ITALIC, 14));
            frame.getContentPane().add(lblNewLabel_1);

            final JComboBox comboBox = new JComboBox();
            comboBox.setBackground(new Color(152, 208, 251));
            comboBox.setFont(new Font("combobox", Font.PLAIN, 14));
            comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "INR-to-USD", "USD-to-INR", "INR-to-Pound", "Pound-to-INR"}));
            comboBox.setBounds(152, 80, 182, 26);
            frame.getContentPane().add(comboBox);

            JButton btnNewButton = new JButton("ok");
            btnNewButton.setBackground(new Color(251, 248, 152));
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String s = ""+comboBox.getItemAt(comboBox.getSelectedIndex());
                    textField.setText(s);
                }

            });
            btnNewButton.setBounds(200, 115, 83, 26);
            btnNewButton.setFont(new Font("Button", Font.PLAIN, 15));
            frame.getContentPane().add(btnNewButton);

            JLabel lblNewLabel_2 = new JLabel("Converting From");
            lblNewLabel_2.setBounds(20, 148, 129, 26);
            lblNewLabel_2.setFont(new Font("label2", Font.PLAIN, 14));
            frame.getContentPane().add(lblNewLabel_2);

            textField = new JTextField();
            textField.setFont(new Font("textF", Font.PLAIN, 14));
            textField.setBounds(152, 150, 175, 28);
            frame.getContentPane().add(textField);
            textField.setColumns(10);

            JLabel lblNewLabel_3 = new JLabel("Enter Amount");
            lblNewLabel_3.setFont(new Font("label3", Font.PLAIN, 14));
            lblNewLabel_3.setBounds(33, 175, 103, 32);
            frame.getContentPane().add(lblNewLabel_3);

            textField_1 = new JTextField();
            textField_1.setFont(new Font("textF1", Font.PLAIN, 14));
            textField_1.setBounds(152, 180, 175, 26);
            frame.getContentPane().add(textField_1);
            textField_1.setColumns(10);

            JLabel lblNewLabel_4 = new JLabel("Result :");
            lblNewLabel_4.setFont(new Font("label4", Font.PLAIN, 14));
            lblNewLabel_4.setBounds(63, 205, 69, 26);
            frame.getContentPane().add(lblNewLabel_4);

            textField_2 = new JTextField();
            textField_2.setFont(new Font("textF2", Font.PLAIN, 14));
            textField_2.setBounds(152, 210, 172, 26);
            frame.getContentPane().add(textField_2);
            textField_2.setColumns(10);


            JButton btnNewButton_1 = new JButton("Submit");
            btnNewButton_1.setBackground(new Color(152, 235, 251));
            btnNewButton_1.setFont(new Font("button1", Font.PLAIN, 14));
            btnNewButton_1.setBounds(185, 240, 92, 26);
            frame.getContentPane().add(btnNewButton_1);
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {

                        float a = Float.parseFloat(textField_1.getText());
                        String str = textField.getText();
                        // using switch case
                        switch (str){
                            case "INR-to-USD": {
                            float x = (a/82);
                            textField_2.setText(x+" Dollars");
                            break;
                        }
                            case "USD-to-INR" : {
                            float y = (a*82);
                            textField_2.setText(y+" Rupee");
                        }
                            case "INR-to-Pound": {
                            float z = (a/101);
                            textField_2.setText(z+" Pounds");
                        }
                            case "Pound-to-INR":{
                            float w = (a*101);
                            textField_2.setText(w+" Rupee");
                        }
                    }
                    }
                    // Handling exception when user have done uncertain operation
                    catch(Exception e1) {
                        JOptionPane.showMessageDialog(frame, "Please Enter a valid number" );
                    }
                }
            });
            JLabel lblNewLabel_5 = new JLabel("Build the Currency Converter Java (GUI) based application");
            lblNewLabel_5.setFont(new Font("label4", Font.BOLD, 14));
            lblNewLabel_5.setBounds(25, 300, 450, 26);
            frame.getContentPane().add(lblNewLabel_5);
            JLabel lblNewLabel_6 = new JLabel("under the Guidance of Let's Grow More | Build By Narendra Singh");
            lblNewLabel_6.setFont(new Font("label6", Font.BOLD, 14));
            lblNewLabel_6.setBounds(25, 315, 470, 26);
            frame.getContentPane().add(lblNewLabel_6);

        }
    }
