package com.example.final_project_senior_app;

public class Questionlibrary {

    public String mQuestions [] = {
            "How many hours of sleep did you have?",
            "Any plans for today? (Choose one)",
            "How do you feel this morning?",
            "Do you feel lonely or depressed?",
            "Have you spoken to anyone today? If, so how many?"
    };

    private String mChoices  [] []= {
            {"More than 10", "8-10", "6-8", "Less than 6"},
            {"Spending time with family", "Shopping", "Exercise", "Cleaning"},
            {"Great", "Good", "Could be better", "Not good"},
            {"No", "Somewhat", "Yes", "No opinion"},
            {"More than 4","2-4","1", "0"}

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
