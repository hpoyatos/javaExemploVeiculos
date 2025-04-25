abstract class Veiculo {
  // Atributos
  private String marca;
  private String modelo;
  private String cor;
  private int ano;
  protected long numChassi;

  // Construtor

  // Getters and Setters
  public String getMarca() {
    return this.marca;
  }
  
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
  	return cor;
  }
  
  public void setCor(String cor) {
  	this.cor = cor;
  }
  
  public int getAno() {
  	return ano;
  }
  
  public void setAno(int ano) {
  	this.ano = ano;
  }

  public void locomover() {
    // frase de exemplo: O Fiat Uno Mille de cor verde, ano 1996 esta se locomovendo

    System.out.printf("O %s %s de cor %s, ano %d e número de chassi %d está se locomovendo!\n", this.marca, this.modelo, this.cor, this.ano, this.numChassi);
  }
}
