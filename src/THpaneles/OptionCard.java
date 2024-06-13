/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package THpaneles;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import THVentanas.VentanaPrincipal;
import THlogica.dia;
import THlogica.opcion;
import THlogica.opciones;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class OptionCard extends javax.swing.JPanel {
    
    public static int[][] hour = {{255,255,204},{255,238,185},{255,222,189},{173,193,229},{115,123,199},{47,85,151}};
    
    private int[] He = {2,0,0};
    private int[] Hs = {5,0,0};
    private int[] day = {0,0,0};
    private int[] md = {0,0,0};
    private int[] mds = {0,0,0};
    
    
    private int days = 3;
    
    private VentanaPrincipal ventana;
    private opcion thisOpcion;
    private opciones thisOpciones;

    
    private boolean chosen = false;
    
    
    public OptionCard(opcion thisOpcion, opciones thisOpciones, VentanaPrincipal ventana) {
        initComponents();
        this.setThisOpciones(thisOpciones);
        this.setVentana(ventana);
        this.setThisOpcion(thisOpcion);
        
        this.del.setVisible(false);
        if (thisOpcion.Label.equalsIgnoreCase("none")){
            this.point.setVisible(false);
        }
    }
    
    
    public void SetColors(){
        DATA1.setForeground(ventana.colores.DarkText);
        DATA2.setForeground(ventana.colores.DarkText);
        DATA.setForeground(ventana.colores.DarkText);
        
        DAY1.setBackground(ventana.colores.DisPane);
        DAY2.setBackground(ventana.colores.DisPane);
        DAY3.setBackground(ventana.colores.DisPane);
        
        del.setForeground(ventana.colores.DarkerText);
    }
    
    
    
    public static Color Hourcolor(int hourr){
        
        int colou = 0;
        if (hourr >= 6 && hourr <= 8) {
            colou = 0;
        } else if (hourr >= 9 && hourr <= 11) {
            colou = 1;
        } else if (hourr >= 12 && hourr <= 14) {
            colou = 2;
        } else if (hourr >= 15 && hourr <= 16) {
            colou = 3;
        } else if (hourr >= 17 && hourr <= 19) {
            colou = 4;
        } else{
            colou = 5;
        }
        
        Color colo = new Color(hour[colou][0],hour[colou][1],hour[colou][2]);
        return colo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        del = new javax.swing.JButton();
        DAYS = new javax.swing.JPanel();
        DAY3 = new javax.swing.JPanel();
        sun2 = new javax.swing.JLabel();
        DATA2 = new javax.swing.JLabel();
        DAY2 = new javax.swing.JPanel();
        DATA1 = new javax.swing.JLabel();
        sun1 = new javax.swing.JLabel();
        DAY1 = new javax.swing.JPanel();
        sun = new javax.swing.JLabel();
        DATA = new javax.swing.JLabel();
        point = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);

        del.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        del.setForeground(new java.awt.Color(102, 102, 102));
        del.setText("x");
        del.setBorder(null);
        del.setBorderPainted(false);
        del.setContentAreaFilled(false);
        del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        del.setEnabled(false);
        del.setFocusPainted(false);
        del.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        add(del);
        del.setBounds(150, -2, 29, 30);

        DAYS.setPreferredSize(new java.awt.Dimension(0, 0));

        DAY3.setBackground(new java.awt.Color(255, 255, 255));
        DAY3.setLayout(null);

        sun2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 65)); // NOI18N
        sun2.setForeground(new java.awt.Color(47, 85, 151));
        sun2.setText("•");
        sun2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sun2ComponentMoved(evt);
            }
        });
        DAY3.add(sun2);
        sun2.setBounds(153, -26, 30, 80);

        DATA2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        DATA2.setForeground(new java.awt.Color(102, 102, 102));
        DATA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DATA2.setText("Jue   12:00 AM - 2:00 PM");
        DAY3.add(DATA2);
        DATA2.setBounds(13, 8, 140, 14);

        DAY2.setBackground(new java.awt.Color(255, 255, 255));
        DAY2.setLayout(null);

        DATA1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        DATA1.setForeground(new java.awt.Color(102, 102, 102));
        DATA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DATA1.setText("Jue   12:00 AM - 2:00 PM");
        DAY2.add(DATA1);
        DATA1.setBounds(13, 8, 140, 14);

        sun1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 65)); // NOI18N
        sun1.setForeground(new java.awt.Color(47, 85, 151));
        sun1.setText("•");
        sun1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sun1ComponentMoved(evt);
            }
        });
        DAY2.add(sun1);
        sun1.setBounds(153, -26, 30, 80);

        DAY1.setBackground(new java.awt.Color(245, 245, 245));
        DAY1.setLayout(null);

        sun.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 65)); // NOI18N
        sun.setForeground(new java.awt.Color(47, 85, 151));
        sun.setText("•");
        sun.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sunComponentMoved(evt);
            }
        });
        DAY1.add(sun);
        sun.setBounds(153, -26, 30, 80);

        DATA.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        DATA.setForeground(new java.awt.Color(102, 102, 102));
        DATA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DATA.setText("Jue   12:00 AM - 2:00 PM");
        DAY1.add(DATA);
        DATA.setBounds(13, 8, 140, 14);

        point.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 65)); // NOI18N
        point.setForeground(new java.awt.Color(153, 255, 153));
        point.setText("•");
        point.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                pointComponentMoved(evt);
            }
        });
        DAY1.add(point);
        point.setBounds(0, -30, 20, 50);

        javax.swing.GroupLayout DAYSLayout = new javax.swing.GroupLayout(DAYS);
        DAYS.setLayout(DAYSLayout);
        DAYSLayout.setHorizontalGroup(
            DAYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DAYSLayout.createSequentialGroup()
                .addComponent(DAY1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(DAYSLayout.createSequentialGroup()
                .addGroup(DAYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DAY3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DAY2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DAYSLayout.setVerticalGroup(
            DAYSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DAYSLayout.createSequentialGroup()
                .addComponent(DAY1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DAY2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DAY3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(DAYS);
        DAYS.setBounds(0, 0, 180, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (!this.chosen) {
            ventana.unchoseChosenopcion();
            ventana.setOpcionChosen(this.thisOpcion);
            ventana.setOpcionchoosen(this);
            
            
            this.chosen = true;
            chose();
        } else {
            ventana.unchoseChosenopcion();
            this.chosen = false;
            this.unchose();
        }
        
        
    }//GEN-LAST:event_formMouseClicked

    private void sunComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sunComponentMoved
        if (this.chosen) {
            chose();
        } else{
            unchose();
        }
    }//GEN-LAST:event_sunComponentMoved

    private void pointComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pointComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pointComponentMoved

    private void sun2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sun2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sun2ComponentMoved

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        if (this.thisOpcion == null) return;
        
        this.thisOpciones.deleteopcion(thisOpcion);
        
        ventana.UpdateOpcionCards();
        ventana.unchoseChosenopcion();
    }//GEN-LAST:event_delActionPerformed

    private void sun1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sun1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sun1ComponentMoved
    
    
    
    private void chose(){
        SwingUtilities.invokeLater(() -> {
            this.sun.setLocation(130,this.sun.getY());
            this.sun1.setLocation(130,this.sun.getY());
            this.sun2.setLocation(130,this.sun.getY());
            this.sun.setVisible(false);
            this.sun1.setVisible(false);
            this.sun2.setVisible(false);
            
            
            
            DAY1.setBackground(ventana.colores.EnPane);
            DAY2.setBackground(ventana.colores.EnPane);
            DAY3.setBackground(ventana.colores.EnPane);
            
            
            this.del.setEnabled(true);
            this.del.setVisible(true);
        });
    }
    
    
    public void unchose(){
        SwingUtilities.invokeLater(() -> {
            DAY1.setBackground(ventana.colores.DisPane);
            DAY2.setBackground(ventana.colores.DisPane);
            DAY3.setBackground(ventana.colores.DisPane);
            
            this.sun.setLocation(153,this.sun.getY());
            this.sun1.setLocation(153,this.sun.getY());
            this.sun2.setLocation(153,this.sun.getY());
            this.sun.setVisible(true);
            this.sun1.setVisible(true);
            this.sun2.setVisible(true);
            
            
            
            this.del.setEnabled(false);
            this.del.setVisible(false);
        });
    }
    
    
    
    
    

    //<editor-fold defaultstate="collapsed" desc=" setters y getters">
    public void setThisOpciones(opciones thisOpciones) {
        this.thisOpciones = thisOpciones;
    }    
    

    public VentanaPrincipal getVentana() {
        return ventana;
    }

    public void setVentana(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    public opcion getThisOpcion() {
        return thisOpcion;
    }

    public void setThisOpcion(opcion thisOpcion) {
        this.thisOpcion = thisOpcion;
        
        
        if (this.thisOpcion != null){
            days = this.thisOpcion.getNdias();
        }
        SwingUtilities.invokeLater(() -> {

            this.setSize(180, 30*days);
            
            this.del.setLocation(del.getX(), -2 + 15*(days-1));
            
            this.DAYS.repaint();
            this.revalidate();
            this.repaint();

        });
        
        for (int i = 0; i < days; i++) {
            He[i] = thisOpcion.getHD()[i];
            Hs[i] = thisOpcion.getHDSS()[i];
            day[i] = thisOpcion.getDias()[i];
            md[i] = thisOpcion.getMD()[i];
            mds[i] = thisOpcion.getMDS()[i];
        }
        
        
        String diu1 = dia.nombreDia(day[0]).toLowerCase();
        String diu2 = dia.nombreDia(day[1]).toLowerCase();
        String diu3 = dia.nombreDia(day[2]).toLowerCase();
        diu1 = (diu1.charAt(0)+"").toUpperCase() + diu1.substring(1, diu1.length()).toLowerCase();
        diu2 = (diu2.charAt(0)+"").toUpperCase() + diu2.substring(1, diu2.length()).toLowerCase();
        diu3 = (diu3.charAt(0)+"").toUpperCase() + diu3.substring(1, diu3.length()).toLowerCase();
        
        String dataone = diu1 + dia.convertirHora(He[0], md[0]).toUpperCase() +" - "+ dia.convertirHora(Hs[0], mds[0]).toUpperCase();
        String datatwo = diu2 + dia.convertirHora(He[1], md[1]).toUpperCase() +" - "+ dia.convertirHora(Hs[1], mds[1]).toUpperCase();
        String datathr = diu3 + dia.convertirHora(He[2], md[2]).toUpperCase() +" - "+ dia.convertirHora(Hs[2], mds[2]).toUpperCase();
        this.DATA.setText(dataone);
        this.DATA1.setText(datatwo);
        this.DATA2.setText(datathr);
        
        this.sun.setForeground(Hourcolor(Hs[0]));
        this.sun1.setForeground(Hourcolor(Hs[1]));
        this.sun2.setForeground(Hourcolor(Hs[2]));
        
    }

    public opciones getThisOpciones() {
        return thisOpciones;
    }
    
    
    
    //</editor-fold>
    
    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DATA;
    private javax.swing.JLabel DATA1;
    private javax.swing.JLabel DATA2;
    private javax.swing.JPanel DAY1;
    private javax.swing.JPanel DAY2;
    private javax.swing.JPanel DAY3;
    private javax.swing.JPanel DAYS;
    private javax.swing.JButton del;
    private javax.swing.JLabel point;
    private javax.swing.JLabel sun;
    private javax.swing.JLabel sun1;
    private javax.swing.JLabel sun2;
    // End of variables declaration//GEN-END:variables
}
