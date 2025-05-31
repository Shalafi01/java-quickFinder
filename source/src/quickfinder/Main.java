package quickfinder;

import java.io.File;
import static java.lang.Math.max;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class Main extends javax.swing.JFrame {

    File[] files;
    File percorso1;
    File percorso2;
    SortedSet<String> cartella1 = new TreeSet<>();
    SortedSet<String> cartella2 = new TreeSet<>();
    int trovati1=0, trovati2=0;
        
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBrowse1 = new javax.swing.JButton();
        jBrowse2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jArea1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jArea2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRefresh = new javax.swing.JButton();
        jTrovati1 = new javax.swing.JLabel();
        jTrovati2 = new javax.swing.JLabel();
        jMancanti1 = new javax.swing.JLabel();
        jMancanti2 = new javax.swing.JLabel();
        jMissing = new javax.swing.JButton();
        jInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Percorso:");

        jBrowse1.setText("Sfoglia...");
        jBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowse1ActionPerformed(evt);
            }
        });

        jBrowse2.setText("Sfoglia...");
        jBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowse2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Percorso:");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jArea1.setViewportView(jTextArea2);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jArea2.setViewportView(jTextArea1);

        jLabel3.setText("File che mancano nella seconda cartella");

        jLabel4.setText("File che mancano nella prima cartella:");

        jRefresh.setText("Aggiorna");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });

        jTrovati1.setText("Trovati: ");

        jTrovati2.setText("Trovati: ");

        jMancanti1.setText("Mancanti: ");

        jMancanti2.setText("Mancanti: ");

        jMissing.setText("Cerca mancanti");
        jMissing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMissingActionPerformed(evt);
            }
        });

        jInfo.setText("Info");
        jInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBrowse1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jMissing))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jTrovati1)
                            .addComponent(jMancanti1))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMancanti2)
                            .addComponent(jTrovati2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jBrowse2)
                            .addComponent(jArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRefresh)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBrowse1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBrowse2)
                            .addComponent(jMissing))))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTrovati2)
                    .addComponent(jTrovati1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMancanti1)
                    .addComponent(jMancanti2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRefresh)
                    .addComponent(jInfo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowse1ActionPerformed
        cartella1.clear();
        percorso1 = sfoglia(jTextArea1, trovati1, cartella1, cartella2, percorso1, jLabel1);
    }//GEN-LAST:event_jBrowse1ActionPerformed

    private void jBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowse2ActionPerformed
        cartella2.clear();
        percorso2 = sfoglia(jTextArea2, trovati2, cartella2, cartella1, percorso2, jLabel2);
    }//GEN-LAST:event_jBrowse2ActionPerformed

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshActionPerformed
        cartella1.clear();
        cartella2.clear();
        trovati1 = carica(percorso1, trovati1, cartella1);
        trovati2 = carica(percorso2, trovati2, cartella2);
        aggiorna(jTextArea1, cartella1, cartella2);
        aggiorna(jTextArea2, cartella2, cartella1);
        
        jTrovati1.setText("Trovati: "+trovati1);
        jTrovati2.setText("Trovati: "+trovati2);
        jMancanti1.setText("Mancanti: "+max((trovati1 - trovati2), 0));
        jMancanti2.setText("Mancanti: "+max((trovati2 - trovati1), 0));
        
        for (String s:cartella1)
            System.out.println(s);
    }//GEN-LAST:event_jRefreshActionPerformed

    private void jMissingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMissingActionPerformed
        
        String[] sequenza = new String[cartella1.size()];  
        int[] sequenzaInt = new int[cartella1.size()]; 
        List<Integer> missing = new ArrayList<>(); 
        
        int i=0;
        for(String s : cartella1) {            
            sequenza[i] = s;
            i++;
        }   
        
        int j=0;
        for(String s:sequenza) {
            sequenzaInt[j] = estraiNumero(s);
            j++;
        }
        
        int c=0;        //indice sfasato in caso di mancante
        for(int k=0; k<sequenzaInt.length; k++) {
            if(sequenzaInt[k] != c) {            
                missing.add(sequenzaInt[k]-1); 
                c++;
            }
            c++;
        }             
        
        JOptionPane.showMessageDialog(null, missing, "Mancanti: ", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jMissingActionPerformed

    private void jInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInfoActionPerformed
        String msg = "Indicate due cartelle, verrà fatto un elenco di quali file mancano nell'altra cartella. \n"
                + "Viene ignorato ciò che viene dopo un \".\" e ciò che viene prima di \"-\"\n\n"
                + "La funzione trova mancanti funziona con i nomi che includono un numero (solo prima cartella) e trova quelli mancanti";
        JOptionPane.showMessageDialog(null, msg, "Informazioni", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jInfoActionPerformed

    public static int estraiNumero(String input) {
        try {
            StringBuilder numero = new StringBuilder();

            for (char carattere : input.toCharArray()) 
                if (carattere >= '0' && carattere <= '9') 
                    numero.append(carattere);
            
            int c = Integer.parseInt(numero.toString());  
            return c;
            
        } catch (Exception e) {}
        System.out.println("Err");
        return 0;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
             
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
    
    public File sfoglia(JTextArea area, int trovati, SortedSet<String>  cartella, SortedSet<String>  altraCartella, File percorso, JLabel jPercorso) {  
        File directory;                                 //QUI cartella iniziale
        directory = new File("E:\\Download");
        //directory = new File(System.getProperty("user.home") + "/Desktop");
        
        JFileChooser chooser = new JFileChooser();        
        chooser.setCurrentDirectory(directory);
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int result = chooser.showOpenDialog(this);        
        if (result == JFileChooser.APPROVE_OPTION) {
            percorso = chooser.getSelectedFile();
            carica(percorso, trovati, cartella);
            jPercorso.setText("Percorso: " + chooser.getSelectedFile().toString());
        }
        
        aggiorna(area, cartella, altraCartella);
        return percorso;        
    }
    
    public int carica(File percorso, int trovati, SortedSet<String>  cartella){
        try{
            files = percorso.listFiles();             
            trovati = files.length;

            int i = 0;
            for (File f : files) {
                cartella.add(f.getName());
                i++;
            }        
            noEstensioni(cartella);
            
            return trovati;
        } catch(NullPointerException e){return 0;}        
    }
    
    public void noEstensioni(SortedSet<String> cartella) {
        SortedSet<String> noEstensioni = new TreeSet<>();
        
        for (String s : cartella) {
            if (s.contains(".")) 
                s = s.substring(0, s.indexOf('.'));
            if (s.contains("-")) 
                s = s.substring(s.indexOf('-')+2);
            noEstensioni.add(s);
        }

        cartella.clear();
        cartella.addAll(noEstensioni);
    }
    
    public void aggiorna(JTextArea area, SortedSet<String> cartella, SortedSet<String>  altraCartella) {
        area.setText("");
        SortedSet<String> text = new TreeSet<>();
        boolean c = false;
        
        for(String s : cartella) {
            for(String k : altraCartella)            
                if(k.toLowerCase().contains(s.toLowerCase()))
                    c=true;
            if(c == false)
                text.add(s);
            c = false;
        }   
        
        for(String s : text)
            area.setText(area.getText()+s+"\n");       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jArea1;
    private javax.swing.JScrollPane jArea2;
    private javax.swing.JButton jBrowse1;
    private javax.swing.JButton jBrowse2;
    private javax.swing.JButton jInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMancanti1;
    private javax.swing.JLabel jMancanti2;
    private javax.swing.JButton jMissing;
    private javax.swing.JButton jRefresh;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel jTrovati1;
    private javax.swing.JLabel jTrovati2;
    // End of variables declaration//GEN-END:variables
}
