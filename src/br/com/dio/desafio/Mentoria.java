package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    public Mentoria() {

    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}
