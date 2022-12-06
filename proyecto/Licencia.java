package javaSwing.proyecto;
//Ventana de Licencia de uso

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{
    private JLabel tema, imgCoca;
    private JButton boton1, boton2;
    private JCheckBox condicion;
    private JTextArea textarea1;
    private JScrollPane scroll1;
    private JPanel panel;

    public Licencia(){
        iniciarComponentes();
        detallesEsteticos();
        tituloDeApartado();
        especificaionDeTerminos();
        respuestaUsuario();
        logotipo();
    }

    private void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Icono - Titulo de Ventana
    private void detallesEsteticos(){
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    }

    //Etiqueta "terminos y condiciones"
    private void tituloDeApartado(){
        tema = new JLabel("TÉRMINOS Y CONDICIONES");
        tema.setBounds(215,5,200,30);
        tema.setFont(new Font("Andale Mono",1,14));
        tema.setForeground(new Color(0,0,0));
        panel.add(tema);
    }

    //Area de detalles de los terminos y condiciones
    private void especificaionDeTerminos(){
        //El area de tecxto se pone dentro del scrollpane
        textarea1 = new JTextArea();
        textarea1.setEditable(false);  //El usuario no podra escribir sobre el area de texto o eliminar lo establecido
        textarea1.setFont(new Font("Andale Mono",0,9));
        textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA EMPRESA COCA-COLA." +
                "\n          B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."+
                "\n          C.  RODOLFO MORQUECHO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE "+
                "\n          (RODOLFO MORQUECHO), NO SE RESPONSABILIZAN DEL USO QUE UDTED HAGA CON ESTE SOFTWARE "+
                "\n          Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLICK EN (ACEPTO), SI USTED NO ACEPTA "+
                "\n          ESTOS TÉRMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+
                "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE:"+
                "\n          https://github.com/RodolfoMorquecho"
        );

        //Scrollpane
        scroll1 = new JScrollPane(textarea1);
        scroll1.setBounds(10,40,575,200);
        panel.add(scroll1);
    }

    //Seccion aceptar o rechazar condiciones
    private void respuestaUsuario(){
        //CheckBox
        //Agregamos el nombre de usuario, accediendo desde la clase y variable(publica) que lo contiene
        condicion = new JCheckBox("Yo "+Bienvenida.texto+" Acepto");
        condicion.setBounds(10,250,300,30);
        condicion.addChangeListener(this);
        panel.add(condicion);

        //Boton "Continuar"
        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.setEnabled(false);  //Inicializar el boton Continuar deshabilitado, ya que el checkbox no esta seleccionado y no se aceptan terminos
        boton1.addActionListener(this);
        panel.add(boton1);

        //Boton "No Acepto"
        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        panel.add(boton2);
    }

    //Etiqueta de la imagen coca-cola
    private void logotipo(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("images/coca-cola.png"));
        imgCoca = new JLabel(imagen);
        imgCoca.setBounds(315,145,300,300);
        panel.add(imgCoca);
    }

    //Eventos del chackbox
    public void stateChanged(ChangeEvent e){
        if(condicion.isSelected() == true){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }
        else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    //Eventos de botones
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            Principal.ventanaPrincipal();
            this.setVisible(false);
        }
        if(e.getSource() == boton2){
            System.exit(0);  //Boton "No Acepto" saca al usuario de la interfaz
        }
    }

    public static void main(String[] args){
        ventanaLicencia();
    }

    //Declarar este metodo publico, ya que lo llamaremos en otras clases/interfaz
    public static void ventanaLicencia(){
        Licencia terminos = new Licencia();
        terminos.setVisible(true);
        terminos.setBounds(0,0,610,390);
        terminos.setResizable(false);
        terminos.setLocationRelativeTo(null);
    }
}
