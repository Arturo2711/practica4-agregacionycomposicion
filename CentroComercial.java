/*
 * Clase CentroComercial
 * 
 * Autores: Cazares Leyva Bryan Jhoan, Gachuz Davila Ulises y Morales Martínez Arturo
 * Descripcion: Clase CentroComercial que se relaciona con la clase Estacionamiento, Restaurante y TiendaDepartamental
 * Fecha: 17/05/2023
 * Version: 1.0
 */

public class CentroComercial {
    // Atributos
    private String domicilio;
    private double superficie; 
    private String nombre; 
    private int numPisos;
    private int numElevadores;
    private int numEntradas;
    private int numSanitarios;
    
    // Atributo - Composicion con TiendaDepartamental
   private TiendaDepartamental miTiendaDepartamental;

    // Metodos
    CentroComercial(){

    }

    public String getDomicilio(){
        return domicilio;
    }

    public double getSuperficie(){
        return superficie;
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumSanitarios(){
        return numSanitarios;
    }

    public void setDomicilio(String dom){
        domicilio = dom;
    }

    public void setSuperficie(double metros2){
        superficie = metros2;
    }

    public void setNombre(String nom){
        nombre = nom;
    }

    public void setNumSanitarios(int num){
        numSanitarios = num;
    }
    
  // Metodo para composicion con TiendaDepartamental
  public void tienda_composicion(
    String nom_tienda,
    String producto,
    String nombre_franquicia,
    int dinero_caja,
    int num_cajasregistradoras,
    String telefono,
    List<Provedor> provedoreLista
  ) {
    miTiendaDepartamental =
      new TiendaDepartamental(
        nom_tienda,
        producto,
        nombre_franquicia,
        dinero_caja,
        num_cajasregistradoras,
        telefono,
        provedoreLista
      );
  }

  // Metodo que utiliza la composicion
  public void get_lista_provedores_tienda() {
    miTiendaDepartamental.imprime_provedores();
  }
}
