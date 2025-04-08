import java.lang.reflect.Field;

public class PrintExample {
    public static int Z = 10; // Bidang publik
    public String B = "Hello"; // Bidang publik
    public static void main(String[] args) {
        Integer A = 10; // Contoh variabel yang diketahui

        try {
            System.out.println("Nilai A: " + A);
        } catch (NullPointerException e) {
            System.out.println("Variabel A tidak memiliki nilai.");
        }

        // Jika Anda tidak yakin apakah variabel ada atau tidak, Anda dapat menggunakan refleksi
        // Namun, ini hanya berlaku jika variabel adalah anggota kelas
        try {
            Class<?> c = Class.forName("PrintExample");
            // java.lang.reflect.Field field = c.getField("A");
            Field[] fields = c.getFields();
            for (Field field : fields) {
                System.out.println("Nama Bidang: " + field.getName());
                System.out.println("Tipe Bidang: " + field.getType());
            }
            // System.out.println("Nilai A dengan refleksi: " + field.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Variabel A tidak ditemukan atau tidak dapat diakses.");
        }
    }
}
