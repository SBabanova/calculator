public class MyStack {
    private int max_size;
    private int current_size;
//    Object value;
    private Object stack[];
    MyStack(int size){
        this.max_size = size;
        current_size = 0;
        stack = new Object[max_size];
    }
    int push(Object value){
        if (isFull()){
            return -1;
        }
        stack[current_size - 1] = value;
        ++current_size;
        return 0;
    }

    Object pop(){
        if (isEmpty()){
            return null;
        }
        Object tmp = stack[current_size - 1];
        stack[current_size - 1] = null;
        --current_size;
        return tmp;
    }

    boolean isEmpty(){
        return current_size == 0;
    }

    boolean isFull(){
        return current_size == max_size;
    }

    void clear(){
        current_size = 0;
        stack = new Object[max_size];
    }

    int size(){
        return current_size;
    }
}
