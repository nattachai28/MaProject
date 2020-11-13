package trafficescape;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class OneWay extends JPanel{
    private final ImageIcon oneway = new ImageIcon(this.getClass().getResource("/Image/OneWay1.jpg"));
    private final ImageIcon gover = new ImageIcon(this.getClass().getResource("/Image/gameover.jpg"));
    private final ImageIcon goverim = new ImageIcon(this.getClass().getResource("/Image/gameover.png"));
    private final ImageIcon pause = new ImageIcon(this.getClass().getResource("/Image/pause.png"));
    private final ImageIcon resume = new ImageIcon(this.getClass().getResource("/Image/resume.png"));
    private final ImageIcon replay = new ImageIcon(this.getClass().getResource("/Image/replay.png"));
    private final ImageIcon home = new ImageIcon(this.getClass().getResource("/Image/home.png"));
    
    MCar mcar = new MCar();
    ArrayList<Car> car = new ArrayList<>();
    
    Home h = new Home();
    public JButton Bpause = new JButton(pause);
    public JButton Bresume = new JButton(resume);
    public JButton Breplay = new JButton(replay);
    public JButton Bhome = new JButton(home);
    int times = 0;
    int crash = 1;
    boolean timestart = false;
    boolean carout = true;
    
    Thread time = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(10);
                }catch(Exception e){ }
                if(timestart == true){
                    repaint();
                }
            }
        }
    });
    
    Thread actor = new Thread(new Runnable(){
            public void run(){
		while(true){
                	try{
                            Thread.sleep(1);
			}catch(Exception e){}
                            repaint();
		}
            }
	});
    
    Thread C1 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(carout == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*1000));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*2000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*3000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else Thread.sleep((long)(Math.random()*5000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(carout == true){
                        car.add(new Car("Car1"));
                    }
            }
        }
    });
    
    Thread C2 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(carout == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*1000));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*2000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*3000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else Thread.sleep((long)(Math.random()*5000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(carout == true){
                        car.add(new Car("Car2"));
                    }
            }
        }
    });
    
    Thread C3 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                     if(carout == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*1000));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*2000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*3000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else Thread.sleep((long)(Math.random()*5000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(carout == true){
                        car.add(new Car("Car3"));
                    }
            }
        }
    });
    
    Thread Cbm = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                     if(carout == true){
                        if(times > 100){
                            Thread.sleep((long)(Math.random()*1000));
                        }
                        else if(times > 75){
                            Thread.sleep((long)(Math.random()*2000));
                        }
                        else if(times > 50){
                            Thread.sleep((long)(Math.random()*3000));
                        }
                        else if(times > 25){
                            Thread.sleep((long)(Math.random()*4000));
                        }
                        else Thread.sleep((long)(Math.random()*5000));
                    }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(carout == true){
                        car.add(new Car("CarBm"));
                    }
            }
        }
    });
    
    Thread t = new Thread(new Runnable(){
            public void run() {
		while(true){
                        times = times + 1;
			try{
                            Thread.sleep(1000);
			}catch(InterruptedException e)
			{
                            e.printStackTrace();
			}
		}
            }
	});
    
    OneWay(){
        this.setFocusable(true);
	this.setLayout(null);
        Bpause.setBounds(1200, 20, 50, 50);
        this.add(Bpause);
        Bresume.setBounds(1200, 80, 50, 50);
        this.add(Bresume);
        this.add(Breplay);
        this.add(Bhome);
        Breplay.setBounds(600, 600, 200, 100);
        Bhome.setBounds(1100, 600, 200, 100);
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                int a = e.getKeyCode();
                if(a==KeyEvent.VK_UP){
                    mcar.y -= 60;
                }
                else if(a==KeyEvent.VK_DOWN){
                    mcar.y += 60;
                }
                else if(a==KeyEvent.VK_RIGHT){
                    mcar.x += 20;
                }
                else if(a==KeyEvent.VK_LEFT){
                    mcar.x -= 20;
                }
            }
        });
        actor.start();
        time.start();
        t.start();
        C1.start();
        C2.start();
        C3.start();
        Cbm.start();
    }
    public void paintComponent(Graphics g){
        if(crash == 1){
            this.remove(Breplay);
            this.remove(Bhome);
            int i;
            g.drawImage(oneway.getImage(),0,0,1280,690,this);            
            for(i=0;i<car.size();i++){
                g.drawImage(car.get(i).getImage(), car.get(i).getX(), car.get(i).getY(),200,200 , this);
            }
            g.drawImage(mcar.car.getImage(), mcar.x, mcar.y,200,200, this);

            if(mcar.x<=0){
                mcar.x = 0;
            }
            if(mcar.x >= 1060){
                mcar.x = 1060;
            }
            if(mcar.y >= 535){
                mcar.y = 535;
            }
            if(mcar.y <= 300){
                mcar.y = 300;
            }
            
            for(i=0;i<car.size();i++){
                if(Intersect(mcar.getbound(),car.get(i).getbound())){
                    crash = 0;
                }
            }
            
            g.setColor(Color.BLACK);
            g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
            g.drawString("TIME : "+times, 30, 30);
    }
        else if(crash == 0){
            t.stop();
            this.remove(Bpause);
            this.remove(Bresume);
            g.drawImage(gover.getImage(), 0, 0, 1280, 720, this);
            g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,50));
            g.drawString("TIME : "+times, 500, 300);
            g.drawImage(goverim.getImage(), 350, 100, this);
            this.add(Breplay);
            this.add(Bhome);
            Breplay.setBounds(700, 400, 100, 100);
            Bhome.setBounds(400, 400, 100, 100);
        }
    }
       

    public boolean Intersect(Rectangle2D a, Rectangle2D b){
	return (a.intersects(b));
    }

}

class Main extends JFrame{
    Main(){
        add(new OneWay());
    }
    public static void main(String[] args){
        JFrame jf = new Main();
        jf.setSize(1280,720);
        jf.setTitle("Traffic Escape");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    } 
}
