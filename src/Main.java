public class Main {
    public static void main(String[] args) {

        System.out.println("homework5.");
        //
        {
            int clientOS = 0;

            if (clientOS == 0) {
                System.out.println("Установите версию приложения для ios по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Неизвестная операционная система");
            }
        }

        //

        {
            int clientOS = 0;
            int clientDeviceYear = 2015;

            if (clientOS != 0 && clientOS != 1) {
                System.out.println("Неизвестная операционная система");

            } else {
                String operationSystem;
                if (clientOS == 0) {
                    operationSystem = "ios";
                } else {
                    operationSystem = "Android";
                }

                String message;
                if (clientDeviceYear < 2015) {
                    message = "Установите облегченную версию приложения для " + operationSystem +
                            " по ссылке";
                } else {
                    message = "Установите облегченную версию приложения для " + operationSystem +
                            " по ссылке";
                }
                System.out.println(message);

            }

            //

            int year = 2021;
            boolean isLeap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    }
                } else {
                    isLeap = true;
                }
            }
            if (isLeap) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

            //

            int deliveryDistance = 85;
            int deliveryTime = 1;

            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime++;
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryTime += 2;
            } else if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            }
            System.out.println("Потребуется дней: " + deliveryTime);

        }

        //

        int monthNumber = 13;
        String season = null;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
        if (season != null) {
            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season + ".");
        }

    }

}