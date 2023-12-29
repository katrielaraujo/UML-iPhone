package br.com.katriel.model;


public class ReprodutorMusical implements Papel{
  private Dispositivo dispositivo;

  public ReprodutorMusical(Dispositivo dispositivo) {
    this.dispositivo = dispositivo;
  }

  public void executar() {
    dispositivo.ligar();
    
    dispositivo.tocarMusica();
    
    dispositivo.desligar();
  }
}
