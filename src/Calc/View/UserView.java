package Calc.View;

import Calc.Controller.MathModule;
import Calc.Model.Argument;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserView {
    Logger logger;

    public UserView(Logger log) {
        this.logger = log;
    }
    public void run(){
        while (true){
            System.out.println("------------------------------------");
            Argument arg1 = new Argument(promt("Enter first argument: "));
            logger.log(Level.INFO, "First argument: " + arg1.getValue());
            int symbol = promt("Chose operation: \n1)+\n2)-\n3)*\n4)/");
            while (true) {
                if (symbol > 0 && symbol < 5) break;
                else symbol = promt("Chose operation: \n1)+\n2)-\n3)*\n4)/");
            }
            if(symbol == 1) logger.log(Level.INFO, "Calculation symbol: +");
            if(symbol == 2) logger.log(Level.INFO, "Calculation symbol: -");
            if(symbol == 3) logger.log(Level.INFO, "Calculation symbol: *");
            if(symbol == 4) logger.log(Level.INFO, "Calculation symbol: /");
            Argument arg2 = new Argument(promt("Enter Second argument:"));
            logger.log(Level.INFO, "Second argument: " + arg2.getValue());
            MathModule math = new MathModule(arg1, arg2);
            switch (symbol){
                case 1:
                    logger.log(Level.INFO, "Result of mathematical addition: " + math.sum());
                    System.out.printf("Result: %d\n", math.sum());
                    break;
                case 2:
                    logger.log(Level.INFO, "Subtraction result: " + math.subtraction());
                    System.out.printf("Result: %d\n", math.subtraction());
                    break;
                case 3:
                    logger.log(Level.INFO, "Multiplication result: " + math.multiply());
                    System.out.printf("Result: %d\n", math.multiply());
                    break;
                case 4:
                    logger.log(Level.INFO, "Division result: " + math.div());
                    System.out.printf("Result: %d\n", math.div());
                    break;
            }
            int ask = promt("Continue?\n1)Yes\n2)No");
            if (ask == 2) {
                logger.log(Level.INFO, "End of calculations.");
                return;
            }
        }
    }

    private Integer promt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
