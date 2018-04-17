public class Expression {
//    enum Operators{
//        Plus, Minus, Multiply, Divivsion, Pow
//    }
//
//    enum Delimiters{
//        LDelimiter, RDelimeter
//    }
    final String operators = "+-*/^";
    final String delimeters = "()";
    final String constants = "0123456789";
    final String vars = "xyz";

    String infixExpression;
    Tokens postfixExpression[];

    Expression(String str){
        infixExpression = (str.toLowerCase()).replaceAll(" ", "");
        postfixExpression = new Tokens[infixExpression.length()];
    }

}
