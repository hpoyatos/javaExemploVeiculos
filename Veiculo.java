//Exemplo de Classe Abstrata
abstract class Veiculo implements VeiculoInterface {
  // Atributos
  public String marca;
  public String modelo;
  public String cor;
  public int ano;

  public void locomover() {
    // frase de exemplo: O Fiat Uno Mille de cor verde, ano 1996 esta se locomovendo

    System.out.printf("O %s %s de cor %s, ano %d está se locomovendo!\n", this.marca, this.modelo, this.cor, this.ano);
  }
}
