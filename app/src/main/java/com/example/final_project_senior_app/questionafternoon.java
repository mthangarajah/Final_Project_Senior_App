package com.example.final_project_senior_app;

public class questionafternoon {

    public String mQuestions [] = {
            "Have you met with anyone today? If, so how many?",
            "How do you feel this afternoon?",
            "Have you felt lonely or depressed from the morning?",
            "Has your day been going according to how you planned?"
    };

    private String mChoices  [] []= {
            {"More than 4","2-4","1", "0"},
            {"Great", "Good", "Could be better", "Not good"},
            {"No", "Somewhat", "Yes", "No opinion"},
            {"No", "Somewhat", "Yes", "Haven't done much yet"},


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


