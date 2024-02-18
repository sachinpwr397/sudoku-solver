/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudoku_solver;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sachin pawar
 */
public class NewJFrame extends javax.swing.JFrame {
    private String turn="1";
    private boolean glabalflag=true;
    private String SolveBoard[][]={
        {"2","9","8","5","1","6","7","3","4"},
            {"4","1","3","2","7","8","5","6","9"},
            {"7","5","6","3","4","9","1","2","8"},
            {"8","2","1","4","3","5","6","9","2"},
            {"5","3","4","6","9","7","2","8","1"},
            {"9","6","7","1","8","2","3","4","5"},
            {"1","4","2","8","5","3","9","7","6"},
            {"3","7","5","9","6","4","8","1","2"},
            {"6","8","9","7","2","1","4","5","3"},
};
    private void AssignTurn(JButton btn){
      selectbtn1.setBackground(black);
      selectbtn2.setBackground(black);
      selectbtn3.setBackground(black);
      selectbtn4.setBackground(black);
      selectbtn5.setBackground(black);
      selectbtn6.setBackground(black);
      selectbtn7.setBackground(black);
      selectbtn8.setBackground(black);
      selectbtn9.setBackground(black);
      
      btn.setBackground(blue);
    
    }
    private void ResetGame(){
        JButton PredifinedBtns []={r2c1,r3c1,r3c3,r1c4,r2c5,r3c5,r2c6,r3c5,r1c7,r1c8,r1c9,r2c7,r2c9,r3c8,r5c2,r5c3,r6c2,r4c5,
                                   r4c6,r6c4,r6c5,r4c8,r5c8,r5c7,r7c2,r8c1,r9c1,r9c2,r9c3,r7c5,r8c5,r9c6,r8c4,r7c7,r7c9,r8c9};
        
        JButton btns [][] ={{r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                
        };
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag=true;
                for(int k=0;k<PredifinedBtns.length;k++){
                    if(btns[i][j]==PredifinedBtns[k]){
                        flag=false;
                    }
                }
                if(flag==true){
                    btns[i][j].setText("");
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                    
                }
            }
        }
            
        
    }
    private void SeeSolution(){
        JButton PredifinedBtns []={r2c1,r3c1,r3c3,r1c4,r2c5,r3c5,r2c6,r3c5,r1c7,r1c8,r1c9,r2c7,r2c9,r3c8,r5c2,r5c3,r6c2,r4c5,
                                   r4c6,r6c4,r6c5,r4c8,r5c8,r5c7,r7c2,r8c1,r9c1,r9c2,r9c3,r7c5,r8c5,r9c6,r8c4,r7c7,r7c9,r8c9};
        
        JButton btns [][] ={{r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                
        };
        if(glabalflag==true){
            glabalflag=false;
            Solutionbtn.setText("Hide Solution");
            for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
            boolean flag=true;
              for(int k=0;k<PredifinedBtns.length;k++){
                                  if(btns[i][j]==PredifinedBtns[k]){
                        flag=false;
                    }
              }
              if(flag==true){
                  btns[i][j].setText(SolveBoard[i][j]);
                  btns[i][j].setBackground(white);
                  btns[i][j].setForeground(black);
                  
              }
            
            }
          }
            
        }
        else{
            Solutionbtn.setText("Solution");
            glabalflag=true;
                    ResetGame();
        }
        
    }
    private void CheckMoves(){
         JButton btns [][] ={{r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                
        };
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 if(btns[i][j].getText()!=SolveBoard[i][j] && btns[i][j].getText()!=""){
                     btns[i][j].setBackground(red);
                     
                     
                 }
             }
         }
    }

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        r1c1 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        r3c3 = new javax.swing.JButton();
        selectbtn2 = new javax.swing.JButton();
        selectbtn1 = new javax.swing.JButton();
        selectbtn3 = new javax.swing.JButton();
        selectbtn4 = new javax.swing.JButton();
        selectbtn5 = new javax.swing.JButton();
        selectbtn6 = new javax.swing.JButton();
        selectbtn7 = new javax.swing.JButton();
        selectbtn8 = new javax.swing.JButton();
        selectbtn9 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        Solutionbtn = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JButton();
        r1c5 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r2c5 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        r4c1 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        r4c4 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r6c6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        r4c7 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        r4c9 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r5c9 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r6c9 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        r7c1 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r9c2 = new javax.swing.JButton();
        r9c3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        r7c4 = new javax.swing.JButton();
        r7c5 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        r9c6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        r7c7 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        r7c9 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        r9c7 = new javax.swing.JButton();
        r9c8 = new javax.swing.JButton();
        r9c9 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r1c1.setText("jButton1");
        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r1c2.setText("jButton1");
        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r1c3.setText("jButton1");
        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r2c1.setBackground(new java.awt.Color(204, 204, 255));
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r2c2.setText("jButton1");
        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        r2c3.setText("jButton1");
        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r3c1.setBackground(new java.awt.Color(204, 204, 255));
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r3c2.setText("jButton1");
        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        r3c3.setBackground(new java.awt.Color(204, 204, 255));
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selectbtn2.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn2.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn2.setText("2");
        selectbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn2ActionPerformed(evt);
            }
        });

        selectbtn1.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn1.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn1.setText("1");
        selectbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn1ActionPerformed(evt);
            }
        });

        selectbtn3.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn3.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn3.setText("3");
        selectbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn3ActionPerformed(evt);
            }
        });

        selectbtn4.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn4.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn4.setText("4");
        selectbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn4ActionPerformed(evt);
            }
        });

        selectbtn5.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn5.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn5.setText("5");
        selectbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn5ActionPerformed(evt);
            }
        });

        selectbtn6.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn6.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn6.setText("6");
        selectbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn6ActionPerformed(evt);
            }
        });

        selectbtn7.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn7.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn7.setText("7");
        selectbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn7ActionPerformed(evt);
            }
        });

        selectbtn8.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn8.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn8.setText("8");
        selectbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn8ActionPerformed(evt);
            }
        });

        selectbtn9.setBackground(new java.awt.Color(0, 0, 0));
        selectbtn9.setForeground(new java.awt.Color(255, 255, 255));
        selectbtn9.setText("9");
        selectbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtn9ActionPerformed(evt);
            }
        });

        jButton97.setBackground(new java.awt.Color(51, 255, 255));
        jButton97.setForeground(new java.awt.Color(102, 0, 51));
        jButton97.setText("RESET");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton98.setBackground(new java.awt.Color(255, 0, 255));
        jButton98.setForeground(new java.awt.Color(0, 204, 204));
        jButton98.setText("EXIT");
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        Solutionbtn.setBackground(new java.awt.Color(0, 204, 204));
        Solutionbtn.setForeground(new java.awt.Color(204, 0, 51));
        Solutionbtn.setText("SOLUTION");
        Solutionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolutionbtnActionPerformed(evt);
            }
        });

        jButton100.setBackground(new java.awt.Color(255, 255, 0));
        jButton100.setForeground(new java.awt.Color(0, 204, 0));
        jButton100.setText("CHECK MOVES");
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r1c4.setBackground(new java.awt.Color(204, 204, 255));
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        r1c5.setText("jButton1");
        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r1c6.setText("jButton1");
        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r2c4.setText("jButton1");
        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r2c5.setBackground(new java.awt.Color(204, 204, 255));
        r2c5.setText("7");
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        r2c6.setBackground(new java.awt.Color(204, 204, 255));
        r2c6.setText("8");
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });

        r3c4.setText("jButton1");
        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r3c5.setBackground(new java.awt.Color(204, 204, 255));
        r3c5.setText("4");
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });

        r3c6.setText("jButton1");
        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r1c7.setBackground(new java.awt.Color(204, 204, 255));
        r1c7.setText("7");
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new java.awt.Color(204, 204, 255));
        r1c8.setText("3");
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r1c9.setBackground(new java.awt.Color(204, 204, 255));
        r1c9.setText("4");
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new java.awt.Color(204, 204, 255));
        r2c7.setText("5");
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r2c8.setText("jButton1");
        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        r2c9.setBackground(new java.awt.Color(204, 204, 255));
        r2c9.setText("9");
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });

        r3c7.setText("jButton1");
        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r3c8.setBackground(new java.awt.Color(204, 204, 255));
        r3c8.setText("2");
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r3c9.setText("jButton1");
        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r4c1.setText("jButton1");
        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r4c2.setText("jButton1");
        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r4c3.setText("jButton1");
        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r5c1.setText("jButton1");
        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r5c2.setBackground(new java.awt.Color(204, 204, 255));
        r5c2.setText("3");
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new java.awt.Color(204, 204, 255));
        r5c3.setText("4");
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r6c1.setText("jButton1");
        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r6c2.setBackground(new java.awt.Color(204, 204, 255));
        r6c2.setText("6");
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r6c3.setText("jButton1");
        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r4c4.setText("jButton1");
        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r4c5.setBackground(new java.awt.Color(204, 204, 255));
        r4c5.setText("3");
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new java.awt.Color(204, 204, 255));
        r4c6.setText("5");
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r5c4.setText("jButton1");
        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r5c5.setText("jButton1");
        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });

        r5c6.setText("jButton1");
        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new java.awt.Color(204, 204, 255));
        r6c4.setText("1");
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        r6c5.setBackground(new java.awt.Color(204, 204, 255));
        r6c5.setText("8");
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r6c6.setText("jButton1");
        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r4c7.setText("jButton1");
        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r4c8.setBackground(new java.awt.Color(204, 204, 255));
        r4c8.setText("9");
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r4c9.setText("jButton1");
        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });

        r5c7.setBackground(new java.awt.Color(204, 204, 255));
        r5c7.setText("2");
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r5c8.setBackground(new java.awt.Color(204, 204, 255));
        r5c8.setText("8");
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        r5c9.setText("jButton1");
        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });

        r6c7.setText("jButton1");
        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r6c8.setText("jButton1");
        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r6c9.setText("jButton1");
        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r7c1.setText("jButton1");
        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r7c2.setBackground(new java.awt.Color(204, 204, 255));
        r7c2.setText("4");
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r7c3.setText("jButton1");
        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new java.awt.Color(204, 204, 255));
        r8c1.setText("3");
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r8c2.setText("jButton1");
        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        r8c3.setText("jButton1");
        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r9c1.setBackground(new java.awt.Color(204, 204, 255));
        r9c1.setText("6");
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });

        r9c2.setBackground(new java.awt.Color(204, 204, 255));
        r9c2.setText("8");
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r9c3.setBackground(new java.awt.Color(204, 204, 255));
        r9c3.setText("9");
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r7c4.setText("jButton1");
        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r7c5.setBackground(new java.awt.Color(204, 204, 255));
        r7c5.setText("5");
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r7c6.setText("jButton1");
        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r8c4.setBackground(new java.awt.Color(204, 204, 255));
        r8c4.setText("9");
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new java.awt.Color(204, 204, 255));
        r8c5.setText("6");
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        r8c6.setText("jButton1");
        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r9c4.setText("jButton1");
        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });

        r9c5.setText("jButton1");
        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        r9c6.setBackground(new java.awt.Color(204, 204, 255));
        r9c6.setText("1");
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r7c7.setBackground(new java.awt.Color(204, 204, 255));
        r7c7.setText("9");
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r7c8.setText("jButton1");
        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r7c9.setBackground(new java.awt.Color(204, 204, 255));
        r7c9.setText("6");
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });

        r8c7.setText("jButton1");
        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r8c8.setText("jButton1");
        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        r8c9.setBackground(new java.awt.Color(204, 204, 255));
        r8c9.setText("2");
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });

        r9c7.setText("jButton1");
        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        r9c8.setText("jButton1");
        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });

        r9c9.setText("jButton1");
        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Solutionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Solutionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        // TODO add your handling code here:
         r1c3.setText(turn);
        r1c3.setBackground(white);
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c2ActionPerformed
        // TODO add your handling code here:
         r2c2.setText(turn);
        r2c2.setBackground(white);
    }//GEN-LAST:event_r2c2ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        // TODO add your handling code here:
         r2c3.setText(turn);
        r2c3.setBackground(white);
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c1ActionPerformed

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c2ActionPerformed
        // TODO add your handling code here:
         r3c2.setText(turn);
        r3c2.setBackground(white);
    }//GEN-LAST:event_r3c2ActionPerformed

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c3ActionPerformed

    private void selectbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn2ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn2);
        turn="2";
    }//GEN-LAST:event_selectbtn2ActionPerformed

    private void selectbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn1ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectbtn1);
        turn="1";
    }//GEN-LAST:event_selectbtn1ActionPerformed

    private void selectbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn3ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn3);
        turn="3";
    }//GEN-LAST:event_selectbtn3ActionPerformed

    private void selectbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn4ActionPerformed
  AssignTurn(selectbtn4);
        turn="4";       
    }//GEN-LAST:event_selectbtn4ActionPerformed

    private void selectbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn5ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn5);
        turn="5";
    }//GEN-LAST:event_selectbtn5ActionPerformed

    private void selectbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn6ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn6);
        turn="6";
    }//GEN-LAST:event_selectbtn6ActionPerformed

    private void selectbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn7ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn7);
        turn="7";
    }//GEN-LAST:event_selectbtn7ActionPerformed

    private void selectbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn8ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn8);
        turn="8";
    }//GEN-LAST:event_selectbtn8ActionPerformed

    private void selectbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtn9ActionPerformed
        // TODO add your handling code here:
          AssignTurn(selectbtn9);
        turn="9";
    }//GEN-LAST:event_selectbtn9ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to reset the Game", "Sudoku Puzzle",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        ResetGame();
        
    }
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Sudoku Puzzle", JOptionPane.YES_NO_OPTION)==
                JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton98ActionPerformed

    private void SolutionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionbtnActionPerformed
        // TODO add your handling code here:
        SeeSolution();
        
    }//GEN-LAST:event_SolutionbtnActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
        CheckMoves();
    }//GEN-LAST:event_jButton100ActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        // TODO add your handling code here:
        r1c2.setText(turn);
        r1c2.setBackground(white);
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c1ActionPerformed

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c5ActionPerformed
        // TODO add your handling code here:
         r1c5.setText(turn);
        r1c5.setBackground(white);
    }//GEN-LAST:event_r1c5ActionPerformed

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c6ActionPerformed
        // TODO add your handling code here:
         r1c6.setText(turn);
        r1c6.setBackground(white);
    }//GEN-LAST:event_r1c6ActionPerformed

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c4ActionPerformed
        // TODO add your handling code here:
         r2c4.setText(turn);
        r2c4.setBackground(white);
    }//GEN-LAST:event_r2c4ActionPerformed

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c5ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r2c5ActionPerformed

    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c6ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r2c6ActionPerformed

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c4ActionPerformed
        // TODO add your handling code here:
         r3c4.setText(turn);
        r3c4.setBackground(white);
    }//GEN-LAST:event_r3c4ActionPerformed

    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c5ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r3c5ActionPerformed

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c6ActionPerformed
        // TODO add your handling code here:
         r3c6.setText(turn);
        r3c6.setBackground(white);
    }//GEN-LAST:event_r3c6ActionPerformed

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c8ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r1c8ActionPerformed

    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c9ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r1c9ActionPerformed

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c7ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r2c7ActionPerformed

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c8ActionPerformed
        // TODO add your handling code here:
         r2c8.setText(turn);
        r2c8.setBackground(white);
    }//GEN-LAST:event_r2c8ActionPerformed

    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c9ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r2c9ActionPerformed

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c7ActionPerformed
        // TODO add your handling code here:
         r3c7.setText(turn);
        r3c7.setBackground(white);
    }//GEN-LAST:event_r3c7ActionPerformed

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c8ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r3c8ActionPerformed

    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c9ActionPerformed
        // TODO add your handling code here:
         r3c9.setText(turn);
        r3c9.setBackground(white);
    }//GEN-LAST:event_r3c9ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        // TODO add your handling code here:
         r4c2.setText(turn);
        r4c2.setBackground(white);
        
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        // TODO add your handling code here:
         r4c3.setText(turn);
        r4c3.setBackground(white);
    }//GEN-LAST:event_r4c3ActionPerformed

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c1ActionPerformed
        // TODO add your handling code here:
         r5c1.setText(turn);
        r5c1.setBackground(white);
    }//GEN-LAST:event_r5c1ActionPerformed

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c2ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r5c2ActionPerformed

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c3ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r5c3ActionPerformed

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c1ActionPerformed
        // TODO add your handling code here:
         r6c1.setText(turn);
        r6c1.setBackground(white);
    }//GEN-LAST:event_r6c1ActionPerformed

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c2ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r6c2ActionPerformed

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c3ActionPerformed
        // TODO add your handling code here:
         r6c3.setText(turn);
        r6c3.setBackground(white);
    }//GEN-LAST:event_r6c3ActionPerformed

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c5ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r4c5ActionPerformed

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c6ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r4c6ActionPerformed

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c4ActionPerformed
        // TODO add your handling code here:
         r5c4.setText(turn);
        r5c4.setBackground(white);
    }//GEN-LAST:event_r5c4ActionPerformed

    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c5ActionPerformed
        // TODO add your handling code here:
         r5c5.setText(turn);
        r5c5.setBackground(white);
        
    }//GEN-LAST:event_r5c5ActionPerformed

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c6ActionPerformed
        // TODO add your handling code here:
         r5c6.setText(turn);
        r5c6.setBackground(white);
    }//GEN-LAST:event_r5c6ActionPerformed

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c4ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r6c4ActionPerformed

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c5ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r6c5ActionPerformed

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c6ActionPerformed
        // TODO add your handling code here:
         r6c6.setText(turn);
        r6c6.setBackground(white);
    }//GEN-LAST:event_r6c6ActionPerformed

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c8ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r4c8ActionPerformed

    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c9ActionPerformed
        // TODO add your handling code here:
         r4c9.setText(turn);
        r4c9.setBackground(white);
    }//GEN-LAST:event_r4c9ActionPerformed

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c7ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r5c7ActionPerformed

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c8ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r5c8ActionPerformed

    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c9ActionPerformed
        // TODO add your handling code here:
         r5c9.setText(turn);
        r5c9.setBackground(white);
    }//GEN-LAST:event_r5c9ActionPerformed

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c7ActionPerformed
        // TODO add your handling code here:
         r6c7.setText(turn);
        r6c7.setBackground(white);
    }//GEN-LAST:event_r6c7ActionPerformed

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c8ActionPerformed
        // TODO add your handling code here:
         r6c8.setText(turn);
        r6c8.setBackground(white);
    }//GEN-LAST:event_r6c8ActionPerformed

    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c9ActionPerformed
        // TODO add your handling code here:
         r6c9.setText(turn);
        r6c9.setBackground(white);
    }//GEN-LAST:event_r6c9ActionPerformed

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c2ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r7c2ActionPerformed

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c3ActionPerformed
        // TODO add your handling code here:
         r7c3.setText(turn);
        r7c3.setBackground(white);
    }//GEN-LAST:event_r7c3ActionPerformed

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c1ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r8c1ActionPerformed

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c2ActionPerformed
        // TODO add your handling code here:
         r8c2.setText(turn);
        r8c2.setBackground(white);
    }//GEN-LAST:event_r8c2ActionPerformed

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c3ActionPerformed
        // TODO add your handling code here:
         r8c3.setText(turn);
        r8c3.setBackground(white);
    }//GEN-LAST:event_r8c3ActionPerformed

    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c1ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r9c1ActionPerformed

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c2ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r9c2ActionPerformed

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c3ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r9c3ActionPerformed

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c5ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r7c5ActionPerformed

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c6ActionPerformed
        // TODO add your handling code here:
         r7c6.setText(turn);
        r7c6.setBackground(white);
    }//GEN-LAST:event_r7c6ActionPerformed

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c4ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r8c4ActionPerformed

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c5ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r8c5ActionPerformed

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c6ActionPerformed
        // TODO add your handling code here:
         r8c6.setText(turn);
        r8c6.setBackground(white);
    }//GEN-LAST:event_r8c6ActionPerformed

    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c4ActionPerformed
        // TODO add your handling code here:
         r9c4.setText(turn);
        r9c4.setBackground(white);
    }//GEN-LAST:event_r9c4ActionPerformed

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c5ActionPerformed
        // TODO add your handling code here:
         r9c5.setText(turn);
        r9c5.setBackground(white);
    }//GEN-LAST:event_r9c5ActionPerformed

    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c6ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r9c6ActionPerformed

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c8ActionPerformed
        // TODO add your handling code here:
         r7c8.setText(turn);
        r7c8.setBackground(white);
    }//GEN-LAST:event_r7c8ActionPerformed

    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c9ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r7c9ActionPerformed

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c7ActionPerformed
        // TODO add your handling code here:
         r8c7.setText(turn);
        r8c7.setBackground(white);
    }//GEN-LAST:event_r8c7ActionPerformed

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c8ActionPerformed
        // TODO add your handling code here:
         r8c8.setText(turn);
        r8c8.setBackground(white);
    }//GEN-LAST:event_r8c8ActionPerformed

    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c9ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r8c9ActionPerformed

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c7ActionPerformed
        // TODO add your handling code here:
         r9c7.setText(turn);
        r9c7.setBackground(white);
    }//GEN-LAST:event_r9c7ActionPerformed

    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c8ActionPerformed
        // TODO add your handling code here:
         r9c8.setText(turn);
        r9c8.setBackground(white);
    }//GEN-LAST:event_r9c8ActionPerformed

    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c9ActionPerformed
        // TODO add your handling code here:
         r9c9.setText(turn);
        r9c9.setBackground(white);
    }//GEN-LAST:event_r9c9ActionPerformed

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c4ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r1c4ActionPerformed

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r1c7ActionPerformed

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c7ActionPerformed
JOptionPane.showMessageDialog(this, "This place is already allocated", "Message", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_r7c7ActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed

       r1c1.setText(turn);
        r1c1.setBackground(white);
        
    }//GEN-LAST:event_r1c1ActionPerformed

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c1ActionPerformed
        // TODO add your handling code here:
         r4c1.setText(turn);
        r4c1.setBackground(white);
    }//GEN-LAST:event_r4c1ActionPerformed

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c4ActionPerformed
        // TODO add your handling code here:
         r4c4.setText(turn);
        r4c4.setBackground(white);
    }//GEN-LAST:event_r4c4ActionPerformed

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c7ActionPerformed
        // TODO add your handling code here:
         r4c7.setText(turn);
        r4c7.setBackground(white);
    }//GEN-LAST:event_r4c7ActionPerformed

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c1ActionPerformed
        // TODO add your handling code here:
         r7c1.setText(turn);
        r7c1.setBackground(white);
    }//GEN-LAST:event_r7c1ActionPerformed

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c4ActionPerformed
        // TODO add your handling code here:
         r7c4.setText(turn);
        r7c4.setBackground(white);
    }//GEN-LAST:event_r7c4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Solutionbtn;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton selectbtn1;
    private javax.swing.JButton selectbtn2;
    private javax.swing.JButton selectbtn3;
    private javax.swing.JButton selectbtn4;
    private javax.swing.JButton selectbtn5;
    private javax.swing.JButton selectbtn6;
    private javax.swing.JButton selectbtn7;
    private javax.swing.JButton selectbtn8;
    private javax.swing.JButton selectbtn9;
    // End of variables declaration//GEN-END:variables
}
