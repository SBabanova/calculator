public class Mutiply extends Tokens{

    Mutiply(){
        type = TYPE.OPERATION;
    }
//
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
        return a * b;
    }
}
