package com.example.trabalhofinal.Objetos;

public class FormataString {
    public String nomeFilme(String dado){
        dado = dado.trim();
        dado = dado.replace(" ","+");

        dado = "https://www.omdbapi.com/?t="+dado+"&apikey=a525c616";
        return dado;
    }
}
