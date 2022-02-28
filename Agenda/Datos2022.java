import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Datos2022 extends JPanel implements ActionListener
{
  private JButton btnGuardar, btnCancelar;
  private JTextField txtNombre, txtApellidos, txtTel, txtCorreo;
  private JRadioButton tec, trabajo;
  
  ManPersona mpa = new ManPersona();
  
  Datos2022()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(15);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
    txtApellidos = new JTextField(20);
    add(lblApellidos);
    add(txtApellidos);
    
    JLabel lblTel = new JLabel("Numero de Celular: ", JLabel.RIGHT);
    txtTel = new JTextField(15);
    add(lblTel);
    add(txtTel);

JLabel lblCorreo = new JLabel("Correo electronico: ", JLabel.RIGHT);
    txtCorreo = new JTextField(20);
    add(lblCorreo);
    add(txtCorreo);

    JLabel lblTipo = new JLabel("CONOCIDO DE...", JLabel.CENTER);
    JLabel lblTipo2 = new JLabel(" ", JLabel.CENTER);
    add(lblTipo);
    add(lblTipo2);
    
    ButtonGroup gpoBotones = new ButtonGroup();
    tec = new JRadioButton("Tecnologico", true);
    trabajo = new JRadioButton("Trabajo");
    gpoBotones.add(tec);
    gpoBotones.add(trabajo);
    
    add(tec);
    add(trabajo);
    
    btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(this);
     btnCancelar = new JButton("Cancelar");
    btnCancelar.addActionListener(this);
    
    add(btnGuardar);
    add(btnCancelar);
  }
  
  public void actionPerformed(ActionEvent e)
  {
     String tipo = "Tecnologico";
     if(trabajo.isSelected())
         tipo = "Trabajo";
     if(e.getSource() == btnGuardar){
        if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);
          txtNombre.requestFocus();
        }
        else
        if(txtTel.getText() == null || txtTel.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Debes capturar el telefono celular",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);
          txtTel.requestFocus();
        }
       else
       {
         mpa.Agregar(txtNombre.getText(), txtApellidos.getText(), txtTel.getText(),
         txtCorreo.getText(), tipo);
         JOptionPane.showMessageDialog(null, "Se guardaran los datos",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);
          txtNombre.setText(null);
          txtApellidos.setText(null);
          txtTel.setText(null);
          txtCorreo.setText(null);
          txtNombre.requestFocus();          
       }
    }
    
    if(e.getSource()==btnCancelar){
    mpa.mostrar();
    System.exit(0);}    
       
  }
}