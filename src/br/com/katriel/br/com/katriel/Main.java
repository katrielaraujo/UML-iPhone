package br.com.katriel;

import br.com.katriel.model.Iphone;

public class Main {
    // Método principal que executa o programa
  public static void main(String[] args) {
    // Cria um objeto do tipo iPhone
    Iphone iphone = new Iphone();
    // Executa os métodos do iPhone
    iphone.ligar();
    iphone.tocarMusica();
    iphone.fazerChamada();
    iphone.acessarSite();
    iphone.desligar();
  }
}
