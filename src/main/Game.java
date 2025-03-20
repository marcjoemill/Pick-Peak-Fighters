package main;


import javafx.animation.PauseTransition;

// TIMESTAMP WORKING

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javafx.stage.Stage;
import javafx.util.Duration;

public class Game {

    private Scene scene, menuScene, authorScene, instrucScene, loadScene; // Menu, Author, Instruction scenes
    private StackPane root;
    private Canvas canvas;

    public final static int WINDOW_WIDTH = 1280;//1920;//1280;
    public final static int WINDOW_HEIGHT = 800;//1080;//800;


    Game() {
        this.root = new StackPane();
        this.scene = new Scene(root);
        this.canvas = new Canvas(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);
        this.root.getChildren().add(this.canvas);
    }

    void setStage(Stage stage) {
        // Add Buttons
        Image button_0 = new Image("ppfButtons/continue.png");
        ImageView button0 = new ImageView(button_0);
        button0.setLayoutX(700);
        button0.setLayoutY(600);

        Image button_1 = new Image("ppfButtons/play.png");
        ImageView button1 = new ImageView(button_1);
        button1.setLayoutX(480);
        button1.setLayoutY(600);

        Image button_2 = new Image("ppfButtons/exit.png");
        ImageView button2 = new ImageView(button_2);
        button2.setLayoutX(100);
        button2.setLayoutY(100);

        Image button_3 = new Image("ppfButtons/about.png");
        ImageView button3 = new ImageView(button_3);
        button3.setLayoutX(150);
        button3.setLayoutY(620);

        Image button_4 = new Image("ppfButtons/developer.png");
        ImageView button4 = new ImageView(button_4);
        button4.setLayoutX(850);
        button4.setLayoutY(620);

        Image button_5 = new Image("ppfButtons/exit.png");
        ImageView button5 = new ImageView(button_5);
        button5.setLayoutX(300);
        button5.setLayoutY(600);





        // Button actions for menu
        button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				menuMode(stage, button1, button3, button4, button2);
			}
		});

        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
                gameMode(stage, button2); // Go to gameMode when clicked
            }
        });

        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
                menuMode(stage, button1, button3, button4, button2);
            }
        });

        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
                instrucMode(stage, button2);
            }
        });

        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
                developerMode(stage, button2);
            }
        });



        loadingScreen(stage, button0, button5);
        stage.setResizable(false);
    }


    // Method to dynamically check and update the visibility of startButton
    private void updateStartButtonVisibility(String[] player1Character, String[] player2Character, ImageView startButton) {
        if (player1Character[0] != null && player2Character[0] != null) {
            startButton.setVisible(true);
        } else {
            startButton.setVisible(false);
        }
    }



    void gameMode(Stage stage, ImageView button2) {


        // Use a Pane to hold the buttons manually
        Pane gameLayout = new Pane();

        // Enter character selection

        String gifPath = getClass().getResource("/ppfBackgrounds/projselect.mp4").toExternalForm();
        Media media = new Media(gifPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Adjust MediaView size
        //mediaView.setFitWidth(WINDOW_WIDTH);
        //mediaView.setFitHeight(WINDOW_HEIGHT);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video

        // Start the media player
        mediaPlayer.play();

        // Add the background media
        gameLayout.getChildren().add(mediaView);




        // Configure button
        button2.setTranslateX(-50); // Adjust based on window dimensions
        button2.setTranslateY(-50);
        // Set desired width and height
        button2.setFitWidth(160);  // Set width to 50 pixels
        button2.setFitHeight(50); // Set height to 50 pixels


        // Character buttons

        Image player_1 = new Image("ppfButtons/player1.png");
        ImageView player1 = new ImageView(player_1);
        player1.setLayoutX(70);
        player1.setLayoutY(630);

        Image player_2 = new Image("ppfButtons/player2.png");
        ImageView player2 = new ImageView(player_2);
        player2.setLayoutX(880);
        player2.setLayoutY(630);

        // Player 1 Select Character buttons

        Image cbutton_0 = new Image("ppfCharacters/ichigokurosaki.png");
        ImageView cbutton0 = new ImageView(cbutton_0);
        cbutton0.setLayoutX(350);
        cbutton0.setLayoutY(150);

        Image cbutton_1 = new Image("ppfCharacters/mira.png");
        ImageView cbutton1 = new ImageView(cbutton_1);
        cbutton1.setLayoutX(560);
        cbutton1.setLayoutY(150);

        Image cbutton_2 = new Image("ppfCharacters/escanor.png");
        ImageView cbutton2 = new ImageView(cbutton_2);
        cbutton2.setLayoutX(770);
        cbutton2.setLayoutY(150);

        Image cbutton_3 = new Image("ppfCharacters/yasuo.png");
        ImageView cbutton3 = new ImageView(cbutton_3);
        cbutton3.setLayoutX(350);
        cbutton3.setLayoutY(330);

        Image cbutton_4 = new Image("ppfCharacters/zoro.png");
        ImageView cbutton4 = new ImageView(cbutton_4);
        cbutton4.setLayoutX(560);
        cbutton4.setLayoutY(330);

        Image cbutton_5 = new Image("ppfCharacters/lili.png");
        ImageView cbutton5 = new ImageView(cbutton_5);
        cbutton5.setLayoutX(770);
        cbutton5.setLayoutY(330);

        // Player 2 Select Character buttons

        Image c2button_0 = new Image("ppfCharacters/ichigokurosaki.png");
        ImageView c2button0 = new ImageView(c2button_0);
        c2button0.setLayoutX(350);
        c2button0.setLayoutY(150);

        Image c2button_1 = new Image("ppfCharacters/mira.png");
        ImageView c2button1 = new ImageView(c2button_1);
        c2button1.setLayoutX(560);
        c2button1.setLayoutY(150);

        Image c2button_2 = new Image("ppfCharacters/escanor.png");
        ImageView c2button2 = new ImageView(c2button_2);
        c2button2.setLayoutX(770);
        c2button2.setLayoutY(150);

        Image c2button_3 = new Image("ppfCharacters/yasuo.png");
        ImageView c2button3 = new ImageView(c2button_3);
        c2button3.setLayoutX(350);
        c2button3.setLayoutY(330);

        Image c2button_4 = new Image("ppfCharacters/zoro.png");
        ImageView c2button4 = new ImageView(c2button_4);
        c2button4.setLayoutX(560);
        c2button4.setLayoutY(330);

        Image c2button_5 = new Image("ppfCharacters/lili.png");
        ImageView c2button5 = new ImageView(c2button_5);
        c2button5.setLayoutX(770);
        c2button5.setLayoutY(330);

        Image start_Button = new Image("ppfButtons/start.png");
        ImageView startButton = new ImageView(start_Button);
        startButton.setLayoutX(470);
        startButton.setLayoutY(520);


        // Initially hide character choice buttons
        cbutton0.setVisible(false);
        cbutton1.setVisible(false);
        cbutton2.setVisible(false);
        cbutton3.setVisible(false);
        cbutton4.setVisible(false);
        cbutton5.setVisible(false);
        c2button0.setVisible(false);
        c2button1.setVisible(false);
        c2button2.setVisible(false);
        c2button3.setVisible(false);
        c2button4.setVisible(false);
        c2button5.setVisible(false);
        startButton.setVisible(false);



        // Arrays to hold the selected characters
        final String[] player1Character = new String[1];
        final String[] player2Character = new String[1];

        player1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
		        cbutton0.setVisible(true);
		        cbutton1.setVisible(true);
		        cbutton2.setVisible(true);
		        cbutton3.setVisible(true);
		        cbutton4.setVisible(true);
		        cbutton5.setVisible(true);
			}
		});

        player2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
		        c2button0.setVisible(true);
		        c2button1.setVisible(true);
		        c2button2.setVisible(true);
		        c2button3.setVisible(true);
		        c2button4.setVisible(true);
		        c2button5.setVisible(true);
			}
		});



        // Player 1 Choose Character
        cbutton0.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player1Character[0] = "Ichigo Kurosaki";
	            System.out.println("Player 1 selected Ichigo Kurosaki");


	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/ichigokurosakibanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            cbutton0.setVisible(false);
	            cbutton1.setVisible(false);
	            cbutton2.setVisible(false);
	            cbutton3.setVisible(false);
	            cbutton4.setVisible(false);
	            cbutton5.setVisible(false);


	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        cbutton1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player1Character[0] = "Mira";
	            System.out.println("Player 1 selected Mira");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/mirabanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            cbutton0.setVisible(false);
	            cbutton1.setVisible(false);
	            cbutton2.setVisible(false);
	            cbutton3.setVisible(false);
	            cbutton4.setVisible(false);
	            cbutton5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();

			}
		});

        cbutton2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player1Character[0] = "Escanor";
	            System.out.println("Player 1 selected Escanor");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/escanorbanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            cbutton0.setVisible(false);
	            cbutton1.setVisible(false);
	            cbutton2.setVisible(false);
	            cbutton3.setVisible(false);
	            cbutton4.setVisible(false);
	            cbutton5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        cbutton3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player1Character[0] = "Yasuo";
	            System.out.println("Player 1 selected Yasuo");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/yasuobanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            cbutton0.setVisible(false);
	            cbutton1.setVisible(false);
	            cbutton2.setVisible(false);
	            cbutton3.setVisible(false);
	            cbutton4.setVisible(false);
	            cbutton5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();

			}
		});

        cbutton4.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player1Character[0] = "Zoro";
	            System.out.println("Player 1 selected Zoro");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/zorobanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            cbutton0.setVisible(false);
	            cbutton1.setVisible(false);
	            cbutton2.setVisible(false);
	            cbutton3.setVisible(false);
	            cbutton4.setVisible(false);
	            cbutton5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();

			}
		});

        cbutton5.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player1Character[0] = "Lili";
	            System.out.println("Player 1 Lili");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/lilibanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            cbutton0.setVisible(false);
	            cbutton1.setVisible(false);
	            cbutton2.setVisible(false);
	            cbutton3.setVisible(false);
	            cbutton4.setVisible(false);
	            cbutton5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        // Player 2 Choose Character
        c2button0.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player2Character[0] = "Ichigo Kurosaki";
	            System.out.println("Player 2 selected Ichigo Kurosaki");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/ichigokurosakibanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            c2button0.setVisible(false);
	            c2button1.setVisible(false);
	            c2button2.setVisible(false);
	            c2button3.setVisible(false);
	            c2button4.setVisible(false);
	            c2button5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        c2button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player2Character[0] = "Mira";
	            System.out.println("Player 2 selected Mira");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/mirabanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            c2button0.setVisible(false);
	            c2button1.setVisible(false);
	            c2button2.setVisible(false);
	            c2button3.setVisible(false);
	            c2button4.setVisible(false);
	            c2button5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        c2button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player2Character[0] = "Escanor";
	            System.out.println("Player 2 selected Escanor");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/escanorbanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            c2button0.setVisible(false);
	            c2button1.setVisible(false);
	            c2button2.setVisible(false);
	            c2button3.setVisible(false);
	            c2button4.setVisible(false);
	            c2button5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        c2button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player2Character[0] = "Yasuo";
	            System.out.println("Player 2 selected Yasuo");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/yasuobanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            c2button0.setVisible(false);
	            c2button1.setVisible(false);
	            c2button2.setVisible(false);
	            c2button3.setVisible(false);
	            c2button4.setVisible(false);
	            c2button5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        c2button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player2Character[0] = "Zoro";
	            System.out.println("Player 2 selected Zoro");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/zorobanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            c2button0.setVisible(false);
	            c2button1.setVisible(false);
	            c2button2.setVisible(false);
	            c2button3.setVisible(false);
	            c2button4.setVisible(false);
	            c2button5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});

        c2button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
	            player2Character[0] = "Lili";
	            System.out.println("Player 2 selected Lili");

	            // Create an ImageView to display the selected character's image temporarily
	            Image selectedCharacterImage = new Image("ppfCharacters/lilibanner.png");  // Use the selected character's image
	            ImageView selectedCharacterImageView = new ImageView(selectedCharacterImage);
	            selectedCharacterImageView.setLayoutX(380);  // Set the position where you want the image to appear
	            selectedCharacterImageView.setLayoutY(170);

	            // Add the image view to the layout
	            gameLayout.getChildren().add(selectedCharacterImageView);

	            c2button0.setVisible(false);
	            c2button1.setVisible(false);
	            c2button2.setVisible(false);
	            c2button3.setVisible(false);
	            c2button4.setVisible(false);
	            c2button5.setVisible(false);
	            updateStartButtonVisibility(player1Character, player2Character, startButton);

	            // Set a delay to hide the selected character's image after a short time
	            PauseTransition pause = new PauseTransition(Duration.seconds(2));  // 2 seconds delay
	            pause.setOnFinished(event -> gameLayout.getChildren().remove(selectedCharacterImageView));  // Remove the image after the delay
	            pause.play();
			}
		});


        startButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
