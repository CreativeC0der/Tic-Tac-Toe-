package Tic_Tac_Toe;

import com.sun.java.swing.plaf.windows.WindowsFileChooserUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class game extends javax.swing.JFrame
{
    int check_turn;
    Font f;
    Container c;
    ImageIcon img;
    
    public game()
    {
        initComponents();
        check_turn=0;
        c=this.getContentPane();
        c.setBackground(Color.BLACK);
        f=new Font("Courier New",Font.BOLD, 24);
    }
    
    public void calculate()
    {
        JButton button[]={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9};
        int k=0;
        String mat[][]=new String[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=button[k++].getText();
            }
        }
        String c=checkWin(mat);
        if(c!="")
          JOptionPane.showMessageDialog(this, "Congratulations! "+c+" Wins", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public String checkWin(String mat[][])
    {
        
       for(int i=0;i<3;i++)
        {
            
               if(mat[i][0]==mat[i][1] && mat[i][1]==mat[i][2])
                   return(mat[i][0]);
               else if(mat[0][i]==mat[1][i] && mat[1][i]==mat[2][i])
                   return(mat[0][i]);
        }                            
           
        if(mat[0][0]==mat[1][1] && mat[1][1]==mat[2][2])
            return(mat[0][0]);
        else if(mat[0][2]==mat[1][1] && mat[1][1]==mat[2][0])
            return(mat[0][2]);
        else 
            return("");
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton9.setBackground(new java.awt.Color(0, 225, 134));
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 225, 134));
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 225, 134));
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 225, 134));
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 225, 134));
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 225, 134));
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 225, 134));
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 225, 134));
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 225, 134));
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                game.this.actionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO TIC-TAC-TOE!!!");
        jLabel1.setOpaque(true);

        jButton10.setBackground(new java.awt.Color(98, 0, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Replay");
        jButton10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jComboBox1.setBackground(new java.awt.Color(255, 222, 1));
        jComboBox1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dark Black", "Spring Red", "Pure White", "Leafy Green" }));
        jComboBox1.setToolTipText("Choose Theme");
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:/Users/Master Shrijon/Documents/NetBeansProjects/tic_tac_toe/src/Icons and Images/icons8_Shutdown_30px.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void actionPerformed(java.awt.event.ActionEvent evt)                                 
    {                                     
        JButton button=(JButton) evt.getSource();
        if(button.getText().equals(""))
        {
            if(check_turn%2==0)
            {
                button.setForeground(Color.blue);
                button.setFont(f);
                button.setText("X");
                jLabel1.setText("Its O's Turn");
            }
            else
            {
                button.setForeground(Color.red);
                button.setFont(f);
                button.setText("O");
                jLabel1.setText("Its X's Turn");
            }
            check_turn++;
        }
        calculate();

    }                                

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)                                          
    {                                              
        JButton button[]={jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9};
        for(int i=0;i<button.length;i++)
        {
            button[i].setText("");
        }
    }                                         

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)                                           
    {                                               
       jLabel1.setForeground(Color.white);
       jLabel2.setIcon(new ImageIcon("C:/Users/Master Shrijon/Documents/NetBeansProjects/tic_tac_toe/src/Icons and Images/icons8_Shutdown_30px.png"));
        
        if(jComboBox1.getSelectedItem()=="Spring Red")
        {
            c.setBackground(new Color(255,73,73));
            jPanel1.setBackground(new Color(255,73,73));
            jLabel1.setBackground(new Color(255,73,73));
        }
        else if(jComboBox1.getSelectedItem()=="Pure White")
        {
            c.setBackground(new Color(252,252,252));
            jPanel1.setBackground(new Color(252,252,252));
            jLabel1.setBackground(new Color(252,252,252));
            jLabel1.setForeground(Color.black);
            jLabel2.setIcon(new ImageIcon("C:/Users/Master Shrijon/Documents/NetBeansProjects/tic_tac_toe/src/Icons and Images/icons8_Shutdown_30px.png"));
        }
        else if(jComboBox1.getSelectedItem()=="Leafy Green")
        {
            c.setBackground(new Color(0,168,87));
            jPanel1.setBackground(new Color(0,168,87));
            jLabel1.setBackground(new Color(0,168,87));
        }
        else if(jComboBox1.getSelectedItem()=="Dark Black")
        {
            c.setBackground(new Color(0,0,0));
            jPanel1.setBackground(new Color(0,0,0));
            jLabel1.setBackground(new Color(0,0,0));
        }
        
    }                                          

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt)                                     
    {                                         
        System.exit(0);
    }                                    

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   

    
    
    
}

