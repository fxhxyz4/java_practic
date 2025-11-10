package Data;

public class CategoryList {
    private static String[] categoryList = new String[] { "автомобіль", "легковий автомобіль", "вантажний автомобіль", "спортивний автомобіль" };

    public String[] getCategoryList() {
        return categoryList;
    }

    public static int categorySize() {
        return categoryList.length;
    }

    /* @param {String} category
     * @return {Boolean} t/f
     */
    public static boolean checkCategory(String category) {
        for (int i = 0; i < categorySize(); i++) {
            if (categoryList[i].equals(category)) {
                System.out.println("Error with selected category");
                return true;
            }
        }

        return false;
    }
}
