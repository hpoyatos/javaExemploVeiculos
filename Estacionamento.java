import java.util.ArrayList;

class Estacionamento {
  private ArrayList<Carro> carros;
  private int vagas;

  // Construtor
  public Estacionamento(){
    this.carros = new ArrayList<Carro>();
    this.vagas = 30;
  }

  public void addCarro(Carro c){
    this.carros.add(c);
  }

  public void delCarro(Carro c){
    this.carros.remove(c);
  }

  public void mostrarVagasDisponiveis(){
    int vagasDisp = this.vagas - this.carros.size();
    System.out.println("O estacionamento possui, neste momento, "+vagasDisp+" vagas disponíveis");
  }

  public void setVagas(int vagas) {
    this.vagas = vagas;
  }
  
  public int getVagas() {
    return vagas;
  }
}
