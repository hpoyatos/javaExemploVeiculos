class Aviao extends Veiculo {
  public String prefixo;

  public void locomover() {
    // frase de exemplo: O Boeing 747 de prefixo PR-MHC, de cor branco(a), ano 2022
    // está voando!!!
    System.out.printf("O %s %s de prefixo %s, cor %s, ano %d está voando!!!\n", this.marca, this.modelo, this.prefixo,
        this.cor, this.ano);
  }
}
