/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.jogoadvinha;

import com.mycompany.jogoadvinha.Jogo.Palpite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Alunos
 */
public class MainWindowController implements Initializable {
    @FXML
    private Label chanceLabel;

    @FXML
    private Label erroLabel;

    @FXML
    private TextField palpiteTextField;

    @FXML
    private Label resultadoLabel;
    /**
     * Initializes the controller class.
     */
    
    Jogo jogo;
    
    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        jogo = new Jogo(6);
    }    
    
    @FXML
    public void testarOnClick(ActionEvent event) {
        int palpite = Integer.parseInt(
                palpiteTextField.getText()
        );
        Palpite status = jogo.testar(palpite);
        if (status == Palpite.Acertou) {
            resultadoLabel.setText(
                    "Acertou Miseravi!!"
            );
        } else if (status == Palpite.Menor) {
            resultadoLabel.setText("Menor");
        } else {
            resultadoLabel.setText("Maior");
        }
    }
    
    @FXML
    public void reiniciarOnClick(ActionEvent event) {
        
    }    
}
