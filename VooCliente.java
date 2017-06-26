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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(int codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
  
  

}
