import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Main{   
    public static void main (String[] args) {
        
       ArrayList<String> auto = new ArrayList<String>();

        JFrame frame = new JFrame("Concessionario macchine usate");

        

        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        p1.setLayout(new GridBagLayout());
        
        
        JLabel l1 = new JLabel("Opzioni concessionario");
        l1.setFont(new Font("Comic Sns", Font.BOLD, 30));
        l1.setForeground(Color.black);
        l1.setBounds(400, 10, 250, 150);;

        JButton b1 = new JButton("Aggiungi auto");
        b1.setMargin(new Insets(10, 10 , 10 , 10));
        b1.setForeground(Color.black);
        b1.setFont(new Font("Comic Sns", Font.BOLD, 20));
        b1.setBounds(400, 110, 100, 50);
       

        JButton b2 = new JButton("Modifica auto");
        b2.setMargin(new Insets(10, 10 , 10 , 10));
        b2.setFont(new Font("Comic Sns", Font.BOLD, 20));
        b2.setForeground(Color.black);

        JButton b3 = new JButton("Elimina auto");
        b3.setFont(new Font("Comic Sns", Font.BOLD, 20));
        b3.setForeground(Color.black);
        b3.setMargin(new Insets(10, 10 , 10 , 10));
        b1.setBounds(400, 110, 100, 50);
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridx = 0;
        gbc.weightx = 0.001;
        gbc.weighty = 0.001;
        p1.add(l1,gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        p1.add(b1,gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        p1.add(b2,gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        p1.add(b3,gbc);


        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    
            JPanel p2 = new JPanel();
            p2.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
            p2.setLayout(new GridLayout(10, 5));
            
            
            JLabel L1 = new JLabel("Identificativo");
            L1.setForeground(Color.black);
            L1.setFont(new Font("Comic Sns", Font.BOLD, 20));
            JLabel L2 = new JLabel("Modello macchina");
            L2.setForeground(Color.black);
            L2.setFont(new Font("Comic Sns", Font.BOLD, 20));  
            JLabel  L3 = new JLabel("Anni");
            L3.setForeground(Color.black);
            L3.setFont(new Font("Comic Sns", Font.BOLD, 20));
            JLabel  L4 = new JLabel("Chilometri percorsi");
            L4.setForeground(Color.black);   
            L4.setFont(new Font("Comic Sns", Font.BOLD, 20));
            JLabel  L5 = new JLabel("Prezzo");
            L5.setForeground(Color.black);
            L5.setFont(new Font("Comic Sns", Font.BOLD, 20));
   
   
            JButton B1 = new JButton("Aggiungi l'auto");
            b1.setBounds(400, 110, 100, 50);
            B1.setForeground(Color.black);
            B1.setMargin(new Insets(10, 10 , 10 , 10));
            B1.setFont(new Font("Comic Sns", Font.BOLD, 25));
               
   
   
            JButton B2 = new JButton("Indietro");
            B2.setForeground(Color.black);
            B2.setFont(new Font("Comic Sns", Font.BOLD, 25));
            B2.setMargin(new Insets(10, 10 , 10 , 10));
            B2.doClick();
   
   
   
            JTextField  T1 = new JTextField(15);
            T1.setBorder(BorderFactory.createEtchedBorder());
            JTextField T2 = new JTextField(15);
            T2.setBorder(BorderFactory.createEtchedBorder());
            JTextField  T3 = new JTextField(15);
            T3.setBorder(BorderFactory.createEtchedBorder());
            JTextField   T4 = new JTextField(15);
            T4.setBorder(BorderFactory.createEtchedBorder());
            JTextField   T5 = new JTextField(15);
            T5.setBorder(BorderFactory.createEtchedBorder());

            B1.addActionListener(new ActionListener(){
                public void  actionPerformed(ActionEvent e ){
      
                   T1.setText(T1.getText());
                   auto.add(T1.getText());
                   T1.setText("");
                   
                   T2.setText(T2.getText());
                   auto.add(T2.getText());
                   T2.setText("");
 
                   T3.setText(T3.getText());
                   auto.add(T3.getText());
                   T3.setText("");
 
                   T4.setText(T4.getText());
                   auto.add(T4.getText());
                   T4.setText("");
                   
 
                   T5.setText(T5.getText());
                   auto.add(T5.getText());
                   T5.setText("");

                   B1.setEnabled(false);
                    
                }
             }); 

             B2.addActionListener(new ActionListener( ){
                public void  actionPerformed(ActionEvent e){
 
                   p2.setVisible(false);
                   p1.setVisible(true);
                }
 
             });


            p2.add(L1);
            p2.add(T1);
            p2.add(L2);
            p2.add(T2);
            p2.add(L3);
            p2.add(T3);
            p2.add(L4);
            p2.add(T4);
            p2.add(L5);
            p2.add(T5);
            p2.add(B2);
            p2.add(B1);
            p1.add(p2);
            frame.add(p2);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setSize(800, 500);
            frame.setLocationRelativeTo(null);
            frame.setResizable(true);
            p1.setVisible(false);

            }
        });

        b2.addActionListener(new ActionListener( ){
            public void  actionPerformed(ActionEvent e){
            
                int i=0;
                int p =1;
                int k = 2;
              int l = 3;
             int m = 4; 
        
             JPanel p3 = new JPanel();
             p3.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
             p3.setLayout(new GridLayout(10, 5));

             JLabel L1 = new JLabel("Identificativo");
             L1.setForeground(Color.black);
             L1.setFont(new Font("Comic Sns", Font.BOLD, 20));
             JLabel L2 = new JLabel("Modello macchina");
             L2.setForeground(Color.black);
             L2.setFont(new Font("Comic Sns", Font.BOLD, 20));  
             JLabel  L3 = new JLabel("Anni");
             L3.setForeground(Color.black);
             L3.setFont(new Font("Comic Sns", Font.BOLD, 20));
             JLabel  L4 = new JLabel("Chilometri percorsi");
             L4.setForeground(Color.black);            L4.setFont(new Font("Comic Sns", Font.BOLD, 20));
             JLabel  L5 = new JLabel("Prezzo");
             L5.setForeground(Color.black);
             L5.setFont(new Font("Comic Sns", Font.BOLD, 20));
   
   
             JButton B1 = new JButton("Aggiungi l'auto");
             B1.setBounds(100, 100 , 250 , 100);
             B1.setForeground(Color.black);
             B1.setMargin(new Insets(10, 10 , 10 , 10));
             B1.setFont(new Font("Comic Sns", Font.BOLD, 25));
               
   
   
             JButton B2 = new JButton("Indietro");
             B2.setForeground(Color.black);
             B2.setFont(new Font("Comic Sns", Font.BOLD, 25));
             B2.setMargin(new Insets(10, 10 , 10 , 10));
             B2.doClick();
   
   
   
             JTextField  T1 = new JTextField(""+auto.get(i));
             T1.setBorder(BorderFactory.createEtchedBorder());
             JTextField T2 = new JTextField(""+auto.get(p));
             T2.setBorder(BorderFactory.createEtchedBorder());
             JTextField  T3 = new JTextField(""+auto.get(k));
             T3.setBorder(BorderFactory.createEtchedBorder());
             JTextField   T4 = new JTextField(""+auto.get(l));
             T4.setBorder(BorderFactory.createEtchedBorder());
             JTextField   T5 = new JTextField(""+auto.get(m));
             T5.setBorder(BorderFactory.createEtchedBorder());

             B1.addActionListener(new ActionListener(){
                public void  actionPerformed(ActionEvent e ){
      
                   T1.setText(T1.getText());
                   auto.add(T1.getText());
                   T1.setText("");
                   
                   T2.setText(T2.getText());
                   auto.add(T2.getText());
                   T2.setText("");
 
                   T3.setText(T3.getText());
                   auto.add(T3.getText());
                   T3.setText("");
 
                   T4.setText(T4.getText());
                   auto.add(T4.getText());
                   T4.setText("");
                   
 
                   T5.setText(T5.getText());
                   auto.add(T5.getText());
                   T5.setText("");
                    
                }
             }); 

             B2.addActionListener(new ActionListener( ){
                public void  actionPerformed(ActionEvent e){
 
                   p3.setVisible(false);
                   p1.setVisible(true);
                }
 
             });


            p3.add(L1);
            p3.add(T1);
            p3.add(L2);
            p3.add(T2);
            p3.add(L3);
            p3.add(T3);
            p3.add(L4);
            p3.add(T4);
            p3.add(L5);
            p3.add(T5);
            p3.add(B2);
            p3.add(B1);
            p1.add(p3);
            frame.add(p3, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setSize(800, 500);
            frame.setLocationRelativeTo(null);
            frame.setResizable(true);
            p1.setVisible(false);
                 
                     
                
                
                
            }
        });
               
                
        b3.addActionListener(new ActionListener( ){
            public void  actionPerformed(ActionEvent e){

                auto.clear();

            }

         });

         
        


        
        frame.add(p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);

         
      }
         


}