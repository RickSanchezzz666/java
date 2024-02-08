import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Conference conf = new Conference("Conference1", "Conference Place");
        conf.createMeeting("Topic1 Name", 5);
        conf.createMeeting("Topic2 Name28", 4);
        conf.createMeeting("Topic3 Name5", 8);
        conf.outputData();
        System.out.println("Average Members num: " + conf.getAverageMembersNum());
        Meeting most = conf.getMostMembersMeeting();
        System.out.println("Most members in meeting: " + most.topic + " with " + most.membersNum + " members.");
        Meeting meet = conf.getMeeting(1);
        System.out.println("Length of name: '" + meet.topic + "' is " + conf.getNameLength(meet) + " symbols.");
    }
}

