package entities;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private LocalDate datadeNascimento;

    public Cliente(){
    }

    public Cliente(String nome, String email, LocalDate datadeNascimento) {
        this.nome = nome;
        this.email = email;
        this.datadeNascimento = datadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(LocalDate datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }
}
