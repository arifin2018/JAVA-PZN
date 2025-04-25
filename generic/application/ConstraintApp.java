package generic.application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> number1 = new NumberData<Integer>(111);
        System.out.println(number1.getData());
        NumberData<Double> number2 = new NumberData<>(1.111);
        System.out.println(number2.getData());
        NumberData<Float> number3 = new NumberData<>(1.2f);
        System.out.println(number3.getData());
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
