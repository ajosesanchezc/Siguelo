/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PantallaTableroABC.java
 *
 * Created on 16/05/2010, 12:03:19 AM
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
public class PantallaTableroABC extends javax.swing.JFrame {

    private  char vector [];
    private  String imagen[];
    private  javax.swing.JButton  listaBoton [][] = null;
   // private  int numerovector;
    private int pos;
    private int error;
    private String nombre;

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
           while ( true )
           {
            AudioPlayer.player.start (new FileInputStream ("c:/sonido/acierto.au") );
            AudioPlayer.player.run();
           }
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
            catch ( Exception e) {
            e.printStackTrace();
                System.out.println(e);
            }
        }
}
    public PantallaTableroABC()
    {     }
    
    
    
    public PantallaTableroABC(String nombre)
    {
        initComponents();
        error=0;
        pos=0;
        if (nombre.compareTo("vectorABC")==0)
        {
           this.jLabel2.setText("¡Comienza Presionando las letras A, B, C y Siguelo!");
            jLabel6.setText("Hoja Nº 3");
            char vectorABC[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                     'Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z','@','$','!'};
             
             String  imagen1[] = {"/juegopantalla/imagenes/a.JPG",
              "/juegopantalla/imagenes/b.JPG",
              "/juegopantalla/imagenes/c.JPG","/juegopantalla/imagenes/d.JPG",
              "/juegopantalla/imagenes/e.JPG","/juegopantalla/imagenes/f.JPG",
              "/juegopantalla/imagenes/g.JPG","/juegopantalla/imagenes/h.JPG",
              "/juegopantalla/imagenes/i.JPG","/juegopantalla/imagenes/j.JPG",
              "/juegopantalla/imagenes/k.JPG","/juegopantalla/imagenes/l.JPG",
              "/juegopantalla/imagenes/m.JPG","/juegopantalla/imagenes/n.JPG",
              "/juegopantalla/imagenes/Ñ.JPG","/juegopantalla/imagenes/o.JPG",
              "/juegopantalla/imagenes/p.JPG","/juegopantalla/imagenes/q.JPG",
              "/juegopantalla/imagenes/r.JPG","/juegopantalla/imagenes/s.JPG",
              "/juegopantalla/imagenes/t.JPG","/juegopantalla/imagenes/u.JPG",
              "/juegopantalla/imagenes/v.JPG","/juegopantalla/imagenes/w.JPG",
              "/juegopantalla/imagenes/x.JPG","/juegopantalla/imagenes/y.JPG",
              "/juegopantalla/imagenes/z.JPG","/juegopantalla/imagenes/@.JPG",
              "/juegopantalla/imagenes/$.JPG","/juegopantalla/imagenes/!.JPG",};
              vector = vectorABC;
              imagen = imagen1;
        }
        else if (nombre.compareTo("vectorABCD")==0)
        {
           this.jLabel2.setText("¡Comienza Presionando las letras Z, Y, X y Siguelo!");
            jLabel6.setText("Hoja Nº 9");
            char vectorABCD [] = {'Z','Y','X','W','V','U','T','S','R','Q','P','O','Ñ','N',
                       'M','L','K','J','I','H','G','F','E','D','C','B','A','@','$','!'};
             String  imagen2[] = {"/juegopantalla/imagenes/z.JPG",
              "/juegopantalla/imagenes/y.JPG",
              "/juegopantalla/imagenes/x.JPG","/juegopantalla/imagenes/w.JPG",
              "/juegopantalla/imagenes/v.JPG","/juegopantalla/imagenes/u.JPG",
              "/juegopantalla/imagenes/t.JPG","/juegopantalla/imagenes/s.JPG",
              "/juegopantalla/imagenes/r.JPG","/juegopantalla/imagenes/q.JPG",
              "/juegopantalla/imagenes/p.JPG","/juegopantalla/imagenes/o.JPG",
              "/juegopantalla/imagenes/Ñ.JPG","/juegopantalla/imagenes/n.JPG",
              "/juegopantalla/imagenes/m.JPG","/juegopantalla/imagenes/l.JPG",
              "/juegopantalla/imagenes/k.JPG","/juegopantalla/imagenes/j.JPG",
              "/juegopantalla/imagenes/i.JPG","/juegopantalla/imagenes/h.JPG",
              "/juegopantalla/imagenes/g.JPG","/juegopantalla/imagenes/f.JPG",
              "/juegopantalla/imagenes/e.JPG","/juegopantalla/imagenes/d.JPG",
              "/juegopantalla/imagenes/c.JPG","/juegopantalla/imagenes/b.JPG",
              "/juegopantalla/imagenes/a.JPG","/juegopantalla/imagenes/@.JPG",
              "/juegopantalla/imagenes/$.JPG","/juegopantalla/imagenes/!.JPG",};
             vector = vectorABCD;
             imagen = imagen2;
        }

        this.nombre = nombre;
        inicializarComponentesPropios();
    }
 private void inicializarComponentesPropios()
 {
  final javax.swing.JButton  arregloBotones [][] = {
                                                    {jB10, jB20, jB30, jB40, jB50},
                                                    {jB11, jB21, jB31, jB41, jB51},
                                                    {jB12, jB22, jB32, jB42, jB52},
                                                    {jB13, jB23, jB33, jB43, jB53},
                                                    {jB14, jB24, jB34, jB44, jB54},
                                                    {jB15, jB25, jB35, jB45, jB55},
                                                    };

   listaBoton = arregloBotones;
   Matriz matriz = new Matriz();
   asignarImagen (matriz.obtenerTableroRandomABC6X5(vector));
 }

 private String buscarChar(char elemento)
 {

     for (int i=0; i<31; i++)
     {
         if (vector[i] == elemento)
             return imagen[i];
     }
     System.out.println("ERROR NO ENCONTRE el elemento");
     return "";
 }


 private void asignarImagen(char vector [][])
 {
     
    for (int i=0 ; i<6 ; i++)
    {
      for (int j =0 ; j<5 ; j++)
      {
            listaBoton[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(buscarChar(vector[i][j]) )));
            listaBoton[i][j].setMnemonic((int)vector[i][j]);
      }
    }
 }


