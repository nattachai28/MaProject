/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficescape;

import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class MCar{
    public ImageIcon car;
    public int x = 10;
    public int y = 300;
    MCar(){
        car = new ImageIcon(getClass().getResource("/Image/MCar.png"));
    }
    
    
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,y,180,40));
    }
}