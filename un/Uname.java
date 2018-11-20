
package un;

import javax.swing.*;
import java.awt.event.*;
public class Uname extends JFrame implements ActionListener {
    public Uname()throws Exception{
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                frame();
                tf();
            }
        });
    }
    
    public void frame(){
        this.setSize(360,200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setVisible(true);
    }
    JLabel un,passs,vpp;
    JTextField unn,pass,vp;
    public void tf(){
        un = new JLabel("Username");
        un.setBounds(20,10,100,25);
        this.add(un);
        
        passs = new JLabel("Password");
        passs.setBounds(20,60,100,25);
        this.add(passs);
        
        vpp = new JLabel("Verify Password");
        vpp.setBounds(20,110,100,25);
        this.add(vpp);
        
        unn = new JTextField("");
        unn.setBounds(90,10,200,25);
        this.add(unn);
        
        pass = new JTextField("");
        pass.setBounds(90,60,200,25);
        this.add(pass);
        
        vp = new JTextField("");
        vp.setBounds(120,110,170,25);
        this.add(vp);
        
        JButton ver = new JButton ("Verify");
        ver.setBounds(240,140,100,25);
        this.add(ver);
        ver.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String x = e.getActionCommand();
        
        if(x.equals("Verify")){
            if(vp.getText().equals(pass.getText())){
                JOptionPane.showMessageDialog(null,"Correct Password");
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Password","",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
