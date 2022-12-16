package Practica.Practicum_10.userinterface;

import Practica.Practicum_10.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

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

    public void nieuweBoeking(ActionEvent actionEvent) {
        System.out.println("nieuweBoeking() is nog niet geïmplementeerd!");

        // Maak in je project een nieuwe FXML-pagina om boekingen te kunnen invoeren
        // Open de nieuwe pagina in deze methode
        // Zorg dat de gebruiker ondertussen geen gebruik kan maken van de HotelOverzicht-pagina
        // Update na sluiten van de nieuwe pagina het boekingen-overzicht
    }

    public void toonBoekingen() {
        System.out.println("toonBoekingen() is nog niet geïmplementeerd!");
        ObservableList<String> boekingen = FXCollections.observableArrayList();

        // Vraag de boekingen op bij het Hotel-object.
        // Voeg voor elke boeking in nette tekst (string) toe aan de boekingen-lijst.

        boekingenListView.setItems(boekingen);
    }
}