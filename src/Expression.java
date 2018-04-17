public class Expression {
//    enum Operators{
//        Plus, Minus, Multiply, Divivsion, Pow
//    }
//
//    enum Brackets{
//        LBracket, RBracket
//    }
    final String operators = "+-*/^";
    final String brackets = "()";
    final String constants = "0123456789";
    final String vars = "xyz";

    String infixExpression;
    Tokens postfixExpression[];
    int postExpSize;

    Expression(String str){
        infixExpression = (str.toLowerCase()).replaceAll(" ", "");
        postfixExpression = new Tokens[infixExpression.length()];
        postExpSize = 0;
    }

    boolean isOperator(String str){
        if (str.length() != 1){
            return false;
        }
        return operators.contains(str);
    }

    boolean isBracket(String str){
        if (str.length() != 1){
            return false;
        }
        return brackets.contains(str);
    }

    boolean isConst(String str){

        if (str.length() != 1){
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    boolean isVar(String str){
        if (str.length() != 1){
            return false;
        }
        return vars.contains(str);
    }

    boolean isToken(String str){
        return isBracket(str) || isConst(str)|| isOperator(str)|| isVar(str);
    }

    int priority(String str){
        if (str == null) return 0;
        if (str.equals("u-")) return 1;
        if (str.equals("^")) return 2;
        if (str.equals("*")) return 3;
        if (str.equals("/")) return 3;
        if (str.equals("+")) return 4;
        if (str.equals("-")) return 4;
        if (str.equals(".")) return 10;
        return 0;
    }

    int parser(){
        StringBuffer strBuffer = new StringBuffer(infixExpression);
        MyStack stack = new MyStack(strBuffer.capacity());
        String currToken;
        String prevToken = "";
        while (strBuffer.length() != 0){
            currToken = String.valueOf(strBuffer.charAt(0));
            strBuffer.deleteCharAt(0);
            if (!isToken(currToken)){
                return -1;
            }
            if (isBracket(currToken)){
                if (currToken.equals("(")){
                    stack.push(new LBracket());
                } else {
                    if (stack.isEmpty()){
                        return -2;
                    }
                    while (!((Tokens)(stack.peek())).getOperation().equals("(")){
                        if (stack.isEmpty()){
                            return -2;
                        }
                        postfixExpression[postExpSize] = (Tokens)stack.pop();
                        postExpSize++;
                    }
                    stack.pop();
                    if (!stack.isEmpty() && isOperator(((Tokens)(stack.peek())).getOperation())){
                        postfixExpression[postExpSize] = (Tokens)stack.pop();
                        postExpSize++;
                    }
                }
            } else if (isOperator(currToken)){
                if (currToken.equals("-") &&
                        (prevToken.equals("") || (isOperator(prevToken)  || prevToken.equals("(")))) {
                    currToken = "u-";
                } else {
                    while (!stack.isEmpty() &&
                            (priority(currToken) <= priority(((Tokens)(stack.peek())).getOperation()))) {
                        postfixExpression[postExpSize] = (Tokens)stack.pop();
                        postExpSize++;
                    }

                }
                if (currToken.equals("+")) stack.push(new Plus());
                if (currToken.equals("-")) stack.push(new Minus());
                if (currToken.equals("u-")) stack.push(new UMinus());
                if (currToken.equals("*")) stack.push(new Multiply());
                if (currToken.equals("/")) stack.push(new Division());
                if (currToken.equals("^")) stack.push(new Pow());

            } else if (isConst(currToken)){
                stack.push(new Const(Integer.parseInt(currToken)));
            } else {
                stack.push(new Var(currToken.charAt(0)));
            }
            prevToken = currToken;
        }
        while (!stack.isEmpty()) {
            if (isOperator(((Tokens)(stack.peek())).getOperation())){
                postfixExpression[postExpSize] = (Tokens)stack.pop();
                postExpSize++;
            } else {
                return -2;
            }
        }
        return 0;
    }
}
