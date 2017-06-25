class Clientes {
  public int codigo;
  public String nome;

  public String sexo;
  public String cpf;

  public int categoria;

  public int codigoConjugue;


  public void cadastrarCliente(int codigo, String nome, String sexo, String cpf, int categoria, int codigoConjugue) {
    this.codigo = codigo;

    this.nome = nome;
    this.sexo = sexo;
    this.cpf = cpf;

    this.categoria = categoria;
    this.codigoConjugue = codigoConjugue;
  }

  public void removerCliente() {
    this.codigo = -1;

    this.nome = "";
    this.sexo = "";
    this.cpf = "";

    this.categoria = -1;
    this.codigoConjugue = -1;
  }
}
