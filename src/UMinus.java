public class UMinus extends Tokens {

    UMinus(){
        type = TYPE.UMINUS;
    }

    @Override
    Integer getValue() {
        return 0;
    }
    @Override
    String getOperation(){
        return "u-";
    }
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
