package javaSwing.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
    private JMenuBar mb;  //Espacio reservado para colocar la barra
    private JMenu menuOpciones, menuCalcular, menuAcerca, menuColorFondo;
    private JMenuItem itemCalculo, itemRojo, itemNegro, itemMorado, itemCreador, itemSalir, itemNuevo;
    private JLabel lblLogo, lblBienvenido, lblTitulo, lblNombre, lblAPaterno, lblAMaterno, lblDepartamento,
            lblAntiguedad, lblResul, lblFooter;
    private JTextField tfNombre, tfAPaterno, tfAMaterno;
    private JComboBox listaDepartamento, listaAntiguedad;
    private JScrollPane scroll1;
    private JTextArea textArea1;
    private JPanel panel;

    public Principal(){
        iniciarComponentes();
        barraDeOpciones();
        submenuOpciones();
        submenuCalcular();
        submenuAcercaDe();
    }

    //Panel - Icono de Ventana - Titulo de Ventana
    private void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        setTitle("Pantalla principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Barra de menu y sus opciones
    private void barraDeOpciones(){
        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));  //Barra color rojo
        setJMenuBar(mb);  //Establece el objeto mb que es una barra en el espacio reservado

        //Opciones de Menu
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);  //Agregar la opcion a la barra

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        menuAcerca = new JMenu("Acerca de");
        menuAcerca.setBackground(new Color(255,0,0));
        menuAcerca.setFont(new Font("Andale Mono",1,14));
        menuAcerca.setForeground(new Color(255,255,255));
        mb.add(menuAcerca);
    }

    //Items de las opciones de menu
    private void submenuOpciones(){
        //Submenu
        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        //Se agrega un tipo Jmenu dentro de otro debido a que este tendra mas opciones dentro y un item no podria almacenarlas
        menuOpciones.add(menuColorFondo);

        //Opciones del submenu "Color de Fondo"
        itemRojo = new JMenuItem("Rojo");
        itemRojo.setFont(new Font("Andale Mono",1,14));
        itemRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(itemRojo);
        itemRojo.addActionListener(this);  //Ejecuta eventos de la misma forma que un boton

        itemNegro = new JMenuItem("Negro");
        itemNegro.setFont(new Font("Andale Mono",1,14));
        itemNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(itemNegro);
        itemNegro.addActionListener(this);

        itemMorado = new JMenuItem("Morado");
        itemMorado.setFont(new Font("Andale Mono",1,14));
        itemMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(itemMorado);
        itemMorado.addActionListener(this);

        //Opciones --> Nuevo
        itemNuevo = new JMenuItem("Nuevo");
        itemNuevo.setFont(new Font("Andale Mono",1,14));
        itemNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(itemNuevo);
        itemNuevo.addActionListener(this);

        //Opciones --> Salir
        itemSalir = new JMenuItem("Salir");
        itemSalir.setFont(new Font("Andale Mono",1,14));
        itemSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(itemSalir);
        itemSalir.addActionListener(this);
    }

    //Calcular
    private void submenuCalcular(){
        //Calcular --> Vacaciones
        itemCalculo = new JMenuItem("Vacaciones");
        itemCalculo.setFont(new Font("Andale Mono",1,14));
        itemCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(itemCalculo);
        itemCalculo.addActionListener(this);
    }

    //Acerca de
    private void submenuAcercaDe(){
        //Acerca de --> El Creaddor
        itemCreador = new JMenuItem("El Creador");
        itemCreador.setFont(new Font("Andale Mono",1,14));
        itemCreador.setForeground(new Color(255,0,0));
        menuAcerca.add(itemCreador);
        itemCreador.addActionListener(this);
    }

    //Metodo para ejecutar los eventos de la barra de menu
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == itemCreador){
        }
    }

    public static void main(String[] args){
        Principal pp = new Principal();
        pp.setVisible(true);
        pp.setBounds(0,0,500,500);
        pp.setResizable(false);
        pp.setLocationRelativeTo(null);
    }
}
