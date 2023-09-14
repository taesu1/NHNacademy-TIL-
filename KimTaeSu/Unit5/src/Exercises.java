public class Exercises {

    //5.1
    public static void alcoholContent(int g) {
        if (g > 40) {
            System.out.println("Extra Strong liquor");
        } else if (g > 20) {
            System.out.println("Strong liquor");
        } else if (g > 15) {
            System.out.println("liquor");
        } else if (g > 12) {
            System.out.println("strong vine");
        } else if (g > 10.5) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }

    }

    //5.2
    public static void compare(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.println("it is regular");
        } else if (a == b || b == c || a == c) {
            System.out.println("it is symentric");
        } else {
            System.out.println("it is irregular");
        }

    }

    //5.3
    public static void isTriangle(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("right triangle");
        }
    }

    //5.6
    public static String yesOrNo(String line) {
        if (line.startsWith("vocal")) {
            return "MAYBE";
        } else if (line.lastIndexOf("ai") == 0 || line.lastIndexOf("u") == 0) {
            return "Yes";
        } else if (line.lastIndexOf("e") == 0 || line.lastIndexOf("o") == 0) {
            return "No";
        } else {
            return "\"Don\"T know";
        }
    }


}


class Year {
    private int day;
    private int inputDay;
    private int year;
    private int month;

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equalDate(Year year) {
        return (this.year == year.year) && (this.month == year.month) && (this.day == year.day);
    }


    public boolean isPrecede(Year anotherDate) {
        if (this.year < anotherDate.year) {
            return false;
        } else if (this.year == anotherDate.year) {
            if (this.month < anotherDate.month) {
                return false;
            } else if (this.month == anotherDate.month) {
                if (this.day < anotherDate.day) {
                    return false;
                } else if (this.day == anotherDate.day) {
                    return false;

                }
            }
        }
        return true;
    }

    public static boolean isLeapYear(Year date) {
        if (date.year % 4 == 0 && date.year % 100 == 0 || date.year % 400 == 0) {
            return true;
        }
        return false;
    }


    public static void nextDay(Year year) {
        if (year.month == 12) {
            if (year.day == 31) {
                year.year++;
                year.month = 1;
                year.day = 1;
            } else {
                year.day++;
            }
        }
        System.out.println(year.year + " " + year.month + " " + year.day);

    }
}
