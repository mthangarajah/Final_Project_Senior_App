package com.example.final_project_senior_app;

public class questionevening {

    public String mQuestions [] = {
            "How many people did you talk to or meet today?",
            "How do you feel this evening?",
            "Did you feel lonely today?",
            "Did you feel depressed or anxious today?",
            "Did you prefer being alone or with people today?",
            "Did you prefer doing tasks in the day alone or with people?"
    };

    private String mChoices  [] []= {
            {"More than 4","2-4","1", "0"},
            {"Great", "Good", "Could be better", "Not good"},
            {"No, not at all", "Somewhat", "Yes I did", "No opinion"},
            {"No, not at all", "Somewhat", "Yes I did", "No opinion"},
            {"Being alone", "With people", "Both", "Doesn't matter"},
            {"Being alone", "With people", "Both", "Doesn't matter"}


    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }
}





