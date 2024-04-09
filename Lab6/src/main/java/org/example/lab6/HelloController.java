package org.example.lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.PixelReader;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas canvas;
    @FXML
    private Spinner<Integer> MySpinner;
    @FXML
    private Spinner<Integer> MySpinner2;
    private int x, y;
    private boolean[][] horizontalSticks;
    private boolean[][] verticalSticks;
    private int currentPlayer = 1;
    private double offsetX, offsetY;
    private double cellWidth, cellHeight;

    private boolean[][] stonesPlaced;
    private boolean firstStonePlaced = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20);
        valueFactory.setValue(1);
        MySpinner.setValueFactory(valueFactory);

        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20);
        valueFactory2.setValue(1);
        MySpinner2.setValueFactory(valueFactory2);

        canvas.setOnMouseClicked(event -> handleCanvasClick(event.getX(), event.getY()));

        up(null);
    }
    @FXML
    public void save(ActionEvent e) {
        WritableImage image = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
        canvas.snapshot(null, image);

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Game Image");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PNG Files", "*.png"));
        File file = fileChooser.showSaveDialog(canvas.getScene().getWindow());

        if (file != null) {
            try {
                PixelReader pixelReader = image.getPixelReader();

                BufferedImage bufferedImage = new BufferedImage((int) image.getWidth(), (int) image.getHeight(), BufferedImage.TYPE_INT_ARGB);
                for (int y = 0; y < image.getHeight(); y++) {
                    for (int x = 0; x < image.getWidth(); x++) {
                        bufferedImage.setRGB(x, y, pixelReader.getArgb(x, y));
                    }
                }

                ImageIO.write(bufferedImage, "png", file);
                System.out.println("Game image saved successfully!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }



    public void exit(ActionEvent e) {
        Stage stage = (Stage) canvas.getScene().getWindow();
        stage.close();
    }
    public void up(ActionEvent e) {
        initializeBoard();
        drawGrid();
    }

    private void initializeBoard() {
        x = MySpinner.getValue();
        y = MySpinner2.getValue();

        horizontalSticks = new boolean[x][y - 1];
        verticalSticks = new boolean[x - 1][y];
        stonesPlaced = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y - 1; j++) {
                horizontalSticks[i][j] = Math.random() < 0.5;
            }
        }
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < y; j++) {
                verticalSticks[i][j] = Math.random() < 0.5;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                stonesPlaced[i][j] = false;
            }
        }
    }

    private void drawGrid() {
        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

        cellWidth = canvasWidth / x;
        cellHeight = canvasHeight / y;

        offsetX = (canvasWidth - (cellWidth * (x - 1))) / 2;
        offsetY = (canvasHeight - (cellHeight * (y - 1))) / 2;

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvasWidth, canvasHeight);

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
        drawSticks(gc);

        gc.setFill(Color.BLACK);
        drawNodes(gc, 8);

        gc.setLineWidth(3);
        highlightThickLines(gc);
    }

    private void drawSticks(GraphicsContext gc) {
        for (int i = 0; i < x; i++) {
            double xPos = offsetX + i * cellWidth;
            gc.strokeLine(xPos, offsetY, xPos, offsetY + cellHeight * (y - 1));
        }

        for (int j = 0; j < y; j++) {
            double yPos = offsetY + j * cellHeight;
            gc.strokeLine(offsetX, yPos, offsetX + cellWidth * (x - 1), yPos);
        }
    }

    private void drawNodes(GraphicsContext gc, double radius) {
        for (int i = 0; i < x; i++) {
            double xPos = offsetX + i * cellWidth;
            for (int j = 0; j < y; j++) {
                double yPos = offsetY + j * cellHeight;
                gc.strokeOval(xPos - radius, yPos - radius, 2 * radius, 2 * radius);
            }
        }
    }

    private void highlightThickLines(GraphicsContext gc) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y - 1; j++) {
                if (horizontalSticks[i][j]) {
                    double xPos = offsetX + i * cellWidth;
                    double yPosStart = offsetY + j * cellHeight;
                    double yPosEnd = yPosStart + cellHeight;
                    gc.strokeLine(xPos, yPosStart, xPos, yPosEnd);
                }
            }
        }

        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < y; j++) {
                if (verticalSticks[i][j]) {
                    double xPosStart = offsetX + i * cellWidth;
                    double xPosEnd = xPosStart + cellWidth;
                    double yPos = offsetY + j * cellHeight;
                    gc.strokeLine(xPosStart, yPos, xPosEnd, yPos);
                }
            }
        }
    }


    private boolean checkForWin() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if (isNodeClickable(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void handleWin() {
        System.out.println("Player " + currentPlayer + " wins!");

    }

    private void handleCanvasClick(double clickX, double clickY) {
        int gridX = (int) Math.round((clickX - offsetX) / cellWidth);
        int gridY = (int) Math.round((clickY - offsetY) / cellHeight);

        if (isNodeClickable(gridX, gridY)) {
            double stoneX = offsetX + gridX * cellWidth;
            double stoneY = offsetY + gridY * cellHeight;

            placeStone(gridX, gridY, stoneX, stoneY);

            if (checkForWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
            } else {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        } else {
            System.out.println("Node is not clickable!");
        }
    }




    private boolean isNodeClickable(int gridX, int gridY) {
        if (gridX < 0 || gridX >= x || gridY < 0 || gridY >= y || stonesPlaced[gridX][gridY]) {
            return false;
        }

        boolean isAdjacentToStone = firstStonePlaced && isAdjacentToAnotherStone(gridX, gridY);
        boolean hasAdjacentThickLine = ((gridX > 0 && verticalSticks[gridX - 1][gridY]) ||
                (gridX < x - 1 && verticalSticks[gridX][gridY]) ||
                (gridY > 0 && horizontalSticks[gridX][gridY - 1]) ||
                (gridY < y - 1 && horizontalSticks[gridX][gridY]));

        if ((isAdjacentToStone || !firstStonePlaced) && hasAdjacentThickLine)
            {
                boolean isConnectedByThickLine = false;

                if (gridX > 0 && stonesPlaced[gridX - 1][gridY] && verticalSticks[gridX - 1][gridY]) isConnectedByThickLine = true;
                if (gridX < x - 1 && stonesPlaced[gridX + 1][gridY] && verticalSticks[gridX][gridY]) isConnectedByThickLine = true;
                if (gridY > 0 && stonesPlaced[gridX][gridY - 1] && horizontalSticks[gridX][gridY - 1]) isConnectedByThickLine = true;
                if (gridY < y - 1 && stonesPlaced[gridX][gridY + 1] && horizontalSticks[gridX][gridY]) isConnectedByThickLine = true;

                return (firstStonePlaced && isConnectedByThickLine) || !firstStonePlaced;
            }


        return false;
    }

     boolean isAdjacentToAnotherStone(int gridX, int gridY) {
        if (gridX > 0 && stonesPlaced[gridX - 1][gridY]) return true;
        if (gridX < x - 1 && stonesPlaced[gridX + 1][gridY]) return true;
        if (gridY > 0 && stonesPlaced[gridX][gridY - 1]) return true;
        if (gridY < y - 1 && stonesPlaced[gridX][gridY + 1]) return true;

        return false;
    }











    private void placeStone(int gridX, int gridY, double stoneX, double stoneY) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double stoneRadius = Math.min(cellWidth, cellHeight) / 4;
        gc.setFill(currentPlayer == 1 ? Color.RED : Color.BLUE);
        gc.fillOval(stoneX - stoneRadius, stoneY - stoneRadius, stoneRadius * 2, stoneRadius * 2);
        stonesPlaced[gridX][gridY] = true;
        firstStonePlaced = true;


    }









}