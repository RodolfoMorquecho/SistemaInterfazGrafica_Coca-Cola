package javaSwing.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener, ItemListener{
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
        logotipoBienvenida();
        informacionPersonal();
        informacionLaboral();
        footer();
    }

    //Panel - Icono de Ventana - Titulo de Ventana
    private void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(new Color(255,0,0));  //Panel de color rojo por default
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

    //Logotipo principal Coca-Cola
    private void logotipoBienvenida(){
        //Imagen de logo
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));
        lblLogo = new JLabel(imagen);
        lblLogo.setBounds(5,5,250,100);
        panel.add(lblLogo);

        //"Bienvenido"
        lblBienvenido = new JLabel("Bienvenido");
        lblBienvenido.setBounds(290,30,250,50);
        lblBienvenido.setFont(new Font("Andale Mono",1,32));
        lblBienvenido.setForeground(new Color(255,255,255));
        panel.add(lblBienvenido);

        //Titulo de apartado
        lblTitulo = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        lblTitulo.setBounds(50,140,650,30);
        lblTitulo.setFont(new Font("Andale Mono",0,22));
        lblTitulo.setForeground(new Color(255,255,255));
        panel.add(lblTitulo);
    }

    //Etiquetas previas a campos y area de texto de informacion personal
    private void informacionPersonal(){
        //Etiqueta de Nombre
        lblNombre = new JLabel("Nombre Completo:");
        lblNombre.setBounds(25,195,150,25);
        lblNombre.setFont(new Font("Andale Mono",1,12));
        lblNombre.setForeground(new Color(255,255,255));
        panel.add(lblNombre);

        //Campo para nombre
        tfNombre = new JTextField();
        tfNombre.setBounds(25,220,150,25);
        tfNombre.setBackground(new Color(228,228,228));
        tfNombre.setFont(new Font("Andale Mono",1,12));
        tfNombre.setForeground(new Color(255,0,0));
        panel.add(tfNombre);

        //Etiqueta apellido paterno
        lblAPaterno = new JLabel("Apellido Paterno:");
        lblAPaterno.setBounds(25,255,150,25);
        lblAPaterno.setFont(new Font("Andale Mono",1,12));
        lblAPaterno.setForeground(new Color(255,255,255));
        panel.add(lblAPaterno);

        //Campo para apellido paterno
        tfAPaterno = new JTextField();
        tfAPaterno.setBounds(25,280,150,25);
        tfAPaterno.setBackground(new Color(228,228,228));
        tfAPaterno.setFont(new Font("Andale Mono",1,12));
        tfAPaterno.setForeground(new Color(255,0,0));
        panel.add(tfAPaterno);

        //Etiqueta apellido materno
        lblAMaterno = new JLabel("Apellido Materno:");
        lblAMaterno.setBounds(25,315,150,25);
        lblAMaterno.setFont(new Font("Andale Mono",1,12));
        lblAMaterno.setForeground(new Color(255,255,255));
        panel.add(lblAMaterno);

        //Campo para apellido materno
        tfAMaterno = new JTextField();
        tfAMaterno.setBounds(25,340,150,25);
        tfAMaterno.setBackground(new Color(228,228,228));
        tfAMaterno.setFont(new Font("Andale Mono",1,12));
        tfAMaterno.setForeground(new Color(255,0,0));
        panel.add(tfAMaterno);
    }

    //Etiquetas previas a lista y area de texto de informacion laboral
    private void informacionLaboral(){
        //Etiqueta de Departamento
        lblDepartamento = new JLabel("Selecciona el Departamento:");
        lblDepartamento.setBounds(225,195,220,25);
        lblDepartamento.setFont(new Font("Andale Mono",1,12));
        lblDepartamento.setForeground(new Color(255,255,255));
        panel.add(lblDepartamento);

        //ComboBox de Departamento
        listaDepartamento = new JComboBox();
        listaDepartamento.setBounds(225,220,220,25);
        panel.add(listaDepartamento);
        listaDepartamento.addItem("");
        listaDepartamento.addItem("Atención al Cliente");
        listaDepartamento.addItem("Departamento de Logistica");
        listaDepartamento.addItem("Departamento de Gerencia");
        listaDepartamento.setBackground(new Color(228,228,228));
        listaDepartamento.setFont(new Font("Andale Mono",1,12));
        listaDepartamento.setForeground(new Color(255,0,0));
        listaDepartamento.addItemListener(this);

        //Etiqueta de Antiguedad
        lblAntiguedad = new JLabel("Selecciona la Antiguedad:");
        lblAntiguedad.setBounds(225,255,220,25);
        lblAntiguedad.setFont(new Font("Andale Mono",1,12));
        lblAntiguedad.setForeground(new Color(255,255,255));
        panel.add(lblAntiguedad);

        //ComboBox de Antiguedad
        listaAntiguedad = new JComboBox();
        listaAntiguedad.setBounds(225,280,220,25);
        panel.add(listaAntiguedad);
        listaAntiguedad.addItem("");
        listaAntiguedad.addItem("1 año de servicio");
        listaAntiguedad.addItem("2 a 6 años de servicio");
        listaAntiguedad.addItem("7 años o mas de servicio");
        listaAntiguedad.setBackground(new Color(228,228,228));
        listaAntiguedad.setFont(new Font("Andale Mono",1,12));
        listaAntiguedad.setForeground(new Color(255,0,0));
        listaAntiguedad.addItemListener(this);

        //Etiqueta resultado del calculo
        lblResul = new JLabel("Resultado del Cálculo:");
        lblResul.setBounds(225,315,220,25);
        lblResul.setFont(new Font("Andale Mono",1,12));
        lblResul.setForeground(new Color(255,255,255));
        panel.add(lblResul);

        //Area de texto del resultado
        textArea1 = new JTextArea("\n    Aqui aparece el resultado del cálculo de las vacaciones");
        textArea1.setFont(new Font("Andale Mono",1,12));
        textArea1.setBackground(new Color(228,228,228));
        textArea1.setForeground(new Color(255,0,0));
        textArea1.setEditable(false);
        scroll1 = new JScrollPane(textArea1);
        scroll1.setBounds(225,340,360,80);
        panel.add(scroll1);
    }

    //Etiquetas para el footer
    private void footer(){
        lblFooter = new JLabel("©2022 The Coca-Cola Company  |  Todos los derechos reservados");  //alt+184 = ©
        lblFooter.setBounds(130,450,500,30);
        lblFooter.setFont(new Font("Andale Mono",1,12));
        lblFooter.setForeground(new Color(255,255,255));
        panel.add(lblFooter);
    }


    public void itemStateChanged(ItemEvent e){

    }


    //Metodo para ejecutar los eventos de la barra de menu
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == itemRojo){  //Tema Rojo
            mb.setBackground(new Color(255,0,0));
            panel.setBackground(new Color(255,0,0));
            tfNombre.setForeground(new Color(255,0,0));
            tfAPaterno.setForeground(new Color(255,0,0));
            tfAMaterno.setForeground(new Color(255,0,0));
            listaDepartamento.setForeground(new Color(255,0,0));
            listaAntiguedad.setForeground(new Color(255,0,0));
            textArea1.setForeground(new Color(255,0,0));
        }
        if(e.getSource() == itemNegro){  //Tema Negro
            mb.setBackground(new Color(0,0,0));
            panel.setBackground(new Color(0,0,0));
            tfNombre.setForeground(new Color(0,0,0));
            tfAPaterno.setForeground(new Color(0,0,0));
            tfAMaterno.setForeground(new Color(0,0,0));
            listaDepartamento.setForeground(new Color(0,0,0));
            listaAntiguedad.setForeground(new Color(0,0,0));
            textArea1.setForeground(new Color(0,0,0));
        }
        if(e.getSource() == itemMorado){  //Tema Morado
            mb.setBackground(new Color(255,0,255));
            panel.setBackground(new Color(255,0,255));
            tfNombre.setForeground(new Color(255,0,255));
            tfAPaterno.setForeground(new Color(255,0,255));
            tfAMaterno.setForeground(new Color(255,0,255));
            listaDepartamento.setForeground(new Color(255,0,255));
            listaAntiguedad.setForeground(new Color(255,0,255));
            textArea1.setForeground(new Color(255,0,255));
        }
        if(e.getSource() == itemNuevo){  //Limpia todos los campos de la ventana
            String limpiar = "";
            tfNombre.setText(limpiar);
            tfAPaterno.setText(limpiar);
            tfAMaterno.setText(limpiar);
            listaDepartamento.setSelectedItem("");
            listaAntiguedad.setSelectedItem("");
        }
        if(e.getSource() == itemSalir){  //Cierra la ventana
            System.exit(0);
        }
        if(e.getSource() == itemCalculo){
            String sector = listaDepartamento.getSelectedItem().toString();
            String tiempo = listaAntiguedad.getSelectedItem().toString();

            String cadSec1 = "Atención al Cliente";
            String cadSec2 = "Departamento de Logistica";
            String cadSec3 = "Departamento de Gerencia";
            String cadTmpo1 = "1 año de servicio";
            String cadTmpo2 = "2 a 6 años de servicio";
            String cadTmpo3 = "7 años o mas de servicio";

            if(sector.equals(cadSec1) && tiempo.equals(cadTmpo1)){  //Reciben 6 dias de vacaciones
                textArea1.setText("\n El trabajador "+ tfNombre.getText() +" "+tfAPaterno.getText()+" "+tfAMaterno.getText()+
                                  "\n quien labora en "+cadSec1+" con "+cadTmpo1+
                                  "\n recibe 6 dias de vacaciones.");
            }
        }
    }

    public static void main(String[] args){
        Principal pp = new Principal();
        pp.setVisible(true);
        pp.setBounds(0,0,640,550);
        pp.setResizable(false);
        pp.setLocationRelativeTo(null);
    }
}
