package arifin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAssosiative {
    public static void main(String[] args) {
        // Membuat list of map
        List<Map<String, Object>> cars = new ArrayList<>();

        // Menambahkan data
        Map<String, Object> car1 = new HashMap<>();
        car1.put("brand", "Ford");
        car1.put("model", "Mustang");
        car1.put("year", 1964);
        cars.add(car1);

        Map<String, Object> car2 = new HashMap<>();
        car2.put("brand", "Ford1");
        car2.put("model", "Mustang");
        car2.put("year", 1962);
        cars.add(car2);

        Map<String, Object> car3 = new HashMap<>();
        car3.put("brand", "Ford2");
        car3.put("model", "Mustang");
        car3.put("year", 1961);
        cars.add(car3);

        // Menampilkan isi data
        for (Map<String, Object> car : cars) {
            System.out.println("Brand: " + car.get("brand"));
            System.out.println("Model: " + car.get("model"));
            System.out.println("Year: " + car.get("year"));
            System.out.println("-------------------");
        }
    }
}
