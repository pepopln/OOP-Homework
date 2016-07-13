package DateModifier;


import java.util.Date;
import java.util.Calendar;

public class DateModifier {
public long getDayDifference(String startString,String endString){
    String[] startParams = startString.split("\\s+");
    String[] endParams = endString.split("\\s+");

    Calendar start = Calendar.getInstance();
    int sYear = Integer.valueOf(startParams[0]);
    int sMonth = Integer.valueOf(startParams[1]);
    int sDay = Integer.valueOf(startParams[2]);
    start.set(sYear,sMonth,sDay);

    Calendar end = Calendar.getInstance();
    int eYear = Integer.valueOf(endParams[0]);
    int eMonth = Integer.valueOf(endParams[1]);
    int eDay = Integer.valueOf(endParams[2]);
    end.set(eYear,eMonth,eDay);

    Date startDate = start.getTime();
    Date endDate = end.getTime();
    long startTime = startDate.getTime();
    long endTime = endDate.getTime();
    if (startTime>endTime){
        long temp = startTime;
        startTime=endTime;
        endTime=temp;
    }
    long diffTime = endTime-startTime;
    long diffDays = diffTime/(1000*60*60*24);
    return diffDays;
}
}
