
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.opcion;
import THlogica.opciones;
import custom.MyButton;
import custom.MySpinner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import raven.GlassPanePopup;

public class CrearOpc extends javax.swing.JPanel {
    
    
    private int round = 25;
    public opciones variable;
    public VentanaPrincipal padre;
    
    public String label = "none";
    public CrearOpc(boolean first) {
        initComponents();
        
        
        if (!first){
            this.labl.setVisible(false);
            this.LabelTxt.setEnabled(false);
            this.LabelTxt.setVisible(false);
        }
        
    }

    public void setPadre(VentanaPrincipal padre) {
        this.padre = padre;
        
    }

    public opciones getVariable() {
        return variable;
    }

    public void setVariable(opciones variable) {
        this.variable = variable;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        labl = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cancelar = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        BTSALI = new custom.MyButton();
        BTENTRA = new custom.MyButton();
        comboEstudio2 = new javax.swing.JComboBox<>();
        HSALI = new custom.MySpinner();
        ELDIA = new custom.MySpinnerDia();
        HENTRA = new custom.MySpinner();
        Cancelar1 = new javax.swing.JLabel();
        Cancelar2 = new javax.swing.JLabel();
        mds = new custom.TextFieldd();
        md = new custom.TextFieldd();
        LabelTxt = new custom.TextFieldd();
        Dia1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(176, 235, 176));
        setOpaque(false);

