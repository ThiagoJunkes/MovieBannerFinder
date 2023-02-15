module com.example.trabalhofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.trabalhofinal to javafx.fxml;
    exports com.example.trabalhofinal;
    exports com.example.trabalhofinal.Objetos;
    opens com.example.trabalhofinal.Objetos to javafx.fxml;
    exports com.example.trabalhofinal.Controllers;
    opens com.example.trabalhofinal.Controllers to javafx.fxml;
}