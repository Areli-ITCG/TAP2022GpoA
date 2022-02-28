import java.util.*;

public class ManPersona
{
  static ArrayList<Persona> ArrPersona = new ArrayList<Persona>();
  private Persona objPersona;
  
  public ManPersona()
  {}
  
  public void Agregar(String nom, String ape, String tel, String correo, String tipo)
  {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setApellidos(ape);
    objPersona.setTelefono(tel);
    objPersona.setCorreoe(correo);
    objPersona.setTipo(tipo);
    
    ArrPersona.add(objPersona); //Agregando el objeto al arraylist
  }
  
  public void mostrar()
  {
    System.out.println("...PERSONAS EN LA AGENDA...");
    Iterator<Persona> itrPersona = ArrPersona.iterator();
    while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println(persona.getNombre() + "  " + persona.getTelefono());
    }
  }
}