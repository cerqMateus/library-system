package Comando;

import Sistema.Repositorio;
import Sistema.Trabalhador;
import UsuarioModelo.IObservador;

public class ConsultarNotificacoes implements IComando{

    @Override
    public void executar(Parametro p) {
        IObservador observador = Repositorio.pegarInstancia().pegarObservador(p.getPrimeiroParametro());
        
        Trabalhador.consultarObservador(observador);
    }   
    
}
