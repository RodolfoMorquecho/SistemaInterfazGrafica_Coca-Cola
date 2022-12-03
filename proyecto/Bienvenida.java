package javaSwing.proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4;
    private JButton ingresar;
    private JTextField textField1;
    private JPanel panel;

    public Bienvenida(){
        iniciarComponentes();
        detallesEsteticos();
        imagenesTexto();
        ingresarNombre();
        botonDeAcceso();
    }

    //Panel
    private void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Titulo - Fondo - Icono
    private void detallesEsteticos(){
        setTitle("Bienvenido");  //Titulo de Ventana
        panel.setBackground(new Color(255,0,0));  //Color de fondo

        //Agregar imagen al icono de la interfaz gráfica en lugar de la taza de cafe caracteristica de java
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        //"getImage()" metodo para obtener una imagen de una ruta especificada
        //"getResource()" metodo para cargar la imagen previamente obtenida
        //"getClass()" metodo para obtener el nombre de la clase en la que se esta trabajando y mostrar la imagen en dicha clase
        //"new ImageIcon" indica que es un onjeto de tipo ImageIcon que se va a dar forma con todos los metodos anteriormente detallados
        //"setIconImage" indica que va a colocar esa imagen en el icono de la interfaz gráfica
    }

    //Etiquetas
    private void imagenesTexto(){
        //Crear objeto de tipo ImageIcon
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/logo-coca.png"));  //Indicar al objeto la ruta de la imagen que va a almacenar ese objeto

        //Colocar el objeto dentro de una etiqueta
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        panel.add(label1);

        //Texto bajo imagen principal
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        //Modificar el tipo de fuente y color
        label2.setFont(new Font("Andale Mono",3,18));  //Andale Mono: fuente, 3:negrita y cursiva, 18:tamaño de texto
        label2.setForeground(new Color(255,255,255));  //Color blanco al texto
        panel.add(label2);

        //Texto previo a el textfield
        label3 = new JLabel("Ingrese su nombre:");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono",1,12));
        label3.setForeground(new Color(255,255,255));
        panel.add(label3);

        //Footer derechos
        label4 = new JLabel("©2022 The Coca-Cola Company");  // "El simbolo "©" se obtiene con las teclas alt + 184
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1,12));
        label4.setForeground(new Color(255,255,255));
        panel.add(label4);
    }

    //Campo de Texto
    private void ingresarNombre(){
        textField1 = new JTextField();
        textField1.setBounds(45,240,255,25);
        textField1.setBackground(new Color(224,224,224));
        textField1.setFont(new Font("Andale Mono",1,12));  //Fuente tamaño 14 y negrita
        textField1.setForeground(new Color(255,0,0));  //Texto color rojo
        panel.add(textField1);
    }

    //Boton de ingreso
    private void botonDeAcceso(){
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(125,280,100,30);
        ingresar.setBackground(new Color(255,255,255));
        ingresar.setFont(new Font("Andale Mono",1,14));  //Fuente tamaño 14 y negrita
        ingresar.setForeground(new Color(255,0,0));
        ingresar.addActionListener(this);
        panel.add(ingresar);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ingresar){

        }
    }
    public static void main(String[] args) {
        Bienvenida test = new Bienvenida();
        test.setVisible(true);
        test.setBounds(0,0,360,460);
        test.setLocationRelativeTo(null);
        test.setResizable(false);
    }
}
