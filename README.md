# SistemaInterfazGrafica_Coca-Cola

## Sistema de cálculo vacacional

La empresa **Coca-Cola Company** requiere de un programa con interfaz gráfica de usuario, el cual debe realizar el calculo de 
los días de vacaciones a los que tiene derecho un trabajador, dependiendo de su puesto y antigüedad en la emprea.

El programa deberá de contener tres distintas interfaces, para navegar entre ellas, las cuales son las siguientes:


**1. Interfaz de bienvenida:** como su nombre lo menciona, será la primera pantalla con la que tendra interacción el usuario y 
dependiendo de la decisión tomada, podra acceder a la siguiente interfaz o terminar la ejecución.

**2. Interfaz de términos y condicione:** en esta sección el usuario leerá los terminos estipulados por la empresa sobre el uso,
 modificación o alteración del diseño del código y tendra la decisión de aceptarlos o rechazarlos.
 
 **3. Interfaz de paantalla principal:** en esta interfaz se encuentra la funcion principal del sistema como lo es calcular el
 día de vacaciones que le corresponden a los empleados de la corporación, segun los parametros ya mencionados. 
 Tambien tiene otras funciones para que el empleado personalize el frame a su comodidad o regrese a la pantalla de 
 bienvenida.
 
 - *Reproduce el gif siguiente para ver el funcionamiento del sistema:*
 
 ![SitemaEjecutado](https://user-images.githubusercontent.com/99112892/206376553-c918137c-129c-4e2b-bdd9-23c7010834a5.gif)
 
 
 ### Nota:
 
*Para este proyecto se utilizazorn imagenes de las que no se poseé ningun derecho de autor, su uso fue meramente con fin ilustrativo 
y didactico, por lo que no me hago responsable de un mal uso de las mismas.En cuanto a los términos y condiciones citados de la interfaz
no tienen ninguna validez, solamente se tomaron a forma de ejemplificar o simular un apartado para el proyecto, sientete libre de modificar
el código a tu beneficio.*

*En caso de querer obtener el ejecutable para correr el programa sin necesidad de cargar todas las clases desde un IDE, basta con 
dirigirse a la carpeta "Empaquetado", ahí encontrara un archivo nombrado "Sistema.jar", se debe descargar y lo podra ejecutar con 
un par de clicks.*


## Funcionalidad de Interfaz "Bienvenida"

- Cunado se ejecuta el archivo "Sistema.jar" se tiene establecido en MANIFEST.MF que la clase main con la que arrancara el programa,
será con la de "Bienvenida", que es la que se muestra a continuación: 

![1Bienvenida_Vacia](https://user-images.githubusercontent.com/99112892/206395342-4fff7a7e-610f-43b0-a528-90f2852df10a.png)


- El usuario debera ingresar su nombre en el campo de texto y presionar el boton "ingresar", pero por algun error o una confunsión, el 
usuario podría presionar el boton sin haber escrito algo en el campo del texto, lo cual no tendria sentido, así que el programa
le arrojara el siguiente mensaje: 

![1_1Bienvenida_Falla](https://user-images.githubusercontent.com/99112892/206396213-45b68048-1662-43ae-904e-bc72f3aaf1ce.png)


- En caso contrario, de que si se introduzca un nombre, se accedera a la interfaz de Licencia:

![1_2Bienvenida_Llenado](https://user-images.githubusercontent.com/99112892/206396349-76db0522-5909-4b80-b781-fabda5e6d2a2.png)



## Funcionalidad de Interfaz "Licencia"

- Al terminar de leer los terminos se puede observar un check box "personalizado" ya que tiene el detalle que se añadio el nombre
que proceso en la ventana anterior. Tambien se puede verificar que hay dos botones debajo, pero el de continuar esta deshabilitado,
cuando presionamos "No Acepto" el programa se cierra: 

![2Licencia](https://user-images.githubusercontent.com/99112892/206398488-41f86a41-fa84-4df1-b7ef-9d965c05f278.png)


- Si seleccionamos el check box, se habilitara el boton "Continuar" de inmediato y si se presiona, se tendra acceso a la siguiente
interfaz "Principal": 

![2_1Licencia_Aceptar](https://user-images.githubusercontent.com/99112892/206399280-dc2b95fb-7a98-42c4-8754-288f981a99c1.png)



## Funcionalidad de Interfaz "Principal"

- Se puede observar en la barra de menu 3 apartados(Opciones, Calcular y Acerca de), seguido de una bienvenida personalizada con 
el nombre que se almaceno desde la primer interfaz y por ultimo una seccion con 5 campos de texto y una area de texto donde se 
mostrara el resultado, segun los datos ingresados.

![3Principal](https://user-images.githubusercontent.com/99112892/206597700-70f4b5e7-5d2f-4d8f-8dae-551e16927e5d.png)


- El apartado **"Acerca de"** contiene en menu "El creador", que al presionarlo, nos dara información de la persona que dearrollo
el software.

![3_2Principal_Creador1](https://user-images.githubusercontent.com/99112892/206598340-a09242ea-92e4-4847-a8c8-c660d2dc8a34.png)

![3_2Principal_Creador2](https://user-images.githubusercontent.com/99112892/206598367-75604e77-c0ca-44f9-a0bb-f24ef388f883.png)


- El apartado **"Opciones"** contiene en menu **"Color de Fondo"** que a su vez tiene como submenu 3 items(Rojo, Negro, Morado) y 
cuando se selecciona alguno, se modifica el color de la ventana.

![3_1Principal_Color1](https://user-images.githubusercontent.com/99112892/206599022-c9669f30-3974-40e2-a4e4-6d1d8e4c5388.png)

![3_1Principal_Color2](https://user-images.githubusercontent.com/99112892/206599050-27429071-a13c-452b-9d0a-bbe7288a5ec4.png)



