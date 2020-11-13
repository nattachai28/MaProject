package trafficescape;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.ImageIcon;
/**
 *
 * @author pan_d
 */
public class Home extends JPanel{
    private ImageIcon backg = new ImageIcon(this.getClass().getResource("/Image/bg.jpg"));
    private ImageIcon w1 = new ImageIcon(this.getClass().getResource("/Image/One1.png"));
    private ImageIcon w2 = new ImageIcon(this.getClass().getResource("/Image/TwoWay.png"));
    private ImageIcon tf = new ImageIcon(this.getClass().getResource("/Image/tfec.png"));
    private ImageIcon l3 = new ImageIcon(this.getClass().getResource("/Image/3l.png"));
    private ImageIcon l4 = new ImageIcon(this.getClass().getResource("/Image/4l.png"));
    private ImageIcon l5 = new ImageIcon(this.getClass().getResource("/Image/5l.png"));
    public JButton lane5 = new JButton(l5);
    public JButton lane4 = new JButton(l4);
    public JButton lane3 = new JButton(l3);
    Home(){
        setLayout(null);
        add(lane5);
        lane5.setBounds(300, 250, 400, 85);
        add(lane4);
        lane4.setBounds(300, 400, 400, 85);
        add(lane3);
        lane3.setBounds(300, 550, 400, 85);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(backg.getImage(),0,0,1000,800,this);
        g.drawImage(tf.getImage(),200,100,this);
        g.setColor(Color.BLACK);
    }
}

