import java.lang.reflect.Method;
import java.util.ArrayList;

public class Conference {
    public Conference(String name, String place) {
        __conferenceName = name;
        __conferencePlace = name;
    }
    private String __conferenceName;
    private String __conferencePlace;
    private ArrayList<Meeting> __meetings = new ArrayList<>();

    void outputData() {
        System.out.println("Conference name: " + __conferenceName);
        System.out.println("Conference place: " + __conferencePlace);
        for (Meeting elem : __meetings) {
            System.out.println("Meeting topic: " + elem.topic + ". Members number: " + elem.membersNum + ". Meeting Date: " + elem.date);
        }
    }

    Meeting getMeeting(int meetNum) {
        if (meetNum > __meetings.size() || meetNum < 0) {
            System.out.println("Wrong number!");
            return null;
        } else {
            return __meetings.get(meetNum);
        }

    }

    int getAverageMembersNum() {
        int count = 0;
        for (Meeting elem : __meetings) {
            count += elem.membersNum;
        }
        return count / __meetings.size();
    }

    Meeting getMostMembersMeeting() {
        Meeting most = new Meeting();
        int count = 0;
        for (Meeting elem : __meetings) {
            if(elem.membersNum > count) {
                count = elem.membersNum;
                most = elem;
            }
        }
        return most;
    }

    int getNameLength(Meeting meet) {
        return meet.topic.length();
    }

    void createMeeting(String topic, int members) {
        Meeting meet = new Meeting(topic, members);
        __meetings.add(meet);
    }

}
