import karyawan.kukuh.Country;

public class ConstantApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);
        System.out.println(karyawan.Utill.MathUtil.sum(1,2,3,4,5,6,7,8,9));

        Country.City city = new Country.City();
        city.setName("arifin");
        System.out.println(city.getName());;
    }
}
