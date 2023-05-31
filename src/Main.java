public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int iOs = 0;
        int android = 1;
        int clientOs = 0;
        if (clientOs == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientOs = 0;
        int clientYear = 2020;
        int iOs = 0;
        int android = 1;
        int checkYear = 2015;

        if (clientOs == iOs) {
            if (clientYear >= checkYear) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (clientYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if(clientOs == android){ if (clientYear >= checkYear)
                System.out.println("Установите обычную версию приложения для Андроид по ссылке");
            } else if (clientYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
            }
        }



        public static void task3() {
            System.out.println("Задача 3");
            int year = 2021;
            int four = 4;
            int one = 100;
            int oneFour = 400;

            if ((year % oneFour == 0) || (year % four == 0 && year % one != 0)) {
                System.out.println("Год является високостным");
            } else {
                System.out.println("год не является високостным");
            }
        }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int threeDayDelyvery = 100;
        int twoDayDelyvery = 60;
        int oneDayDelivery = 20;
        int deliveryDay = 1;

        if (deliveryDistance < oneDayDelivery) {
            System.out.println("Потребуется дней " + (deliveryDay) + " , срок доставки");
        } else if (deliveryDistance >= oneDayDelivery && deliveryDistance <= twoDayDelyvery){
            System.out.println("Потребуется дней " + (deliveryDay + 1) + " , срок доставки");
        } else if (deliveryDistance > twoDayDelyvery && deliveryDistance <= threeDayDelyvery){
            System.out.println("Потребуется дней " + (deliveryDay + 2) + " , срок доставки");
        } else if (deliveryDistance > threeDayDelyvery){
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                    System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                    System.out.println("Весна");
                    break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                    System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Такого месяца не существует");
                }

    }

}

