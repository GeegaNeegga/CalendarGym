import java.time.DayOfWeek;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main  {
    public static void main(String[] args) {

        // здесь bro это сам календарь (хз название другое не лезло в голову)
        Calendar bro = new GregorianCalendar();

        //эта часть нужна для определения щя вечер день утро или ночь (пока не ебу как определить утро и ночь тут формат 12 часов)

            int hourday = bro.get(Calendar.HOUR_OF_DAY);

            if (hourday >= 18) { // Вечер
                System.out.print("Good evening, ");
            } else if (hourday >= 12) { // День
                System.out.print("Good afternoon, ");
            } else if (hourday >= 6) { // Утро
                System.out.print("Good morning, ");
            } else { // Ночь
                System.out.print("Good night, ");
            }

            System.out.println("Mr.Kamil");

             //тут week это для узнавания дня недели (нюанс: начало это вс 1 = sunday)
        int week = bro.get(Calendar.DAY_OF_WEEK);

        switch (week){
            case 1:
                System.out.println("Do sum shi man");
                break;

            case 2:
                System.out.println("Chill");
                break;

            case 3:
                System.out.println("Today is Monday\nChest and Triceps");
                break;

            case 4:

                System.out.println("Chill");
                break;

            case 5:
                System.out.println("Today is Thursday\nBack and Biceps");
                break;

            case 6:
                System.out.println("Chill");
                break;

            case 7:
                System.out.println("Today is Saturday\nLegs and Shoulders");
                break;
        }
        //тут решен нюанс с началом недели

        System.out.println(java.time.LocalDate.now());

        }

    }
