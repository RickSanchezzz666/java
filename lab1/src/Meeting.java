import java.time.Instant;
import java.time.Year;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class Meeting {
    public Meeting() {};
    public Meeting(String topic, int members) {
        this.date = new Date();
        this.topic = topic;
        this.membersNum = members;
    }

    Date date;
    String topic;
    int membersNum;

//    void outputData() {
//        System.out.println("Meeting date: " + date);
//        System.out.println("Meeting topic: " + topic);
//        System.out.println("Meeting members number: " + membersNum);
//    }
}
