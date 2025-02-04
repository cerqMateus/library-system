package Comando;

import BibliotecaModelo.Livro;
import Sistema.Repositorio;
import Sistema.Trabalhador;
import UsuarioModelo.IObservador;

public class RegistrarObservador implements IComando{

    @Override
    public void executar(Parametro p) {
       IObservador observador =  Repositorio.pegarInstancia().pegarObservador(p.getPrimeiroParametro());
       Livro livro = Repositorio.pegarInstancia().pegarLivro(p.getSegundoParametro());
       
       Trabalhador.registrarObservador(observador, livro);
    }
    
}
