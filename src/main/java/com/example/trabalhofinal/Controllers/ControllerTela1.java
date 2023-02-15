package com.example.trabalhofinal.Controllers;


import com.example.trabalhofinal.Objetos.BuscarDado;
import com.example.trabalhofinal.Objetos.Filme;
import com.example.trabalhofinal.Objetos.FilmeParser;
import com.example.trabalhofinal.Objetos.FormataString;
import com.example.trabalhofinal.Listener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ControllerTela1 {

    @FXML
    private TextField textField;

    Listener listener = new Listener();
    BuscarDado buscar = new BuscarDado();

    @FXML
    void carregarPressionado(ActionEvent e) throws Exception {
        System.out.println("Carregar");
        //textField.getText();
        if(textField.getText()==""){
            System.out.println("Campo Vazio");
        }else{
            String pesquisa = textField.getText();

            FormataString formatar = new FormataString();
            pesquisa = formatar.nomeFilme(pesquisa);


            String JSON = buscar.BuscarDado(pesquisa);
            System.out.println(JSON);

            Filme f = FilmeParser.pegaFilme(JSON);

            Stage stage = new Stage();
            listener.setFilme(f);
            listener.start(stage);

        }
    }

    @FXML
    void limparPressionado(ActionEvent e) {
        System.out.println("Limpar");
        textField.setText("");
    }

}