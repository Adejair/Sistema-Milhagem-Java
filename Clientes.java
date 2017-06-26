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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCodigoConjugue() {
        return codigoConjugue;
    }

    public void setCodigoConjugue(int codigoConjugue) {
        this.codigoConjugue = codigoConjugue;
    }
  
  
}
