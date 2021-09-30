public class StackOverflowDemo {
    public static void getError(int number){
        if (number==0){
            return;
        }
        number++;
        getError(number);
    }

    public static void main(String[] args) {
        getError(1);
    }
}
