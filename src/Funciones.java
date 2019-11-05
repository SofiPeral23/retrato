

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Funciones {
    public static void main(String[] args){
        
        //CREACION VENTANA
        Principal p = new Principal();
        p.setSize(1008, 662);//tamaño ventana
        p.setLocationRelativeTo(null);//centrar la ventana
        p.setTitle("RETRATO HABLADO");//crear titulo
        p.setVisible(true);
        p.pack();
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);//cerrar la ventana
        
        

    }
    
}
