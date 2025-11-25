package Data;

public class CategoryList {
    private static String[] categoryList = new String[] { "автомобіль", "легковий автомобіль", "вантажний автомобіль", "спортивний автомобіль" };

    public String[] getCategoryList() {
        return categoryList;
    }

    public static int categorySize() {
        return categoryList.length;
    }

    public static boolean checkCategory(String category) {
        for (String s : categoryList) {
            if (s.equals(category)) {
                return true;
            }
        }

        System.out.println("Error with selected category");
        return false;
    }
}
