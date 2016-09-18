import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by KungFuDounut on 2016/09/18.
 */
public class Menu extends JPanel {
    JButton start = new JButton("Start Game");
    JButton options = new JButton("Options");
    JButton exit = new JButton("Exit");

    public Menu(){
        setLayout(new GridLayout(3,0));
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello");
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        add(start);
        add(options);
        add(exit);
    }

    public void paintComponent(Graphics g){
        g.fillOval(0,0,10,10);
    }
}
