package sorting.laba1.sortinglaba1;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #000000");
        Image leftCurtainImage = new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\sortingLaba1\\src\\main\\resources\\sorting\\laba1\\sortinglaba1\\Z2.png");
        ImageView leftCurtain = new ImageView(leftCurtainImage);
        leftCurtain.setTranslateX(268);
        leftCurtain.setFitWidth(625);
        leftCurtain.setFitHeight(710);
        Image rightCurtainImage = new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\sortingLaba1\\src\\main\\resources\\sorting\\laba1\\sortinglaba1\\Z1.png");
        ImageView rightCurtain = new ImageView(rightCurtainImage);
        rightCurtain.setTranslateX(-268);
        rightCurtain.setFitWidth(625);
        rightCurtain.setFitHeight(710);
        Image image = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/kartinka_open.png");
        ImageView imageView = new ImageView(image);
        imageView.setVisible(false);
        Image imageup = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/writer.png");
        ImageView imageViewup = new ImageView(imageup);
        imageViewup.setVisible(false);
        Image buttonImage = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/write.png");
        ImageView buttonImageView = new ImageView(buttonImage);
        // Установка размеров изображения кнопки
        buttonImageView.setFitWidth(342);
        buttonImageView.setFitHeight(126);
        Image buttonImage1 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/1.png");
        ImageView n1 = new ImageView(buttonImage1);
        n1.setFitWidth(211);
        n1.setFitHeight(77);
        n1.setLayoutX(94);
        n1.setLayoutY(515);
        Image buttonImage2 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/2.png");
        ImageView n2 = new ImageView(buttonImage2);
        n2.setFitWidth(211);
        n2.setFitHeight(77);
        n2.setLayoutX(270);
        n2.setLayoutY(432);
        Image buttonImage3 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/3.png");
        ImageView n3 = new ImageView(buttonImage3);
        n3.setFitWidth(211);
        n3.setFitHeight(77);
        n3.setLayoutX(340);
        n3.setLayoutY(158);
        Image buttonImage4 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/4.png");
        ImageView n4 = new ImageView(buttonImage4);
        n4.setFitWidth(211);
        n4.setFitHeight(77);
        n4.setLayoutX(475);
        n4.setLayoutY(401);
        Image buttonImage5 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/5.png");
        ImageView n5 = new ImageView(buttonImage5);
        n5.setFitWidth(211);
        n5.setFitHeight(77);
        n5.setLayoutX(610);
        n5.setLayoutY(149);
        Image buttonImage6 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/6.png");
        ImageView n6 = new ImageView(buttonImage6);
        n6.setFitWidth(211);
        n6.setFitHeight(77);
        n6.setLayoutX(729);
        n6.setLayoutY(394);
        Image buttonImage7 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/7.png");
        ImageView n7 = new ImageView(buttonImage7);
        n7.setFitWidth(211);
        n7.setFitHeight(77);
        n7.setLayoutX(890);
        n7.setLayoutY(150);
        Image buttonImage8 = new Image("D:/JAVAPROG/Kurs3/engineeringandArchitecture/8.png");
        ImageView n8 = new ImageView(buttonImage8);
        n8.setFitWidth(211);
        n8.setFitHeight(77);
        n8.setLayoutX(1015);
        n8.setLayoutY(500);
        Pane root1 = new Pane();
        buttonImageView.setOnMouseClicked(event -> {
            // Анимация раздвигания штор
            TranslateTransition leftCurtainTransition = new TranslateTransition(Duration.seconds(1), leftCurtain);
            leftCurtainTransition.setByX(1200);
            leftCurtainTransition.play();
            TranslateTransition rightCurtainTransition = new TranslateTransition(Duration.seconds(1), rightCurtain);
            rightCurtainTransition.setByX(-1200);
            rightCurtainTransition.setOnFinished(e -> {
                imageViewup.setVisible(true);
                imageView.setVisible(true);
                buttonImageView.setVisible(false);
                root1.getChildren().add(n1);
                root1.getChildren().add(n2);
                root1.getChildren().add(n3);
                root1.getChildren().add(n4);
                root1.getChildren().add(n5);
                root1.getChildren().add(n6);
                root1.getChildren().add(n7);
                root1.getChildren().add(n8);
            });
            rightCurtainTransition.play();
        });
        n1.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("СОРТИРОВКА ВСТАВКАМИ\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            insertionSort(array5);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            insertionSort(array8);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            insertionSort(array11);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            insertionSort(array14);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            insertionSort(array6);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            insertionSort(array9);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            insertionSort(array12);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            insertionSort(array15);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            insertionSort(array7);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            insertionSort(array10);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            insertionSort(array13);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            insertionSort(array16);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n2.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("СОРТИРОВКА ВЫБОРОМ\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            selectionSort(array5);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            selectionSort(array8);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            selectionSort(array11);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            selectionSort(array14);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            selectionSort(array6);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            selectionSort(array9);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            selectionSort(array12);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            selectionSort(array15);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            selectionSort(array7);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            selectionSort(array10);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            selectionSort(array13);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            selectionSort(array16);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n3.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("СОРТИРОВКА ОБМЕНОМ\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            bubbleSort(array5);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            bubbleSort(array8);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            bubbleSort(array11);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            bubbleSort(array14);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            bubbleSort(array6);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            bubbleSort(array9);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            bubbleSort(array12);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            bubbleSort(array15);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            bubbleSort(array7);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            bubbleSort(array10);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            bubbleSort(array13);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            bubbleSort(array16);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n4.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("БЫСТРАЯ СОРТИРОВКА\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            quickSort(array5,0, array5.length - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            quickSort(array8,0, array8.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            quickSort(array11,0, array11.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            quickSort(array14,0, array14.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            quickSort(array6,0, array6.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            quickSort(array9,0, array9.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            quickSort(array12,0, array12.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            quickSort(array15,0, array15.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            quickSort(array7,0, array7.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            quickSort(array10,0, array10.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            quickSort(array13,0, array13.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            quickSort(array16,0, array16.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n5.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("СОРТИРОВКА ДЕРЕВЬЯ\n");
            BinaryTree tree = new BinaryTree();
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);



            long startTime = System.nanoTime();
            for (int i : array5) {
                tree.insert(i);
            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            for (int i : array8) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            for (int i : array11) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            for (int i : array14) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            for (int i : array6) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            for (int i : array9) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            for (int i : array12) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            for (int i : array15) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            for (int i : array7) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            for (int i : array10) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            for (int i : array13) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            for (int i : array16) {
                tree.insert(i);
            }
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n6.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("ПИРАМИДАЛЬНАЯ СОРТИРОВКА\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            heapSort(array5);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            heapSort(array8);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            heapSort(array11);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            heapSort(array14);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            heapSort(array6);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            heapSort(array9);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            heapSort(array12);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            heapSort(array15);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            heapSort(array7);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            heapSort(array10);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            heapSort(array13);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            heapSort(array16);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n7.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("СОРТИРОВКА Шелла\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            shellSort(array5);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            shellSort(array8);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            shellSort(array11);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            shellSort(array14);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            shellSort(array6);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            shellSort(array9);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            shellSort(array12);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            shellSort(array15);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            shellSort(array7);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            shellSort(array10);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            shellSort(array13);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            shellSort(array16);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        n8.setOnMouseClicked(event -> {
            StringBuilder result = new StringBuilder();
            result.append("СОРТИРОВКА СЛИЯНИЕМ\n");
            // Тестирование для неотсортированного массива
            result.append("\nНаихудший случай:\n");
            int[] array5 = generateUnsortedArray(5000);
            long startTime = System.nanoTime();
            mergeSort(array5, 0, array5.length - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array8 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            mergeSort(array8, 0, array8.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array11 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            mergeSort(array11, 0, array11.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array14 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            mergeSort(array14, 0, array14.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для массива отсортированного на 50%
            result.append("\nСредний случай:\n");
            int[] array6 = generateSemiSortedArray(5000);
            startTime = System.nanoTime();
            mergeSort(array6, 0, array6.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n^2)\n");
            int[] array9 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            mergeSort(array9, 0, array9.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array12 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            mergeSort(array12, 0, array12.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array15 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            mergeSort(array15, 0, array15.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            // Тестирование для полностью отсортированного массива
            result.append("\nЛучший случай:\n");
            int[] array7 = generateSortedArray(5000);
            startTime = System.nanoTime();
            mergeSort(array7, 0, array7.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("5000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            //result.append("Временная сложность: O(n)\n");
            int[] array10 = generateUnsortedArray(10000);
            startTime = System.nanoTime();
            mergeSort(array10, 0, array10.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("10000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array13 = generateUnsortedArray(100000);
            startTime = System.nanoTime();
            mergeSort(array13, 0, array13.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("100000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");
            int[] array16 = generateUnsortedArray(150000);
            startTime = System.nanoTime();
            mergeSort(array16, 0, array16.length - 1);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // в миллисекундах
            result.append("150000 элементов - ");
            result.append("время работы ").append(duration).append(" мс\n");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Результаты тестирования");
            StackPane stackPane = new StackPane();
            ImageView imageViewс = new ImageView(new Image("D:\\JAVAPROG\\Kurs3\\engineeringandArchitecture\\card2.png"));
            imageViewс.setFitWidth(476); // Установка ширины изображения
            imageViewс.setFitHeight(662); // Установка ширины изображения
            stackPane.getChildren().add(imageViewс);
            Text text = new Text(result.toString());
            Label contentText = new Label(result.toString());
            contentText.setStyle("-fx-font-size: 14px; -fx-text-alignment: center;");
            stackPane.getChildren().add(contentText);
            alert.getDialogPane().setContent(stackPane);
            alert.getDialogPane().setStyle("-fx-background-color: black;");
            alert.showAndWait();
        });
        StackPane.setAlignment(buttonImageView, Pos.CENTER);
        StackPane.setAlignment(imageViewup, Pos.TOP_CENTER);
        root.getChildren().addAll( leftCurtain, rightCurtain,  imageView, root1, imageViewup, buttonImageView);
        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Метод для генерации неотсортированного массива
    public static int[] generateUnsortedArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    // Метод для генерации массива, отсортированного на 50%
    public static int[] generateSemiSortedArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                array[i] = i;
            } else {
                array[i] = random.nextInt(size);
            }
        }
        return array;
    }

    // Метод для генерации полностью отсортированного массива
    public static int[] generateSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
    /*private int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }*/
    private void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // быстрая
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    //двоичного дерева поиска
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        Node insertRec(Node root, int key) {
            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            return root;
        }

        void inorder() {
            inorderRec(root);
        }

        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.key + " ");
                inorderRec(root.right);
            }
        }
    }
    // пирамидальная
    public void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    // Шелла
    public void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
    // слиянием
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}