//				Player player1 = new Player(player1Character);
//				Player player2 = new Player(player2Character);
				System.out.println("START THE GAME!!!");
				startGame(stage, button2, player1Character, player2Character);
			}
		});



        // Add buttons to the Pane (game layout)
        gameLayout.getChildren().addAll(button2, startButton, cbutton0, cbutton1, cbutton2, cbutton3, cbutton4, cbutton5, c2button0, c2button1, c2button2, c2button3, c2button4, c2button5, player1, player2);

        // Create the scene for the game mode with character selection
        Scene scene = new Scene(gameLayout, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("Character Selection - The Game");

//        // After character selection, transition to the game screen
//        Button startGameButton = new Button("Start Game");
//        startGameButton.setOnAction(event -> {
//            // Check if both players have selected their characters
//            if (player1Character[0] != null && player2Character[0] != null) {
//                // Load the character images based on selection
//                Image player1Image = loadCharacterImage(player1Character[0]);  // Load image based on selected character
//                Image player2Image = loadCharacterImage(player2Character[0]);  // Load image based on selected character
//
//                // Create Player objects with selected characters
//                Character character1 = new Character(player1Character[0], player1Image, 10, 100);
//                Character character2 = new Character(player2Character[0], player2Image, 10, 100);
//
//                Player player1 = new Player(character1);  // Assign the character to Player 1
//                Player player2 = new Player(character2);  // Assign the character to Player 2
//
//                // Start the game with the selected characters
//                startGame(stage, button2, player1, player2);  // Pass players to the startGame method
//            } else {
//                System.out.println("Both players need to select characters!");
//            }
//        });
//
//        // Add start game button to layout
//        gameLayout.getChildren().add(startGameButton);
//        startGameButton.setLayoutY(500);  // Position the start game button lower
    }

