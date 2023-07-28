package Calc;

import Calc.Logger.Log;
import Calc.View.UserView;

import java.util.logging.Level;
import java.util.logging.Logger;


//Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
//Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
//Соблюдать принципы SOLID, паттерны проектирования.
//Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA, то необходимо написать документ,
// каким образом можно запустить приложение (что необходимо установить, каким образом запускать и т.п.).
public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in Calculator package started.");
        UserView view = new UserView(log);
        view.run();
    }
}