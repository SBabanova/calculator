public class Division extends Tokens{

    Division(){
        type = TYPE.OPERATION;
    }

    @Override
    Integer getValue() {
        return 0;
    }
    @Override
    String getOperation(){
        return "/";
    }
    //
    //    }
    //        return null;
    //    Integer calc(int a) {
    //    @Override
//

    Integer calc(int a, int b) throws ArithmeticException {
        return (int) a / b;
    }
}