        bg.setBackground(new java.awt.Color(169, 209, 142));
        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setOpaque(false);
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bgMouseMoved(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bgMouseExited(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO OPCION");
        bg.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        labl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        labl.setForeground(new java.awt.Color(255, 255, 255));
        labl.setText("Etiqueta:");
        bg.add(labl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        Salida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Salida.setForeground(new java.awt.Color(255, 255, 255));
        Salida.setText("Salida");
        bg.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 350, 10));

        Cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancelar.setText(":");
        bg.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 10, -1));

        cancelar.setBackground(new java.awt.Color(141, 196, 162));
        cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.setFocusPainted(false);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        bg.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 30));

        guardar.setBackground(new java.awt.Color(141, 196, 162));
        guardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setFocusPainted(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        bg.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        BTSALI.setBackground(new java.awt.Color(101, 163, 130));
        BTSALI.setBorder(null);
        BTSALI.setForeground(new java.awt.Color(255, 255, 255));
        BTSALI.setText("PM");
        BTSALI.setBorderColor(new java.awt.Color(101, 163, 130));
        BTSALI.setBorderPainted(false);
        BTSALI.setColor(new java.awt.Color(101, 163, 130));
        BTSALI.setColorClick(new java.awt.Color(101, 163, 130));
        BTSALI.setColorOver(new java.awt.Color(101, 163, 130));
        BTSALI.setFocusPainted(false);
        BTSALI.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        BTSALI.setRadius(20);
        BTSALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSALIActionPerformed(evt);
            }
        });
        bg.add(BTSALI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 20));

        BTENTRA.setBackground(new java.awt.Color(153, 195, 172));
        BTENTRA.setBorder(null);
        BTENTRA.setForeground(new java.awt.Color(255, 255, 255));
        BTENTRA.setText("AM");
        BTENTRA.setBorderColor(new java.awt.Color(153, 195, 172));
        BTENTRA.setBorderPainted(false);
        BTENTRA.setColor(new java.awt.Color(153, 195, 172));
        BTENTRA.setColorClick(new java.awt.Color(153, 195, 172));
        BTENTRA.setColorOver(new java.awt.Color(153, 195, 172));
        BTENTRA.setFocusPainted(false);
        BTENTRA.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        BTENTRA.setRadius(20);
        BTENTRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTENTRAActionPerformed(evt);
            }
        });
        bg.add(BTENTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 60, 20));

        comboEstudio2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 18)); // NOI18N
        comboEstudio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Primaria", "Bachiller", "Técnico", "Pregrado", "Especialista", "Magister", "Doctorado" }));
        bg.add(comboEstudio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, -1));

        HSALI.setForeground(new java.awt.Color(127, 127, 127));
        HSALI.setBtnBack(new java.awt.Color(153, 195, 172));
        HSALI.setMaxVal(9);
        HSALI.setTxtFore(new java.awt.Color(102, 102, 102));
        HSALI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HSALIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HSALIMouseEntered(evt);
            }
        });
        HSALI.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HSALIPropertyChange(evt);
            }
        });
        bg.add(HSALI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        ELDIA.setForeground(new java.awt.Color(127, 127, 127));
        ELDIA.setBtnBack(new java.awt.Color(153, 195, 172));
        ELDIA.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ELDIA.setTxtBack(new java.awt.Color(204, 255, 204));
        ELDIA.setTxtFore(new java.awt.Color(102, 102, 102));
        bg.add(ELDIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, -1));

        HENTRA.setForeground(new java.awt.Color(127, 127, 127));
        HENTRA.setBtnBack(new java.awt.Color(153, 195, 172));
        HENTRA.setMinVal(6);
        HENTRA.setTxtFore(new java.awt.Color(102, 102, 102));
        HENTRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HENTRAMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HENTRAMousePressed(evt);
            }
        });
        HENTRA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HENTRAPropertyChange(evt);
            }
        });
        bg.add(HENTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        Cancelar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar1.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar1.setText("Entrada");
        bg.add(Cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, -1));

        Cancelar2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar2.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancelar2.setText(":");
        bg.add(Cancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 10, -1));

        mds.setBorder(null);
        mds.setForeground(new java.awt.Color(102, 102, 102));
        mds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mds.setText("00");
        mds.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bg.add(mds, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 20));

        md.setBorder(null);
        md.setForeground(new java.awt.Color(102, 102, 102));
        md.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        md.setText("00");
        md.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdActionPerformed(evt);
            }
        });
        bg.add(md, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 50, 20));

        LabelTxt.setBorder(null);
        LabelTxt.setForeground(new java.awt.Color(102, 102, 102));
        LabelTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LabelTxt.setText("none");
        LabelTxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        LabelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelTxtActionPerformed(evt);
            }
        });
        bg.add(LabelTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 200, 20));

        Dia1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia1.setForeground(new java.awt.Color(255, 255, 255));
        Dia1.setText("Dia");
        bg.add(Dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       if (padre.creada == null) return;
       
       int enplus = (BTENTRA.getText().equals("PM"))?12:0;
       int saplus = (BTSALI.getText().equals("PM"))?12:0;
       this.label = this.LabelTxt.getText();
       
       
        if (!padre.creada.creardia(ELDIA.getValue(), HENTRA.getValue()+enplus, HSALI.getValue()+saplus, Integer.parseInt(md.getText()), Integer.parseInt(mds.getText()))) {
            
            return;
        }
        
        if (!label.equalsIgnoreCase("none")) padre.creada.Label = label;
        
       GlassPanePopup.closePopupLast();
        if (padre.creada.ndias == padre.creada.numdis) {
            padre.CrearOpcion();
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        salir();  
    }//GEN-LAST:event_cancelarActionPerformed
    
    
    private void salir(){
        padre.creada = null;
        padre.iscreada = false;
        GlassPanePopup.closePopupAll(); 
    }
    
    
    private void BTSALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSALIActionPerformed

        CambiarJornada(BTSALI, HSALI);
        
    }//GEN-LAST:event_BTSALIActionPerformed
    
    public void CambiarJornada(MyButton but, MySpinner spi){
        cmbiarM(but);
        if (but.getText().equals("PM")) {
            spi.setMaxVal(9);
            spi.setMinVal(1);
        } else {
            spi.setMaxVal(12);
            spi.setMinVal(6);
        }
        
        
        ActualizarRange();
    }
    
    
    private void BTENTRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTENTRAActionPerformed

        CambiarJornada(BTENTRA, HENTRA);
    }//GEN-LAST:event_BTENTRAActionPerformed

    private void bgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseMoved
        ActualizarRange();
        if (padre.creada == null) salir();
    }//GEN-LAST:event_bgMouseMoved

    private void bgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseExited
        if (padre.creada == null) salir();
    }//GEN-LAST:event_bgMouseExited

    private void HSALIPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HSALIPropertyChange

    }//GEN-LAST:event_HSALIPropertyChange
    
    
    public void ActualizarRange(){
        if (BTENTRA.getText().equals("PM") && BTSALI.getText().equals("AM")) {
            BTENTRA.doClick();
        }
        if (BTENTRA.getText().equals(BTSALI.getText()) && HSALI.getValue() < HENTRA.getValue()) {
            HENTRA.setValue(HSALI.getValue());
        }
        
        if (BTENTRA.getText().equals(BTSALI.getText())) {
            HSALI.setMinVal(HENTRA.getValue());
            HENTRA.setMaxVal(HSALI.getValue());
        }
    }
    
    private void HSALIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HSALIMouseClicked
        
    }//GEN-LAST:event_HSALIMouseClicked

    private void HSALIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HSALIMouseEntered

    }//GEN-LAST:event_HSALIMouseEntered

    private void HENTRAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HENTRAMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_HENTRAMouseEntered

    private void HENTRAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HENTRAMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_HENTRAMousePressed

    private void HENTRAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HENTRAPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_HENTRAPropertyChange

    private void mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdActionPerformed

    private void LabelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelTxtActionPerformed
    
    
    public void cmbiarM(custom.MyButton boton){
        if (boton.getText().equals("AM")){
            boton.setText("PM");
            boton.setBackground(new Color(101,163,130));
            boton.setBorderColor(new Color(101,163,130));
            boton.setColor(new Color(101,163,130));
            boton.setColorClick(new Color(101,163,130));
            boton.setColorOver(new Color(101,163,130));
        } else{
            boton.setText("AM");
            boton.setBackground(new Color(153,195,172));
            boton.setBorderColor(new Color(153,195,172));
            boton.setColor(new Color(153,195,172));
            boton.setColorClick(new Color(153,195,172));
            boton.setColorOver(new Color(153,195,172));
        }
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="REDONDEADO UWU">      
    @Override
    protected void paintComponent(Graphics grphcs) {
        this.setOpaque(false);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(bg.getBackground());
        Area area = new Area(createRoundTopLeft());
        if (round > 0) {
            area.intersect(new Area(createRoundTopRight()));
        }
        if (round > 0) {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (round > 0) {
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    private Shape createRoundTopLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundTopRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }// </editor-fold> 
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.MyButton BTENTRA;
    private custom.MyButton BTSALI;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel Cancelar1;
    private javax.swing.JLabel Cancelar2;
    private javax.swing.JLabel Dia1;
    private custom.MySpinnerDia ELDIA;
    private custom.MySpinner HENTRA;
    private custom.MySpinner HSALI;
    private custom.TextFieldd LabelTxt;
    private javax.swing.JLabel Salida;
    private javax.swing.JPanel bg;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> comboEstudio2;
    private javax.swing.JLabel creandog;
    private javax.swing.JButton guardar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labl;
    private custom.TextFieldd md;
    private custom.TextFieldd mds;
    // End of variables declaration//GEN-END:variables
}
