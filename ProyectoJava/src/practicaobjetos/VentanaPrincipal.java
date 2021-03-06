/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobjetos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author DAVIDESPITIA
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Persona p;
    Consultas con = new Consultas();
    java.sql.Date sqldate;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANEJAR TABLA PERSONAS");

        jLabel1.setText("Tipo de Documento:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T.I.", "C.C.", "C.E." }));

        jLabel2.setText("Número de Documento:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Fecha de Nacimiento:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Importar Datos desde CSV");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exportar Datos a CSV");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Esperando Solicitud...");

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6))
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //BOTON BORRAR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jTextField1.getText().length() == 0){
            jLabel7.setText("Por favor digita el número de documento a borrar.");            
        }else{
        
            Integer numdoc = Integer.valueOf(jTextField1.getText());       

            con = new Consultas();   

            try {
                con.borrar_persona(numdoc);
                jLabel7.setText("El registro se eliminó exitosamente.");
            } catch (SQLException ex) {
                jLabel7.setText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //BOTON AÑADIR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(jTextField1.getText().length() == 0 || jTextField2.getText().length() == 0 || jTextField3.getText().length() == 0 || jTextField4.getText().length() == 0){
            jLabel7.setText("Por favor diligencia todos los campos.");
        } else {
        
            int tipodoc = jComboBox1.getSelectedIndex();
            tipodoc +=1;
            Integer numdoc = Integer.valueOf(jTextField1.getText());
            String apellidos = jTextField2.getText();
            String nombres = jTextField3.getText();
            int dia = jComboBox2.getSelectedIndex();
            dia +=2;
            int mes = jComboBox3.getSelectedIndex();
            Integer year = Integer.valueOf(jTextField4.getText())-1900;

            //------------PARTE DE FECHA--------------
            java.util.Date utildate = new java.util.Date();
            utildate.setDate(dia);
            utildate.setMonth(mes);
            utildate.setYear(year);

            sqldate = new java.sql.Date(utildate.getTime());
            //---------------------------------------------

            //----PARTE DE AGREGAR PERSONA----------------
            p = new Persona(tipodoc, numdoc, apellidos, nombres, utildate);       

            con = new Consultas();   

            try {
                con.agregarPersona(p, sqldate);
                jLabel7.setText("El registro se insertó exitosamente.");
            } catch (SQLException | ClassNotFoundException ex) {
                jLabel7.setText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //BOTON MODIFICAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(jTextField1.getText().length() == 0 || jTextField2.getText().length() == 0 || jTextField3.getText().length() == 0 || jTextField4.getText().length() == 0){
            jLabel7.setText("Por favor diligencia todos los campos.");
        } else {
        
            int tipodoc = jComboBox1.getSelectedIndex();
            tipodoc +=1; 
            Integer numdoc = Integer.valueOf(jTextField1.getText());
            String apellidos = jTextField2.getText();
            String nombres = jTextField3.getText();
            int dia = jComboBox2.getSelectedIndex();
            dia +=2;
            int mes = jComboBox3.getSelectedIndex();
            Integer year = Integer.valueOf(jTextField4.getText())-1900;

            //------------PARTE DE FECHA--------------
            java.util.Date utildate = new java.util.Date();
            utildate.setDate(dia);
            utildate.setMonth(mes);
            utildate.setYear(year);

            sqldate = new java.sql.Date(utildate.getTime());
            //---------------------------------------------

            //----PARTE DE AGREGAR PERSONA----------------
            p = new Persona(tipodoc, numdoc, apellidos, nombres, utildate);       

            con = new Consultas();   

            try {
                con.editar_persona(p, sqldate);
                jLabel7.setText("El registro se modificó exitosamente.");
            } catch (SQLException ex) {
                jLabel7.setText(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //BOTON IMPORTAR
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //----------Parte de seleccionar archivo---------------------------
        JFileChooser fc=new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CSV", "csv");
        
        fc.setFileFilter(filtro);
        
        int result = fc.showOpenDialog(this);
        
        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fc.getSelectedFile();
        //-----------------------------------------------------------
            if ((fileName == null) || (fileName.getName().equals(""))) {
                jLabel7.setText("Por favor selecciona un directorio.");
                
            }else{
                try{
                    FileReader archivo = new FileReader(fileName.getAbsolutePath());
                    
                    BufferedReader br = new BufferedReader(archivo);
                    
                    String line = br.readLine();
                    
                    while (null != line){
                        String[] campos = line.split(";");
                        campos = removeTrailingQuotes(campos);
                        
                        int tipodoc = Integer.valueOf(campos[0]);
                        int numdoc = Integer.valueOf(campos[1]);
                        String ape = campos[2];
                        String nom = campos[3];
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        Date fechan;
                        fechan = formato.parse(campos[4]);
                        Persona pe = new Persona(tipodoc, numdoc, ape, nom, fechan);
                        sqldate = new java.sql.Date(fechan.getTime());
                        System.out.println(pe.imprimirLinea());
                        con.agregarPersona(pe, sqldate);
                        
                        line = br.readLine();                      
                    }
                    jLabel7.setText("Datos Ingresados correctamente.");
                    br.close();
                    
                }catch (SQLException | IOException | ClassNotFoundException | ParseException ex) {
                    jLabel7.setText(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //BOTON EXPORTAR
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        //----------Parte de seleccionar archivo---------------------------
        JFileChooser fc=new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.CSV", "csv");
        
        fc.setFileFilter(filtro);
        
        int result = fc.showOpenDialog(this);
        
        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fc.getSelectedFile();
        //-----------------------------------------------------------
            if ((fileName == null) || (fileName.getName().equals(""))) {
                jLabel7.setText("Por favor selecciona un directorio.");
                
            }else{               
                
                ArrayList<Persona> listapersonas;               
                               
                try {                   
                    
                    FileWriter archivo;          
                    
                    if (fileName.exists()){
                        archivo = new FileWriter(fileName.getAbsolutePath());
                    } else{
                        archivo = new FileWriter(fileName.getAbsolutePath()+".csv");
                    }                   
                    
                    listapersonas = con.mostrarpersonas();                   
                    Iterator<Persona> it= listapersonas.iterator();                                   
                    
                    BufferedWriter bw;
                    bw = new BufferedWriter(archivo);
                    
                    while (it.hasNext()){
                        Persona l=it.next();
                        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(l.getFechanacimiento());                        
                        
                        bw.write(Integer.toString(l.getTipodocumento())+ ";" + Integer.toString(l.getNum_documento())+ ";" + l.getApellidos()+ ";" + l.getNombres()+ ";" + fecha);
                        bw.newLine();
                        }
                    bw.close();
                    jLabel7.setText("Datos Ingresados correctamente.");
                } catch (SQLException | IOException ex) {
                    jLabel7.setText(ex.getMessage());
                }
                
            }
        }
        
                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    public static String QUOTE="\"";
    
    private static String[] removeTrailingQuotes(String[] fields) {

      String result[] = new String[fields.length];

      for (int i=0;i<result.length;i++){
         result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
      }
      return result;
   }

}
