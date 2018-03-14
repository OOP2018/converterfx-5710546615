package converter;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * 
 * @author Visurt Anuttivong
 */
public class ConverterController {
	@FXML
	private TextField textfield1;
	@FXML
	private TextField textfield2;
	@FXML
	private ComboBox<Length> unitbox1;
	@FXML
	private ComboBox<Length> unitbox2;

	/**
	 * JavaFX calls the initialize() method of your controller when it creates the
	 * UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 */
	public void initialize() {
		if (unitbox1 != null) {
			unitbox1.getItems().addAll(Length.values());
			unitbox1.getSelectionModel().select(0); // select an item to show
		}
		if (unitbox2 != null) {
			unitbox2.getItems().addAll(Length.values());
			unitbox2.getSelectionModel().select(1); // select an item to show
		}
	}

	/**
	 * Convert handler is to convert some unit to another unit.
	 */
	public void handleConvert() {
		try {
			Length unit1 = unitbox1.getValue();
			Length unit2 = unitbox2.getValue();
			double amount = 0;
			if (!textfield1.getText().isEmpty() && !textfield1.getText().equals("Invalid")) {
				amount = Double.parseDouble(textfield1.getText().trim());
				textfield2.setText(String.format("%.4g", amount * unit1.getValue() / unit2.getValue()));
			}
			if (!textfield2.getText().isEmpty() && !textfield2.getText().equals("Invalid")) {
				amount = Double.parseDouble(textfield2.getText().trim());
				textfield1.setText(String.format("%.4g", amount * unit2.getValue() / unit1.getValue()));
			}
			textfield1.setStyle("-fx-text-fill: black;");
			textfield2.setStyle("-fx-text-fill: black;");
		} catch (Exception e) {
			textfield1.setText("Invalid");
			textfield2.setText("Invalid");
			textfield1.setStyle("-fx-text-fill: red;");
			textfield2.setStyle("-fx-text-fill: red;");
		}
	}

	/**
	 * Clear handler is to empty all text field.
	 */
	public void handleClear() {
		textfield1.clear();
		textfield2.clear();
		textfield1.setStyle("-fx-text-fill: black;");
		textfield2.setStyle("-fx-text-fill: black;");
	}
}
