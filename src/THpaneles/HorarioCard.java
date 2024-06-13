/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.Hopcion;
import THlogica.dia;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import THpaneles.COLORPALETTE;
import javax.swing.JLabel;
/**
 *
 * @author User
 */
public class HorarioCard extends javax.swing.JPanel {
    
    private VentanaPrincipal ventana;
    private int Line = 0;
    private int Page = 0;
    
    private int round;
    private Hopcion horario;
    
    public javax.swing.JPanel[] rectangulitos;
    public javax.swing.JLabel[] punticos;
    
    public HorarioCard() {
        round = 25;
        initComponents();
        
        this.rectangulitos = new JPanel[6];
        this.rectangulitos[0] = dia1;
        this.rectangulitos[2] = dia3;
        this.rectangulitos[3] = dia4;
        this.rectangulitos[4] = dia5;
        this.rectangulitos[5] = dia6;
        this.rectangulitos[1] = dia2;
        
        
        this.punticos = new JLabel[8];
        this.punticos[0] = point1;
        this.punticos[1] = point2;
        this.punticos[2] = point3;
        this.punticos[3] = point4;
        this.punticos[4] = point5;
        this.punticos[5] = point6;
        this.punticos[6] = point7;
        this.punticos[7] = point8;
        
        
    }

    public Hopcion getHorario() {
        return horario;
    }

    public void setHorario(Hopcion horario) {
        this.horario = horario;
        this.Days.setText(horario.getDiastogo()+"");
        
        this.Hmax.setText(dia.convertirHora(horario.getHMAX(), 0));
        this.Hmin.setText(dia.convertirHora(horario.getHMIN(),0));
        this.VoidHours.setText(horario.getHuecos()+"");
        setDiasIcon(horario.getDiastogo());
        
        
        
        this.sun2.setForeground(OptionCard.Hourcolor(horario.getHMIN()));
        this.sun1.setForeground(OptionCard.Hourcolor(horario.getHMAX()));
        
        
        int i = 1;
        for (JPanel u : this.rectangulitos){
            u.setBounds((26 * i), 96, 26, 5);
            if (horario.dt[i-1] >=1){
                u.setBackground(new Color(234,234,234));
            } else {
                u.setBackground(Color.white);
            }
            i++;
        }
        
        
        
        
        
        int val = (horario.favorites<this.punticos.length) ? horario.favorites : this.punticos.length;
        
        for (JLabel h : this.punticos) {
            h.setVisible(false);
        }
        
        
        for (int j = 0; j < val; j++) {
            this.punticos[j].setLocation(0, j*10);
            this.punticos[j].setForeground(new Color(207, 255, 181));
            this.punticos[j].setVisible(true);
        }
        
        
    }
    
    
    private void setDiasIcon(int dias){
        String ruta = "/THimages/CirclesFilled/Circle" + dias + ".png";
        this.Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
        
        //ventana.getjLabel4().setText("/THImages/CirclesFilled/Circle"+ dias + ".png");
//       String ruta;       
//        switch (dias) {
//            case 1:
//                ruta = "/THimages/CirclesFilled/Circle1.png";
//                Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                break;
//            case 2:
//                ruta = "/THImages/CirclesFilled/Circle2.png";
//                Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                break;
//            case 3:
//                ruta = "/THImages/CirclesFilled/Circle3.png";
//                Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                break;
//            case 4:
//                ruta = "/THImages/CirclesFilled/Circle4.png";
//                Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                break;
//            case 5:
//                ruta = "/THImages/CirclesFilled/Circle5.png";
//                Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                break;
//            case 6:
//                ruta = "/THImages/CirclesFilled/Circle6.png";
//                Days.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
//                break;
//        }
//        
    }
    
    
    public VentanaPrincipal getVentana() {
        return ventana;
    }

    public void setVentana(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int Page) {
        this.Page = Page;
    }
    
    
    
    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getLine() {
        return Line;
    }

