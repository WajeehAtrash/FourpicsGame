package fourpicsF.fourpicsF;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class SecondaryController /*implements Initializable*/ {
    AudioRecorder AR=new AudioRecorder();
    ArrayList<Question> Questions=new ArrayList<Question>();
    Integer question_num=0;
    int curr_answer;
    int delay = 2000;//specify the delay for the timer
    Timer timer = new Timer( delay, e -> {
        try {
            nextQ(new ActionEvent());
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    } );


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ScrollPane scroll;

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Label status;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private Button prevBtrn;

    @FXML
    private Button nextBtn;

    @FXML
    private Label qNum;

    @FXML
    private Button sound;

    @FXML
    void nextQ(ActionEvent event) throws FileNotFoundException {
        if(question_num.intValue()<9) {
            question_num+=1;
            loadQ(question_num);
            status.setText("");
        }
        else {
            try {
                AR.close();
                App.setRoot("primary");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @FXML
    void prevQ(ActionEvent event) throws FileNotFoundException {
        if(question_num>0) {
            question_num--;
            loadQ(question_num);
            status.setText("");

        }
    }

    @FXML
    void initialize() throws FileNotFoundException {
        assert scroll != null : "fx:id=\"scroll\" was not injected: check your FXML file 'secondary.fxml'.";
        assert Anchor != null : "fx:id=\"Anchor\" was not injected: check your FXML file 'secondary.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'secondary.fxml'.";
        assert image1 != null : "fx:id=\"image1\" was not injected: check your FXML file 'secondary.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'secondary.fxml'.";
        assert image3 != null : "fx:id=\"image3\" was not injected: check your FXML file 'secondary.fxml'.";
        assert image4 != null : "fx:id=\"image4\" was not injected: check your FXML file 'secondary.fxml'.";
        assert prevBtrn != null : "fx:id=\"prevBtrn\" was not injected: check your FXML file 'secondary.fxml'.";
        assert nextBtn != null : "fx:id=\"nextBtn\" was not injected: check your FXML file 'secondary.fxml'.";
        assert qNum != null : "fx:id=\"qNum\" was not injected: check your FXML file 'secondary.fxml'.";
        assert sound != null : "fx:id=\"sound\" was not injected: check your FXML file 'secondary.fxml'.";
        InputStream stream=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/pics/sound.jpg");
        Image img=new Image(stream);
        ImageView imgView=new ImageView(img);
        imgView.setFitHeight(40);
        imgView.setFitWidth(100);
        sound.setGraphic(imgView);
        try {
            initGame();
            loadQ(question_num);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @FXML
    void playsound(ActionEvent event) {
        playLoop(Questions.get(question_num).getSoundPath());
    }

    @FXML
    void checkAnswer(MouseEvent event) throws InterruptedException, FileNotFoundException {
        ImageView target=(ImageView) event.getTarget();
        if(target.getId().equals("image1")&&curr_answer==0) {
            status.setTextFill(Color.web("#32a852"));
            status.setText("תשובה נכונה");
            playSucc();
            int delay = 2000;//specify the delay for the timer
            Timer timer = new Timer( delay, e -> {
                Platform.runLater(()->{
                    try {
                        nextQ(new ActionEvent());

                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });

            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();

        }
        else if(target.getId().equals("image2")&&curr_answer==1){
            status.setTextFill(Color.web("#32a852"));
            status.setText("תשובה נכונה");
            playSucc();
            int delay = 2000;//specify the delay for the timer
            Timer timer = new Timer( delay, e -> {
                Platform.runLater(()->{
                    try {
                        nextQ(new ActionEvent());

                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });

            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }
        else if(target.getId().equals("image3")&&curr_answer==2){
            status.setTextFill(Color.web("#32a852"));
            status.setText("תשובה נכונה");
            playSucc();
            int delay = 2000;//specify the delay for the timer
            Timer timer = new Timer( delay, e -> {
                Platform.runLater(()->{
                    try {
                        nextQ(new ActionEvent());

                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });

            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }
        else if(target.getId().equals("image4")&&curr_answer==3){
            status.setTextFill(Color.web("#32a852"));
            status.setText("תשובה נכונה");
            playSucc();
            int delay = 2000;//specify the delay for the timer
            Timer timer = new Timer( delay, e -> {
                Platform.runLater(()->{
                    try {
                        nextQ(new ActionEvent());

                    } catch (FileNotFoundException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });

            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }else {
            status.setTextFill(Color.web("#a83232"));
            status.setText("תשובה שגויה");
            playWrong();
        }
    }

    public void initGame() {
        Question q1=new Question();
        Question q2=new Question();
        Question q3=new Question();
        Question q4=new Question();
        Question q5=new Question();
        Question q6=new Question();
        Question q7=new Question();
        Question q8=new Question();
        Question q9=new Question();
        //---------------Q-1-chair--------------------------------
        q1.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q1.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/AC.jfif");
        q1.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/projector.jfif");
        q1.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/window.jfif");
        q1.setCorrectAnswer(0);
        q1.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/chair.wav");
        //----------------------------------------------------
        //---------------Q-2-computer--------------------------------
        q2.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q2.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/AC.jfif");
        q2.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/computer.jpg");
        q2.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/window.jfif");
        q2.setCorrectAnswer(2);
        q2.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/computer.wav");
        //----------------------------------------------------
        //---------------Q-3-closet---------------------------------
        q3.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q3.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/closet.jpg");
        q3.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/projector.jfif");
        q3.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/board.jpg");
        q3.setCorrectAnswer(1);
        q3.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/closet.wav");
        //----------------------------------------------------
        //---------------Q-4-board--------------------------------
        q4.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q4.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/board.jpg");
        q4.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/door.jfif");
        q4.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/window.jfif");
        q4.setCorrectAnswer(1);
        q4.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/board.wav");
        //----------------------------------------------------
        //---------------Q-5-table---------------------------------
        q5.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q5.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/closet.jpg");
        q5.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/projector.jfif");
        q5.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/table.jpg");
        q5.setCorrectAnswer(3);
        q5.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/table.wav");
        //----------------------------------------------------
        //---------------Q-6-AC---------------------------------
        q6.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q6.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/closet.jpg");
        q6.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/AC.jfif");
        q6.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/board.jpg");
        q6.setCorrectAnswer(2);
        q6.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/AC.wav");
        //----------------------------------------------------
        //---------------Q-7-projector---------------------------------
        q7.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q7.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/closet.jpg");
        q7.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/projector.jfif");
        q7.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/board.jpg");
        q7.setCorrectAnswer(2);
        q7.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/projector.wav");
        //----------------------------------------------------
        //---------------Q-8-window---------------------------------
        q8.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/window.jfif");
        q8.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/closet.jpg");
        q8.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/projector.jfif");
        q8.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/board.jpg");
        q8.setCorrectAnswer(0);
        q8.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/window.wav");
        //----------------------------------------------------
        //---------------Q-9-door---------------------------------
        q9.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/chair.jfif");
        q9.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/closet.jpg");
        q9.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/door.jfif");
        q9.addImagePath(System.getProperty("user.dir")+"/src/main/resources/pics/board.jpg");
        q9.setCorrectAnswer(2);
        q9.setSoundPath(System.getProperty("user.dir")+"/src/main/resources/records/door.wav");
        //----------------------------------------------------
        Questions.add(q1);
        Questions.add(q2);
        Questions.add(q3);
        Questions.add(q4);
        Questions.add(q5);
        Questions.add(q6);
        Questions.add(q7);
        Questions.add(q8);
        Questions.add(q9);

    }
    public void loadQ(int index) throws FileNotFoundException {
        status.setText("");
        if(index<Questions.size()) {
            Question q1=Questions.get(index);
            Integer q_num=index+1;
            qNum.setText("שאלה"+q_num.toString());
            curr_answer=q1.getCorrectAnswer();
            ArrayList<String>imageList=q1.getImagepath();
            String image1Path=imageList.get(0);
            String image2Path=imageList.get(1);
            String image3Path=imageList.get(2);
            String image4Path=imageList.get(3);
            InputStream stream1=new FileInputStream(image1Path);
            InputStream stream2=new FileInputStream(image2Path);
            InputStream stream3=new FileInputStream(image3Path);
            InputStream stream4=new FileInputStream(image4Path);
            Image img1=new Image(stream1);
            Image img2=new Image(stream2);
            Image img3=new Image(stream3);
            Image img4=new Image(stream4);
            image1.setImage(img1);
            image2.setImage(img2);
            image3.setImage(img3);
            image4.setImage(img4);
            System.out.println(q1.getSoundPath());
            playLoop(q1.getSoundPath());
        }

    }
    public void playSucc() {
        AR.close();
        AR.playRecord(System.getProperty("user.dir")+"/src/main/resources/records/success.wav");
    }
    public void playWrong() {
        AR.close();
        AR.playRecord(System.getProperty("user.dir")+"/src/main/resources/records/wrong.wav");
    }
    public void playLoop(String path) {
        AR.close();
        AR.playLoopedRecord(path);
    }
}