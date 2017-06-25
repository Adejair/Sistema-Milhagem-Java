class VooCliente {
  public int codigoCliente;
  public int codigoVoo;

  String data;
  String hora;



  public void setarVooCliente(int codigoCliente, int codigoVoo, String data, String hora) {
      this.codigoCliente = codigoCliente;
      this.codigoVoo = codigoVoo;

      this.data = data;
      this.hora = hora;
  }

  public void removerVooCliente() {
    this.codigoCliente = -1;
    this.codigoVoo = -1;

    this.data = "";
    this.hora = "";
  }

}
