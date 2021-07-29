package com.company;

public class Main {

    public static void main(String[] args) {
        String [] answers = {"a.Минск", "b.Гродно", "c.Витебск", "d.Могилев"};
        String [] answers2 = {""};
        String [] corAnsers = {"a"};
        String [] corAnsers2 = {"b,c,d"};
        String [] corAnsers3 = {"Минск"};
        String [] answers3 = {"a.Канада", "b.Россия", "c.Африка", "d.Египет"};
        String [] corAnsers4 = {"b"};
        String [] corAnsers5 = {"d"};
        String [] answers4 = {"a.Париж","b.Лондон","c.Венеция","d.Прага"};
        String [] corAnsers6 = {"a"};
        Question [] questions = new Question[15];

        questions[0] = new Question("Столица Беларуси?", answers, corAnsers,"SCQ");
        questions[1] = new Question("Не столица Беларуси?", answers, corAnsers2,"MCQ");
        questions[2]= new Question("Столица Беларуси?", answers2, corAnsers,"TQ");
        questions[3]= new Question("Самое глубокое озеро в мире называется Байкал. В какой из перечисленных стран оно находится?", answers3, corAnsers4, "SCQ");
        questions[4]= new Question("В какой из предложенных стран находятся самые высокие и известные пирамиды фараонов?", answers3, corAnsers5, "SCQ");
        questions[5]= new Question( "В каком городе можно увидеть Эйфелеву башню и побывать в Диснейленде?", answers4, corAnsers6,"SCQ");
    }
}
