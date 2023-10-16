package main.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " + "Código: " + codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodigoConvite() {
        return codigoConvite;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getCodigoConvite());
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }


}
