package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField txtbeløp, txtrente, txtantallår;

    @FXML
    Label result;


    @FXML
    public void VisResult(ActionEvent actionEvent) {
        //Hente fra datafelt
        String innBeløp =txtbeløp.getText();
        String innRente =txtrente.getText();
        String innAntallÅr =txtantallår.getText();


double beløp,rente,antallÅr;
        //Konverter dem til double
        try {
           beløp = Double.parseDouble(innBeløp);
            rente = Double.parseDouble(innRente);
             antallÅr = Double.parseDouble(innAntallÅr);
        }
        catch(Exception e ){
            result.setText("Du har skrevet ugyldig data");
            beløp=0;
            rente=0;
            antallÅr=0;
        }

        //Bruk dem i formel
        // startBeløp*(1+(rente/100))^år
        double res=beløp*(Math.pow(1+(rente/100),antallÅr));

        if(res!=0) {

            result.setText("Resultatet er " + res);
        }








    }

}
