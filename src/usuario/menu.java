/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.ArrayList;
import negocio.*;


/**
 *
 * @author Familia
 */
public class Menu extends javax.swing.JFrame {
    
    public static Partido partido;
    public static ArrayList<Miembro> miembros;
    public static ArrayList<Denegacion> denegaciones;
    public static Miembro nuevoMiembro;
    public static ArrayList<Criterio> criterios;
    public static ArrayList<AlgortimoEquipo> algoritmos;
    
    /**
     * Creates new form menu
     */
    public Menu() {
        initComponents();
        inicializarCriterios();
	inicializarAlgoritmos();
	cargarMiembros();
	denegaciones = new ArrayList<Denegacion>();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bOrganizarPartido = new javax.swing.JButton();
        bInscribirsePartido = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();
        bIncorporarJugador = new javax.swing.JButton();
        bAdministrarJugador = new javax.swing.JButton();
        bGenerarEquipos = new javax.swing.JButton();
        bCalificar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bOrganizarPartido.setText("Organizar Partido");
        bOrganizarPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bOrganizarPartidoMouseClicked(evt);
            }
        });

        bInscribirsePartido.setText("Inscribirse al partido");
        bInscribirsePartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bInscribirsePartidoMouseClicked(evt);
            }
        });

        bBaja.setText("Darse de baja del partido");
        bBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBajaMouseClicked(evt);
            }
        });

        bIncorporarJugador.setText("Incorporar nuevo jugador");
        bIncorporarJugador.setMaximumSize(new java.awt.Dimension(159, 23));
        bIncorporarJugador.setMinimumSize(new java.awt.Dimension(159, 23));
        bIncorporarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bIncorporarJugadorMouseClicked(evt);
            }
        });

        bAdministrarJugador.setText("Administrar nuevo jugador");
        bAdministrarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAdministrarJugadorMouseClicked(evt);
            }
        });

        bGenerarEquipos.setText("Generar equipos tentativos");
        bGenerarEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bGenerarEquiposMouseClicked(evt);
            }
        });

        bCalificar.setText("Calificar jugadores");
        bCalificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCalificarMouseClicked(evt);
            }
        });

        bCerrar.setText("Cerrar programa");
        bCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCerrarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido al Sistema de Partidos");

        jLabel2.setText("Seleccione una opción: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCerrar)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bCalificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bGenerarEquipos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addComponent(bIncorporarJugador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bInscribirsePartido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bOrganizarPartido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAdministrarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bOrganizarPartido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bInscribirsePartido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bIncorporarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAdministrarJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGenerarEquipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(bCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOrganizarPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bOrganizarPartidoMouseClicked
        new OrganizarPartido().setVisible(true);

    }//GEN-LAST:event_bOrganizarPartidoMouseClicked

    private void bInscribirsePartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInscribirsePartidoMouseClicked
        new InscribirsePartido().setVisible(true);
    }//GEN-LAST:event_bInscribirsePartidoMouseClicked

    private void bBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBajaMouseClicked
       new DarseBaja().setVisible(true);
        
    }//GEN-LAST:event_bBajaMouseClicked

    private void bIncorporarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bIncorporarJugadorMouseClicked
        new IncorporarJugador().setVisible(true);
    }//GEN-LAST:event_bIncorporarJugadorMouseClicked

    private void bAdministrarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdministrarJugadorMouseClicked
       new AdministrarNuevoJugador().setVisible(true);
    }//GEN-LAST:event_bAdministrarJugadorMouseClicked

    private void bGenerarEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGenerarEquiposMouseClicked
        new GenerarEquipos().setVisible(true);
    }//GEN-LAST:event_bGenerarEquiposMouseClicked

    private void bCalificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCalificarMouseClicked
        new CalificarJugador().setVisible(true);
    }//GEN-LAST:event_bCalificarMouseClicked

    private void bCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    //metodo utilitario para pruebas
	private void cargarMiembros()
	{
		miembros = new ArrayList<Miembro>();
		
		Miembro miembro1 = new Miembro(1, "Juan", "Perez" , 15);
		Miembro miembro2 = new Miembro(2, "Pedro", "Quintana" , 20);
		Miembro miembro3 = new Miembro(3, "Damian", "Quinteros" , 27);
		Miembro miembro4 = new Miembro(4, "Santiago", "Fernandez" , 15);
		Miembro miembro5 = new Miembro(5, "Alberto", "Ramirez" , 18);
		Miembro miembro6 = new Miembro(6, "Leonardo", "Ortega" , 17);
		Miembro miembro7 = new Miembro(7, "Hernan", "Comar" , 18);
		Miembro miembro8 = new Miembro(8, "Facundo", "Saavedra" , 19);
		Miembro miembro9 = new Miembro(9, "Juan Pablo", "Quiroga" , 25);
		Miembro miembro10 = new Miembro(10, "Lautaro", "Reynoso" , 26);
		Miembro miembro11 = new Miembro(11, "Martin", "Piedrabuena" , 14);
		Miembro miembro12 = new Miembro(12, "Esteban", "Ala Triste" , 16);
		Miembro miembro13 = new Miembro(13, "Raul", "Pontmercy" , 18);
		Miembro miembro14 = new Miembro(14, "Victor", "Valjean" , 19);
		Miembro miembro15 = new Miembro(15, "Ignacio", "Kiman" , 16);
		Miembro miembro16 = new Miembro(16, "Juan Ignacio", "Jarvet" , 18);
		Miembro miembro17 = new Miembro(17, "Juan Patricio", "Dominguez" , 25);
		Miembro miembro18 = new Miembro(18, "Patricio", "Ventura" , 28);
		Miembro miembro19 = new Miembro(19, "Joaquin", "Burocco" , 24);
		Miembro miembro20 = new Miembro(20, "Nicolas", "Cardozo" , 20);
		Miembro miembro21 = new Miembro(21, "Fernando", "Novoa" , 15);
		Miembro miembro22 = new Miembro(22, "Juan Manuel", "Iba�ez" , 22);
		Miembro miembro23 = new Miembro(23, "Juan Martin", "Bugarin" , 24);
		Miembro miembro24 = new Miembro(24, "Constantino", "Pereyra" , 19);
		Miembro miembro25 = new Miembro(25, "Augusto", "Ledesma" , 15);
		
		
		miembros.add(miembro1);
		miembros.add(miembro2);
		miembros.add(miembro3);
		miembros.add(miembro4);
		miembros.add(miembro5);
		miembros.add(miembro6);
		miembros.add(miembro7);
		miembros.add(miembro8);
		miembros.add(miembro9);
		miembros.add(miembro10);
		miembros.add(miembro11);
		miembros.add(miembro12);
		miembros.add(miembro13);
		miembros.add(miembro14);
		miembros.add(miembro15);
		miembros.add(miembro16);
		miembros.add(miembro17);
		miembros.add(miembro18);
		miembros.add(miembro19);
		miembros.add(miembro20);
		miembros.add(miembro21);
		miembros.add(miembro22);
		miembros.add(miembro23);
		miembros.add(miembro24);
		miembros.add(miembro25);
		
	}

        
        //Inicializa los cirterios existentes hasta el momento
	private static void inicializarCriterios()
	{
		criterios = new ArrayList<Criterio>();
		criterios.add(new Handicap());
		criterios.add(new PromedioUltimoPartido());
		criterios.add(new PromedioNPartidos());
		criterios.add(new Mix());
	}
	
	//Inicializa los algoritmos de eleccion de equipos
	//existentes hasta el momento
	private static void inicializarAlgoritmos()
	{
		algoritmos = new ArrayList<AlgortimoEquipo>();
		algoritmos.add(new ParesEImpares());
		algoritmos.add(new SegundoAlgoritmo());
		
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdministrarJugador;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bCalificar;
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bGenerarEquipos;
    private javax.swing.JButton bIncorporarJugador;
    private javax.swing.JButton bInscribirsePartido;
    private javax.swing.JButton bOrganizarPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
