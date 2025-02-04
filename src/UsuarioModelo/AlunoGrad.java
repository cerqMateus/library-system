package UsuarioModelo;

public class AlunoGrad extends Usuario {
    
    public AlunoGrad(String codigo, String nome){
        super(codigo, nome, new RegraAluno(), 4, 2);
    } 
}
