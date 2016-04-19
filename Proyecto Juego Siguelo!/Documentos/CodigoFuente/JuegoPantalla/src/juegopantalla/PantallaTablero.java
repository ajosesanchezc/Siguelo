/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PantallaTablero.java
 *
 * Created on 02/04/2010, 08:54:37 PM
 */

package juegopantalla;
import javax.swing.JOptionPane;
import juegocodigo.Matriz;
import java.io.FileInputStream;
import sun.audio.* ;

/**
 *
 * @author tony
 */
public class PantallaTablero extends javax.swing.JFrame {
    private  int vector [];
    private  String imagen[];
    private  javax.swing.JButton  listaBoton [][] = null;
    private  int numerovector;
    private int pos;
    private int error;
    private String nombre;

      /** Creates new form PantallaTablero */


class win extends Thread
{
      public void run ()
      {
        try
        {
           while ( true )
           {
            AudioPlayer.player.start (new FileInputStream ("c:/sonido/win.au") );
            AudioPlayer.player.run();
           }
        }
            catch ( Exception e) {
            e.printStackTrace();
            }
        }
}



class cuckoo extends Thread
{
      public void run ()
      {
        try
        {
           while ( true )
           {
            AudioPlayer.player.start (new FileInputStream ("c:/sonido/cuckoo.au") );
            AudioPlayer.player.run();
           }
        }
            catch ( Exception e) {
            e.printStackTrace();
            }
        }
}

class acierto extends Thread
{
      public void run ()
      {
        try
        {
          // while ( true )
           //{
            AudioPlayer.player.start (new FileInputStream ("c:/sonido/acierto.au") );
            AudioPlayer.player.run();
          // }
        }
            catch ( Exception e) {
            e.printStackTrace();
            }
        }
}

class equivoque extends Thread
{
      public void run ()
      {
        try
        {
           while ( true )
           {
            AudioPlayer.player.start (new FileInputStream ("c:/sonido/equivoque.au") );
            AudioPlayer.player.run();
           }
        }
            catch ( Exception e)
            {
            e.printStackTrace();
            }
        }
}

public PantallaTablero()
{ }

public PantallaTablero(String nombre)
{
        initComponents();
        pos=0;
        error=0;
 if (nombre.compareTo("vector1")==0)
 {
    numerovector=1;
      this.jLabel2.setText("¡Comienza Presionando los números 1, 2, 3 y Siguelo!");
      jLabel6.setText("Hoja Nº 2");
      int vector1 [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

       String  imagen1[] = {"","/juegopantalla/imagenes/1.JPG",
              "/juegopantalla/imagenes/2.jpg","/juegopantalla/imagenes/3.jpg",
              "/juegopantalla/imagenes/4.jpg","/juegopantalla/imagenes/5.jpg",
              "/juegopantalla/imagenes/6.jpg","/juegopantalla/imagenes/7.jpg",
              "/juegopantalla/imagenes/8.jpg","/juegopantalla/imagenes/9.jpg",
              "/juegopantalla/imagenes/10.jpg","/juegopantalla/imagenes/11.jpg",
              "/juegopantalla/imagenes/12.JPG","/juegopantalla/imagenes/13.jpg",
              "/juegopantalla/imagenes/14.jpg","/juegopantalla/imagenes/15.jpg",
              "/juegopantalla/imagenes/16.jpg","/juegopantalla/imagenes/17.jpg",
              "/juegopantalla/imagenes/18.jpg","/juegopantalla/imagenes/19.jpg",
              "/juegopantalla/imagenes/20.jpg","/juegopantalla/imagenes/21.jpg",
              "/juegopantalla/imagenes/22.jpg","/juegopantalla/imagenes/23.jpg",
              "/juegopantalla/imagenes/24.jpg","/juegopantalla/imagenes/25.jpg",};

       vector = vector1;
       imagen = imagen1;

 }
 else if(nombre.compareTo("vector1D")==0)
 {
    numerovector=1;
    this.jLabel2.setText("¡Comienza Presionando los números 25, 24, 23 y Siguelo!");
    jLabel6.setText("Hoja Nº 6");
    int   vector1D[] = {25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,};
     
           String  imagen1[] = {"","/juegopantalla/imagenes/1.JPG",
              "/juegopantalla/imagenes/2.jpg","/juegopantalla/imagenes/3.jpg",
              "/juegopantalla/imagenes/4.jpg","/juegopantalla/imagenes/5.jpg",
              "/juegopantalla/imagenes/6.jpg","/juegopantalla/imagenes/7.jpg",
              "/juegopantalla/imagenes/8.jpg","/juegopantalla/imagenes/9.jpg",
              "/juegopantalla/imagenes/10.jpg","/juegopantalla/imagenes/11.jpg",
              "/juegopantalla/imagenes/12.JPG","/juegopantalla/imagenes/13.jpg",
              "/juegopantalla/imagenes/14.jpg","/juegopantalla/imagenes/15.jpg",
              "/juegopantalla/imagenes/16.jpg","/juegopantalla/imagenes/17.jpg",
              "/juegopantalla/imagenes/18.jpg","/juegopantalla/imagenes/19.jpg",
              "/juegopantalla/imagenes/20.jpg","/juegopantalla/imagenes/21.jpg",
              "/juegopantalla/imagenes/22.jpg","/juegopantalla/imagenes/23.jpg",
              "/juegopantalla/imagenes/24.jpg","/juegopantalla/imagenes/25.jpg",};


       vector = vector1D;
       imagen = imagen1;
 }
 else if(nombre.compareTo("vector2")==0)
 {
     numerovector=2;
    this.jLabel2.setText("¡Comienza Presionando los números 2, 4, 6 y Siguelo!");
    jLabel6.setText("Hoja Nº 4");
     int  vector2[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50};
      
     String imagen2[]={"","/juegopantalla/imagenes/2.jpg",
      "/juegopantalla/imagenes/4.jpg","/juegopantalla/imagenes/6.jpg",
      "/juegopantalla/imagenes/8.jpg","/juegopantalla/imagenes/10.jpg",
      "/juegopantalla/imagenes/12.JPG","/juegopantalla/imagenes/14.jpg",
      "/juegopantalla/imagenes/16.jpg","/juegopantalla/imagenes/18.jpg",
      "/juegopantalla/imagenes/20.jpg","/juegopantalla/imagenes/22.jpg",
      "/juegopantalla/imagenes/24.jpg","/juegopantalla/imagenes/26.JPG",
      "/juegopantalla/imagenes/28.JPG","/juegopantalla/imagenes/30.JPG",
      "/juegopantalla/imagenes/32.JPG","/juegopantalla/imagenes/34.JPG",
      "/juegopantalla/imagenes/36.JPG","/juegopantalla/imagenes/38.JPG",
      "/juegopantalla/imagenes/40.JPG","/juegopantalla/imagenes/42.JPG",
      "/juegopantalla/imagenes/44.JPG","/juegopantalla/imagenes/46.JPG",
      "/juegopantalla/imagenes/48.JPG","/juegopantalla/imagenes/50.JPG",};

     vector = vector2;
     imagen = imagen2;

 }
 else if(nombre.compareTo("vector2D")==0)
 {
     this.jLabel2.setText("¡Comienza Presionando los números 50, 48, 46 y Siguelo!");
     jLabel6.setText("Hoja Nº 7");
     numerovector=2;
     int vector2D[] = {50,48,46,44,42,40,38,36,34,32,30,28,26,24,22,20,18,16,14,12,10,8,6,4,2};

      String imagen2[]={"","/juegopantalla/imagenes/2.jpg",
      "/juegopantalla/imagenes/4.jpg","/juegopantalla/imagenes/6.jpg",
      "/juegopantalla/imagenes/8.jpg","/juegopantalla/imagenes/10.jpg",
      "/juegopantalla/imagenes/12.JPG","/juegopantalla/imagenes/14.jpg",
      "/juegopantalla/imagenes/16.jpg","/juegopantalla/imagenes/18.jpg",
      "/juegopantalla/imagenes/20.jpg","/juegopantalla/imagenes/22.jpg",
      "/juegopantalla/imagenes/24.jpg","/juegopantalla/imagenes/26.JPG",
      "/juegopantalla/imagenes/28.JPG","/juegopantalla/imagenes/30.JPG",
      "/juegopantalla/imagenes/32.JPG","/juegopantalla/imagenes/34.JPG",
      "/juegopantalla/imagenes/36.JPG","/juegopantalla/imagenes/38.JPG",
      "/juegopantalla/imagenes/40.JPG","/juegopantalla/imagenes/42.JPG",
      "/juegopantalla/imagenes/44.JPG","/juegopantalla/imagenes/46.JPG",
      "/juegopantalla/imagenes/48.JPG","/juegopantalla/imagenes/50.JPG",};

      vector = vector2D;
      imagen = imagen2;
 }
 else if(nombre.compareTo("vector3")==0)
 {
      this.jLabel2.setText("¡Comienza Presionando los números 3, 6, 9 y Siguelo!");
      jLabel6.setText("Hoja Nº 5");
     numerovector=3;
       int vector3 [] = {3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60,63,66,69,72,75};
        String imagen3[]={"","/juegopantalla/imagenes/3.jpg",
      "/juegopantalla/imagenes/6.jpg","/juegopantalla/imagenes/9.jpg",
      "/juegopantalla/imagenes/12.JPG","/juegopantalla/imagenes/15.jpg",
      "/juegopantalla/imagenes/18.jpg","/juegopantalla/imagenes/21.jpg",
      "/juegopantalla/imagenes/24.jpg","/juegopantalla/imagenes/27.JPG",
      "/juegopantalla/imagenes/30.JPG","/juegopantalla/imagenes/33.JPG",
      "/juegopantalla/imagenes/36.JPG","/juegopantalla/imagenes/39.JPG",
      "/juegopantalla/imagenes/42.JPG","/juegopantalla/imagenes/45.JPG",
      "/juegopantalla/imagenes/48.JPG","/juegopantalla/imagenes/51.JPG",
      "/juegopantalla/imagenes/54.JPG","/juegopantalla/imagenes/57.JPG",
      "/juegopantalla/imagenes/60.JPG","/juegopantalla/imagenes/63.JPG",
      "/juegopantalla/imagenes/66.JPG","/juegopantalla/imagenes/69.JPG",
      "/juegopantalla/imagenes/72.JPG","/juegopantalla/imagenes/75.JPG",};
        vector = vector3;
        imagen=imagen3;
      
 }
 else if(nombre.compareTo("vector3D")==0)
 {
     numerovector=3;
      this.jLabel2.setText("¡Comienza Presionando los números 75, 72, 69 y Siguelo!");
      jLabel6.setText("Hoja Nº 8");
     int vector3D [] = {75,72,69,66,63,60,57,54,51,48,45,42,39,36,33,30,27,24,21,18,15,12,9,6,3};
      String imagen3[]={"","/juegopantalla/imagenes/3.jpg",
      "/juegopantalla/imagenes/6.jpg","/juegopantalla/imagenes/9.jpg",
      "/juegopantalla/imagenes/12.JPG","/juegopantalla/imagenes/15.jpg",
      "/juegopantalla/imagenes/18.jpg","/juegopantalla/imagenes/21.jpg",
      "/juegopantalla/imagenes/24.jpg","/juegopantalla/imagenes/27.JPG",
      "/juegopantalla/imagenes/30.JPG","/juegopantalla/imagenes/33.JPG",
      "/juegopantalla/imagenes/36.JPG","/juegopantalla/imagenes/39.JPG",
      "/juegopantalla/imagenes/42.JPG","/juegopantalla/imagenes/45.JPG",
      "/juegopantalla/imagenes/48.JPG","/juegopantalla/imagenes/51.JPG",
      "/juegopantalla/imagenes/54.JPG","/juegopantalla/imagenes/57.JPG",
      "/juegopantalla/imagenes/60.JPG","/juegopantalla/imagenes/63.JPG",
      "/juegopantalla/imagenes/66.JPG","/juegopantalla/imagenes/69.JPG",
      "/juegopantalla/imagenes/72.JPG","/juegopantalla/imagenes/75.JPG",};

    vector = vector3D;
    imagen = imagen3;
 }
     this.nombre = nombre;
     inicializarComponentesPropios();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        jB11 = new javax.swing.JButton();
        jB12 = new javax.swing.JButton();
        jB13 = new javax.swing.JButton();
        jB14 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jB20 = new javax.swing.JButton();
        jB21 = new javax.swing.JButton();
        jB22 = new javax.swing.JButton();
        jB23 = new javax.swing.JButton();
        jB24 = new javax.swing.JButton();
        jB30 = new javax.swing.JButton();
        jB31 = new javax.swing.JButton();
        jB32 = new javax.swing.JButton();
        jB33 = new javax.swing.JButton();
        jB34 = new javax.swing.JButton();
        jB40 = new javax.swing.JButton();
        jB41 = new javax.swing.JButton();
        jB42 = new javax.swing.JButton();
        jB43 = new javax.swing.JButton();
        jB44 = new javax.swing.JButton();
        jB50 = new javax.swing.JButton();
        jB51 = new javax.swing.JButton();
        jB52 = new javax.swing.JButton();
        jB53 = new javax.swing.JButton();
        jB54 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(juegopantalla.JuegoPantallaApp.class).getContext().getResourceMap(PantallaTablero.class);
        fondo.setText(resourceMap.getString("fondo.text")); // NOI18N
        fondo.setName("fondo"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB11.setActionCommand(resourceMap.getString("jB11.actionCommand")); // NOI18N
        jB11.setAutoscrolls(true);
        jB11.setName("jB11"); // NOI18N
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });
        getContentPane().add(jB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 60, 50));
        jB11.getAccessibleContext().setAccessibleName(resourceMap.getString("jB11.AccessibleContext.accessibleName")); // NOI18N

