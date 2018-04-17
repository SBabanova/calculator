public class Division extends Tokens{

    Division(){
        type = TYPE.OPERATION;
    }

//    @Override
//    Integer getValue() {
//        return null;
//    }
//
//    @Override
//    Integer calc(int a) {
//        return null;
//    }
//
//    @Override
    Integer calc(int a, int b) throws ArithmeticException {
        return (int) a / b;
    }
}
