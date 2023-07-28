package Calc.Controller;

import Calc.Model.Argument;

public class MathModule implements Operations {
    private Integer res;
    protected Argument first;
    protected Argument second;

    public MathModule(Argument first, Argument second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Integer div() {
        res = first.getValue() / second.getValue();
        return res;
    }

    public Integer multiply(){
        res = first.getValue() * second.getValue();
        return res;
    }

    @Override
    public Integer sum() {
        res = first.getValue() + second.getValue();
        return res;
    }

    @Override
    public Integer subtraction() {
        res = first.getValue() - second.getValue();
        return res;
    }
}
