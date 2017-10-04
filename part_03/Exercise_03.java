package part_03;


/**

 Implement the following methods

 */

class Exercise_03 {

    public static void main(String[] strings) {

        int i;
        // use a for loop to iterate 1000 times {
        for (i = 0; i < 1000; i++) {

            // Generate a random int between >= 1 and <= 12
            int month = 1 + (int) (Math.random() * ((12 - 1) + 1));

            // call getMonthName(int month) and pass your random int
            String monthName = getMonthName(month);

            System.out.println(month + " " + monthName);
            // print the name of the month and the random int generated to the console
        }
    }

        // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {
        String monthName="";

        // use a switch statement to determine the name of the month
        // for instance if the random int is 1 the name of month is January

        switch (month) {

            case 1:
                monthName = "The name of the month is January";
                break;
            case 2:
                monthName = "The name of the month is February";
                break;
            case 3:
                monthName = "The name of the month is March";
                break;
            case 4:
                monthName = "The name of the month is April";
                break;
            case 5:
                monthName = "The name of the month is May";
                break;
            case 6:
                monthName = "The name of the month is June";
                break;
            case 7:
                monthName = "The name of the month is July";
                break;
            case 8:
                monthName = "The name of the month is August";
                break;
            case 9:
                monthName = "The name of the month is September";
                break;
            case 10:
                monthName = "The name of the month is October";
                break;
            case 11:
                monthName = "The name of the month is November";
                break;
            case 12:
                monthName = "The name of the month is December";
                break;
       }



        return monthName;
    }
}

        // return the month name