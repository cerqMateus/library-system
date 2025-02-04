package BibliotecaModelo;

import UsuarioModelo.IObservador;

public interface IObjeto {
  public void registraObservador(IObservador o);
  public void removeObservador(IObservador o);
  public void notificaObservadores();
}
