/*
Declaração da classe Carro
*/
class Carro extends Veiculo {
  // Atributos
  private String placa;
  // Nosso primeiro método!

  // Método construtor
  /*
   * No Java tem duas regras:
   * - Tem que ter o mesmo nome da classe (com letra maiscúla e tudo);
   * - Não tem retorno declarada (não tem o void)
   */
  public Carro() {

  }

  public Carro(String marca, String modelo, String cor, int ano, String placa) {
    this.setMarca(marca);
    this.setModelo(modelo);
    this.setCor(cor);
    this.setAno(ano);
    this.setPlaca(placa);
    //vamos definir número de chassi
    this.numChassi = 99;
  }

  public String getPlaca() {
  	return placa;
  }
  
  public void setPlaca(String placa) {
  	this.placa = placa;
  }
  
  // Gentilmente cedido por Miriã Sousa
  public void locomover() {
    System.out.printf("O %s %s  de cor %s  ano: %d  placa %s e número de chassi %d está batendo!\n", this.getMarca(), this.getModelo(), this.getCor(),
        this.getAno(), this.getPlaca(), this.numChassi);
  }

}
