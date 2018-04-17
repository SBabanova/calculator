public class Pow extends Tokens {
    Pow(){
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
    Integer calc(int a, int b) {
        return (int)Math.pow(a, b);
    }
}
