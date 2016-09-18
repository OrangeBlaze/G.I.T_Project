/**
 * Created by KungFuDounut on 2016/09/18.
 */

import javax.swing.*;

public class Frame{

    private JPanel menu = new Menu();
    private static JFrame instance = null;

    public Frame(){
        if(instance == null) {
            instance = new JFrame();
            instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            instance.setSize(800, 600);
            instance.setLocationRelativeTo(null);
            instance.setVisible(true);
            instance.add(menu);
        }
    }
    public Frame(int x, int y){
        this();
        instance.setSize(x,y);
    }

    JFrame getInstance(){
        return instance;
    }
}
