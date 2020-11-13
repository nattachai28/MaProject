package trafficescape;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
import java.util.Random;

public class Car1 extends carab{
    Car1(String str){
        super(str);
        runner.start();
    }
    Thread runner = new Thread(new Runnable() {
            public void run() {
                int[] a = {1,2,3,4};  
                int rd = new Random().nextInt(a.length);
                if(a[rd] == 1){
                    y = 300;
                }
                else if(a[rd] == 2){
                    y = 380;
                }
                else if(a[rd] == 3){
                    y = 460;
                }
                else y = 540;
		while(true){
                    x -= 6;
                    if(x <= -500){
			img = null;
			runner = null;
                    }
                    try{
			runner.sleep(10);
                    }catch(InterruptedException e){}
                }
            }
    });

   public Image getImage(){
            return img;
	}
	
	public int getX(){
            return x;
	}
	public int getY(){
            return y;
	}
	public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,180,30));
	}
}


