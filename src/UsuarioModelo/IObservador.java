package UsuarioModelo;

public interface IObservador {
    public void atualizar();
    public String consultarObservador();
    public boolean testarCodigo(String codigo);
}

