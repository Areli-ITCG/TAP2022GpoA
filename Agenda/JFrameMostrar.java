import javax.swing.*;
import java.awt.*;

public class JFrameMostrar extends JFrame
{
   Datos2022 mostrar = new Datos2022();
   
    public JFrameMostrar()
   {  
      //super.setVisible(false);
     //super.dispose();
      initComponents();
   }
   
   private void initComponents()
   {
      //super.setVisible(false);
      //super.dispose();
      setSize(300, 200);
      setTitle("AGENDA");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}
