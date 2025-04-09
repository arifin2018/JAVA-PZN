import java.util.Arrays;
import java.util.Scanner;

public class AplikasiTodoList {

    public static String[] model = new String[1];
    public static int inc = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * logic todolist
     */
    public static void showTodoList(){
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i+1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }
    
    /**
     * test ShowTodoList;
     */
    public static void testShowTodoList(){
        model[0] = "arifin";
        model[1] = "felan";
        showTodoList();
    }

    public static void addTodoList(String todo){
        Boolean isFull = false;
        
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
            if (i == model.length-1 && model[i] != null) {
                isFull = true;
            }
        }
        if (isFull) {
            String[] copy = Arrays.copyOf(model, model.length*2);
            model = copy;
            addTodoList(todo);
            return;
        }
    }

    public static void testAddTodoList() {
        for (int i = 1; i < 23; i++) {
            addTodoList("menambah todo sebanyak => "+ i);
        }

        showTodoList();
        System.out.println(Arrays.toString(model));
        System.out.println(model.length);
    }

    public static boolean removeTodoList(int numberRemove){
        if (numberRemove > model.length) {
            return false;
        }else if (model[numberRemove - 1] == null) {
            return false;
        }else{
            for (int i = numberRemove-1; i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                }else{
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        for (int i = 0; i < 4; i++) {
            addTodoList("menambah todo sebanyak => "+ i);
        }

        showTodoList();
        System.out.println("===============================================");
        removeTodoList(2);
        showTodoList();
    }

    public static String inputData(String info){
        System.out.print(info + " => ");
        String data = sc.nextLine();
        return data;
    }

    public static void testInput() {
        var name = inputData("Nama");
        System.out.println("Hi " + name);
    
        var channel = inputData("Channel");
        System.out.println(channel);
        sc.close();
    }


    /**
     * menampilkan show todolist
     */
    public static void viewShowTodoList() {
        System.out.println("VIEW SHOW TODO LIST: ");
        while (true) {
            showTodoList();
            System.out.println();

            System.out.println("MENU....");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = inputData("Pilih");

            if (input.equals("1")) {
                viewAddTodoList();
            }else if (input.equals("2")) {
                viewRemoveTodoList();
            }else if (input.equals("x")) {
                System.out.println("Terima kasih");
                break;
            }else{
                System.out.println("Input tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList(){
        model[0] = "arifin";
        viewShowTodoList();
    }

    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODO LIST");
        String todo = inputData("Nama Todo (x jika ingin berhenti)");
        if (todo.equals("x")) {
            return;
        }else{
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("Satu");

        viewAddTodoList();

        showTodoList();
    }


    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODO LIST");
        String todo = inputData("Nomer Todo List (x jika ingin berhenti)");

        if (todo.equals("x")) {
            return;
        }else{
            Integer numberRemoveTodo = Integer.valueOf(todo);
            var resultRemoveTodoList = removeTodoList(numberRemoveTodo);
            if (!resultRemoveTodoList) {
                System.out.println("Mohon maaf number yang anda masukan gagal atau tidak sesuai");
            }else{
                return;
            }
        }
    }

    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
