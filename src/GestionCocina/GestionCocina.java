
package GestionCocina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GestionCocina extends javax.swing.JFrame {

    /**
     * Creates new form GestionCocina
     */
    public GestionCocina() {
        
     // Configuración de la ventana
        setTitle("Gestión de Cocina");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar solo esta ventana
        setLocationRelativeTo(null); // Centrar la ventana
        
        
         // Crear contenedor principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);
        
         // Agregar el título
        JLabel titulo = new JLabel("Gestión de Cocina", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titulo, BorderLayout.NORTH);
        
        
         // Crear un panel para los botones principales
        JPanel contenidoPanel = new JPanel();
        contenidoPanel.setLayout(new GridLayout(3, 1, 10, 10));
        panel.add(contenidoPanel, BorderLayout.CENTER);
        
        
         // Botones de funcionalidad
        JButton btnAdminInventario = new JButton("Ver Inventario");
        JButton btnIncluirTrabajador = new JButton("Incluir Trabajador");
        JButton btnExcluirTrabajador = new JButton("Excluir Trabajador");
        JButton btnModificarInventario = new JButton("Modificar Inventario");
        
       btnAdminInventario.setFont(new Font("Arial", Font.PLAIN, 18));
        btnIncluirTrabajador.setFont(new Font("Arial", Font.PLAIN, 18));
        btnExcluirTrabajador.setFont(new Font("Arial", Font.PLAIN, 18)); 
          btnModificarInventario.setFont(new Font("Arial", Font.PLAIN, 18)); 
        
        
        contenidoPanel.add(btnAdminInventario);
        contenidoPanel.add(btnIncluirTrabajador);
        contenidoPanel.add(btnExcluirTrabajador); 
        contenidoPanel.add(btnModificarInventario); 
        
      // Botón para regresar al menú principal
        JButton btnRegresar = new JButton("Regresar al Menú Principal");
        btnRegresar.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(btnRegresar, BorderLayout.SOUTH);
        
        
    btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra esta ventana
            }
        });

        setVisible(true); // Mostrar la ventana
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCocina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
