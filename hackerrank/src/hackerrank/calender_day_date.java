package hackerrank;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
      /*  Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, month);
        c1.set(Calendar.DATE, day);
        c1.set(Calendar.YEAR, year);
       // int dayOfWeek = c1.get(Calendar.DAY_OF_WEEK);
        //Integer n= new Integer(dayOfWeek);
        //String dayweek= n.toString();
     //    String[] strDays = new String[] { "SUNDAY", "MONDAY", "TUESDAY",
       // "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
         SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
         return (simpleDateformat.format(c1.get(Calendar.DAY_OF_WEEK)));
  
      //  return (strDays[dayOfWeek]);
       // return dayweek;
        
        */
    	LocalDate DT= LocalDate.of(year, month, day);
    DayOfWeek dayof= DT.getDayOfWeek();
    
    	
    	return (dayof.name());
    }
}



public class calender_day_date {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
