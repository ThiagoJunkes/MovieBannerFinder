package com.example.trabalhofinal.Objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BuscarDado {

    public static String BuscarDado(String site) {
        StringBuffer resposta = new StringBuffer();

        try{
            URL url = new URL(site);
            HttpURLConnection cliente = (HttpURLConnection) url.openConnection();
            cliente.setRequestMethod("GET");

            //int codigo = connection.getResponseCode();
            //System.out.println(codigo); //200 é OK

            InputStream stream = cliente.getInputStream();
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffer = new BufferedReader(reader);

            String line;
            while((line = buffer.readLine()) != null){
                resposta.append(line);
            }
            buffer.close();
            cliente.disconnect();
        } catch(MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return resposta.toString();
    }


}
