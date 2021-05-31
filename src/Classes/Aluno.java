package Classes;

import java.util.InputMismatchException;

public class Aluno {

    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome; 
    }

    public void setNome(String nome) {
        if (nome.matches(".*\\d.")){
            System.out.println("Nome não pode conter numeros!");
        } else 
        this.nome = nome;
    }
        
  
public String getCpf() {
	return Formatacpf (cpf);
}
public void setCpf(String cpf) {
    if (cpf == null) {
        throw new NullPointerException("O CPF estar nulo");
    }

    cpf = cpf.trim().replace(".", "").replace("-", "");

    if (cpf.length() == 11){
	this.cpf = cpf;
    } else {
        throw new NumberFormatException ("Numeros de caracteres invalidos para o CPF.");
    }

}  


private String Formatacpf(String cpf) {
    cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    return cpf;
}


public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    if (idade < 0) {
       throw new InputMismatchException ("Idade nao pode ser negativa");
    } else
    this.idade = idade;
}

public String GetFaixaEtaria() {
    if (this.idade <12) {
        return "crianca";
    }else 
    if (this.idade <65) {
        return "adulto";
    }else 
    return "idoso";
    
}

@Override
public String toString() {
    return String.format("Aluno:%s \nCpf:%s \nIdade %d \nFaixa etaria: %s", 
    nome, cpf, idade, GetFaixaEtaria());

}
public Aluno (String nome, String cpf, int idade) {
    setNome (nome);
    setCpf (cpf);
    setIdade(idade);
}
public Aluno() {
}
}