        jB12.setText(resourceMap.getString("jB12.text")); // NOI18N
        jB12.setActionCommand(resourceMap.getString("jB12.actionCommand")); // NOI18N
        jB12.setName("jB12"); // NOI18N
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });
        getContentPane().add(jB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, 50));

        jB13.setText(resourceMap.getString("jB13.text")); // NOI18N
        jB13.setActionCommand(resourceMap.getString("jB13.actionCommand")); // NOI18N
        jB13.setName("jB13"); // NOI18N
        jB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB13ActionPerformed(evt);
            }
        });
        getContentPane().add(jB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 60, 50));

        jB14.setText(resourceMap.getString("jB14.text")); // NOI18N
        jB14.setActionCommand(resourceMap.getString("jB14.actionCommand")); // NOI18N
        jB14.setName("jB14"); // NOI18N
        jB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB14ActionPerformed(evt);
            }
        });
        getContentPane().add(jB14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 60, 50));

        jB10.setText(resourceMap.getString("jB10.text")); // NOI18N
        jB10.setActionCommand(resourceMap.getString("jB10.actionCommand")); // NOI18N
        jB10.setName("jB10"); // NOI18N
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });
        getContentPane().add(jB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 60, 50));

        jB20.setText(resourceMap.getString("jB20.text")); // NOI18N
        jB20.setActionCommand(resourceMap.getString("jB20.actionCommand")); // NOI18N
        jB20.setName("jB20"); // NOI18N
        jB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB20ActionPerformed(evt);
            }
        });
        getContentPane().add(jB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 60, 50));

        jB21.setText(resourceMap.getString("jB21.text")); // NOI18N
        jB21.setActionCommand(resourceMap.getString("jB21.actionCommand")); // NOI18N
        jB21.setName("jB21"); // NOI18N
        jB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB21ActionPerformed(evt);
            }
        });
        getContentPane().add(jB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 60, 50));

        jB22.setText(resourceMap.getString("jB22.text")); // NOI18N
        jB22.setActionCommand(resourceMap.getString("jB22.actionCommand")); // NOI18N
        jB22.setName("jB22"); // NOI18N
        jB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB22ActionPerformed(evt);
            }
        });
        getContentPane().add(jB22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 60, 50));

        jB23.setActionCommand(resourceMap.getString("jB23.actionCommand")); // NOI18N
        jB23.setName("jB23"); // NOI18N
        jB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB23ActionPerformed(evt);
            }
        });
        getContentPane().add(jB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 60, 50));

        jB24.setText(resourceMap.getString("jB24.text")); // NOI18N
        jB24.setActionCommand(resourceMap.getString("jB24.actionCommand")); // NOI18N
        jB24.setName("jB24"); // NOI18N
        jB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB24ActionPerformed(evt);
            }
        });
        getContentPane().add(jB24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 60, 50));

        jB30.setText(resourceMap.getString("jB30.text")); // NOI18N
        jB30.setActionCommand(resourceMap.getString("jB30.actionCommand")); // NOI18N
        jB30.setName("jB30"); // NOI18N
        jB30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB30ActionPerformed(evt);
            }
        });
        getContentPane().add(jB30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 60, 50));

        jB31.setText(resourceMap.getString("jB31.text")); // NOI18N
        jB31.setActionCommand(resourceMap.getString("jB31.actionCommand")); // NOI18N
        jB31.setName("jB31"); // NOI18N
        jB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB31ActionPerformed(evt);
            }
        });
        getContentPane().add(jB31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 60, 50));

        jB32.setText(resourceMap.getString("jB32.text")); // NOI18N
        jB32.setActionCommand(resourceMap.getString("jB32.actionCommand")); // NOI18N
        jB32.setName("jB32"); // NOI18N
        jB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB32ActionPerformed(evt);
            }
        });
        getContentPane().add(jB32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 60, 50));

        jB33.setForeground(resourceMap.getColor("jB33.foreground")); // NOI18N
        jB33.setText(resourceMap.getString("jB33.text")); // NOI18N
        jB33.setActionCommand(resourceMap.getString("jB33.actionCommand")); // NOI18N
        jB33.setName("jB33"); // NOI18N
        jB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB33ActionPerformed(evt);
            }
        });
        getContentPane().add(jB33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 60, 50));

        jB34.setText(resourceMap.getString("jB34.text")); // NOI18N
        jB34.setActionCommand(resourceMap.getString("jB34.actionCommand")); // NOI18N
        jB34.setName("jB34"); // NOI18N
        jB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB34ActionPerformed(evt);
            }
        });
        getContentPane().add(jB34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 60, 50));

        jB40.setText(resourceMap.getString("jB40.text")); // NOI18N
        jB40.setActionCommand(resourceMap.getString("jB40.actionCommand")); // NOI18N
        jB40.setName("jB40"); // NOI18N
        jB40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB40ActionPerformed(evt);
            }
        });
        getContentPane().add(jB40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 60, 50));

        jB41.setText(resourceMap.getString("jB41.text")); // NOI18N
        jB41.setActionCommand(resourceMap.getString("jB41.actionCommand")); // NOI18N
        jB41.setName("jB41"); // NOI18N
        jB41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB41ActionPerformed(evt);
            }
        });
        getContentPane().add(jB41, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 60, 50));

        jB42.setText(resourceMap.getString("jB42.text")); // NOI18N
        jB42.setActionCommand(resourceMap.getString("jB42.actionCommand")); // NOI18N
        jB42.setName("jB42"); // NOI18N
        jB42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB42ActionPerformed(evt);
            }
        });
        getContentPane().add(jB42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 60, 50));

        jB43.setText(resourceMap.getString("jB43.text")); // NOI18N
        jB43.setActionCommand(resourceMap.getString("jB43.actionCommand")); // NOI18N
        jB43.setName("jB43"); // NOI18N
        jB43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB43ActionPerformed(evt);
            }
        });
        getContentPane().add(jB43, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 60, 50));

        jB44.setText(resourceMap.getString("jB44.text")); // NOI18N
        jB44.setActionCommand(resourceMap.getString("jB44.actionCommand")); // NOI18N
        jB44.setName("jB44"); // NOI18N
        jB44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB44ActionPerformed(evt);
            }
        });
        getContentPane().add(jB44, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 60, 50));

        jB50.setText(resourceMap.getString("jB50.text")); // NOI18N
        jB50.setActionCommand(resourceMap.getString("jB50.actionCommand")); // NOI18N
        jB50.setName("jB50"); // NOI18N
        jB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB50ActionPerformed(evt);
            }
        });
        getContentPane().add(jB50, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 60, 50));

        jB51.setText(resourceMap.getString("jB51.text")); // NOI18N
        jB51.setActionCommand(resourceMap.getString("jB51.actionCommand")); // NOI18N
        jB51.setName("jB51"); // NOI18N
        jB51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB51ActionPerformed(evt);
            }
        });
        getContentPane().add(jB51, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 60, 50));

        jB52.setText(resourceMap.getString("jB52.text")); // NOI18N
        jB52.setActionCommand(resourceMap.getString("jB52.actionCommand")); // NOI18N
        jB52.setName("jB52"); // NOI18N
        jB52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB52ActionPerformed(evt);
            }
        });
        getContentPane().add(jB52, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 60, 50));

        jB53.setText(resourceMap.getString("jB53.text")); // NOI18N
        jB53.setActionCommand(resourceMap.getString("jB53.actionCommand")); // NOI18N
        jB53.setName("jB53"); // NOI18N
        jB53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB53ActionPerformed(evt);
            }
        });
        getContentPane().add(jB53, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 60, 50));

        jB54.setText(resourceMap.getString("jB54.text")); // NOI18N
        jB54.setActionCommand(resourceMap.getString("jB54.actionCommand")); // NOI18N
        jB54.setName("jB54"); // NOI18N
        jB54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB54ActionPerformed(evt);
            }
        });
        getContentPane().add(jB54, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 60, 50));

        jButton10.setFont(resourceMap.getFont("jButton10.font")); // NOI18N
        jButton10.setForeground(resourceMap.getColor("jButton10.foreground")); // NOI18N
        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 90, 30));

        jLabel4.setIcon(resourceMap.getIcon("jLabel4.icon")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 280));

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setForeground(resourceMap.getColor("jLabel6.foreground")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 710, 40));

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 410, 50));

        jLabel5.setIcon(resourceMap.getIcon("jLabel5.icon")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, 360));

        jLabel7.setIcon(resourceMap.getIcon("jLabel7.icon")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 120));

        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void inicializarComponentesPropios()
 {
  final javax.swing.JButton  arregloBotones [][] = {
                                                    {jB10, jB20, jB30, jB40, jB50},
                                                    {jB11, jB21, jB31, jB41, jB51},
                                                    {jB12, jB22, jB32, jB42, jB52},
                                                    {jB13, jB23, jB33, jB43, jB53},
                                                    {jB14, jB24, jB34, jB44, jB54},
                                                    };

   listaBoton = arregloBotones;
   Matriz matriz = new Matriz();
   asignarImagen (matriz.obtenerTableroRandom5X5(vector),numerovector);
     
 }



 private void asignarImagen(int num [][], int n)
{

    for (int i=0 ; i<5 ; i++)
    {
      for (int j =0 ; j<5 ; j++)
      {
            listaBoton[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen [num[i][j]/n] )));
            listaBoton[i][j].setMnemonic(num[i][j]);

      }
    }
}

