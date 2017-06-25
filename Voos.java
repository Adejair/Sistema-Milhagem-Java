class Voos {
  public int codigo;

  public String origem;
  public String destino;

  public double distancia;

  public void criarVoo(int codigo, String origem, String destino, double distancia) {
    this.codigo = codigo;

    this.origem = origem;
    this.destino = destino;

    this.distancia = distancia;
  }

  public void destruirVoo() {
    this.codigo = -1;

    this.origem = "";
    this.destino = "";

    this.distancia = "";
  }
}
