package kleyton13_09;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Forca extends javax.swing.JFrame {

    private ImageIcon f0 = new ImageIcon(this.getClass().getResource("/imagens/forca0.png"));
    private ImageIcon f1 = new ImageIcon(this.getClass().getResource("/imagens/forca1.png"));
    private ImageIcon f2 = new ImageIcon(this.getClass().getResource("/imagens/forca2.png"));
    private ImageIcon f3 = new ImageIcon(this.getClass().getResource("/imagens/forca3.png"));
    private ImageIcon f4 = new ImageIcon(this.getClass().getResource("/imagens/forca4.png"));
    private ImageIcon f5 = new ImageIcon(this.getClass().getResource("/imagens/forca5.png"));
    private ImageIcon f6 = new ImageIcon(this.getClass().getResource("/imagens/forca6.png"));

    private ArrayList<String> palavras = new ArrayList();
    private String palavra;
    private String[] resultado;
    private int erro, contagem, pontuacao;

    public Forca() {
        initComponents();
        inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelAlfabeto = new javax.swing.JPanel();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonV = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jLabelPontuacao = new javax.swing.JLabel();
        jLabelPontuacao1 = new javax.swing.JLabel();
        jLabelIcon = new javax.swing.JLabel();
        jLabelPalavra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca");
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(700, 450));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(0, 255, 102));

        jPanelAlfabeto.setOpaque(false);
        jPanelAlfabeto.setLayout(new java.awt.GridLayout(4, 7, 3, 3));

        jButtonA.setBackground(new java.awt.Color(153, 153, 153));
        jButtonA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonA.setText("A");
        jButtonA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonA);

        jButtonB.setBackground(new java.awt.Color(153, 153, 153));
        jButtonB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonB.setText("B");
        jButtonB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonB);

        jButtonC.setBackground(new java.awt.Color(153, 153, 153));
        jButtonC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonC.setText("C");
        jButtonC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonC);

        jButtonD.setBackground(new java.awt.Color(153, 153, 153));
        jButtonD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonD.setText("D");
        jButtonD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonD);

        jButtonE.setBackground(new java.awt.Color(153, 153, 153));
        jButtonE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonE.setText("E");
        jButtonE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonE);

        jButtonF.setBackground(new java.awt.Color(153, 153, 153));
        jButtonF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonF.setText("F");
        jButtonF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonF);

        jButtonG.setBackground(new java.awt.Color(153, 153, 153));
        jButtonG.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonG.setText("G");
        jButtonG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonG);

        jButtonH.setBackground(new java.awt.Color(153, 153, 153));
        jButtonH.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonH.setText("H");
        jButtonH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonH);

        jButtonI.setBackground(new java.awt.Color(153, 153, 153));
        jButtonI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonI.setText("I");
        jButtonI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonI);

        jButtonJ.setBackground(new java.awt.Color(153, 153, 153));
        jButtonJ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonJ.setText("J");
        jButtonJ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonJ);

        jButtonK.setBackground(new java.awt.Color(153, 153, 153));
        jButtonK.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonK.setText("K");
        jButtonK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonK);

        jButtonL.setBackground(new java.awt.Color(153, 153, 153));
        jButtonL.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonL.setText("L");
        jButtonL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonL);

        jButtonM.setBackground(new java.awt.Color(153, 153, 153));
        jButtonM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonM.setText("M");
        jButtonM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonM);

        jButtonN.setBackground(new java.awt.Color(153, 153, 153));
        jButtonN.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonN.setText("N");
        jButtonN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonN);

        jButtonO.setBackground(new java.awt.Color(153, 153, 153));
        jButtonO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonO.setText("O");
        jButtonO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonO);

        jButtonP.setBackground(new java.awt.Color(153, 153, 153));
        jButtonP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonP.setText("P");
        jButtonP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonP);

        jButtonQ.setBackground(new java.awt.Color(153, 153, 153));
        jButtonQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonQ.setText("Q");
        jButtonQ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonQ);

        jButtonR.setBackground(new java.awt.Color(153, 153, 153));
        jButtonR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonR.setText("R");
        jButtonR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonR);

        jButtonS.setBackground(new java.awt.Color(153, 153, 153));
        jButtonS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonS.setText("S");
        jButtonS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonS);

        jButtonT.setBackground(new java.awt.Color(153, 153, 153));
        jButtonT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonT.setText("T");
        jButtonT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonT);

        jButtonU.setBackground(new java.awt.Color(153, 153, 153));
        jButtonU.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonU.setText("U");
        jButtonU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonU);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanelAlfabeto.add(jPanel1);

        jButtonV.setBackground(new java.awt.Color(153, 153, 153));
        jButtonV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonV.setText("V");
        jButtonV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonV);

        jButtonW.setBackground(new java.awt.Color(153, 153, 153));
        jButtonW.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonW.setText("W");
        jButtonW.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonW);

        jButtonX.setBackground(new java.awt.Color(153, 153, 153));
        jButtonX.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonX.setText("X");
        jButtonX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonX);

        jButtonY.setBackground(new java.awt.Color(153, 153, 153));
        jButtonY.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonY.setText("Y");
        jButtonY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonY);

        jButtonZ.setBackground(new java.awt.Color(153, 153, 153));
        jButtonZ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonZ.setText("Z");
        jButtonZ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });
        jPanelAlfabeto.add(jButtonZ);

        jLabelPontuacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPontuacao.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPontuacao.setText("Pontuação:");

        jLabelPontuacao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPontuacao1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPontuacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPontuacao1.setText("Jogo da Forca com Swing");

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/forca0.png"))); // NOI18N

        jLabelPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPalavra.setText("jLabel1");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPontuacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabelPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabelPontuacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jPanelAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        verificarBotao(jButtonA);
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        verificarBotao(jButtonB);
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        verificarBotao(jButtonC);
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
        verificarBotao(jButtonD);
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
        verificarBotao(jButtonE);
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        verificarBotao(jButtonF);
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
        verificarBotao(jButtonU);
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
        verificarBotao(jButtonG);
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
        verificarBotao(jButtonH);
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
        verificarBotao(jButtonI);
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
        verificarBotao(jButtonJ);
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
        verificarBotao(jButtonK);
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
        verificarBotao(jButtonL);
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        verificarBotao(jButtonM);
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
        verificarBotao(jButtonN);
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
        verificarBotao(jButtonO);
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
        verificarBotao(jButtonP);
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
        verificarBotao(jButtonQ);
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        verificarBotao(jButtonR);
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        verificarBotao(jButtonS);
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
        verificarBotao(jButtonT);
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
        verificarBotao(jButtonV);
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
       verificarBotao(jButtonW);
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
       verificarBotao(jButtonX);
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
        verificarBotao(jButtonY);
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
        verificarBotao(jButtonZ);
    }//GEN-LAST:event_jButtonZActionPerformed
    public void inicializar() {
        botoesPadroes();//deixar botoes padroes
        palavras();    //conjunto de palavras

        this.erro = 0;  //resetar o erro
        this.contagem = 0;  //resetar a contagem
        jLabelPontuacao.setText(String.valueOf(pontuacao));  //pegar a variavel pontuacao,converter para String

        this.palavra = this.palavras.get(0);  //pegar primeira palavra da lista embaralhada
        this.resultado = new String[palavra.length()];//cria o vetor de string com o tamanho da palavra
        this.palavras.remove(0);

        jLabelIcon.setIcon(f0); //definir forca0
        jLabelPalavra.setText(""); //resetar a label palavra

        for (int i = 0; i < palavra.length(); i++) {
            resultado[i] = "  ___  ";//define o vetor com os dunders 
            jLabelPalavra.setText(jLabelPalavra.getText() + resultado[i]);
        }
    }

    private void verificarBotao(JButton b) {
        boolean contem = false;

        b.setEnabled(false);
        jLabelPalavra.setText("");

        for (int i = 0; i < palavra.length(); i++) {
            if (b.getText().charAt(0) == palavra.charAt(i)) {
                resultado[i] = " " + b.getText().charAt(0) + " ";
                contem = true;
                this.contagem++;
            }
            jLabelPalavra.setText(jLabelPalavra.getText() + resultado[i]);
        }
        if (contem) {//acertou a letra
            b.setForeground(Color.BLUE);
        } else { //Errou a letra
            b.setForeground(Color.red);
            this.erro++;
            switch (this.erro) {
                case 1:
                    jLabelIcon.setIcon(f1);
                    break;
                case 2:
                    jLabelIcon.setIcon(f2);
                    break;
                case 3:
                    jLabelIcon.setIcon(f3);
                    break;
                case 4:
                    jLabelIcon.setIcon(f4);
                    break;
                case 5:
                    jLabelIcon.setIcon(f5);
                    break;
                case 6:
                    jLabelIcon.setIcon(f6);
                    break;
                default:
                    jLabelIcon.setIcon(f0);
                    break;
            }
        }
        if (this.contagem == this.palavra.length()) { //Acertou a palavra
            JOptionPane.showMessageDialog(null, "Você acertou a palavra!", "Fim da rodada",
                    JOptionPane.INFORMATION_MESSAGE);
            this.pontuacao++;
            inicializar();
        }
        if (this.erro == 6) { //Errou a palavra
            JOptionPane.showMessageDialog(null, "Você errou a palavra! A resposta correta é: ");
            inicializar();

        }
    }

    private void palavras() {
        palavras.add("DESTINY");
        palavras.add("PIZZA");
        palavras.add("LEAO");
        palavras.add("GATO");
        palavras.add("CACHORRO");
        palavras.add("CINEMA");
        palavras.add("MARIA");
        palavras.add("CARLOS");
        palavras.add("BEACH");
        palavras.add("VIAJAR");

        Collections.shuffle(palavras);
    }

    public void botoesPadroes() {
        ArrayList<JButton> botoes = new ArrayList();

        botoes.add(jButtonA);
        botoes.add(jButtonB);
        botoes.add(jButtonC);
        botoes.add(jButtonD);
        botoes.add(jButtonE);
        botoes.add(jButtonF);
        botoes.add(jButtonG);
        botoes.add(jButtonH);
        botoes.add(jButtonI);
        botoes.add(jButtonJ);
        botoes.add(jButtonK);
        botoes.add(jButtonL);
        botoes.add(jButtonM);
        botoes.add(jButtonN);
        botoes.add(jButtonO);
        botoes.add(jButtonP);
        botoes.add(jButtonQ);
        botoes.add(jButtonR);
        botoes.add(jButtonS);
        botoes.add(jButtonT);
        botoes.add(jButtonU);
        botoes.add(jButtonV);
        botoes.add(jButtonW);
        botoes.add(jButtonX);
        botoes.add(jButtonY);
        botoes.add(jButtonZ);

        for (JButton botao : botoes) {
            botao.setBackground(Color.WHITE);
            botao.setForeground(new Color(0, 51, 51));
            botao.setEnabled(true);
        }
    }

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
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelPalavra;
    private javax.swing.JLabel jLabelPontuacao;
    private javax.swing.JLabel jLabelPontuacao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAlfabeto;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
