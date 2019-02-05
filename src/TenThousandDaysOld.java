public class TenThousandDaysOld {
    private int daysOldTarget = 10000;

    public TenThousandDaysOld( int age){
        for (int d = age; d <= daysOldTarget; d++) {
            System.out.println("You are " + d + " days old");
            if (d == daysOldTarget)
            {
                System.out.println("Congrats, you are now " + d + " days old!");
            }
        }
    }
}