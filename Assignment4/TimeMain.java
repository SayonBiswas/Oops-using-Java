import java.util.Scanner;

class Time{
    int hour;
    int minute;
    int second;

    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }

    Time addTime(Time t) {
        int newHour = hour + t.hour;
        int newMinute = minute + t.minute;
        int newSecond = second + t.second;

        if (newSecond >= 60) {
            newMinute += newSecond / 60;
            newSecond = newSecond % 60;
        }
        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute = newMinute % 60;
        }

        return new Time(newHour, newMinute, newSecond);
    }
}

class TimeMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time (hour minute second):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter second time (hour minute second):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        System.out.print("First Time : ");
        t1.displayTime();

        System.out.print("Second Time: ");
        t2.displayTime();

        Time total = t1.addTime(t2);
        System.out.print("Sum of Times: ");
        total.displayTime();
    }
}
