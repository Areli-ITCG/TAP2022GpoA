import javax.swing.*;
import java.awt.*;

public class JFrameTablaDatos extends JFrame
{
  TablaDatos md = new TablaDatos();
  
  public JFrameTablaDatos()
  {
   initComponents();
  }
  
  private void initComponents()
  {
     setSize(400,400);
     setTitle("Contactos Registrados");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(false);
     setContentPane(md);
     setVisible(true);
  }
}