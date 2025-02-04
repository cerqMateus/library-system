package Comando;

import Sistema.Trabalhador;

public class Sair implements IComando {

    @Override
    public void executar(Parametro p) {
        Trabalhador.sair();
    }
    
}
