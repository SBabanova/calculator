import java.lang.reflect.Field;

abstract class Tokens {
    enum TYPE{
        OPERATION, VAR, CONST, UMINUS, LBRACKET, RBRACKET
    }
    TYPE type;
//    char c;
//    Integer value;
//    abstract Integer getValue();
//    abstract Integer calc(int a);
//    abstract Integer calc(int a, int b);
}

