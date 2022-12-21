package Practica.Practicum_10.userinterface;

import Practica.Practicum_10.model.Boeking;
import Practica.Practicum_10.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;

public class HotelOverzichtController {
    @FXML private Label hotelnaamLabel;
    @FXML private ListView boekingenListView;
    @FXML private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();

    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent) throws Exception {

        // Maak in je project een nieuwe FXML-pagina om boekingen te kunnen invoeren
        // Open de nieuwe pagina in deze methode
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Boekingen.fxml"));
        Parent root = loader.load();

        Stage newStage = new Stage();
        newStage.setScene(new Scene(root));
        // Zorg dat de gebruiker ondertussen geen gebruik kan maken van de HotelOverzicht-pagina
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.showAndWait();
        // Update na sluiten van de nieuwe pagina het boekingen-overzicht
        initialize();
    }

    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();
        var geselecteerdeDatum = overzichtDatePicker.getValue();

        // Vraag de boekingen op bij het Hotel-object.
        var hotelBoekingen = hotel.getBoekingen();
        // Voeg voor elke boeking in nette tekst (string) toe aan de boekingen-lijst.
        for (Boeking boeking : hotelBoekingen) {
            var aankomst = boeking.getAankomstDatum();
            var vertrek = boeking.getVertrekDatum();
            var kamerNummer = boeking.getKamer().getKamerNummer();
            var klantNaam = boeking.getBoeker().getNaam();

            var geselecteerdeDatumIsAtOrBeforeVertrek = geselecteerdeDatum.isBefore(vertrek) || geselecteerdeDatum.equals(vertrek);
            var geselecteerdeDatumIsAtOrAfterAankomst = geselecteerdeDatum.isAfter(aankomst) || geselecteerdeDatum.equals(aankomst);

            if(geselecteerdeDatumIsAtOrBeforeVertrek && geselecteerdeDatumIsAtOrAfterAankomst){
            boekingen.add(String.format("%1$s t/m %2$s, kamernummer: %3$s, klant: %4$s",
                    aankomst,vertrek,kamerNummer,klantNaam));
            }
        boekingenListView.setItems(boekingen);
        }
    }
}