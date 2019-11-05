
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Principal extends interfaz implements ActionListener{
    private JMenuBar mb1; // es la barra
    private JMenu m1; // contiene las opciones
    private JMenuItem mi1,mi2,mi3; // son las opciones del menú
    
public Principal(){
    //CREAR MENU
    mb1=new JMenuBar(); //se instancia la barra
    setJMenuBar(mb1);//se agrega al frame
    m1=new JMenu("HERRAMIENTAS");
    
    mb1.add(m1); //se agrega el menú a la barra
    mi1=new JMenuItem("BORRAR TODO");
    m1.add(mi1); //se agrega al menú
    mi1.addActionListener((ActionListener) this);// se escucha la opcion para ponerle una acción (evento)

    mi2=new JMenuItem("GUARDAR");
    m1.add(mi2); //se agrega al menú
    mi2.addActionListener((ActionListener) this); //se escucha la opcion para ponerle una acción (evento)
    
    mi3=new JMenuItem("VOLVER");
    m1.add(mi3); //se agrega al menú
    mi3.addActionListener((ActionListener) this); //se escucha la opcion para ponerle una acción (evento)

}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mi1) {
            JOptionPane.showMessageDialog(null, "BORRADO PERFECTO");
    	}
      if (e.getSource()==mi2) {
        JOptionPane.showMessageDialog(null, "GUARDADO PERFECTO");
       	}
    }
}

