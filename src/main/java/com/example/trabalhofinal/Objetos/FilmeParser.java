package com.example.trabalhofinal.Objetos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FilmeParser {

    public static Filme pegaFilme(String json){
        Filme f = new Filme();

        //Response":False,Error\:Movie not found!

        JsonElement elm = JsonParser.parseString(json);
        if(elm.isJsonObject()){
            JsonObject obj = elm.getAsJsonObject();
            String resp = obj.get("Response").getAsString();

            if (resp.compareToIgnoreCase("True")==0){
                f.name = obj.get("Title").getAsString();
                f.name = "Titulo: "+f.name;
                f.data = obj.get("Released").getAsString();
                f.data = "Data: "+f.data;
                f.sinopse = obj.get("Plot").getAsString();
                f.sinopse = "Sinopse: "+f.sinopse;
                f.posterURL = obj.get("Poster").getAsString();
            } else{
                f.name = "Erro!";
                f.data = "Filme";
                f.sinopse = "Não Encontrado";
                f.posterURL = "https://cdn.pixabay.com/photo/2018/01/04/15/51/404-error-3060993_960_720.png";
            }
        }
        return f;
    }
}
