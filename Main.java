// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Instanciação de um objeto do tipo Carro
    Carro uno = new Carro();
    uno.marca = "Fiat";

    //Exibir a marca do carro contido na variável "uno"
    System.out.println("Marca do 1o. carro: "+uno.marca);

    //Nova instanciação ("estou criando!!") um novo objeto do tipo Carro.. 
    Carro porsche = new Carro();
    porsche.marca = "Porsche";
    System.out.println("Marca do 2o. carro: "+porsche.marca);

    //Agora podemos guardar mais propriedades dos carros!
    uno.modelo = "Uno Mille";
    uno.ano = 1996;
    uno.cor = "verde";
    uno.placa = "KWX-3791";

    uno.locomover();

    // Criar um objeto do tipo Avião!!
    Aviao b747 = new Aviao();
    b747.marca = "Boeing";
    b747.modelo = "747";
    b747.cor = "branco(a)";
    b747.ano = 2022;
    b747.prefixo = "PR-MHC";

    b747.locomover();

    Estacionamento estapar = new Estacionamento();
      estapar.mostrarVagasDisponiveis();
      estapar.addCarro(uno);
      estapar.mostrarVagasDisponiveis();
      estapar.addCarro(porsche);
      estapar.mostrarVagasDisponiveis();


    Estacionamento seuZe = new Estacionamento();
    seuZe.setVagas(50);
  }
}
