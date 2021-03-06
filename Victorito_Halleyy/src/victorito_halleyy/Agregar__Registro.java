package victorito_halleyy;

public class Agregar__Registro extends javax.swing.JFrame {

    public Agregar__Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        L11 = new javax.swing.JLabel();
        TXT1 = new javax.swing.JTextField();
        SP1 = new javax.swing.JSeparator();
        L10 = new javax.swing.JLabel();
        TXT_NOMBRE = new javax.swing.JTextField();
        SP2 = new javax.swing.JSeparator();
        L6 = new javax.swing.JLabel();
        SP3 = new javax.swing.JSeparator();
        TXT_CANTIDAD = new javax.swing.JTextField();
        L4 = new javax.swing.JLabel();
        SP6 = new javax.swing.JSeparator();
        TXT_PRECIOU = new javax.swing.JTextField();
        L7 = new javax.swing.JLabel();
        SP7 = new javax.swing.JSeparator();
        TXT_PTSI = new javax.swing.JTextField();
        L8 = new javax.swing.JLabel();
        TXT_PTCI = new javax.swing.JTextField();
        SP8 = new javax.swing.JSeparator();
        L12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXT_INFOA = new javax.swing.JTextArea();
        L3 = new javax.swing.JLabel();
        TXT8_FECHA = new javax.swing.JTextField();
        SP9 = new javax.swing.JSeparator();
        BT1 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 0));
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setText("AGREGAR REGISTRO");
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 80));

        L1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores.jpg"))); // NOI18N
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 82));

        L5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L5.setText("Categoria:");
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 60, 20));

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajo", "Cotizacion" }));
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 112, 90, 20));

        L11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L11.setText("Nombre del Cliente:");
        jPanel1.add(L11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        TXT1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TXT1.setBorder(null);
        jPanel1.add(TXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 290, 30));

        SP1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 310, 10));

        L10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L10.setText("Nombre del Trabajo:");
        jPanel1.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        TXT_NOMBRE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TXT_NOMBRE.setBorder(null);
        jPanel1.add(TXT_NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 310, 30));

        SP2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 310, 10));

        L6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L6.setText("Cantidad");
        jPanel1.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        SP3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 20));

        TXT_CANTIDAD.setBorder(null);
        jPanel1.add(TXT_CANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 232, 120, 30));

        L4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L4.setText("Precio unitario");
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 90, 20));

        SP6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, 10));

        TXT_PRECIOU.setBorder(null);
        jPanel1.add(TXT_PRECIOU, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 30));

        L7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L7.setText("Precio total (Sin IVA):");
        jPanel1.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 20));

        SP7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 10));

        TXT_PTSI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TXT_PTSI.setBorder(null);
        jPanel1.add(TXT_PTSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 110, 30));

        L8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L8.setText("Precio total (con IVA):");
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 130, 20));

        TXT_PTCI.setBorder(null);
        TXT_PTCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_PTCIKeyTyped(evt);
            }
        });
        jPanel1.add(TXT_PTCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 110, 30));

        SP8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 110, 10));

        L12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L12.setText("Informacion Adicional:");
        jPanel1.add(L12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 20));

        TXT_INFOA.setColumns(20);
        TXT_INFOA.setRows(5);
        TXT_INFOA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_INFOAKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TXT_INFOA);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 240, 100));

        L3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L3.setText("Fecha de entrega:");
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 110, 20));

        TXT8_FECHA.setBorder(null);
        jPanel1.add(TXT8_FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 160, 30));

        SP9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 160, 20));

        BT1.setBackground(new java.awt.Color(0, 193, 193));
        BT1.setText("Subir Registro");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });
        jPanel1.add(BT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 462, 110, 20));

        BT2.setBackground(new java.awt.Color(0, 193, 193));
        BT2.setText("Limpiar los campos");
        BT2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });
        jPanel1.add(BT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 462, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_PTCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_PTCIKeyTyped
        char n = evt.getKeyChar();
        if(( n<  '0' || n> '9')) evt.consume();
    }//GEN-LAST:event_TXT_PTCIKeyTyped

    private void TXT_INFOAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_INFOAKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_TXT_INFOAKeyTyped

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed

    }//GEN-LAST:event_BT1ActionPerformed

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT2ActionPerformed
        TXT_NOMBRE.setText("");
        TXT_CANTIDAD.setText("");
        TXT_PRECIOU.setText("");
        TXT_PTSI.setText("");
        TXT_PTCI.setText("");
        TXT_INFOA.setText("");
        TXT8_FECHA.setText("");
    }//GEN-LAST:event_BT2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar__Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar__Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar__Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar__Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar__Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JSeparator SP1;
    private javax.swing.JSeparator SP2;
    private javax.swing.JSeparator SP3;
    private javax.swing.JSeparator SP6;
    private javax.swing.JSeparator SP7;
    private javax.swing.JSeparator SP8;
    private javax.swing.JSeparator SP9;
    private javax.swing.JTextField TXT1;
    private javax.swing.JTextField TXT8_FECHA;
    private javax.swing.JTextField TXT_CANTIDAD;
    private javax.swing.JTextArea TXT_INFOA;
    private javax.swing.JTextField TXT_NOMBRE;
    private javax.swing.JTextField TXT_PRECIOU;
    private javax.swing.JTextField TXT_PTCI;
    private javax.swing.JTextField TXT_PTSI;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
