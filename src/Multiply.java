public class Multiply extends Tokens{

    Multiply(){
        type = TYPE.OPERATION;
    }
//
    @Override
    Integer getValue() {
        return null;
    }
    @Override
    String getOperation(){
        return "*";
    }
    //
    //    }
    //        return null;
    //    Integer calc(int a) {
    //    @Override
//

    Integer calc(int a, int b) {
        return a * b;
    }
}
