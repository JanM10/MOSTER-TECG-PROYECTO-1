import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;


public class VentanaJuegoCliente extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form VentanaJuegoHOST
     */
    int numeroCarta = 1;
    public VentanaJuegoCliente() {
        initComponents();
        Agregar1.setEnabled(false);
        Agregar2.setEnabled(false);
        Agregar3.setEnabled(false);
        Agregar4.setEnabled(false);
        Agregar5.setEnabled(false);
        //this.getRootPane().setDefaultButton(this.enviarBoton);
        Servidor s = new Servidor(6000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
        System.out.println("Cliente conectado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mana = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vida = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto1 = new javax.swing.JTextArea();
        miMano = new javax.swing.JLabel();
        anteriorBoton = new javax.swing.JButton();
        siguenteBoton = new javax.swing.JButton();
        enemigo1 = new javax.swing.JLabel();
        Agregar2 = new javax.swing.JButton();
        Agregar1 = new javax.swing.JButton();
        Agregar3 = new javax.swing.JButton();
        Agregar4 = new javax.swing.JButton();
        Agregar5 = new javax.swing.JButton();
        carta4 = new javax.swing.JLabel();
        carta5 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        carta1 = new javax.swing.JLabel();
        miDeck = new javax.swing.JLabel();
        sacarCarta = new javax.swing.JButton();
        enemigo5 = new javax.swing.JLabel();
        enemigo2 = new javax.swing.JLabel();
        enemigo3 = new javax.swing.JLabel();
        enemigo4 = new javax.swing.JLabel();
        terminarRonda = new javax.swing.JButton();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("CLIENTE");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Mana:");

        mana.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        mana.setText("200");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Vida:");

        vida.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        vida.setText("1000");

        txtTexto1.setEditable(false);
        txtTexto1.setColumns(20);
        txtTexto1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtTexto1.setRows(5);
        jScrollPane1.setViewportView(txtTexto1);

        miMano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartas/1.jpg"))); // NOI18N

        anteriorBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        anteriorBoton.setText("Anterior");
        anteriorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBotonActionPerformed(evt);
            }
        });

        siguenteBoton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        siguenteBoton.setText("Siguente");
        siguenteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguenteBotonActionPerformed(evt);
            }
        });

        Agregar2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Agregar2.setText("Agregar");
        Agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar2ActionPerformed(evt);
            }
        });

        Agregar1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Agregar1.setText("Agregar");
        Agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar1ActionPerformed(evt);
            }
        });

        Agregar3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Agregar3.setText("Agregar");
        Agregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar3ActionPerformed(evt);
            }
        });

        Agregar4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Agregar4.setText("Agregar");
        Agregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar4ActionPerformed(evt);
            }
        });

        Agregar5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Agregar5.setText("Agregar");
        Agregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar5ActionPerformed(evt);
            }
        });

        sacarCarta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sacarCarta.setText("Sacar Carta");
        sacarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarCartaActionPerformed(evt);
            }
        });

        terminarRonda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        terminarRonda.setText("TERMINAR RONDA");
        terminarRonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarRondaActionPerformed(evt);
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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(207, 207, 207)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(sacarCarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(miDeck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(terminarRonda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(miMano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(anteriorBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(siguenteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(56, 56, 56)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(enemigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(enemigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(Agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Agregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(carta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Agregar3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                                        .addComponent(enemigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(Agregar4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                                                        .addComponent(carta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(enemigo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(mana, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(carta5, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                                .addComponent(Agregar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(enemigo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(589, 589, 589)
                                        .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(891, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(vida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(mana)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(enemigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(enemigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(enemigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(enemigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(enemigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(54, 54, 54)))))
                                .addGap(131, 131, 131)
                                .addComponent(terminarRonda, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(miMano, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(miDeck, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Agregar1)
                                                .addComponent(Agregar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Agregar3)
                                                .addComponent(Agregar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Agregar5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(siguenteBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(anteriorBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(sacarCarta, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))))
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(515, Short.MAX_VALUE)
                                        .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)))
        );

        pack();
    }// </editor-fold>

    /**
     * Se le resta uno a la variable para cambiar la carta actual a la anterior
     * @param evt
     */
    private void anteriorBotonActionPerformed(java.awt.event.ActionEvent evt) {
        numeroCarta -= 1;
        System.out.println("EL NUMERO DISMINUYO");
        if(numeroCarta == 0){
            numeroCarta = 16;
            System.out.println("EL NUMERO VOLVIO AL PRIMERO");
            //CAMBIO DE IMAGEN
        }
    }

    /**
     * Se le suma uno a la variable para cambiar la carta actual a la siguente
     * @param evt
     */
    private void siguenteBotonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        numeroCarta += 1;
        System.out.println("EL NUMERO AUMENTO");
        String numeroCartaString = String.valueOf(numeroCarta);
        miMano.setIcon(new ImageIcon(getClass().getResource("Cartas/" + numeroCartaString+ ".jpg")));
        int numeroCartasInt = Integer.parseInt(numeroCartaString);
        System.out.println(numeroCartasInt);
        if(numeroCarta == 17){
            numeroCarta = 1;
            System.out.println("EL NUMERO VOLVIO AL PRIMERO");
            //CAMBIO DE IMAGEN
        }


    }

    /**
     * Se agrega una carta en el label carta1
     * @param evt
     */
    private void Agregar1ActionPerformed(java.awt.event.ActionEvent evt) {
        miMano.setIcon(new ImageIcon(getClass().getResource("")));
        carta1.setIcon(new ImageIcon(getClass().getResource("Cartas/1.jpg")));

//        Cliente c = new Cliente(6000, mensaje);
//        Thread t = new Thread(c);
//        t.start();
        //String mensaje = this.textoEnviar1.getText();

    }

    /**
     * Se agrega una carta en el label carta2
     * @param evt
     */
    private void Agregar2ActionPerformed(java.awt.event.ActionEvent evt) {
        miMano.setIcon(new ImageIcon(getClass().getResource("")));
        carta2.setIcon(new ImageIcon(getClass().getResource("Cartas/1.jpg")));

    }

    /**
     * Se agrega una carta en el label carta3
     * @param evt
     */
    private void Agregar3ActionPerformed(java.awt.event.ActionEvent evt) {
        miMano.setIcon(new ImageIcon(getClass().getResource("")));
        carta3.setIcon(new ImageIcon(getClass().getResource("Cartas/1.jpg")));
    }

    /**
     * Se agrega una carta en el label carta4
     * @param evt
     */
    private void Agregar4ActionPerformed(java.awt.event.ActionEvent evt) {
        miMano.setIcon(new ImageIcon(getClass().getResource("")));
        carta4.setIcon(new ImageIcon(getClass().getResource("Cartas/1.jpg")));
    }

    /**
     * Se agrega una carta en el label carta5
     * @param evt
     */
    private void Agregar5ActionPerformed(java.awt.event.ActionEvent evt) {
        miMano.setIcon(new ImageIcon(getClass().getResource("")));
        carta5.setIcon(new ImageIcon(getClass().getResource("Cartas/1.jpg")));
    }

    /**
     * Saca una carta de la pila y la agrega a miMano
     * @param evt
     */
    private void sacarCartaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    /**
     * Al precionar este boton el jugador termina su ronda y los botones se deshabilitan
     * @param evt
     */
    private void terminarRondaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String mensaje = String.valueOf(numeroCarta);
        this.txtTexto1.append(mensaje);

        String cambioDeBotones = "Z";
        this.txtTexto1.append(cambioDeBotones);

        Agregar1.setEnabled(false);
        Agregar2.setEnabled(false);
        Agregar3.setEnabled(false);
        Agregar4.setEnabled(false);
        Agregar5.setEnabled(false);
        terminarRonda.setEnabled(false);

        Cliente c = new Cliente(6000, cambioDeBotones);
        Cliente d = new Cliente(6000, mensaje);
        Thread t = new Thread(c);
        Thread t2 = new Thread(d);
        t.start();
        t2.start();
    }

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
            java.util.logging.Logger.getLogger(VentanaJuegoHOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoHOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoHOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuegoHOST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuegoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Agregar1;
    private javax.swing.JButton Agregar2;
    private javax.swing.JButton Agregar3;
    private javax.swing.JButton Agregar4;
    private javax.swing.JButton Agregar5;
    private javax.swing.JButton anteriorBoton;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel enemigo1;
    private javax.swing.JLabel enemigo2;
    private javax.swing.JLabel enemigo3;
    private javax.swing.JLabel enemigo4;
    private javax.swing.JLabel enemigo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mana;
    private javax.swing.JLabel miDeck;
    private javax.swing.JLabel miMano;
    private javax.swing.JButton sacarCarta;
    private javax.swing.JButton siguenteBoton;
    private javax.swing.JButton terminarRonda;
    private javax.swing.JTextArea txtTexto1;
    private javax.swing.JLabel vida;
    // End of variables declaration

    /**
     * El observable espera a que llegue un mensaje(carta) y la coloca donde debe.
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("AQUI ESTA " + arg.toString());

        switch(arg.toString()){
            case "1":
                enemigo1.setIcon(new ImageIcon(getClass().getResource("Cartas/1.jpg")));
                break;
            case "2":
                enemigo1.setIcon(new ImageIcon(getClass().getResource("Cartas/2.jpg")));
                break;
            case "Z":
                Agregar1.setEnabled(true);
                Agregar2.setEnabled(true);
                Agregar3.setEnabled(true);
                Agregar4.setEnabled(true);
                Agregar5.setEnabled(true);
                break;
            default:
                System.out.println("Carta no valida");
                break;
        }
        this.txtTexto1.append((String) arg);
    }
}
