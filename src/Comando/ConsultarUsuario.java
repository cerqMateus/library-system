package Comando;

import Sistema.Repositorio;
import Sistema.Trabalhador;
import UsuarioModelo.Usuario;

public class ConsultarUsuario implements IComando{

    @Override
    public void executar(Parametro p) {
        Usuario usuario = Repositorio.pegarInstancia().pegarUsuario(p.getPrimeiroParametro());
        
        Trabalhador.consultarUsuario(usuario);
    }
    
}
