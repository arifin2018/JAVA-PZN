import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.HashMap<String, String>();
        map.put("name", "demo");
        map.put("fname", "fname");
        // etc

        map.get("name"); // returns "demo"

        System.out.println(map);

        Map<String, String> map1 = new java.util.LinkedHashMap<String, String>(){{
            put("name", "demo1");
            put("aname", "aname1");
        }};
        
        // etc

        // map1.get("name"); // returns "demo"



        Map<String, Object> map2 = new java.util.LinkedHashMap<>(){{
            put("name2", "demo2");
            put("aname2", "aname2");
            put("age", 30);
            put("isActive", true);
            Map<String, String> nestedMap = new LinkedHashMap<>();
            nestedMap.put("tes", "arifin");
            put("isActive2", nestedMap);
        }};

        System.out.println(map2);
        System.out.printf(map2.get("age").getClass().getSimpleName());
        System.out.println(map2.get("isActive"));
        System.out.println(map2.get("aname2"));
        System.out.println("========================================================");
        System.out.printf("name: %s%n", map2.get("name2"));
        System.out.printf("aname: %s%n", map2.get("aname2"));
        System.out.printf("age: %s%n", map2.get("age"));
        System.out.printf("isActive: %s%n", map2.get("isActive"));
        System.out.printf("isActive2: %s%n", map2.get("isActive2"));

        Object isActive2Value = map2.get("isActive2");
        Map<String, String> isActive2Map = (Map<String, String>) isActive2Value;
        // Mengakses nilai dari nested Map
        String tesValue = isActive2Map.get("tes");
        System.out.println("tes: " + tesValue);
        System.out.println("========AKHIR================================================");

        List<Map<String, String>> data = new ArrayList<>();
        data.add(0, map);
        data.get(0).get("name"); 
        System.out.println(data);


        // Mendeklarasikan variabel sebagai Map tetapi menginisialisasinya sebagai LinkedHashMap
        Map<String, String> map3 = new LinkedHashMap<>();

        // Menambahkan pasangan kunci-nilai
        map3.put("Satu", "One");
        map3.put("Dua", "Two");
        map3.put("Tiga", "Three");

        // Mengambil nilai berdasarkan kunci
        System.out.println("Nilai untuk kunci 'Dua': " + map3.get("Dua"));

        // Menghapus pasangan kunci-nilai
        map3.remove("Satu");

        // Menampilkan ukuran map3
        System.out.println("Ukuran map3: " + map3.size());

        // Menampilkan isi map3
        System.out.println("Isi map3: " + map3);
    }
}
