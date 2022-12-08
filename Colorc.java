import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Colorc {
    private JPanel p;
    private JButton yellowButton;
    private JButton blueButton;
    private JButton redButton;
    private JButton pinkButton;
    private JButton whiteButton;
    private JButton orangeButton;
    JFrame j=new JFrame();
    public Colorc() {


        j.setTitle("Color");
        j.setSize(600, 600);
        j.add(p);
        redButton.setBounds(70,50,50,20);
        redButton.setBackground(Color.RED);
        blueButton.setBackground(Color.BLUE);
        whiteButton.setBackground(Color.WHITE);
        pinkButton.setBackground(Color.PINK);
        yellowButton.setBackground(Color.YELLOW);
        orangeButton.setBackground(Color.ORANGE);



        j.setVisible(true);
        redButton.addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.RED);


            }
       });



        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               p.setBackground(Color.BLUE);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.YELLOW);
            }
        });

        orangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.ORANGE);
            }
        });
        pinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.PINK);
            }
        });
        whiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setBackground(Color.WHITE);
            }
        });
    }

    public static void main(String[] args) {
        new Colorc();
    }
}
