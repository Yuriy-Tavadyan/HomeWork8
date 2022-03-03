import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    /*Task 1*/
    public static void checkingLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    /*Task 2*/
    public static void selectTheUpdateVersion(String clientOS, int clientDeviceYear) {

        int currentYear = LocalDateTime.now().getYear();
        int checkedOS = checkedOSMethod(clientOS);

        String messageInfo = clientDeviceYear >= currentYear ? "" : " light ";

        System.out.println(checkedOS == 0 ? "Установите" + messageInfo + "версию приложения для iOS по ссылке"
                : checkedOS == 1 ? "Установите" + messageInfo + "версию приложения для Android по ссылке"
                : "Вы выбрали не верную OS");
    }

    private static int checkedOSMethod(String clientOS) {
        if (clientOS.equalsIgnoreCase("ios")) {
            return 0;
        } else if (clientOS.equalsIgnoreCase("android")) {
            return 1;
        }
        return -1;
    }

    /*Task 3*/
    public static void countDays(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays++;
        }
        if (deliveryDistance >= 20) {
            deliveryDays++;
        }
        printCountDays(deliveryDays);
    }

    public static void printCountDays(int deliveryDays) {
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    /*Task 4.1*/
    public static void distinctLetters(String str) {

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                System.out.println("В строке присутствуют дубли");
                return;
            }
        }
        System.out.println("Строка не содержит дубли");
    }

    /*Task 4.2*/
    public static void doubleLetters(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                sb.append(str.charAt(i));
                i += count;
                count = 0;
            }
        }
        System.out.println(sb);
    }

    /*Task 5*/
    public static void reversArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; ++i) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        //Task 1//
        checkingLeapYear(2021);

        //Task 2//
        selectTheUpdateVersion("ios", 2021);

        //Task 3//
        countDays(19);

        //Task 4//
        distinctLetters("aabccddefgghiijjkk");
        distinctLetters("adghijk");

        doubleLetters("aabccddefgghiijjkk");
        doubleLetters("adghijk");

        //Task 5//
        int[] arr = new int[]{3, 2, 1, 6, 5};
        reversArray(arr);
    }
}

