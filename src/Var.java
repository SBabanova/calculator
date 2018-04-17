public class Var extends Tokens{
    char c;
    Integer value;
    Var(char c){
        this.c = c;
        type = TYPE.VAR;
        value = 0;
    }

    void setValue(int value){
        this.value = value;
    }

//    @Override
    Integer getValue() {
        return value;
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
