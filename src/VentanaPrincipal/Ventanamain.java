
package VentanaPrincipal;

import GestionCocina.GestionCocina;
import VentanaGestionMesas.VentanaGestionMesas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventanamain extends javax.swing.JFrame {

    
    public Ventanamain() {
        
        // Configurar la ventana principal
        setTitle("Sistema de Gestion de Restaurante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear el contenedor principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        // Agregar el título
        JLabel titulo = new JLabel("Menu Principal", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24)); // Letras grandes
        panel.add(titulo, BorderLayout.NORTH);

        // Crear el panel para los botones
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new GridLayout(2, 1, 10, 10)); // 2 filas, 1 columna, espacio entre botones

        // Botón Gestión de Mesas
        JButton btnGestionMesas = new JButton("Gestion de Mesas");
        btnGestionMesas.setFont(new Font("Arial", Font.PLAIN, 18)); // Letras más grandes
        botonesPanel.add(btnGestionMesas);

        // Botón Gestión de Cocina
        JButton btnGestionCocina = new JButton("Gestion de Cocina");
        btnGestionCocina.setFont(new Font("Arial", Font.PLAIN, 18));
        botonesPanel.add(btnGestionCocina);
        
        
       btnGestionCocina.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        new GestionCocina(); // Abre la ventana de Gestión de Cocina
    }
}); 
        
        
        
        

        // Agregar los botones al panel principal
        panel.add(botonesPanel, BorderLayout.CENTER);

        // Acción para abrir la ventana de Gestión de Mesas
        btnGestionMesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaGestionMesas(); // Abre la ventana de Gestión de Mesas
            }
        });

        // Acción para abrir la ventana de Gestión de Cocina
        btnGestionCocina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GestionCocina(); // Abre la ventana de Gestión de Cocina
            }
        });

        setVisible(true); // Mostrar la ventana
    

        
        
        
        initComponents();
    }

   
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
            java.util.logging.Logger.getLogger(Ventanamain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanamain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanamain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanamain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanamain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
