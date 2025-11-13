#!/bin/bash
rm -f CatFights.class
javac --module-path "./javafx-sdk-25.0.1/lib" --add-modules javafx.controls,javafx.fxml CatFights.java
