module Web {
	requires javafx.controls;
	requires javafx.web;
	
	opens application to javafx.graphics, javafx.fxml;
}
