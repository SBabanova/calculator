import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Expression test1 = new Expression("(x +   2) -   Y*4");
        System.out.println(test1.infixExpression);
        test1.parser();
        System.out.println(Arrays.toString(test1.postfixExpression));
    }
}
