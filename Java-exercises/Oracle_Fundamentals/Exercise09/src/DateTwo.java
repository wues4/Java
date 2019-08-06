public class DateTwo {
    private int day, month, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void setDate(int d, int m, int y){
        if (y > 1000 && y < 10000) {
            this.year = y;
        } else {
            System.out.println("Error: " + y + " year is invalid value. Enter value from 1000 to 10000");
            this.year = 0;
        }

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.month = m;
                if (d > 0 && d < 32) {
                    this.day = d;
                } else {
                    System.out.println("Error: " + d + " day value is invalid for " + m + " month. Enter value from 1 to 31");
                    this.day = 0;
                }
                break;
            case 2:
                this.month = m;
                if (d > 0 && d < 29) {
                    this.day = d;
                } else if (d == 29) {
                    if (((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0)) {
                        this.day = d;
                    }else {
                        System.out.println("Error: " + d + " day value is invalid for " + m + " month. Day cannot be 29 unless the year is a leap year");
                        this.day = 0;
                    }
                } else {
                    System.out.println("Error: " + d + " day value is invalid for " + m + " month");
                    this.day = 0;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                this.month = m;
                if (d > 0 && d < 31) {
                    this.day = d;
                } else {
                    System.out.println("Error: " + d + " day value is invalid for " + m + " month. Enter value from 1 to 30");
                    this.day = 0;
                }
                break;
            default:
                System.out.println(m + " is an invalid month.");
                this.month = 0;
                break;
        }
    }

    void displayDate(){
        if (day == 0 || month == 0 || year == 0){
            System.out.println("Error: Invalid date.");
        }else
            System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}
