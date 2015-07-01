

package projectfianl;

import java.awt.*;
import javax.swing.*;

public class Image extends JFrame {
    
    private ImageIcon image1;
    private JLabel labelimg;

    
    Image() {
        setLayout (new FlowLayout());
        
        image1= new ImageIcon(getClass().getResource("Mortal-Combat-Wallpaper-HD.jpg"));
        labelimg=new JLabel(image1);
        add(labelimg);
    }
    
    public static void main(String[] args) {
        Image gui = new Image();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        
    }
    
}
