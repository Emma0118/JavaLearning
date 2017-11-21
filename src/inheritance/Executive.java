package inheritance;

//use final to prevent inheritance from Executive

final class Executive extends Manager{
    public Executive(String n, double s, int year, int month, int day) {
        super(n,s,year,month,day);
    }
}
