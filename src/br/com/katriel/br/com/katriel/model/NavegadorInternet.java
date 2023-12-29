package br.com.katriel.model;
public class NavegadorInternet implements Papel{
  private Dispositivo dispositivo;

  public NavegadorInternet(Dispositivo dispositivo) {
    this.dispositivo = dispositivo;
  }

  public void executar() {
    dispositivo.ligar();
    dispositivo.acessarSite();
    dispositivo.desligar();
  }
}
