package pl.pietoro;


import javafx.scene.paint.Paint;

public enum Status {

    UNDERWEIGHT("Underweight"),
    OPTIMUM("Optimum weight"),
    OVERWEIGHT("Overweight"),
    OBESE("Obese");

    String statusDescripttion;

    public String getStatusDescripttion() {
        return statusDescripttion;
    }

    Status(String description) {
        this.statusDescripttion = description;
    }



}
