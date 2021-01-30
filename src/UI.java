import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI {
    public UI(Backend backend){

        ArrayList<String> inputList = new ArrayList<>();
        //Creating the Frame

        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Course Name and Section");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton addBtn = new JButton("Add");
        JButton goBtn = new JButton("Go");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(addBtn);
        panel.add(goBtn);
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String course = tf.getText();
                if(backend.verifyclass(course)){
                    ta.append(course+"\n");
                    inputList.add(course);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Invalid Course Number");
                }
            }
        });
        goBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(backend.findOutputListToUI(inputList));
            }
        });
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
