package com.example.trabalhofinal;

import com.example.trabalhofinal.Controllers.ControllerTela2;
import com.example.trabalhofinal.Objetos.Filme;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Listener extends Application {

    private Filme f;

    public void setFilme(Filme temp){this.f = temp;}

    private Parent root;

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaFilmes.fxml"));
            root = loader.load();

            ControllerTela2 controller2 = loader.getController();
            controller2.mudaData(f.data);
            controller2.mudaNome(f.name);
            controller2.mudaSinopse(f.sinopse);
            controller2.mudaImagem(f.posterURL);

            //Parent root = FXMLLoader.load(getClass().getResource("tela2.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("TelaFilme");
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
