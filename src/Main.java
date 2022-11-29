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

    }
}