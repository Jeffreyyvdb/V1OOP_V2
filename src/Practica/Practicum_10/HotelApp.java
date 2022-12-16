package Practica.Practicum_10;

import Practica.Practicum_10.model.Hotel;
import Practica.Practicum_10.model.Kamer;
import Practica.Practicum_10.model.KamerType;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelApp extends Application {
	public static void main(String[] args) throws Exception {
		KamerType kt1 = new KamerType("Standaard", 2, 60.00);
		KamerType kt2 = new KamerType("DeLuxe", 2, 85.00);

		List<Kamer> kamers = new ArrayList<>();
		kamers.add(new Kamer(1, kt2));
		kamers.add(new Kamer(2, kt1));
		kamers.add(new Kamer(3, kt1));
		kamers.add(new Kamer(4, kt2));

		Hotel nieuwHotel = new Hotel("Avondrust", kamers);
		nieuwHotel.voegBoekingToe(LocalDate.now(), LocalDate.now().plusWeeks(2), "Mark Rutte", "Torentje 1", kt2);
		nieuwHotel.voegBoekingToe(LocalDate.now(), LocalDate.now().plusDays(3), "Toos Hopeloos", "Botersloot 85", kt1);
		nieuwHotel.voegBoekingToe(LocalDate.now().plusDays(3), LocalDate.now().plusDays(13), "Trammetje Westerflat", "Studio 100", kt1);

		Hotel.setHotel(nieuwHotel);

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		String fxmlPagina = "userinterface/HotelOverzicht.fxml";
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
		Parent root = loader.load();

		stage.setTitle("HotelApp");
		stage.setScene(new Scene(root));
		stage.show();
	}
}