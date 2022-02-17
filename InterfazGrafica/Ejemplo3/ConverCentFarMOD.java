import javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos
import java.awt.*;

public class ConverCentFarMOD extends JFrame
{
  JLabel Letrero, lblGCent, lblGFar;//Reserva el espacio en memoria
  JButton btnConvertir, btnSalir;
  JTextField txtGCent, txtGFar;
  JPanel panel;
  private Object objTextField;
  
  public ConverCentFarMOD()
  {
   initComponents();
  }
  
  private void initComponents()
  {
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    txtGCent = new JTextField(10);//instanciación del objeto
    txtGFar = new JTextField(10);
       
    Letrero = new JLabel("Convierte Grados Centigrados a Grados Farenheit");
    lblGCent = new JLabel("Grados Centigrados: ");
    lblGFar = new JLabel("Grados Farenheit: ");
    
    btnConvertir = new JButton("Convertir");
    btnConvertir.setMnemonic('C');
    btnSalir = new JButton("Salir");
    btnSalir.setMnemonic('S');
    
    btnSalir.addMouseListener(new MyListener());
    
    panel = new JPanel();
    panel.add(Letrero);
    panel.add(lblGCent);
    lblGCent.setBounds(12,28,116,16);
    panel.add(txtGCent);
    txtGCent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtGCent.setBounds(132,28,144,20);
    panel.add(lblGFar);
    panel.add(txtGFar);
    panel.add(btnConvertir);
    panel.add(btnSalir);
    
    KeyAdapter kl = new KeyAdapter()//clase anonima
    {
      public void keyTyped(KeyEvent evt)
      {
        GradosKeyTyped(evt);
      } 
    };
    txtGCent.addKeyListener(kl);
    
    KeyAdapter klf = new KeyAdapter() //clase anonima 2
    {
      public void keyTyped(KeyEvent evt)
      {
        GradosKeyTyped(evt);
      }
    };
    txtGFar.addKeyListener(klf);
    
    btnConvertir.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        btnConvertirActionPerformed(evt);
      }
    });
    
   setTitle("Ejemplo 3. Centigrados a Farenheit Modificado");
   setContentPane(panel);
   setVisible(true);
  }
  
  private void GradosKeyTyped (KeyEvent evt)
   {
     objTextField = evt.getSource();//objeto que produce el evento
   }
   
   private void btnConvertirActionPerformed(ActionEvent evt)
   {
    double grados = 0.0;
    int recgrados = 0;
   
    try{
          if(objTextField == txtGCent)
          {
           String c = txtGCent.getText();
           recgrados = Integer.parseInt(c.trim());
           grados = (recgrados * 9.0 / 5.0) + 32;//conversion
           String texto = String.format("%.2f", grados);
           txtGFar.setText(texto); //Los JTextField solamente pueden recibir y mostrar cadenas.          
          }
          
          if(objTextField == txtGFar)
          {
           String c = txtGFar.getText();
           recgrados = Integer.parseInt(c.trim());
           grados = (recgrados - 32) * 5.0 / 9.0;//conversion
           String texto = String.format("%.2f", grados);
           txtGCent.setText(texto); //Los JTextField solamente pueden recibir y mostrar cadenas.          
          }
      }
      catch(NumberFormatException e)
      {
        JOptionPane.showMessageDialog(null, "El valor de los grados centigrados no es correcto",
        "Error", JOptionPane.ERROR_MESSAGE);
        txtGCent.setText(" "); 
        //txtGCent.setText(null);
        txtGCent.requestFocus();
        txtGFar.setText(null);
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
