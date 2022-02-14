import javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos

public class ConvertidorCentFar extends JFrame
{
  JLabel Letrero, lblGCent, lblGFar;//Reserva el espacio en memoria
  JButton btnConvertir, btnSalir;
  JTextField txtGCent, txtGFar;
  JPanel panel;
  
  public ConvertidorCentFar()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    txtGCent = new JTextField(10);//instanciación del objeto
    txtGFar = new JTextField(10);
    txtGFar.setEditable(false);//el usuario no puede cambiar el valor del texto
    
    Letrero = new JLabel("Convierte Grados Centigrados a Grados Farenheit");
    lblGCent = new JLabel("Grados Centigrados: ");
    lblGFar = new JLabel("Grados Farenheit: ");
    
    btnConvertir = new JButton("Convertir");
    btnConvertir.setMnemonic('C');
    btnSalir = new JButton("Salir");
    btnSalir.setMnemonic('S');
    
    btnConvertir.addMouseListener(new MyClickListener());
    btnSalir.addMouseListener(new MyListener());
    
    panel = new JPanel();
    panel.add(Letrero);
    panel.add(lblGCent);
    panel.add(txtGCent);
    panel.add(lblGFar);
    panel.add(txtGFar);
    panel.add(btnConvertir);
    panel.add(btnSalir);
    
    setTitle("Ejemplo 2. Centigrados a Farenheit");
    setContentPane(panel);
    setVisible(true);
  }
  
   private class MyClickListener extends MouseAdapter
  {
    double farenheit = 0.0;
    int gcent = 0;
   
    public void mouseClicked(MouseEvent event)
    { 
       String c = txtGCent.getText();
      try{
           gcent = Integer.parseInt(c.trim());
           farenheit = (gcent * 9 / 5) + 32;//conversion
           txtGFar.setText(String.valueOf(farenheit)); //Los JTextField solamente pueden recibir y mostrar cadenas.          
      }
      catch(NumberFormatException e)
      {
        JOptionPane.showMessageDialog(null, "El valor de los grados centigrados no es correcto");
        txtGCent.setText(" "); 
        //txtGCent.setText(null);
        txtGCent.requestFocus();
        txtGFar.setText("32.00");
      }
  
    }
  }
  
  private class MyListener extends MouseAdapter
  {
   public void mouseClicked(MouseEvent event)
   {
      System.exit(0);
   }
  }
}
