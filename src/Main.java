public class Main {

    public Main() {}

    public String[] sortString(String[] stringArr) {

        String tempString;

        for (int i = 0; i < stringArr.length - 1; i++) {
            for (int j = 0; j < stringArr.length - 1; j++) {
                if (stringArr[j].compareTo(stringArr[j + 1]) > 0) {
                    tempString = stringArr[j];
                    stringArr[j] = stringArr[j + 1];
                    stringArr[j + 1] = tempString;
                }
            }
        }
        return stringArr;
    }

    public static void main(String[] args) {

        String str[] = {"s", "k", "c", "r", "v", "n", "b", "f", "a", "d"};

        String str2[] = {"Pata", "Peter", "Andi", "Franki", "Olaf", "Asterix", "Laura", "Christoph", "Bernd", "Xena"};

        Main main = new Main();

        String[] sortiert = main.sortString(str);
        String[] sorttiert2 = main.sortString(str2);

        for (int i = 0; i < sortiert.length; i++) {
            System.out.println(str[i]);
        }
        for (int i = 0; i < sorttiert2.length; i++) {
            System.out.println(str2[i]);
        }

    }
}
