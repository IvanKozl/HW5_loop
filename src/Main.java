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
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int clientOsA = 1;
        int clientDeviceYearA = 2015;
        if (clientOsA == 1) {
            System.out.println("Установите версию приложения для Андроид по ссылке");
        } else if (clientDeviceYearA < 2015) {
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
        } else {
            System.out.println("Установите версию приложения для Андроид по ссылке");
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
        int distance;
        int oneDayDelivery = 20;
        int deliveryDay1 = 1;
        int deliveryDay2 = 2;
        int deliveryDay3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + deliveryDay1 + " , срок доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней " + deliveryDay2 + " , срок доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней " + deliveryDay3 + " , срок доставки");
        } else if (deliveryDistance > 100){
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
                int monthNumber = 12;
                switch (monthNumber) {
                    case 1:
                        System.out.println("Январь");
                        break;
                    case 2:
                        System.out.println("Февраль");
                        break;
                    case 3:
                        System.out.println("Март");
                        break;
                    case 4:
                        System.out.println("Апрель");
                        break;
                    case 5:
                        System.out.println("Май");
                        break;
                    case 6:
                        System.out.println("Июнь");
                        break;
                    case 7:
                        System.out.println("Июль");
                        break;
                    case 8:
                        System.out.println("Август");
                        break;
                    case 9:
                        System.out.println("Сентябрь");
                        break;
                    case 10:
                        System.out.println("Октябрь");
                        break;
                    case 11:
                        System.out.println("Ноябрь");
                        break;
                    case 12:
                        System.out.println("Декабрь");
                        break;
                    default:
                        System.out.println("Такого месяца не существует");
                }

    }

}

