public class Plus extends Tokens{
    Plus(){
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
        return a + b;
    }
}
