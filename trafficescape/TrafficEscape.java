package trafficescape;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class TrafficEscape extends JFrame implements ActionListener{
    Home home = new Home();
    OneWay ow = new OneWay();
    OneWay1 ow1 = new OneWay1();
    OneWay2 ow2 = new OneWay2();
    
    public TrafficEscape(){
        Hinvoke();
    }    
    public final void OWinvoke(){   
        ow = new OneWay();
        ow.Bpause.addActionListener(this);
        ow.Bresume.addActionListener(this);
        ow.Breplay.addActionListener(this);
        ow.Bhome.addActionListener(this);
    }
    public final void OW1invoke(){
        ow1 = new OneWay1();
        ow1.Bpause.addActionListener(this);
        ow1.Bresume.addActionListener(this);
        ow1.Breplay.addActionListener(this);
        ow1.Bhome.addActionListener(this);
    }
    public final void OW2invoke(){
        ow2 = new OneWay2();
        ow2.Bpause.addActionListener(this);
        ow2.Bresume.addActionListener(this);
        ow2.Breplay.addActionListener(this);
        ow2.Bhome.addActionListener(this);
    }
    public final void Hinvoke(){
        home = new Home();
        this.setSize(1000, 800);        
        this.add(home);
        home.lane5.addActionListener(this);
        home.lane4.addActionListener(this);
        home.lane3.addActionListener(this);
        ow.Bpause.addActionListener(this);
        ow.Bresume.addActionListener(this);
        ow.Breplay.addActionListener(this);
        ow.Bhome.addActionListener(this);
        ow1.Bpause.addActionListener(this);
        ow1.Bresume.addActionListener(this);
        ow1.Breplay.addActionListener(this);
        ow1.Bhome.addActionListener(this);
        ow2.Bpause.addActionListener(this);
        ow2.Bresume.addActionListener(this);
        ow2.Breplay.addActionListener(this);
        ow2.Bhome.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //5 Lanes
        if(e.getSource()==home.lane5){
            this.setLocationRelativeTo(null);
            this.remove(home);
            this.setSize(1280,720);
            this.add(ow);
            ow.requestFocusInWindow();
            ow.times = 0;
        }
        else if(e.getSource()==ow.Bpause){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(ow);
            ow.requestFocusInWindow();
            ow.actor.suspend();
            ow.t.suspend();
            ow.C1.suspend();
            ow.C2.suspend();
            ow.C3.suspend();
            ow.Cbm.suspend();
            ow.time.suspend();
        }
        else if(e.getSource()==ow.Bresume){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(ow);
            ow.requestFocusInWindow();
            ow.actor.resume();
            ow.t.resume();
            ow.C1.resume();
            ow.C2.resume();
            ow.C3.resume();
            ow.Cbm.resume();
            ow.time.resume();
        }
        else if(e.getSource() == ow.Breplay){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.remove(ow);
            ow = new OneWay();
            OWinvoke();
            this.add(ow);
            ow.requestFocusInWindow();
            ow.times = 0;           
        }
        else if(e.getSource() == ow.Bhome){
            this.remove(ow);           
            Hinvoke();
            OWinvoke();            
        }
        //4 Lanes
        else if(e.getSource()==home.lane4){
            this.setLocationRelativeTo(null);
            this.remove(home);
            this.setSize(1280,720);
            this.add(ow1);
            ow1.requestFocusInWindow();
            ow1.times = 0;
        }
        else if(e.getSource()==ow1.Bpause){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(ow1);
            ow1.requestFocusInWindow();
            ow1.actor.suspend();
            ow1.t.suspend();
            ow1.C1.suspend();
            ow1.C2.suspend();
            ow1.C3.suspend();
            ow1.Cbm.suspend();
            ow1.time.suspend();
        }
        else if(e.getSource()==ow1.Bresume){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(ow1);
            ow1.requestFocusInWindow();
            ow1.actor.resume();
            ow1.t.resume();
            ow1.C1.resume();
            ow1.C2.resume();
            ow1.C3.resume();
            ow1.Cbm.resume();
            ow1.time.resume();
        }
        else if(e.getSource() == ow1.Breplay){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.remove(ow1);
            ow1 = new OneWay1();
            OW1invoke();
            this.add(ow1);
            ow1.requestFocusInWindow();
            ow1.times = 0;           
        }
        else if(e.getSource() == ow1.Bhome){
            this.remove(ow1);           
            Hinvoke();
            OW1invoke();            
        }
        //3 Lanes
        else if(e.getSource()==home.lane3){
            this.setLocationRelativeTo(null);
            this.remove(home);
            this.setSize(1280,720);
            this.add(ow2);
            ow2.requestFocusInWindow();
            ow2.times = 0;
        }
        else if(e.getSource()==ow2.Bpause){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(ow2);
            ow2.requestFocusInWindow();
            ow2.actor.suspend();
            ow2.t.suspend();
            ow2.C1.suspend();
            ow2.C2.suspend();
            ow2.C3.suspend();
            ow2.Cbm.suspend();
            ow2.time.suspend();
        }
        else if(e.getSource()==ow2.Bresume){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.add(ow2);
            ow2.requestFocusInWindow();
            ow2.actor.resume();
            ow2.t.resume();
            ow2.C1.resume();
            ow2.C2.resume();
            ow2.C3.resume();
            ow2.Cbm.resume();
            ow2.time.resume();
        }
        else if(e.getSource() == ow2.Breplay){
            this.setLocationRelativeTo(null);
            this.setSize(1280,720);
            this.remove(ow2);
            ow2 = new OneWay2();
            OW2invoke();
            this.add(ow2);
            ow2.requestFocusInWindow();
            ow2.times = 0;           
        }
        else if(e.getSource() == ow2.Bhome){
            this.remove(ow2);           
            Hinvoke();
            OW2invoke();            
        }
        this.validate();
        this.repaint();
    }
    
   public static void main(String[] args){
        JFrame jf = new TrafficEscape();
        jf.setSize(1000,800);
        jf.setTitle("Traffic Escape");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
   }
}
