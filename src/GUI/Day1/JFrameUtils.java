package GUI.Day1;

import javax.swing.*;
import java.awt.*;

public class JFrameUtils {
    public static void initFrame(JFrame frame,int width,int height){
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension d=toolkit.getScreenSize();
        int x=(int)d.getWidth();
        int y=(int)d.getHeight();
        frame.setBounds((x-width)/2,(y-height)/2,width,height);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
