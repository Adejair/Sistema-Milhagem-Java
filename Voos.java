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

    this.distancia = -1.0;
  }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
  
  
}
