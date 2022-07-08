public class PrintDayInWord {
    public static void main(String[] arg){
        String day = "Monday";
        //check if day == Monday using nested if
        if(day=="Monday"){
            System.out.println("Monday");
        } else if (day=="Tuesday") {
            System.out.println("Tuesday");
        }
        else if (day=="Wednesday") {
            System.out.println("Wednesday");
        }
        else if (day=="Thursday") {
            System.out.println("Thursday");
        }
        else if (day=="Friday") {
            System.out.println("Friday");
        }
        else if (day=="Saturday") {
            System.out.println("Saturday");
        }
        else if (day=="Sunday") {
            System.out.println("Sunday");
        }
        //checking using swict-case
        switch (day){
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            case "Sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day!!!");

        }
    }
}
