public class Main {
    public static void main(String[] args) {

        //задание 1
        System.out.println("Задание 1");

        int integerNumber = 1;
        byte byteNumber = 12;
        short shortNumber = 157;
        long longNumber = 5000;
        float floatNumber = 5.5f;
        double doubleNumber = 15.123456;

        System.out.println("Значение переменной integerNumber с типом int равно " + integerNumber);
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);

        //задание 2
        System.out.println("Задание 2");

        float secondFloatNumber = 27.12f;
        long secondLongNumber = 98767896549L;
        double secondDoubleNumber = 2.786;
        short firstShortNumber = 569;
        short secondShortNumber = -159;
        short thirdShortNumber = 27897;
        byte secondByteNumber = 67;

        //задание 3
        System.out.println("Задание 3");
        byte firstTeacherS = 23;
        byte secondTeacherS = 27;
        byte thirdTeacherS = 30;
        short sheetsAmount = 480;
        int sheetPerStudent = sheetsAmount/(firstTeacherS + secondTeacherS + thirdTeacherS);
        System.out.println("На каждого ученика рассчитано " + sheetPerStudent + " листов бумаги");

        //задание 4
        System.out.println("Задание 4");
        int productionRate = 16;
        int interval = 2;
        productionRate = productionRate/interval;

        interval = 20;
        int totalProduct = productionRate * interval;
        System.out.println("За " + interval + " минут машина произвела " + totalProduct + " штук бутылок");

        interval = 60*24;
        totalProduct = productionRate * interval;
        System.out.println("За сутки машина произвела " + totalProduct + " штук бутылок");

        interval = 60*24*3;
        totalProduct = productionRate * interval;
        System.out.println("За 3 дня машина машина произвела " + totalProduct + " штук бутылок");

        interval = 60*24*30;
        totalProduct = productionRate * interval;
        System.out.println("За 1 месяц машина произвела " + totalProduct + " штук бутылок");

        //задание 5
        System.out.println("Задание 5");

        byte totalCans = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        int classes = (totalCans / (whiteCans+brownCans));

        System.out.println("В школе, где " + classes + " классов, нужно " + (classes * whiteCans)
                + "  банок белой краски и " + (classes * brownCans) + " банок коричневой краски");


        //задание 6
        System.out.println("Задание 6");

        int bananaCount = 5;
        int bananaGrams = 80;
        float milk_G_per_ML = 1.05f;
        int milk_ML = 200;
        int iceCreamCount = 2;
        int iceCreamGrams = 100;
        int eggCount = 4;
        int eggGrams = 70;
        float totalMass = (bananaCount * bananaGrams) + (milk_G_per_ML * milk_ML) + (iceCreamCount * iceCreamGrams) + (eggCount * eggGrams);
        System.out.println(totalMass + " грамм");
        System.out.println((totalMass/1000) + " килограмм");

        //задание 7
        System.out.println("Задание 7");

        int massToLoseKG = 7;
        int massToLoseG = massToLoseKG * 1000;
        int massLossG_1 = 250;
        int massLossG_2 = 500;

        System.out.println(massToLoseG/massLossG_1 + " дней, чтобы похудеть за 250 грамм");
        System.out.println(massToLoseG/massLossG_2 + " дней, чтобы похудеть за 500 грамм");


        //задание 8
        System.out.println("Задание 8");

        int wageEmployee_1 = 67_760; //Маша
        int wageEmployee_2 = 83_690; //Денис
        int wageEmployee_3 = 76_230; //Кристина

        float indexationValue = 1.1f;

        float newWageEmployee_1 = wageEmployee_1 * indexationValue;
        float newWageEmployee_2 = wageEmployee_2 * indexationValue;
        float newWageEmployee_3 = wageEmployee_3 * indexationValue;

        System.out.println("Маша теперь получает " +  newWageEmployee_1 + " рублей. Годовой доход вырос на " + (newWageEmployee_1-wageEmployee_1)*12 + " рублей");
        System.out.println("Денис теперь получает " +  newWageEmployee_2 + " рублей. Годовой доход вырос на " + (newWageEmployee_2-wageEmployee_2)*12 + " рублей");
        System.out.println("Кристина теперь получает " +  newWageEmployee_3 + " рублей. Годовой доход вырос на " + (newWageEmployee_3-wageEmployee_3)*12 + " рублей");

    }
    }
