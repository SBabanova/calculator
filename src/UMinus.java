public class UMinus extends Tokens {

    UMinus(){
        type = TYPE.UMINUS;
    }

//    @Override
//    Integer getValue() {
//        return null;
//    }
//
//    @Override
    Integer calc(int a) {
        return -a;
    }

//    @Override
//    Integer calc(int a, int b) {
//        return null;
//    }
}
