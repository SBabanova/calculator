public class RBracket extends Tokens{
    RBracket(){
        type = TYPE.RBRACKET;
    }

    @Override
    Integer getValue() {
        return 0;
    }

    @Override
    String getOperation() {
        return ")";
    }
}
