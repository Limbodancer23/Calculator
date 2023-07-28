package Calc.Model;

public class Argument {
    private Integer value;

    public Argument(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Argument{" +
                "value=" + value +
                '}';
    }
}