// // Helper method to create a button with an image background
//    private Button createButtonWithImage(String buttonText, String imagePath) {
//        Button button = new Button(buttonText);
//        Image image = new Image(imagePath);  // Load the image
//        button.setGraphic(new ImageView(image));  // Set the image as the button's graphic
//        return button;
//    }

    // Start the actual game after character selection
    void startGame(Stage stage, ImageView button2, String[] player1Character, String[] player2Character) {
        GraphicsContext gc = canvas.getGraphicsContext2D();


        // Initialize the GameTimer with the players and graphics context
        GameTimer gameTimer = new GameTimer(gc, scene, button2, player1Character, player2Character, root);
        gameTimer.start();

        stage.setTitle("The WandaVision Game");
        stage.setScene(scene); // Switch to the game scene
        stage.show();
    }



    void loadingScreen(Stage stage, ImageView button0, ImageView button5) {
        // Create a Pane for layout
        Pane layout1 = new Pane();

        // Use Media to load the video background
        String gifPath = getClass().getResource("/ppfBackgrounds/projload.mp4").toExternalForm();
        Media media = new Media(gifPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Adjust MediaView size
        //mediaView.setFitWidth(WINDOW_WIDTH);
        //mediaView.setFitHeight(WINDOW_HEIGHT);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video

        // Start the media player
        mediaPlayer.play();

        // Add the background media
        layout1.getChildren().add(mediaView);





        // Add button to the layout
        layout1.getChildren().addAll(button0, button5);

        // Create and set the scene
        loadScene = new Scene(layout1, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(loadScene);
        stage.setTitle("The WandaVision Game");
        stage.show();
    }



    public void menuMode(Stage stage, ImageView button1, ImageView button3, ImageView button4, ImageView button2) {
        // Create a Pane for layout
        Pane layout1 = new Pane();

   	 	if (root.getChildren().contains(button2)) {
   	        button2.setLayoutX(100);
   	        button2.setLayoutY(100);
	    }




        // Use Media to load the video background
        String gifPath = getClass().getResource("/ppfBackgrounds/projmenu.mp4").toExternalForm();
        Media media = new Media(gifPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Adjust MediaView size
        //mediaView.setFitWidth(WINDOW_WIDTH);
        //mediaView.setFitHeight(WINDOW_HEIGHT);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video

        // Start the media player
        mediaPlayer.play();

        // Add the background media
        layout1.getChildren().add(mediaView);


        layout1.getChildren().addAll(button1, button3, button4);

        // Create and set the scene
        menuScene = new Scene(layout1, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(menuScene);
        stage.setTitle("The WandaVision Game");
        stage.show();
    }



    void developerMode(Stage stage, ImageView button2) {
   	 	if (root.getChildren().contains(button2)) {
   	        button2.setTranslateX(-50); // Adjust based on window dimensions
   	        button2.setTranslateY(-200);
	    }
        Pane layout2 = new Pane();

        // Use Media to load the video background
        String videoPath = getClass().getResource("/ppfBackgrounds/projdev.mp4").toExternalForm();
        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Adjust MediaView size
        mediaView.setFitWidth(WINDOW_WIDTH);
        mediaView.setFitHeight(WINDOW_HEIGHT);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video

        // Start the media player
        mediaPlayer.play();

        // Add the background media
        layout2.getChildren().add(mediaView);


        // Configure button
        button2.setTranslateX(50); // Adjust based on window dimensions
        button2.setTranslateY(550);
     // Set desired width and height
        button2.setFitWidth(160);  // Set width to 50 pixels
        button2.setFitHeight(50); // Set height to 50 pixels

   	 	if (root.getChildren().contains(button2)) {
   	        button2.setLayoutX(100);
   	        button2.setLayoutY(100);
	    }

        // Add button on top of the video
        layout2.getChildren().add(button2);

        // Create and set the scene
        authorScene = new Scene(layout2, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(authorScene);
        stage.setTitle("The WandaVision Game");
        stage.show();
    }

    void instrucMode(Stage stage, ImageView button2) {
        Pane layout2 = new Pane();

        // Use Media to load the video background
        String videoPath = getClass().getResource("/ppfBackgrounds/projabout.mp4").toExternalForm();
        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Adjust MediaView size
        mediaView.setFitWidth(WINDOW_WIDTH);
        mediaView.setFitHeight(WINDOW_HEIGHT);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the video

        // Start the media player
        mediaPlayer.play();

        // Add the background media
        layout2.getChildren().add(mediaView);

        // Configure button
        button2.setTranslateX(0); // Adjust based on window dimensions
        button2.setTranslateY(550);
        // Set desired width and height
        button2.setFitWidth(160);  // Set width to 50 pixels
        button2.setFitHeight(50); // Set height to 50 pixels

   	 	if (root.getChildren().contains(button2)) {
   	        button2.setLayoutX(100);
   	        button2.setLayoutY(100);
	    }
        // Add button on top of the video
        layout2.getChildren().add(button2);

        // Create and set the scene
        instrucScene = new Scene(layout2, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(instrucScene);
        stage.setTitle("The WandaVision Game");
        stage.show();
    }
}


