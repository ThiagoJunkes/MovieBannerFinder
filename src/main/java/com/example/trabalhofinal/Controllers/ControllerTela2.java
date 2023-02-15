package com.example.trabalhofinal.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControllerTela2 {

    @FXML
    private ImageView imagem;

    @FXML
    private Label textoData;

    @FXML
    private Label textoNome;

    @FXML
    private Label textoSinopse;

    public void mudaImagem(String texto){
        Image image = new Image(texto);
        imagem.setImage(image);
    }

    public void mudaData(String texto){
        textoData.setText(texto);
    }

    public void mudaNome(String texto){
        textoNome.setText(texto);
    }

    public void mudaSinopse(String texto){
        textoSinopse.setText(texto);
    }



}