private boolean verificarnum(int num)
{
    if (  vector[pos] ==  num )
    {
       new acierto ().start();
        pos++;
        return true;
    }
    else
    {
      new equivoque().start();
        error++;
         JOptionPane.showMessageDialog(null,"Error letra incorrecta"  ,"Error ",2,null);
        return false;
       
    }
}

private void finJuego()
{
  if (pos ==27)
  {
      if (error <= 3 )
      {
          new win().start();
          
          if (nombre.compareTo("vectorABC")==0)
          {
           JOptionPane.showMessageDialog(null,"Muy bien, ha pasado al siguiente nivel"  ,"Felicitaciones ",2,null);
            PantallaTablero pantallaTablero = new PantallaTablero("vector2");
            pantallaTablero.setLocationRelativeTo(null);
            pantallaTablero.setVisible(true);
            this.setVisible(false);
          }
          if ((nombre.compareTo("vectorABCD")==0))
          {
           JOptionPane.showMessageDialog(null,"Terminaste el Examen pasaste de grado! "  ,"Felicitaciones ",2,null);
           this.setVisible(false);
          }
      }
      else
      {
        new cuckoo().start();
        JOptionPane.showMessageDialog(null,"REPITAMOS EL NIVEL UNA VEZ MAS! "  ,"Informacion ",2,null);
        PantallaTableroABC pantallaABC = new PantallaTableroABC(nombre);
        pantallaABC.setLocationRelativeTo(null);
        pantallaABC.setVisible(true);
        this.setVisible(false);
      }
  }
}



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jB15 = new javax.swing.JButton();
        jB25 = new javax.swing.JButton();
        jB35 = new javax.swing.JButton();
        jB45 = new javax.swing.JButton();
        jB55 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(juegopantalla.JuegoPantallaApp.class).getContext().getResourceMap(PantallaTableroABC.class);
        jB11.setActionCommand(resourceMap.getString("jB11.actionCommand")); // NOI18N
        jB11.setAutoscrolls(true);
        jB11.setName("jB11"); // NOI18N
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });
        getContentPane().add(jB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 60, 50));

        jB12.setActionCommand(resourceMap.getString("jB12.actionCommand")); // NOI18N
        jB12.setName("jB12"); // NOI18N
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });
        getContentPane().add(jB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 60, 50));

        jB13.setActionCommand(resourceMap.getString("jB13.actionCommand")); // NOI18N
        jB13.setName("jB13"); // NOI18N
        jB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB13ActionPerformed(evt);
            }
        });
        getContentPane().add(jB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 60, 50));

        jB14.setActionCommand(resourceMap.getString("jB14.actionCommand")); // NOI18N
        jB14.setName("jB14"); // NOI18N
        jB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB14ActionPerformed(evt);
            }
        });
        getContentPane().add(jB14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 60, 50));

        jB10.setActionCommand(resourceMap.getString("jB10.actionCommand")); // NOI18N
        jB10.setName("jB10"); // NOI18N
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });
        getContentPane().add(jB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 60, 50));

        jB20.setActionCommand(resourceMap.getString("jB20.actionCommand")); // NOI18N
        jB20.setName("jB20"); // NOI18N
        jB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB20ActionPerformed(evt);
            }
        });
        getContentPane().add(jB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 60, 50));

        jB21.setActionCommand(resourceMap.getString("jB21.actionCommand")); // NOI18N
        jB21.setName("jB21"); // NOI18N
        jB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB21ActionPerformed(evt);
            }
        });
        getContentPane().add(jB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 60, 50));

        jB22.setActionCommand(resourceMap.getString("jB22.actionCommand")); // NOI18N
        jB22.setName("jB22"); // NOI18N
        jB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB22ActionPerformed(evt);
            }
        });
        getContentPane().add(jB22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 60, 50));

        jB23.setActionCommand(resourceMap.getString("jB23.actionCommand")); // NOI18N
        jB23.setName("jB23"); // NOI18N
        jB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB23ActionPerformed(evt);
            }
        });
        getContentPane().add(jB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 60, 50));

        jB24.setActionCommand(resourceMap.getString("jB24.actionCommand")); // NOI18N
        jB24.setName("jB24"); // NOI18N
        jB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB24ActionPerformed(evt);
            }
        });
        getContentPane().add(jB24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 60, 50));

        jB30.setActionCommand(resourceMap.getString("jB30.actionCommand")); // NOI18N
        jB30.setName("jB30"); // NOI18N
        jB30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB30ActionPerformed(evt);
            }
        });
        getContentPane().add(jB30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 60, 50));

        jB31.setActionCommand(resourceMap.getString("jB31.actionCommand")); // NOI18N
        jB31.setName("jB31"); // NOI18N
        jB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB31ActionPerformed(evt);
            }
        });
        getContentPane().add(jB31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 60, 50));

        jB32.setActionCommand(resourceMap.getString("jB32.actionCommand")); // NOI18N
        jB32.setName("jB32"); // NOI18N
        jB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB32ActionPerformed(evt);
            }
        });
        getContentPane().add(jB32, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 60, 50));

        jB33.setActionCommand(resourceMap.getString("jB33.actionCommand")); // NOI18N
        jB33.setName("jB33"); // NOI18N
        jB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB33ActionPerformed(evt);
            }
        });
        getContentPane().add(jB33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 60, 50));

        jB34.setActionCommand(resourceMap.getString("jB34.actionCommand")); // NOI18N
        jB34.setName("jB34"); // NOI18N
        jB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB34ActionPerformed(evt);
            }
        });
        getContentPane().add(jB34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 60, 50));

        jB40.setActionCommand(resourceMap.getString("jB40.actionCommand")); // NOI18N
        jB40.setName("jB40"); // NOI18N
        jB40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB40ActionPerformed(evt);
            }
        });
        getContentPane().add(jB40, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 60, 50));

        jB41.setActionCommand(resourceMap.getString("jB41.actionCommand")); // NOI18N
        jB41.setName("jB41"); // NOI18N
        jB41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB41ActionPerformed(evt);
            }
        });
        getContentPane().add(jB41, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, 50));

        jB42.setActionCommand(resourceMap.getString("jB42.actionCommand")); // NOI18N
        jB42.setName("jB42"); // NOI18N
        jB42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB42ActionPerformed(evt);
            }
        });
        getContentPane().add(jB42, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 60, 50));

        jB43.setActionCommand(resourceMap.getString("jB43.actionCommand")); // NOI18N
        jB43.setName("jB43"); // NOI18N
        jB43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB43ActionPerformed(evt);
            }
        });
        getContentPane().add(jB43, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 60, 50));

        jB44.setActionCommand(resourceMap.getString("jB44.actionCommand")); // NOI18N
        jB44.setName("jB44"); // NOI18N
        jB44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB44ActionPerformed(evt);
            }
        });
        getContentPane().add(jB44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 60, 50));

        jB50.setActionCommand(resourceMap.getString("jB50.actionCommand")); // NOI18N
        jB50.setName("jB50"); // NOI18N
        jB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB50ActionPerformed(evt);
            }
        });
        getContentPane().add(jB50, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 60, 50));

        jB51.setActionCommand(resourceMap.getString("jB51.actionCommand")); // NOI18N
        jB51.setName("jB51"); // NOI18N
        jB51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB51ActionPerformed(evt);
            }
        });
        getContentPane().add(jB51, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 60, 50));

        jB52.setActionCommand(resourceMap.getString("jB52.actionCommand")); // NOI18N
        jB52.setName("jB52"); // NOI18N
        jB52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB52ActionPerformed(evt);
            }
        });
        getContentPane().add(jB52, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 60, 50));

        jB53.setActionCommand(resourceMap.getString("jB53.actionCommand")); // NOI18N
        jB53.setName("jB53"); // NOI18N
        jB53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB53ActionPerformed(evt);
            }
        });
        getContentPane().add(jB53, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 60, 50));

        jB54.setActionCommand(resourceMap.getString("jB54.actionCommand")); // NOI18N
        jB54.setName("jB54"); // NOI18N
        jB54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB54ActionPerformed(evt);
            }
        });
        getContentPane().add(jB54, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 60, 50));

        jB15.setText(resourceMap.getString("jB15.text")); // NOI18N
        jB15.setName("jB15"); // NOI18N
        jB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB15ActionPerformed(evt);
            }
        });
        jB15.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jB15InputMethodTextChanged(evt);
            }
        });
        getContentPane().add(jB15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 60, 50));

        jB25.setText(resourceMap.getString("jB25.text")); // NOI18N
        jB25.setName("jB25"); // NOI18N
        jB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB25ActionPerformed(evt);
            }
        });
        getContentPane().add(jB25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 60, 50));

        jB35.setText(resourceMap.getString("jB35.text")); // NOI18N
        jB35.setName("jB35"); // NOI18N
        jB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB35ActionPerformed(evt);
            }
        });
        getContentPane().add(jB35, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 60, 50));

        jB45.setText(resourceMap.getString("jB45.text")); // NOI18N
        jB45.setName("jB45"); // NOI18N
        jB45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB45ActionPerformed(evt);
            }
        });
        getContentPane().add(jB45, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 60, 50));

        jB55.setText(resourceMap.getString("jB55.text")); // NOI18N
        jB55.setName("jB55"); // NOI18N
        jB55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB55ActionPerformed(evt);
            }
        });
        getContentPane().add(jB55, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 60, 50));

        jButton10.setFont(resourceMap.getFont("jButton10.font")); // NOI18N
        jButton10.setForeground(resourceMap.getColor("jButton10.foreground")); // NOI18N
        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 90, 30));

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 390, 30));

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setForeground(resourceMap.getColor("jLabel6.foreground")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel5.setIcon(resourceMap.getIcon("jLabel5.icon")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 460, 110));

        jLabel4.setIcon(resourceMap.getIcon("jLabel4.icon")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 340));

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 30));

        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -20, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB11ActionPerformed
        if (verificarnum(jB11.getMnemonic()))
            jB11.setEnabled(false);
        finJuego();
}//GEN-LAST:event_jB11ActionPerformed

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

    private void jB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB14ActionPerformed

        if (verificarnum(jB14.getMnemonic()))
            jB14.setEnabled(false);
        finJuego();
    }//GEN-LAST:event_jB14ActionPerformed

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10ActionPerformed
        if (verificarnum(jB10.getMnemonic()))
            jB10.setEnabled(false);
        finJuego();
}//GEN-LAST:event_jB10ActionPerformed

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

    private void jB15InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jB15InputMethodTextChanged

    }//GEN-LAST:event_jB15InputMethodTextChanged

    private void jB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB15ActionPerformed
       if (verificarnum(jB15.getMnemonic()))
            jB15.setEnabled(false);
        finJuego();
    }//GEN-LAST:event_jB15ActionPerformed

    private void jB25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB25ActionPerformed
       if (verificarnum(jB25.getMnemonic()))
            jB25.setEnabled(false);
        finJuego();
    }//GEN-LAST:event_jB25ActionPerformed

    private void jB35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB35ActionPerformed
           if (verificarnum(jB35.getMnemonic()))
            jB35.setEnabled(false);
        finJuego();
    }//GEN-LAST:event_jB35ActionPerformed

    private void jB45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB45ActionPerformed
          if (verificarnum(jB45.getMnemonic()))
            jB45.setEnabled(false);
        finJuego();
    }//GEN-LAST:event_jB45ActionPerformed

    private void jB55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB55ActionPerformed
        if (verificarnum(jB55.getMnemonic()))
            jB55.setEnabled(false);
        finJuego();
    }//GEN-LAST:event_jB55ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        this.setVisible(false);
}//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaTableroABC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB13;
    private javax.swing.JButton jB14;
    private javax.swing.JButton jB15;
    private javax.swing.JButton jB20;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JButton jB23;
    private javax.swing.JButton jB24;
    private javax.swing.JButton jB25;
    private javax.swing.JButton jB30;
    private javax.swing.JButton jB31;
    private javax.swing.JButton jB32;
    private javax.swing.JButton jB33;
    private javax.swing.JButton jB34;
    private javax.swing.JButton jB35;
    private javax.swing.JButton jB40;
    private javax.swing.JButton jB41;
    private javax.swing.JButton jB42;
    private javax.swing.JButton jB43;
    private javax.swing.JButton jB44;
    private javax.swing.JButton jB45;
    private javax.swing.JButton jB50;
    private javax.swing.JButton jB51;
    private javax.swing.JButton jB52;
    private javax.swing.JButton jB53;
    private javax.swing.JButton jB54;
    private javax.swing.JButton jB55;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
