public class Main {
    public static void main(String[] args) {

        int var1 =10;
        System.out.println("Значение переменной var1 с типом int равно " + var1);
        byte var2 = 15;
        System.out.println("Значение переменной var2 с типом byte равно " + var1);
        short var3 = 20;
        System.out.println("Значение переменной var3 с типом short равно " + var1);
        long var4 = 25;
        System.out.println("Значение переменной var4 с типом long равно " + var1);
        float var5 = 30.5F;
        System.out.println("Значение переменной var5 с типом float равно " + var1);
        double var6 = 35.5;
        System.out.println("Значение переменной var6 с типом double равно " + var1);

        float var7 = (float) 27.12;
        long var8 = 987678965549L;
        double var9 = 2.786;
        boolean var10 = false;
        short var11 = 569;
        short var12 = -159;
        int var13 = 27897;
        byte var14 = 67;

        short lpPupils = 23;
        short asPupils = 27;
        short eaPupils = 30;
        short numberOfLists = 480;
        short totalListsForPupil = (short) (numberOfLists / (lpPupils + asPupils + eaPupils));
        System.out.println("На каждого ученика рассчитано " + totalListsForPupil + " листов бумаги");

        short bottlesPerTwoMinutes = 16;
        short bottlesPerMinute = (short) (bottlesPerTwoMinutes / 2);
        short bottlePer20Minutes = (short) (bottlesPerMinute * 20);
        System.out.println("За 20 минут машина произвела бутылок " + bottlePer20Minutes + " штук");
        int bottlePerDay = bottlesPerMinute * 60 * 24;
        System.out.println("За день машина произвела бутылок " + bottlePerDay + " штук");
        int bottlePer3Day = bottlePerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + bottlePer3Day + " штук");
        int bottlePerMonth = bottlePer3Day * 10;
        System.out.println("За месяц машина произвела бутылок " + bottlePerMonth + " штук");

        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte paintPerClass = (byte) (whitePaintPerClass + brownPaintPerClass);
        byte totalClasses = (byte) (totalPaint / paintPerClass);
        byte totalWhitePaint = (byte) (whitePaintPerClass * totalClasses);
        byte totalBrownPaint = (byte) (brownPaintPerClass * totalClasses);
        System.out.println("В школе, где " + totalClasses +
                " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        short bananaWeight = 80;
        short milkWeight = 105;
        short iceCreamWeight = 100;
        short eggWeight = 70;
        double totalWeight = (bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4) / 1000;
        System.out.println(totalWeight);

        short lowWeight = 250;
        short highWeight = 500;
        short lowWeightLoss = (short) (7000 / lowWeight);
        System.out.println(lowWeightLoss);
        short highWeightLoss = (short) (7000 / highWeight);
        System.out.println(highWeightLoss);
        short averageWeightLoss = (short) ((lowWeightLoss + highWeightLoss) / 2);
        System.out.println(averageWeightLoss);

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double newMashaSalary = mashaSalary * 1.1;
        double newDenisSalary = denisSalary * 1.1;
        double newKristinaSalary = kristinaSalary * 1.1;
        int mashaSalaryPerYear = mashaSalary * 12;
        int denisSalaryPerYear = denisSalary * 12;
        int kristinaSalaryPerYear = kristinaSalary * 12;
        double newMashaSalaryPerYear = newMashaSalary * 12;
        double mashaDifference = newMashaSalaryPerYear - mashaSalaryPerYear;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на "
                + mashaDifference + " рублей");
        double newDenisSalaryPerYear = newDenisSalary * 12;
        double denisDifference = newDenisSalaryPerYear - denisSalaryPerYear;
        System.out.println("Денис теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на "
                + denisDifference + " рублей");
        double newKristinaSalaryPerYear = newKristinaSalary * 12;
        double kristinaDifference = newKristinaSalaryPerYear - kristinaSalaryPerYear;
        System.out.println("Кристина теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на "
                + kristinaDifference + " рублей");
    }
}