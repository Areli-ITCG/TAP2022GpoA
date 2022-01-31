public class Coche extends Vehiculo
{
  //atributo
  private int NoCilindros;
  
  //M�todos
  public Coche(Color color, int NumSerie, int c)//m�todo constructor
  {
    super(color, NumSerie);
    this.NoCilindros = c;
  }
  
 public int NoCilindros()
 {
   return NoCilindros;
 }
 
 public void cambiaCilindros(int c)
 {
   this.NoCilindros = c;
 }
 
 @Override
 public String toString()
 {
   return super.toString() + "  Numero de Cilindros   " + NoCilindros;
 }
}