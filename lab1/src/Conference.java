import java.util.ArrayList;
import java.util.Optional;

public class Conference {
    public Conference(String name, String place) {
        conferenceName = name;
        conferencePlace = name;
    }
    private String conferenceName;
    private String conferencePlace;
    private ArrayList<Meeting> meetings = new ArrayList<>();

    void outputData() {
        System.out.println("Conference name: " + conferenceName);
        System.out.println("Conference place: " + conferencePlace);
        for (Meeting elem : meetings) {
            System.out.println("Meeting topic: " + elem.topic + ". Members number: " + elem.membersNum + ". Meeting Date: " + elem.date);
        }
    }

    Optional<Meeting> getMeeting(int meetNum) {
        if (meetNum > meetings.size() || meetNum < 0) {
            System.out.println("Wrong number!");
            return Optional.empty();
        } else {
            return Optional.ofNullable(meetings.get(meetNum));
        }

    }

    int getAverageMembersNum() {
        int count = 0;
        for (Meeting elem : meetings) {
            count += elem.membersNum;
        }
        return count / meetings.size();
    }

    Meeting getMostMembersMeeting() {
        Meeting most = new Meeting();
        int count = 0;
        for (Meeting elem : meetings) {
            if(elem.membersNum > count) {
                count = elem.membersNum;
                most = elem;
            }
        }
        return most;
    }

    int getNameLength(Meeting meet) {
        return conferenceName.length();
    }

    void createMeeting(String topic, int members) {
        Meeting meet = new Meeting(topic, members);
        meetings.add(meet);
    }

}
