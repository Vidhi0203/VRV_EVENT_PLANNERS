package com.example.vrveventplanners;

public class FeedbackModel {

    String name,feedback;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public FeedbackModel(String name, String feedback) {
        this.name = name;
        this.feedback = feedback;
    }
}
