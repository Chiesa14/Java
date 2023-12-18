public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }
    public  void infoDay(){
        switch (day){
            case SATURDAY :
            case SUNDAY : System.out.println("Weekends are best");
                break;
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            default:
                System.out.println("Mid day are so-so");
        }
    }
    public  static void  main(String[] args) throws Exception {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.infoDay();
        EnumTest secondDay = new EnumTest(Day.SUNDAY);
        secondDay.infoDay();
        EnumTest thirdDay = new EnumTest(Day.SATURDAY);
        thirdDay.infoDay();
        EnumTest fouthDay = new EnumTest(Day.FRIDAY);
        fouthDay.infoDay();
        EnumTest fifthDay = new EnumTest(Day.WEDNESDAY);
        fifthDay.infoDay();

    }
}
