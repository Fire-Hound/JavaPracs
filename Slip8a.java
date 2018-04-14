class Slip8a
{
    String pname;
    int innings, notouts, runs;
    Slip8a(String pname, int innings, int notouts, int runs)
    {
        this.pname = pname;
        this.innings = innings;
        this.notouts = notouts;
        this.runs = runs;
    }
    void showData()
    {
        System.out.println("Player: " + pname +
                           "\nInnings: " + innings + 
                           "\nNot Outs: " + notouts +
                           "\nRuns: " + runs);
    }
    void calcAverage()
    {
        double average = runs/(innings-notouts)*1.0;
        System.out.println("Average for " + pname + ": " + average + " runs");
    }
    public static void main(String[] args) {
        Slip8a player = new Slip8a("Don Bradman", 80, 10, 6996);
        player.showData();
        player.calcAverage();
    }
}