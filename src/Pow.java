public class Pow extends Tokens {
    Pow(){
        type = TYPE.OPERATION;
    }

    @Override
    Integer getValue() {
        return 0;
    }
    @Override
    String getOperation(){
        return "^";
    }
//
//    @Override
//    Integer calc(int a) {
//        return null;
//    }
//
//    @Override
    Integer calc(int a, int b) {
        return (int)Math.pow(a, b);
    }
}
