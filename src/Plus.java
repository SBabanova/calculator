public class Plus extends Tokens{
    Plus(){
        type = TYPE.OPERATION;
    }

    @Override
    Integer getValue() {
        return 0;
    }
    @Override
    String getOperation(){
        return "+";
    }
//
//    @Override
//    Integer calc(int a) {
//        return null;
//    }
//
//    @Override
    Integer calc(int a, int b) {
        return a + b;
    }
}
