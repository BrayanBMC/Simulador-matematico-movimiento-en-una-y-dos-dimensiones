
package vista;

public class CaidaLibre extends javax.swing.JPanel {

    public CaidaLibre() {
        initComponents();
        this.jPanel1.setVisible(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        sub1txt = new javax.swing.JTextField();
        sub1_2 = new javax.swing.JLabel();
        btncal = new javax.swing.JPanel();
        txtcal = new javax.swing.JLabel();
        btnlim = new javax.swing.JPanel();
        txtlim = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sub3txt = new javax.swing.JTextField();
        sub3 = new javax.swing.JLabel();
        sub3_1 = new javax.swing.JLabel();
        btncer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        titulo.setBackground(new java.awt.Color(153, 255, 153));
        titulo.setFont(new java.awt.Font("Roboto Condensed", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Caida libre");
        titulo.setOpaque(true);

        sub1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sub1.setText("Altura ");

        sub1txt.setBackground(new java.awt.Color(204, 255, 153));
        sub1txt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        sub1txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sub1txtKeyTyped(evt);
            }
        });

        sub1_2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        sub1_2.setText("Metros");

        btncal.setBackground(new java.awt.Color(0, 102, 0));
        btncal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncalMouseClicked(evt);
            }
        });

        txtcal.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        txtcal.setForeground(new java.awt.Color(255, 255, 255));
        txtcal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcal.setText("Calcular");
        txtcal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btncalLayout = new javax.swing.GroupLayout(btncal);
        btncal.setLayout(btncalLayout);
        btncalLayout.setHorizontalGroup(
            btncalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncalLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(txtcal)
                .addGap(19, 19, 19))
        );
        btncalLayout.setVerticalGroup(
            btncalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtcal)
                .addContainerGap())
        );

        btnlim.setBackground(new java.awt.Color(0, 102, 0));
        btnlim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimMouseClicked(evt);
            }
        });

        txtlim.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtlim.setForeground(new java.awt.Color(255, 255, 255));
        txtlim.setText("Limpiar");

        javax.swing.GroupLayout btnlimLayout = new javax.swing.GroupLayout(btnlim);
        btnlim.setLayout(btnlimLayout);
        btnlimLayout.setHorizontalGroup(
            btnlimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlimLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtlim)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnlimLayout.setVerticalGroup(
            btnlimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnlimLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtlim)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESULTADOS");
        jLabel2.setOpaque(true);

        sub3txt.setBackground(new java.awt.Color(204, 255, 153));
        sub3txt.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N

        sub3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sub3.setText("Tiempo");

        sub3_1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        sub3_1.setText("s");

        btncer.setBackground(new java.awt.Color(0, 102, 0));
        btncer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cerrar");

        javax.swing.GroupLayout btncerLayout = new javax.swing.GroupLayout(btncer);
        btncer.setLayout(btncerLayout);
        btncerLayout.setHorizontalGroup(
            btncerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btncerLayout.setVerticalGroup(
            btncerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btncerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sub3txt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sub3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btncer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub3_1))
                .addGap(18, 18, 18)
                .addComponent(btncer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digita el siguiente dato para obtener el tiempo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(sub1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sub1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btncal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnlim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btncalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncalMouseClicked
        double h = Double.parseDouble(sub1txt.getText());
        
        this.jPanel1.setVisible(true);
        double resultado = Math.sqrt(2*h/9.8);
        sub3txt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btncalMouseClicked

    private void btnlimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimMouseClicked
        sub1txt.setText("");
        sub3txt.setText("");
    }//GEN-LAST:event_btnlimMouseClicked

    private void btncerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncerMouseClicked

    private void sub1txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sub1txtKeyTyped
        char x = evt.getKeyChar(); 
        if(x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9'||x=='.'||x==','){
            sub1txt.setText(sub1txt.getText());
        }
        else{
            evt.consume();
        }
    }//GEN-LAST:event_sub1txtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btncal;
    private javax.swing.JPanel btncer;
    private javax.swing.JPanel btnlim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sub1;
    private javax.swing.JLabel sub1_2;
    private javax.swing.JTextField sub1txt;
    private javax.swing.JLabel sub3;
    private javax.swing.JLabel sub3_1;
    private javax.swing.JTextField sub3txt;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtcal;
    private javax.swing.JLabel txtlim;
    // End of variables declaration//GEN-END:variables
}
