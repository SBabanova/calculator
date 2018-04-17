import jdk.jshell.spi.ExecutionControl;

abstract class Tokens{
    String name;
    String getName(){
        return name;
    }
}

abstract class Operatoins extends Tokens{
    abstract int calc(int a) throws ExecutionControl.NotImplementedException;
    abstract int calc(int a, int b) throws ExecutionControl.NotImplementedException;
}

abstract class Vars extends Tokens {
    int value;
    void setValue(int value){
        this.value = value;
    }
    int getValue(){
        return value;
    }
}

class Plus extends Operatoins {
    Plus(){
        name = "+";
    }

    @Override
    int calc(int a) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Неверное количество аргументов");
    }

    @Override
    int calc(int a, int b) {
        return a + b;
    }
}

class Minus extends Operatoins {

    Minus(){
        name = "-";
    }

    @Override
    int calc(int a) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Неверное количество аргументов");
    }
    @Override
    int calc(int a, int b) {
        return a - b;
    }

}

class Multiply extends Operatoins {
    Multiply(){
        name = "*";
    }

    @Override
    int calc(int a) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Неверное количество аргументов");
    }

    @Override
    int calc(int a, int b) {
        return a * b;
    }
}

class Division extends Operatoins {
    Division(){
        name = "/";
    }

    @Override
    int calc(int a) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Неверное количество аргументов");
    }

    @Override
    int calc(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by 0");
        }
        return (int) a / b;
    }
}

class Pow extends Operatoins {

    Pow(){
        name = "^";
    }

    @Override
    int calc(int a) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Неверное количество аргументов");
    }

    @Override
    int calc(int a, int b) {
        return (int) Math.pow(a, b);
    }
}

class UMinus extends Operatoins {

    UMinus(){
        name = "u-";
    }

    @Override
    int calc(int a) {
        return -a;
    }

    @Override
    int calc(int a, int b) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Неверное количество аргументов");
    }
}

class VarX extends Vars {
    VarX(){
        name = "x";
    }
}

class VarY extends Vars {
    VarY(){
        name = "y";
    }
}

class VarZ extends Vars {
    VarZ(){
        name = "z";
    }
}

class Numder extends Tokens {
    int value;

    Numder(int value){
        this.value = value;
        name = String.valueOf(value);
    }

    int getValue(){
        return value;
    }
}