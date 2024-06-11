class MinutesToYearsDays {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Values");
        } else {
            long years = (minutes / (365 * 24 * 60));
            long remainingDays = ((minutes / (60 * 24)) % 365);
            System.out.println(minutes + "min=" + years + " y and " + remainingDays + "d");
        }
    }

    public static void main(String[] args) {
        MinutesToYearsDays obj = new MinutesToYearsDays();
        obj.printYearsAndDays(525600);
        obj.printYearsAndDays(1051200);
        obj.printYearsAndDays(561600);
    }
}