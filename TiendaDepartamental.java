

import java.util.List;

public class TiendaDepartamental {

  // Atributos
  private String nomtienda;
  private String producto;
  // 4 atributos propuestos
  private String nombre_franquicia;
  private int dinero_caja;
  private int num_cajasregistradoras;
  private String telefono;
  private List<Provedor> provedores;

  // Constructor
  public TiendaDepartamental(
    String nomtienda,
    String producto,
    String nombre_franquicia,
    int dinero_caja,
    int num_cajasregistradoras,
    String telefono,
    List<Provedor> provedores
  ) {
    this.nomtienda = nomtienda;
    this.producto = producto;
    this.nombre_franquicia = nombre_franquicia;
    this.dinero_caja = dinero_caja;
    this.num_cajasregistradoras = num_cajasregistradoras;
    this.telefono = telefono;
    this.provedores = provedores;
  }

  // Métodos getter y setter para los atributos

  public String getNomtienda() {
    return nomtienda;
  }

  public String getProducto() {
    return producto;
  }

  public String getNombre_franquicia() {
    return nombre_franquicia;
  }

  public int getDinero_caja() {
    return dinero_caja;
  }

  public int getNum_cajasregistradoras() {
    return num_cajasregistradoras;
  }

  public String getTelefono() {
    return telefono;
  }

  public List<Provedor> getProvedores() {
    return provedores;
  }

  // Métodos adicionales

  public int dinero_promedio() {
    // Método que retorna el promedio de dinero por cada caja registradora
    return dinero_caja / num_cajasregistradoras;
  }

  public void imprime_provedores() {
    // Método para imprimir la lista de provedores
    for (Provedor provedor : provedores) {
      provedor.devuelve_nombre_proveedor();
    }
  }
}
