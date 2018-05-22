/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Gui extends JFrame {
    public  Gui(){
        super("titulo");
        initialComponents();
    
    }
    
    private JTextField caja1,caja2;
    private JButton boton;
    
    public void initialComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1=new JTextField();
        caja1.setBounds(10,100,150,30);
        
        caja2=new JTextField();
        caja2.setBounds(10,130,150,30);
        caja2.setText(caja1.getText());
        caja2.setEditable(false);
        boton=new JButton("click");
        boton.setBounds(30,160,150,30);
        Container conteiner=getContentPane();
        conteiner.add(caja1);
       conteiner.add(caja2);
       conteiner.add(boton);
        setSize(300,300);
        
         boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   System.out.println("Hola muundo");
             
            }
        });
    }
    
   
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
        
   
    }
 
    
}
