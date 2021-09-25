package fourpicsF.fourpicsF;

import java.util.ArrayList;

public class Question {
    private int correctAnswer;
    private ArrayList<String> Imagepath;
    private String soundPath;

    public Question() {
        Imagepath = new ArrayList();
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getImagepath() {
        return Imagepath;
    }

    public void setImagepath(ArrayList<String> imagepath) {
        Imagepath = imagepath;
    }

    public String getSoundPath() {
        return soundPath;
    }

    public void setSoundPath(String soundPath) {
        this.soundPath = soundPath;
    }

    public void addImagePath(String Path) {
        Imagepath.add(Path);
    }
}
