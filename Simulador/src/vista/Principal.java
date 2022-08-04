package vista;

import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;
    public Principal() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        badg = new javax.swing.JPanel();
        panelmenu = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JPanel();
        boton1txt = new javax.swing.JLabel();
        boton2 = new javax.swing.JPanel();
        boton2txt = new javax.swing.JLabel();
        boton3 = new javax.swing.JPanel();
        boton3txt = new javax.swing.JLabel();
        lbeltitulo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        cerrartxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        badg.setBackground(new java.awt.Color(255, 255, 255));
        badg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelmenu.setBackground(new java.awt.Color(255, 255, 255));

        menu1.setBackground(new java.awt.Color(0, 95, 169));

        boton1.setBackground(new java.awt.Color(0, 134, 190));
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton1txt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        boton1txt.setForeground(new java.awt.Color(255, 255, 255));
        boton1txt.setText("Caida Libre");
        boton1txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton1txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton1txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout boton1Layout = new javax.swing.GroupLayout(boton1);
        boton1.setLayout(boton1Layout);
        boton1Layout.setHorizontalGroup(
            boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(boton1txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        boton1Layout.setVerticalGroup(
            boton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton1txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        boton2.setBackground(new java.awt.Color(0, 134, 190));

        boton2txt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        boton2txt.setForeground(new java.awt.Color(255, 255, 255));
        boton2txt.setText("Movimiento Uniforme Acelerado");
        boton2txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton2txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton2txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton2txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout boton2Layout = new javax.swing.GroupLayout(boton2);
        boton2.setLayout(boton2Layout);
        boton2Layout.setHorizontalGroup(
            boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(boton2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        boton2Layout.setVerticalGroup(
            boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton2txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boton3.setBackground(new java.awt.Color(0, 134, 190));

        boton3txt.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        boton3txt.setForeground(new java.awt.Color(255, 255, 255));
        boton3txt.setText("Tiro Parabolico");
        boton3txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton3txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton3txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton3txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout boton3Layout = new javax.swing.GroupLayout(boton3);
        boton3.setLayout(boton3Layout);
        boton3Layout.setHorizontalGroup(
            boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(boton3txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        boton3Layout.setVerticalGroup(
            boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton3txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbeltitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbeltitulo.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        lbeltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbeltitulo.setText("SIMULADOR DE MECANICA");

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbeltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbeltitulo)
                .addGap(30, 30, 30)
                .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(262, 262, 262))
        );

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        badg.add(panelmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 480));

        content.setBackground(new java.awt.Color(255, 255, 255));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/111.jpg"))); // NOI18N

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 490, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );

        badg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 490, 480));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(255, 255, 255));

        cerrartxt.setBackground(new java.awt.Color(255, 255, 255));
        cerrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrartxt.setText("X");
        cerrartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrartxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrartxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addContainerGap(781, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        badg.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(badg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(badg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void cerrartxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrartxtMousePressed
        System.exit(0);
    }//GEN-LAST:event_cerrartxtMousePressed

    private void cerrartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrartxtMouseEntered
        cerrar.setBackground(Color.red);
        cerrartxt.setForeground(Color.white);   
    }//GEN-LAST:event_cerrartxtMouseEntered

    private void cerrartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrartxtMouseExited
        cerrar.setBackground(Color.white);
        cerrartxt.setForeground(Color.black);
    }//GEN-LAST:event_cerrartxtMouseExited

    private void boton1txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1txtMouseEntered
        boton1.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_boton1txtMouseEntered

    private void boton1txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1txtMouseExited
        boton1.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_boton1txtMouseExited

    private void boton1txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1txtMouseClicked
        CaidaLibre p1 = new CaidaLibre();
        p1.setSize(500,500);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_boton1txtMouseClicked

    private void boton2txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2txtMouseEntered
        boton2.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_boton2txtMouseEntered

    private void boton2txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2txtMouseExited
        boton2.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_boton2txtMouseExited

    private void boton3txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3txtMouseEntered
        boton3.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_boton3txtMouseEntered

    private void boton3txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3txtMouseExited
        boton3.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_boton3txtMouseExited

    private void boton2txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2txtMouseClicked
        MUA m = new MUA(); 
        m.setSize(500,500); 
        m.setLocation(0,0);
        
        content.removeAll();
        content.add(m); 
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_boton2txtMouseClicked

    private void boton3txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3txtMouseClicked
        MParabolico p = new MParabolico(); 
        p.setSize(500,500); 
        p.setLocation(0,0); 
        
        content.removeAll();
        content.add(p); 
        content.revalidate();
        content.repaint(); 
    }//GEN-LAST:event_boton3txtMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel badg;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel boton1;
    private javax.swing.JLabel boton1txt;
    private javax.swing.JPanel boton2;
    private javax.swing.JLabel boton2txt;
    private javax.swing.JPanel boton3;
    private javax.swing.JLabel boton3txt;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrartxt;
    private javax.swing.JPanel content;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel lbeltitulo;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel panelmenu;
    // End of variables declaration//GEN-END:variables
}
