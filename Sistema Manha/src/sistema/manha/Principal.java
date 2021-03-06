/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.manha;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Jason Santos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jdpPrincipal.setUI(null);
        menuEnderecos.setVisible(false);
        menuAparencia.setVisible(false);
        menuRelogio.setVisible(false);        
        itemLogoff.setVisible(false);
        menuAgenda.setVisible(false);
        try
        {
            jdpPrincipal.add(slogan);
            slogan.setMaximum(true);
            //maximiza a tela de slogan
            slogan.setVisible(true);
        }catch (Exception erro){}
        Autenticacao autenticar=new Autenticacao();
        jdpPrincipal.add(autenticar);
        autenticar.setVisible(true);
        conexao();
        menuRelogio.setEnabled(false);
        ActionListener atualizaHorario=
                new ActionListener()
        {
            public void actionPerformed
                    (ActionEvent e)
            {
                Date horario=new Date();
                menuRelogio.setText
                    (formataHorario.format(horario));
            }                
        };        
        tempo=new Timer(1000,atualizaHorario);
        tempo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuLogin = new javax.swing.JMenu();
        itemAutenticar = new javax.swing.JMenuItem();
        itemLogoff = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemFechar = new javax.swing.JMenuItem();
        menuEnderecos = new javax.swing.JMenu();
        itemCadastrarEnderecos = new javax.swing.JMenuItem();
        itemConsultarEnderecos = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        itemCadastrarContato = new javax.swing.JMenuItem();
        itemConsultarContato = new javax.swing.JMenuItem();
        menuAparencia = new javax.swing.JMenu();
        itemCor = new javax.swing.JMenuItem();
        itemSlogan = new javax.swing.JMenuItem();
        menuRelogio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuLogin.setText("Login");

        itemAutenticar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        itemAutenticar.setText("Autenticar");
        itemAutenticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAutenticarActionPerformed(evt);
            }
        });
        menuLogin.add(itemAutenticar);

        itemLogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        itemLogoff.setText("Logoff");
        itemLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoffActionPerformed(evt);
            }
        });
        menuLogin.add(itemLogoff);
        menuLogin.add(jSeparator1);

        itemFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        itemFechar.setText("Fechar");
        itemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharActionPerformed(evt);
            }
        });
        menuLogin.add(itemFechar);

        barraMenu.add(menuLogin);

        menuEnderecos.setText("Endereços");

        itemCadastrarEnderecos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        itemCadastrarEnderecos.setText("Cadastrar Endereços");
        itemCadastrarEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarEnderecosActionPerformed(evt);
            }
        });
        menuEnderecos.add(itemCadastrarEnderecos);

        itemConsultarEnderecos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        itemConsultarEnderecos.setText("Consultar Endereços");
        itemConsultarEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarEnderecosActionPerformed(evt);
            }
        });
        menuEnderecos.add(itemConsultarEnderecos);

        barraMenu.add(menuEnderecos);

        menuAgenda.setText("Agenda");

        itemCadastrarContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        itemCadastrarContato.setText("Cadastrar Contato");
        itemCadastrarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarContatoActionPerformed(evt);
            }
        });
        menuAgenda.add(itemCadastrarContato);

        itemConsultarContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        itemConsultarContato.setText("Consultar Contato");
        itemConsultarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarContatoActionPerformed(evt);
            }
        });
        menuAgenda.add(itemConsultarContato);

        barraMenu.add(menuAgenda);

        menuAparencia.setText("Aparência do Sistema");

        itemCor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        itemCor.setText("Cor de Fundo");
        itemCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCorActionPerformed(evt);
            }
        });
        menuAparencia.add(itemCor);

        itemSlogan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        itemSlogan.setText("Mostrar Slogan");
        itemSlogan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSloganActionPerformed(evt);
            }
        });
        menuAparencia.add(itemSlogan);

        barraMenu.add(menuAparencia);
        barraMenu.add(menuRelogio);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAutenticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAutenticarActionPerformed
        Autenticacao autenticar=new Autenticacao();
        jdpPrincipal.add(autenticar);
        autenticar.setVisible(true);
    }//GEN-LAST:event_itemAutenticarActionPerformed

    private void itemCadastrarEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarEnderecosActionPerformed
        CadastrarAlterarEnderecos cadastrar=new 
        CadastrarAlterarEnderecos();
        jdpPrincipal.add(cadastrar);
        cadastrar.setVisible(true);
    }//GEN-LAST:event_itemCadastrarEnderecosActionPerformed

    private void itemConsultarEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarEnderecosActionPerformed
        ConsultarEnderecos consultar=new 
        ConsultarEnderecos();
        jdpPrincipal.add(consultar);
        consultar.setVisible(true);
    }//GEN-LAST:event_itemConsultarEnderecosActionPerformed

    private void itemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharActionPerformed
        if (jdpPrincipal.getAllFrames().length==1)
        {
            Object[] opcoes={"Sim","Não"};
            int retorno=JOptionPane.showOptionDialog
            (null,"Tem certeza que deseja encerrar?",
            "Encerrar",JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,
            opcoes,opcoes[0]);
            if (retorno==0)
            {
                try
                {
                    conexao.close();
                }catch (SQLException e)
                {
                    JOptionPane.showMessageDialog(null,
                    "Erro ao desconectar: " + 
                    e.getMessage(),"Erro",
                    JOptionPane.ERROR_MESSAGE);
                }catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null,
                    "Erro: " + 
                    e.getMessage(),"Erro",
                    JOptionPane.ERROR_MESSAGE);
                }
                dispose();
            } 
        }else
        {
            JOptionPane.showMessageDialog(null,
            "Existem janelas abertas!!! Feche-as antes",
            "Fechar",JOptionPane.ERROR_MESSAGE);
        }           
    }//GEN-LAST:event_itemFecharActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.itemFecharActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void itemSloganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSloganActionPerformed
        slogan.setVisible(true);
        slogan.moveToBack();
    }//GEN-LAST:event_itemSloganActionPerformed

    private void itemCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCorActionPerformed
        Color corFundo=JColorChooser.
        showDialog(this,
        "Escolha uma Cor Para o Plano de Fundo",
        this.getBackground());
        if (corFundo!=null)
        {
            slogan.setVisible(false);
            jdpPrincipal.setBackground(corFundo);
        }
    }//GEN-LAST:event_itemCorActionPerformed

    private void itemLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoffActionPerformed
        if (jdpPrincipal.getAllFrames().length==1)
        {
            itemAutenticar.setVisible(true);
            itemLogoff.setVisible(false);
            menuEnderecos.setVisible(false);
            menuAparencia.setVisible(false);
            menuRelogio.setVisible(false);
            menuAgenda.setVisible(false);
            Autenticacao autenticar=new Autenticacao();
            jdpPrincipal.add(autenticar);
            autenticar.setVisible(true); 
        }else
        {
            JOptionPane.showMessageDialog(null,
            "Existem janelas abertas!!! Feche-as antes",
            "Logoff",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_itemLogoffActionPerformed

    private void itemCadastrarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarContatoActionPerformed
        CadastrarAlterarContatos cadastrar=new 
        CadastrarAlterarContatos();
        jdpPrincipal.add(cadastrar);
        cadastrar.setVisible(true);
    }//GEN-LAST:event_itemCadastrarContatoActionPerformed

    private void itemConsultarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarContatoActionPerformed
        ConsultarContatos consultar=new 
        ConsultarContatos();
        jdpPrincipal.add(consultar);
        consultar.setVisible(true);
    }//GEN-LAST:event_itemConsultarContatoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    private void conexao()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            conexao=DriverManager.getConnection
            ("jdbc:postgresql://Localhost:5432/sistema",
              "postgres","ftec");
            //endereço do servidor,porta,nome do banco, 
            //usuário,senha 
        }catch (ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,
            "Erro na conexão com o banco de dados. Erro " 
            + e.getMessage(),"Erro",
            JOptionPane.ERROR_MESSAGE);
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,
            "Erro de SQL: " 
            + e.getMessage(),"Erro",
            JOptionPane.ERROR_MESSAGE);
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,
            "Erro: " 
            + e.getMessage(),"Erro",
            JOptionPane.ERROR_MESSAGE);
        }
    }
    private Date horario=new Date();
    private DateFormat formataHorario=new
            SimpleDateFormat("HH:mm:ss");
    private Timer tempo;
    protected static Connection conexao;
    private Slogan slogan=new Slogan();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    protected static javax.swing.JMenuItem itemAutenticar;
    private javax.swing.JMenuItem itemCadastrarContato;
    private javax.swing.JMenuItem itemCadastrarEnderecos;
    private javax.swing.JMenuItem itemConsultarContato;
    private javax.swing.JMenuItem itemConsultarEnderecos;
    private javax.swing.JMenuItem itemCor;
    private javax.swing.JMenuItem itemFechar;
    protected static javax.swing.JMenuItem itemLogoff;
    private javax.swing.JMenuItem itemSlogan;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    protected static javax.swing.JDesktopPane jdpPrincipal;
    protected static javax.swing.JMenu menuAgenda;
    protected static javax.swing.JMenu menuAparencia;
    protected static javax.swing.JMenu menuEnderecos;
    private javax.swing.JMenu menuLogin;
    protected static javax.swing.JMenu menuRelogio;
    // End of variables declaration//GEN-END:variables
}
