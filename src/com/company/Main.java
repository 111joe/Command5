package com.company;

public class Main {

    public static void main(String[] args) {
        String[] answers = {"a.Минск", "b.Гродно", "c.Витебск", "d.Могилев"};
        String[] answers2 = {""};
        String[] corAnswers = {"a"};
        String[] answers3 = {"a.Канада", "b.Россия", "c.Африка", "d.Египет"};
        String[] corAnswers4 = {"b"};
        String[] corAnswers5 = {"d"};
        String[] answers4 = {"a.Париж", "b.Лондон", "c.Венеция", "d.Прага"};
        String[] corAnswers6 = {"a"};
        String[] corAnswers7 = {"c"};
        String[] answers5 = {"a.Чикаго", "b.Cингапур", "c.Мальта", "d.Бразилия"};
        String[] corAnswers8 = {"b"};
        String[] corAnswers9 = {"a"};
        String[] answers6 = {"a.Эрио", "b.Олимпиада", "c.Багдад", "d.Афины"};
        String[] corAnswers10 = {"d"};
        String[] corAnswers2 = {"Вашингтон"};
        String[] corAnswers3 = {"Пиза"};
        String[] corAnswers11 = {"Токио"};
        String[] answers7 = {"a.Вязьма", "b.Туапсе", "с.Йошкар-Ола", "d.Уральск", "e.Улан-Удэ"};
        String[] corAnswers12 = {"a,b,c,e"};
        String[] answers8 = {"a.Агро", "b.Мумбаи", "с.Мубаи", "d.Дали"};
        String[] corAnswers13 = {"a,c,d"};
        String[] answers9 = {"a.Норвегия", "b.Бельгия", "c.Швеция", "d.Швеция", "e.Финляндия"};
        String[] corAnswers14 = {"a,b,e"};
        String[] answers10 = {"a.Светлогорск", "b.Балтийск", "c.Калининград", "d.Калязин"};
        String[] corAnswers15 = {"a,b,c"};
        Question[] questions = new Question[15];

        questions[0] = new Question("Столица Беларуси?", answers, corAnswers, "SCQ");
        questions[1] = new Question("Самое глубокое озеро в мире называется Байкал. В какой из перечисленных стран оно находится?", answers3, corAnswers4, "SCQ");
        questions[2] = new Question("В какой из предложенных стран находятся самые высокие и известные пирамиды фараонов?", answers3, corAnswers5, "SCQ");
        questions[3] = new Question("В каком городе можно увидеть Эйфелеву башню и побывать в Диснейленде?", answers4, corAnswers6, "SCQ");
        questions[4] = new Question("Уникальный город на воде, славящийся своими карнавалами?", answers4, corAnswers7, "SCQ");
        questions[5] = new Question("Выберите вариант, в котором город-столица и страна имеют одинаковые названия:", answers5, corAnswers8, "SCQ");
        questions[6] = new Question("В каком городе впервые было построено (Чёртово колесо)?", answers5, corAnswers9, "SCQ");
        questions[7] = new Question("Какая европейская столица, имеет название как у богини?", answers6, corAnswers10, "SCQ");
        questions[8] = new Question("Столица США?", answers2, corAnswers2, "TQ");
        questions[9] = new Question("В каком городе распологается падающая башня?", answers2, corAnswers3, "TQ");
        questions[10] = new Question("Какой город признан самым населеннам?", answers2, corAnswers11, "TQ");
        questions[11] = new Question("Какие города распологаются в России?", answers7, corAnswers12, "MCQ");
        questions[12] = new Question("Какие города расположены в Индии?", answers8, corAnswers13, "MCQ");
        questions[13] = new Question("Какие страны называют 'скандинавским'?", answers9, corAnswers14, "MCQ");
        questions[14] = new Question("Какие из перечисленных городов относятся к так называемому 'Янтарному краю'?", answers10, corAnswers15, "MCQ");
    }
}
