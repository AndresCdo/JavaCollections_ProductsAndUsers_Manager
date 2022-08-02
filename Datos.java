import javax.swing.*; // Se importa todas las clases necesarias para realizar interfaces gráficas

public class Datos extends JFrame{ // Creamos una clase que hereda de la clase JFrame
    // inicializamos los atributos donde se va almacenar el objeto tipo JLabel
    private JLabel label1,label2; 

    public Datos() { //Constructor de la clase Datos
        JPanel panel1 = new JPanel();
        // Se crea un objeto con el texto que tendrá la etiqueta
        label1=new JLabel("Digite los datos del usuario.");
        panel1.add(label1);
        // Con este método agrega la etiqueta a la ventana o JFrame
        add(label1);
        // Se crea un objeto con el texto que tendrá la etiqueta
        label2=new JLabel("Version 0.0.1");
        panel1.add(label2);
        add(panel1);
    } 

    public static void main(String[] ar) {
        Datos formulario1=new Datos();
        /* Este método nos permite definir la posición y tamaño de la ventana. 
           En este caso se ubica en la fila 10 columna 5, con altura 150 pixeles
           y ancho 200 pixeles.  */
        formulario1.setBounds(50,50,250,150);  
        // Este método nos permite definir la visibilidad de la ventana
        formulario1.setVisible(true); 
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        /* Este método nos permite definir la operación a realizar una vez se cierre la ventana. 
        En este caso salir de la aplicación. */
    }
}