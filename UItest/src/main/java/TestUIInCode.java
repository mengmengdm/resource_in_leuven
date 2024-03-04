import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestUIInCode extends JFrame{
    private JTextField myText1;
    private JTextField myText2;
    private JButton myButton1;
    private JButton myButton2;
    private JLabel myLabel;
    private JPanel myPanel;



    public TestUIInCode(String title){
        //generate Jframe
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a JPanel
        myPanel = new JPanel();

        // create a JLabel and add some placeholder text
        myLabel = new JLabel();
        myLabel.setText("This is placeholder text");

        // create 2 textfield and set the size to 10
        myText1 = new JTextField(10);
        myText2 = new JTextField(10);


        //create a button1
        myButton1 = new JButton();

        //set text for button
        myButton1.setText("+");

        //configure the actionlistener for the button
        myButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if(myText2.getText().isEmpty()) {
                        myText2.setText(myText1.getText());
                    } else {
                        int num1 = Integer.parseInt(myText1.getText());
                        int num2 = Integer.parseInt(myText2.getText());
                        int sum = num1 + num2;
                        myLabel.setText(String.valueOf(sum));
                    }
                } catch (NumberFormatException e) {
                    // deal with the situation if user did not enter a number
                    JOptionPane.showMessageDialog(null, "please enter a number", "error", JOptionPane.INFORMATION_MESSAGE);
                }

            };
        });

        myButton2 = new JButton();

        //set text for button
        myButton2.setText("/");

        //configure the actionlistener for the button
        myButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if(myText2.getText().isEmpty()) {
                        myText2.setText(myText1.getText());
                    } else {
                        double num1 = Double.parseDouble(myText1.getText());
                        double num2 = Double.parseDouble(myText2.getText());
                        double div  = num2 / num1;
                        myLabel.setText(String.valueOf(div));
                    }
                } catch (NumberFormatException e) {
                    // deal with the situation if user did not enter a number
                    JOptionPane.showMessageDialog(null, "please enter a number", "error", JOptionPane.INFORMATION_MESSAGE);
                }
            };
        });

        myPanel.add(myLabel);
        myPanel.add(myText1);
        myPanel.add(myText2);
        myPanel.add(myButton1);
        myPanel.add(myButton2);

        //add the Jpanel to the Jframe
        this.setContentPane(myPanel);

    }


    //Code always starts running at main
    public static void main(String[] args) {
        //generate my UI
        //JFrame ui= new TestUIInCode("Mytitle");

        //task1: change the title of the JFrame to your name and last name.
        JFrame ui= new TestUIInCode("HaoranFang");
        //the frame needs to become visible
        ui.setVisible(true);
        ui.pack();
    }


}
