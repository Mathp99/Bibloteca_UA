package vista;

import getset.gsUsuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;
import modelo.modUsuario;

/**
 *
 * @author EVA Tester
 */
public class frmUsuario extends javax.swing.JFrame {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    String sSQL = "";

    public frmUsuario() {
        initComponents();
        mostrar("");
        vaciarCampos();
        centrarFormulario();
    }
    private String accion = "guardar";

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            modUsuario func = new modUsuario();
            modelo = func.mostrar(buscar);
            tablaUsuario.setModel(modelo);
            lbltotalregistros.setText("Total Registros " + func.totalregistros);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    void centrarFormulario() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsup = new javax.swing.JPanel();
        lblTituloForm = new javax.swing.JLabel();
        panelcentro = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        lblIDUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        scrollPanel = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        lbltotalregistros = new javax.swing.JLabel();
        txtContrasenha = new javax.swing.JTextField();
        lblContrasenha = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFormularios = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemAutores = new javax.swing.JMenuItem();
        jMenuItemGeneros = new javax.swing.JMenuItem();
        jMenuItemEditoriales = new javax.swing.JMenuItem();
        jMenuItemPrestamos = new javax.swing.JMenuItem();
        jMenuLogin = new javax.swing.JMenu();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE INFORMACIÓN DE USUARIOS");
        setResizable(false);

        panelsup.setBackground(new java.awt.Color(250, 147, 8));

        lblTituloForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloForm.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloForm.setText("Registro de Información de Usuarios");

        panelcentro.setBackground(new java.awt.Color(45, 62, 82));

