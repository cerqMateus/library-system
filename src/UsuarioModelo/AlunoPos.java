package UsuarioModelo;

public class AlunoPos extends Usuario {
    
    public AlunoPos (String codigo, String nome) {
        super(codigo, nome, new RegraAluno(), 5, 3);
    }
    
}
