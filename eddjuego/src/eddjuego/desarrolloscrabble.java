/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddjuego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdom.Document;			// |
import org.jdom.Element;			// |\ Librerias
import org.jdom.JDOMException;		// |/ JDOM
import org.jdom.input.SAXBuilder;

/**
 *
 * @author Yesus
 */
public class desarrolloscrabble extends javax.swing.JFrame {

    /**
     * Creates new form desarrolloscrabble
     */
     ArrayList<String> palabrasdiccionario;
     
    JFileChooser abrir=new JFileChooser();
	JFileChooser FC_File=new JFileChooser();
        String linea;
        String x, y, x2,y2; 
        public static String dimension1;
        ArrayList<String> dimension;
        public static int valormatrizscrabble=0;
        
    public desarrolloscrabble() {
        initComponents();
        jLabel1.setText(" ");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 21));

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Cargar el Archivo para Poder jugar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jButton2.setText("Ingreso de Jugadores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jButton5.setText("Cargar Xml");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eddjuego/scrabblejugadores.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 670, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        if(jLabel1.getText()==null){
            JOptionPane.showMessageDialog(null, "debe cargar al Archivo para poder continuar");
        }
        else{
            
            Jugadores verjugador=new Jugadores();
            verjugador.setVisible(true);
            this.setVisible(false);    
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cargarxml();
        System.out.println(dimension1);
    }//GEN-LAST:event_jButton5ActionPerformed


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
            java.util.logging.Logger.getLogger(desarrolloscrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desarrolloscrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desarrolloscrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desarrolloscrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desarrolloscrabble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

public void cargarxml(){
        //parsear archivo
        palabrasdiccionario=new ArrayList<String>();
        
        this.abrir.showOpenDialog(null);
				
			File archivo = null;
      			FileReader fr = null;
                        BufferedReader br = null;

      			try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         		archivo = new File (abrir.getSelectedFile().getAbsolutePath());
         		fr = new FileReader (archivo);
         		br = new BufferedReader(fr);

         // Lectura del fichero 		
         		
            	                           
      			}
      			catch(Exception e){
         		e.printStackTrace();
      			}finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         		try{                    
            		if( null != fr ){   
               		    
            	}                  
         		}catch (Exception e2){ 
            		e2.printStackTrace();
         		}
                        jLabel1.setText("El archivo a sido Cargado con exito");
			} 
        
        
        try{
       //     String xmlScrabble=jTextArea1.getText();
            
        	SAXBuilder builder = new SAXBuilder();
                //File xmlFile = new File(archivo);
                
                //crear documento del archivo
                Document document = (Document) builder.build(archivo);
                int h=0;
                //se obtiene la raiz scrabble
                Element rootNode = document.getRootElement();
                dimension1=rootNode.getChildText("dimension");
                valormatrizscrabble=Integer.parseInt(dimension1);
        
                 
                

                
                
                
                System.out.println(dimension);
		List listdobles = rootNode.getChildren("dobles");
                        
                       for ( int i = 0; i < listdobles.size(); i++ )
			{
                            
                       Element dobles = (Element) listdobles.get(i);
                       List lista_casillas = dobles.getChildren("casilla");
                        System.out.println("SIZE CASILLAS"+lista_casillas.size());
                       for (int j=0; j<lista_casillas.size(); j++){
                           Element casilla = (Element)lista_casillas.get( j );
                            x = casilla.getChildTextTrim("x");
                            y = casilla.getChildTextTrim("y");
                           System.out.println("\t "+x);
                           System.out.println("\t "+y);
                           
                       }  
                       }
                       //se obtiene la lista de hijos  de triples
                 List listtriple = rootNode.getChildren("triples");
                        
                 for ( int k = 0; k < listtriple.size(); k++ )
			{
                            
                       Element triples = (Element) listtriple.get(k);
                       List lista_casillas2 = triples.getChildren();
                        
                       for (int l=0; l<lista_casillas2.size(); l++){
                           Element casilla = (Element)lista_casillas2.get( l );
                           x2 = casilla.getChildTextTrim("x");
                           y2 = casilla.getChildTextTrim("y");
                           System.out.println("\t "+x2);
                           System.out.println("\t "+y2);
                       }  
                       }
                List listdiccionario = rootNode.getChildren("diccionario");
                    
                         
                         for(int k=0;k<listdiccionario.size();k++){
                            Element palabras = (Element)listdiccionario.get(k);
                            List listaPalabras = palabras.getChildren("palabra");
                                for(int n=0;n<listaPalabras.size();n++){
                                Element l = (Element)listaPalabras.get(n);
                                System.out.println("PALABRA:"+l.getText());
                                palabrasdiccionario.add(l.getText());
                                
                                }
                         }
                         
                         System.out.println(palabrasdiccionario.get(1));
    }
        catch ( IOException io ) {
			System.out.println( io.getMessage() );
		}catch ( JDOMException jdomex ) {
			System.out.println( jdomex.getMessage() );
		}
                
    }

}