public class Const extends  Tokens{

    private Integer value;

    Const(int value){
        this.value = value;
        type = TYPE.CONST;
    }

    @Override
    Integer getValue() {
        return value;
    }

    @Override
    String getOperation() {
        return ".";
    }
//
//    @Override
//    Integer calc(int a) {
//        return null;
//    }
//
//    @Override
//    Integer calc(int a, int b) {
//        return null;
//    }
}
