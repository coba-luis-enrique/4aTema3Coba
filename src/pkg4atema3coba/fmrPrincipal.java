/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4atema3coba;
import pkg4atema3coba.obtenerDeterminante;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cobak
 */
public class fmrPrincipal extends javax.swing.JFrame {
    private String resultUno;
    obtenerDeterminante mat = new obtenerDeterminante();
    /**
     * Creates new form fmrPrincipal
     */
    public fmrPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(777,420);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tlbMatrizUno = new javax.swing.JTable();
        txtN = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        txtD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tlbMatriz = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tlbMatrizUno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tlbMatrizUno);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(429, 100, 320, 240);
        getContentPane().add(txtN);
        txtN.setBounds(330, 30, 120, 30);

        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerar.setText("GENERAR MATRIZ");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar);
        btnGenerar.setBounds(310, 70, 150, 23);
        getContentPane().add(txtD);
        txtD.setBounds(530, 350, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAMAÑO DE LA MATRIZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 145, 15);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DETERMINANTE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 360, 100, 20);

        tlbMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tlbMatriz);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 100, 330, 240);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MATRIZ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 80, 50, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MATRIZ INVERSA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 80, 100, 14);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vladstudio.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 770, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        int n= Integer.parseInt(txtN.getText());
        double [][] c= mat.matrizEspiral(n);
        double determinate= mat.Determinante(0, c); //calculando la determinate
        double[][]MatAdjunta=mat.AdjuntaMatriz(c);
        double[][]MatTrans=mat.TransouestaMatriz(MatAdjunta);
        double [][]Inversa=mat.inversaMatriz(MatTrans, determinate);
        resultUno=String.valueOf(determinate);
        txtD.setText(resultUno);
        
        this.mostrarMatriz(c, n);
        this.mostrarMatrizUno(Inversa,n);
        this.mostrarMatriz(c, n);
    }//GEN-LAST:event_btnGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrPrincipal().setVisible(true);
            }
        });
    }
    
public void mostrarMatrizUno(double matriz[][],int n){
DefaultTableModel model = (DefaultTableModel)tlbMatrizUno.getModel();
model.setRowCount(n);
model.setColumnCount(n);
for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
    tlbMatrizUno.setValueAt(matriz[i][j],i,j);
    }
}
}    


public void mostrarMatriz(double matriz[][],int n){
DefaultTableModel model = (DefaultTableModel)tlbMatriz.getModel();
model.setRowCount(n);
model.setColumnCount(n);
for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
    tlbMatriz.setValueAt(matriz[i][j],i,j);
    }
}
}   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tlbMatriz;
    private javax.swing.JTable tlbMatrizUno;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
