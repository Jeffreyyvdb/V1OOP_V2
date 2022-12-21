package Practica.Practicum_10.userinterface;

import Practica.Practicum_10.model.Hotel;
import Practica.Practicum_10.model.KamerType;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.StringConverter;

import java.time.LocalDate;

public class BoekingenController {

    @FXML
    private Button ButtonBoek;

    @FXML
    private Button ButtonReset;

    @FXML
    private ComboBox<KamerType> ComboBoxKamerType;

    @FXML
    private DatePicker DatePickerAankomstDatum;

    @FXML
    private DatePicker DatePickerVertrekDatum;

    @FXML
    private TextField textBoxAdres;

    @FXML
    private TextField textBoxNaam;

    @FXML
    private Label LabelGegevens;

    private Hotel hotel = Hotel.getHotel();
    public void initialize(){
        textBoxAdres.setText("");
        textBoxNaam.setText("");
        ComboBoxKamerType.setValue(null);
        ComboBoxKamerType.setPromptText("");
        DatePickerAankomstDatum.setValue(null);
        DatePickerVertrekDatum.setValue(null);

        var obserableKamertypen = FXCollections.observableArrayList(hotel.getKamerTypen());

        ComboBoxKamerType.setItems(obserableKamertypen);
        ComboBoxKamerType.setConverter(new StringConverter<KamerType>() {
            @Override
            public String toString(KamerType kamerType) {
                return kamerType.toString();
            }

            @Override
            public KamerType fromString(String s) {
                return null;
            }
        });
    }
    @FXML
    void ButtonBoek_Clicked(ActionEvent event) {

        var aankomstDatum = DatePickerAankomstDatum.getValue();
        var vertrekDatum = DatePickerVertrekDatum.getValue();
        var naam = textBoxNaam.getCharacters().toString();
        var adres = textBoxAdres.getCharacters().toString();
        var kamerType = ComboBoxKamerType.getValue();

        try
        {
            if(naam.isBlank()){
                throw new Exception("Naam is leeg");
            }

            if(adres.isBlank()){
                throw new Exception("Adres is leeg");
            }

            if(aankomstDatum == null || vertrekDatum == null){
                throw new Exception("aakomst- of vertrek- datum is in het verleden");
            }

            if(aankomstDatum.isBefore(LocalDate.now()) || vertrekDatum.isBefore(LocalDate.now())) {
                throw new Exception("aankomst- of vertrek- datum is in het verleden");
            }

            if(aankomstDatum.isAfter(vertrekDatum)){
                throw new Exception("aankomst datum is na vertrek datum");
            }

            if(kamerType == null){
                throw new Exception("Kamertype is leeg");
            }

            hotel.voegBoekingToe(aankomstDatum,vertrekDatum,naam,adres, kamerType);
        }
        catch  (Exception exception)
        {
            LabelGegevens.setText(exception.getMessage());
        }
    }

    @FXML
    void ButtonReset_Click(ActionEvent event) {
        initialize();
    }

}
