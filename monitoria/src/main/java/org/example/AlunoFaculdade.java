package org.example;

public class AlunoFaculdade {
    private String nome;
    private String matricula;
    private String email;
    private int creditos;

    public AlunoFaculdade (){

    }

    public AlunoFaculdade (String nome, String matricula, String email, int creditos){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.creditos = creditos;
    }

    public String getNome (){
        return this.nome;
    }
    public String getMatricula (){
        return this.matricula;
    }
    public String getEmail(){
        return this.email;
    }
    public int getCreditos (){
        return this.creditos;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setMatricula ( String matricula){
        this.matricula = matricula;

    }
    public void setEmail ( String email){
        this.email = email;

    }
    public void setCreditos (int creditos){
        this.creditos = creditos;
    }

    public void quantidadeCreditos (int creditos){
        if (creditos != 2 && creditos != 4 && creditos != 6){
            System.out.println("Valor inválido.");
        } else {
            this.creditos = this.creditos + creditos;
        }
    }
}


