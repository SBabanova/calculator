public class LBracket extends Tokens{
    LBracket(){
        type = TYPE.LBRACKET;
    }

    @Override
    Integer getValue() {
        return 0;
    }

    @Override
    String getOperation() {
        return "(";
    }
}
