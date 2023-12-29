package br.com.katriel.model;
public class AparelhoTelefonico implements Papel{
  private Dispositivo dispositivo;

  public AparelhoTelefonico(Dispositivo dispositivo) {
    this.dispositivo = dispositivo;
  }

  public void executar() {
    dispositivo.ligar();
    dispositivo.fazerChamada();
    dispositivo.desligar();
  }
}