private boolean verificarnum(int num)
{
    if (  vector[pos] ==  num )
    {
        pos++;
        new acierto ().start();
        return true;
    }
    else
    {
        error++;
         new equivoque().start();
         JOptionPane.showMessageDialog(null,"Error numero equivocado"  ,"Error ",2,null);
        return false;
    }
}

private void finJuego() 
{
  if (pos ==25)
  {
      if (error <= 3 )
      {
          new win().start();
          JOptionPane.showMessageDialog(null,"Muy bien, ha pasado al siguiente nivel"  ,"Felicitaciones ",2,null);
          if (nombre.compareTo("vector1")==0)
          {
               PantallaTableroABC pantallaABC = new PantallaTableroABC("vectorABC");
               pantallaABC.setLocationRelativeTo(null);
               pantallaABC.setVisible(true);
                this.setVisible(false);
          }
          else if(nombre.compareTo("vector1D")==0)
          {
            PantallaTablero pantallaTablero = new PantallaTablero("vector2D");
            pantallaTablero.setLocationRelativeTo(null);
            pantallaTablero.setVisible(true);
          }
          else if (nombre.compareTo("vector2")==0)
          {
          PantallaTablero pantallaTablero = new PantallaTablero("vector3");
          pantallaTablero.setLocationRelativeTo(null);
          pantallaTablero.setVisible(true);
          this.setVisible(false);
          }
          else if (nombre.compareTo("vector2D")==0)
          {
            PantallaTablero pantallaTablero = new PantallaTablero("vector3D");
            pantallaTablero.setLocationRelativeTo(null);
            pantallaTablero.setVisible(true);
            this.setVisible(false);
          }
          else if (nombre.compareTo("vector3")==0)
          {
            PantallaTablero pantallaTablero = new PantallaTablero("vector1D");
            pantallaTablero.setLocationRelativeTo(null);
            pantallaTablero.setVisible(true);
            this.setVisible(false);
          }
          else if (nombre.compareTo("vector3D")==0)
          {
                 PantallaTableroABC pantallaABC = new PantallaTableroABC("vectorABCD");
                 pantallaABC.setLocationRelativeTo(null);
                 pantallaABC.setVisible(true);
                this.setVisible(false);
          }
      }
      else
      {
        new cuckoo().start();
         JOptionPane.showMessageDialog(null,"REPITAMOS EL NIVEL UNA VEZ MAS! "  ,"Informacion ",2,null);

        PantallaTablero pantallaTablero = new PantallaTablero(nombre);
        pantallaTablero.setLocationRelativeTo(null);
        pantallaTablero.setVisible(true);
      }
  }
}


    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB11ActionPerformed
        if (verificarnum(jB11.getMnemonic()))
            jB11.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB11ActionPerformed

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10ActionPerformed
        if (verificarnum(jB10.getMnemonic()))
            jB10.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB10ActionPerformed

    private void jB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB14ActionPerformed

        if (verificarnum(jB14.getMnemonic()))
            jB14.setEnabled(false);
        finJuego();
     
    }//GEN-LAST:event_jB14ActionPerformed

    private void jB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB12ActionPerformed
    if (verificarnum(jB12.getMnemonic()))
            jB12.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB12ActionPerformed

    private void jB13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB13ActionPerformed
     if (verificarnum(jB13.getMnemonic()))
            jB13.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB13ActionPerformed

    private void jB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB20ActionPerformed
       if (verificarnum(jB20.getMnemonic()))
            jB20.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB20ActionPerformed

    private void jB21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB21ActionPerformed
        if (verificarnum(jB21.getMnemonic()))
            jB21.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB21ActionPerformed

    private void jB22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB22ActionPerformed
        if (verificarnum(jB22.getMnemonic()))
            jB22.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB22ActionPerformed

    private void jB23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB23ActionPerformed
       if (verificarnum(jB23.getMnemonic()))
            jB23.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB23ActionPerformed

    private void jB24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB24ActionPerformed
     if (verificarnum(jB24.getMnemonic()))
            jB24.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB24ActionPerformed

    private void jB30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB30ActionPerformed
      if (verificarnum(jB30.getMnemonic()))
            jB30.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB30ActionPerformed

    private void jB31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB31ActionPerformed
       if (verificarnum(jB31.getMnemonic()))
            jB31.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB31ActionPerformed

    private void jB32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB32ActionPerformed
        if (verificarnum(jB32.getMnemonic()))
            jB32.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB32ActionPerformed

    private void jB33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB33ActionPerformed
        if (verificarnum(jB33.getMnemonic()))
            jB33.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB33ActionPerformed

    private void jB34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB34ActionPerformed
         if (verificarnum(jB34.getMnemonic()))
            jB34.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB34ActionPerformed

    private void jB40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB40ActionPerformed
      if (verificarnum(jB40.getMnemonic()))
            jB40.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB40ActionPerformed

    private void jB41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB41ActionPerformed
      if (verificarnum(jB41.getMnemonic()))
            jB41.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB41ActionPerformed

    private void jB42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB42ActionPerformed
       if (verificarnum(jB42.getMnemonic()))
            jB42.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB42ActionPerformed

    private void jB43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB43ActionPerformed
     if (verificarnum(jB43.getMnemonic()))
            jB43.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB43ActionPerformed

    private void jB44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB44ActionPerformed
      if (verificarnum(jB44.getMnemonic()))
            jB44.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB44ActionPerformed

    private void jB50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB50ActionPerformed
       if (verificarnum(jB50.getMnemonic()))
            jB50.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB50ActionPerformed

    private void jB51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB51ActionPerformed
      if (verificarnum(jB51.getMnemonic()))
            jB51.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB51ActionPerformed

    private void jB52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB52ActionPerformed
       if (verificarnum(jB52.getMnemonic()))
            jB52.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB52ActionPerformed

    private void jB53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB53ActionPerformed
      if (verificarnum(jB53.getMnemonic()))
            jB53.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB53ActionPerformed

    private void jB54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB54ActionPerformed
      if (verificarnum(jB54.getMnemonic()))
            jB54.setEnabled(false);
         finJuego();
    }//GEN-LAST:event_jB54ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        this.setVisible(false);
}//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB13;
    private javax.swing.JButton jB14;
    private javax.swing.JButton jB20;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JButton jB23;
    private javax.swing.JButton jB24;
    private javax.swing.JButton jB30;
    private javax.swing.JButton jB31;
    private javax.swing.JButton jB32;
    private javax.swing.JButton jB33;
    private javax.swing.JButton jB34;
    private javax.swing.JButton jB40;
    private javax.swing.JButton jB41;
    private javax.swing.JButton jB42;
    private javax.swing.JButton jB43;
    private javax.swing.JButton jB44;
    private javax.swing.JButton jB50;
    private javax.swing.JButton jB51;
    private javax.swing.JButton jB52;
    private javax.swing.JButton jB53;
    private javax.swing.JButton jB54;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