    public void setLine(int Line) {
        this.Line = Line;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        VoidHours = new javax.swing.JLabel();
        sun1 = new javax.swing.JLabel();
        Days = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hmax = new javax.swing.JLabel();
        sun2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hmin = new javax.swing.JLabel();
        dia1 = new javax.swing.JPanel();
        dia2 = new javax.swing.JPanel();
        dia3 = new javax.swing.JPanel();
        dia4 = new javax.swing.JPanel();
        dia5 = new javax.swing.JPanel();
        dia6 = new javax.swing.JPanel();
        point1 = new javax.swing.JLabel();
        point2 = new javax.swing.JLabel();
        point3 = new javax.swing.JLabel();
        point4 = new javax.swing.JLabel();
        point5 = new javax.swing.JLabel();
        point6 = new javax.swing.JLabel();
        point7 = new javax.swing.JLabel();
        point8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(210, 100));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(false);
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgMouseClicked(evt);
            }
        });
        bg.setLayout(null);

        VoidHours.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        VoidHours.setForeground(new java.awt.Color(102, 102, 102));
        VoidHours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VoidHours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/CirclesFilled/void.png"))); // NOI18N
        VoidHours.setText("4");
        VoidHours.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(VoidHours);
        VoidHours.setBounds(110, 5, 35, 35);

        sun1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 75)); // NOI18N
        sun1.setForeground(new java.awt.Color(47, 85, 151));
        sun1.setText("•");
        sun1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sun1ComponentMoved(evt);
            }
        });
        bg.add(sun1);
        sun1.setBounds(160, 60, 30, 40);

        Days.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Days.setForeground(new java.awt.Color(255, 255, 255));
        Days.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/CirclesFilled/Circle1.png"))); // NOI18N
        Days.setText("1");
        Days.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(Days);
        Days.setBounds(20, 5, 35, 37);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Horas");
        bg.add(jLabel1);
        jLabel1.setBounds(150, 20, 40, 16);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("H Max.");
        bg.add(jLabel2);
        jLabel2.setBounds(20, 75, 70, 15);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Dias");
        bg.add(jLabel3);
        jLabel3.setBounds(60, 20, 30, 15);

        Hmax.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Hmax.setForeground(new java.awt.Color(102, 102, 102));
        Hmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hmax.setText("5:00 PM");
        bg.add(Hmax);
        Hmax.setBounds(60, 70, 100, 20);

        sun2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 75)); // NOI18N
        sun2.setForeground(new java.awt.Color(47, 85, 151));
        sun2.setText("•");
        sun2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sun2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sun2ComponentMoved(evt);
            }
        });
        bg.add(sun2);
        sun2.setBounds(160, 35, 30, 40);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("H Min.");
        bg.add(jLabel5);
        jLabel5.setBounds(20, 55, 70, 15);

        Hmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Hmin.setForeground(new java.awt.Color(102, 102, 102));
        Hmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hmin.setText("9:00 PM");
        bg.add(Hmin);
        Hmin.setBounds(60, 50, 100, 20);

        javax.swing.GroupLayout dia1Layout = new javax.swing.GroupLayout(dia1);
        dia1.setLayout(dia1Layout);
        dia1Layout.setHorizontalGroup(
            dia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dia1Layout.setVerticalGroup(
            dia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        bg.add(dia1);
        dia1.setBounds(20, 95, 20, 5);

        javax.swing.GroupLayout dia2Layout = new javax.swing.GroupLayout(dia2);
        dia2.setLayout(dia2Layout);
        dia2Layout.setHorizontalGroup(
            dia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dia2Layout.setVerticalGroup(
            dia2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        bg.add(dia2);
        dia2.setBounds(20, 95, 20, 5);

        javax.swing.GroupLayout dia3Layout = new javax.swing.GroupLayout(dia3);
        dia3.setLayout(dia3Layout);
        dia3Layout.setHorizontalGroup(
            dia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dia3Layout.setVerticalGroup(
            dia3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        bg.add(dia3);
        dia3.setBounds(20, 95, 20, 5);

        javax.swing.GroupLayout dia4Layout = new javax.swing.GroupLayout(dia4);
        dia4.setLayout(dia4Layout);
        dia4Layout.setHorizontalGroup(
            dia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dia4Layout.setVerticalGroup(
            dia4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        bg.add(dia4);
        dia4.setBounds(20, 95, 20, 5);

        javax.swing.GroupLayout dia5Layout = new javax.swing.GroupLayout(dia5);
        dia5.setLayout(dia5Layout);
        dia5Layout.setHorizontalGroup(
            dia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dia5Layout.setVerticalGroup(
            dia5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        bg.add(dia5);
        dia5.setBounds(20, 95, 20, 5);

        javax.swing.GroupLayout dia6Layout = new javax.swing.GroupLayout(dia6);
        dia6.setLayout(dia6Layout);
        dia6Layout.setHorizontalGroup(
            dia6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        dia6Layout.setVerticalGroup(
            dia6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        bg.add(dia6);
        dia6.setBounds(20, 95, 20, 5);

        point1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point1.setForeground(new java.awt.Color(47, 85, 151));
        point1.setText("•");
        point1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point1ComponentMoved(evt);
            }
        });
        bg.add(point1);
        point1.setBounds(0, 0, 20, 30);

        point2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point2.setForeground(new java.awt.Color(47, 85, 151));
        point2.setText("•");
        point2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point2ComponentMoved(evt);
            }
        });
        bg.add(point2);
        point2.setBounds(0, 0, 20, 30);

        point3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point3.setForeground(new java.awt.Color(47, 85, 151));
        point3.setText("•");
        point3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point3ComponentMoved(evt);
            }
        });
        bg.add(point3);
        point3.setBounds(0, 0, 20, 30);

        point4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point4.setForeground(new java.awt.Color(47, 85, 151));
        point4.setText("•");
        point4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point4ComponentMoved(evt);
            }
        });
        bg.add(point4);
        point4.setBounds(0, 0, 20, 30);

        point5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point5.setForeground(new java.awt.Color(47, 85, 151));
        point5.setText("•");
        point5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point5ComponentMoved(evt);
            }
        });
        bg.add(point5);
        point5.setBounds(0, 0, 20, 30);

        point6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point6.setForeground(new java.awt.Color(47, 85, 151));
        point6.setText("•");
        point6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point6ComponentMoved(evt);
            }
        });
        bg.add(point6);
        point6.setBounds(0, 0, 20, 30);

        point7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point7.setForeground(new java.awt.Color(47, 85, 151));
        point7.setText("•");
        point7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point7ComponentMoved(evt);
            }
        });
        bg.add(point7);
        point7.setBounds(0, 0, 20, 30);

        point8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        point8.setForeground(new java.awt.Color(47, 85, 151));
        point8.setText("•");
        point8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                point8ComponentMoved(evt);
            }
        });
        bg.add(point8);
        point8.setBounds(0, 0, 20, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sun1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sun1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sun1ComponentMoved

    private void sun2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sun2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sun2ComponentMoved

    private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked
        System.out.println(this.Page);
        ventana.getGroupChosen().getHor().ChooseElH(horario);
        ventana.HORARIO();
    }//GEN-LAST:event_bgMouseClicked

    private void point1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point1ComponentMoved

    private void point2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point2ComponentMoved

    private void point3ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point3ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point3ComponentMoved

    private void point4ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point4ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point4ComponentMoved

    private void point5ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point5ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point5ComponentMoved

    private void point6ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point6ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point6ComponentMoved

    private void point7ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point7ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point7ComponentMoved

    private void point8ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_point8ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_point8ComponentMoved
    
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="REDONDEADO UWU">      
    @Override
    protected void paintComponent(Graphics grphcs) {
        this.setOpaque(false);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
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
    
    
    
    
//    private Shape createRounds(){
//        Area area = new Area(new RoundRectangle2D(0,0,this.getWidth(), this.getHeight(),15 ,15));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Days;
    private javax.swing.JLabel Hmax;
    private javax.swing.JLabel Hmin;
    private javax.swing.JLabel VoidHours;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel dia1;
    private javax.swing.JPanel dia2;
    private javax.swing.JPanel dia3;
    private javax.swing.JPanel dia4;
    private javax.swing.JPanel dia5;
    private javax.swing.JPanel dia6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel point1;
    private javax.swing.JLabel point2;
    private javax.swing.JLabel point3;
    private javax.swing.JLabel point4;
    private javax.swing.JLabel point5;
    private javax.swing.JLabel point6;
    private javax.swing.JLabel point7;
    private javax.swing.JLabel point8;
    private javax.swing.JLabel sun1;
    private javax.swing.JLabel sun2;
    // End of variables declaration//GEN-END:variables
}