        btnRegistrar.setBackground(new java.awt.Color(52, 176, 240));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(52, 176, 240));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(253, 50, 36));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(52, 176, 240));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblIDUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIDUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblIDUsuario.setText("ID Usuario");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");

        txtIDUsuario.setBackground(new java.awt.Color(109, 125, 140));
        txtIDUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIDUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtIDUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUsuarioActionPerformed(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(109, 125, 140));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        tablaUsuario.setBackground(new java.awt.Color(109, 125, 140));
        tablaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Usuario", "Usuario", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        scrollPanel.setViewportView(tablaUsuario);

        lbltotalregistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltotalregistros.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalregistros.setText("Total Registros");

        txtContrasenha.setBackground(new java.awt.Color(109, 125, 140));
        txtContrasenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContrasenha.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtContrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenhaActionPerformed(evt);
            }
        });

        lblContrasenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblContrasenha.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenha.setText("Contraseña");

        javax.swing.GroupLayout panelcentroLayout = new javax.swing.GroupLayout(panelcentro);
        panelcentro.setLayout(panelcentroLayout);
        panelcentroLayout.setHorizontalGroup(
            panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(panelcentroLayout.createSequentialGroup()
                        .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIDUsuario)
                            .addComponent(lblUsuario)
                            .addComponent(lblContrasenha))
                        .addGap(18, 18, 18)
                        .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtIDUsuario)
                            .addComponent(txtContrasenha, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelcentroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(138, 138, 138))
        );
        panelcentroLayout.setVerticalGroup(
            panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelcentroLayout.createSequentialGroup()
                        .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelcentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelcentroLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelsupLayout = new javax.swing.GroupLayout(panelsup);
        panelsup.setLayout(panelsupLayout);
        panelsupLayout.setHorizontalGroup(
            panelsupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelcentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelsupLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTituloForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelsupLayout.setVerticalGroup(
            panelsupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsupLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTituloForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelcentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuFormularios.setText("Formularios");

        jMenuItemUsuarios.setText("Libros");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemUsuarios);

        jMenuItemAutores.setText("Autores");
        jMenuItemAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAutoresActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemAutores);

        jMenuItemGeneros.setText("Géneros");
        jMenuItemGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGenerosActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemGeneros);

        jMenuItemEditoriales.setText("Editoriales");
        jMenuItemEditoriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditorialesActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemEditoriales);

        jMenuItemPrestamos.setText("Prestamos");
        jMenuItemPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPrestamosActionPerformed(evt);
            }
        });
        jMenuFormularios.add(jMenuItemPrestamos);

        jMenuBar.add(jMenuFormularios);

        jMenuLogin.setText("Login");

        jMenuItemCerrarSesion.setText("Cerrar Sesión");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuItemCerrarSesion);

        jMenuBar.add(jMenuLogin);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vaciarCampos() {
        txtIDUsuario.setText("");
        txtUsuario.setText("");
        txtContrasenha.setText("");
    }

    private void jMenuItemAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAutoresActionPerformed
        this.setVisible(false);
        frmAutor nuevoform = new frmAutor();
        nuevoform.setVisible(true);
    }//GEN-LAST:event_jMenuItemAutoresActionPerformed

    private void jMenuItemEditorialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditorialesActionPerformed
        this.setVisible(false);
        frmEditorial nuevoform = new frmEditorial();
        nuevoform.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditorialesActionPerformed

    private void jMenuItemGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGenerosActionPerformed
        this.setVisible(false);
        frmGenero nuevoform = new frmGenero();
        nuevoform.setVisible(true);
    }//GEN-LAST:event_jMenuItemGenerosActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        this.setVisible(false);
        frmLibro nuevoform = new frmLibro();
        nuevoform.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed
        this.setVisible(false);
        frmLogin nuevoform = new frmLogin();
        nuevoform.setVisible(true);
    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        gsUsuario dts = new gsUsuario();
        modUsuario func = new modUsuario();

        int idusuario = Integer.parseInt(txtIDUsuario.getText());
        dts.setIdUsuario(idusuario);
        dts.setUsuario(txtUsuario.getText());
        dts.setContrasenha(txtContrasenha.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "Registo exitoso");
                vaciarCampos();
                mostrar("");
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        /*if (!txtIDUsuario.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Editar el registro?", "Confirmar", 2);

            if (confirmacion == 0) {
                modUsuario func = new modUsuario();
                gsUsuario dts = new gsUsuario();

                int idusuario = Integer.parseInt(txtIDUsuario.getText());
                dts.setIdUsuario(idusuario);
                func.editar(dts);
                mostrar("");
            }
        }*/
        try {
            String idusuario = txtIDUsuario.getText();
            String usuario = txtUsuario.getText();
            String contrasenha = txtContrasenha.getText();

            sSQL = "update usuario set idUsuario='" + idusuario + "', nombreUsuario='" + usuario + "', contrasenha='" + contrasenha + "' where idUsuario='" + idusuario + "'";

            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.execute();

            JOptionPane.showMessageDialog(rootPane, "Registo editado");
            vaciarCampos();
            mostrar("");
            accion = "guardar";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtIDUsuario.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Eliminar el registro?", "Confirmar", 2);

            if (confirmacion == 0) {
                modUsuario func = new modUsuario();
                gsUsuario dts = new gsUsuario();

                dts.setIdUsuario(Integer.parseInt(txtIDUsuario.getText()));
                func.eliminar(dts);
                vaciarCampos();
                mostrar("");
                accion = "guardar";
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        vaciarCampos();
        accion = "guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        accion = "editar";

        int fila = tablaUsuario.rowAtPoint(evt.getPoint());
        txtIDUsuario.setText(tablaUsuario.getValueAt(fila, 0).toString());
        txtUsuario.setText(tablaUsuario.getValueAt(fila, 1).toString());
        txtContrasenha.setText(tablaUsuario.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tablaUsuarioMouseClicked

    private void txtContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenhaActionPerformed

    private void jMenuItemPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPrestamosActionPerformed
        this.setVisible(false);
        frmPrestamos nuevoform = new frmPrestamos();
        nuevoform.setVisible(true);
    }//GEN-LAST:event_jMenuItemPrestamosActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFormularios;
    private javax.swing.JMenuItem jMenuItemAutores;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemEditoriales;
    private javax.swing.JMenuItem jMenuItemGeneros;
    private javax.swing.JMenuItem jMenuItemPrestamos;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JLabel lblContrasenha;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JPanel panelcentro;
    private javax.swing.JPanel panelsup;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tablaUsuario;
    public javax.swing.JTextField txtContrasenha;
    public javax.swing.JTextField txtIDUsuario;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
