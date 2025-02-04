package Comando;

import BibliotecaModelo.Livro;
import Sistema.Repositorio;
import Sistema.Trabalhador;

public class ConsultarLivro implements IComando{

    @Override
    public void executar(Parametro p) {
        Livro livro = Repositorio.pegarInstancia().pegarLivro(p.getPrimeiroParametro());
        
        Trabalhador.consultarLivro(livro);
    }
    
}
