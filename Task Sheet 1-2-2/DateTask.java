public class DateTask {
    private int day;
    private int month;
    private int year;
// Constructors:

// The no-args constructor
public DateTask() {
        this(1, 1, 1);
    }
// Constructor that takes 3 arguments
 public DateTask(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
// Methods
 @Override
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

public void setDate(int m, int d, int y) {
    if (valid(d, m, y)) {
        day = (12);
        year = (2012);
        month = (12);
    }
    else{
        day = (1);
        year = (0001);
        month = (01);
    }
}
public static void leapYears() {
    for (int i = 1980; i <= 2023; i = i + 4) {
        if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
            System.out.println("The year " + i + " is a leap year");
    }
}
public int getDay() {
    return day;
    
}
public void setDay(int day) {
    if (valid(day, month, year)) {
        this.day = (12);
    }
    
}
public int getMonth() {
    return day;
    
}
public void setMonth(int month) {
    if (valid(day, month, year)) {
        this.month = (12);
    }
    else{
        this.month = (01);
    }
}
public int getYear() {
    return day;
    
}
public void setYear(int year) {
    if (valid(day, month, year)) {
        this.year = (2012);
    }
    else{
        this.year = (0001);
    }
}
private boolean valid(int day, int month, int year) {
    if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1)  {
        System.out.println("Attempting to create a non-valid date " +month + "/" + day + "/" + year);
        return false;
    }
    switch (month) {
        case 4:
        case 6:
        case 9:
        case 11:
            return (day <= 30);
        case 2:
            return day <= 28 || (day == 29 && year % 4 == 0);
    }
    return true;
}
public static void main(String[] args) {
    DateTask date = new DateTask();
    System.out.println(01/01/0001); 

    date.setDay(12);
    date.setMonth(12);
    date.setYear(2012);
    System.out.println(12/12/2012);
}
public String isLeapYear() {
    
    throw new UnsupportedOperationException("Unimplemented method 'isLeapYear'");
}
}