




















import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Team extends Members {
	private ArrayList<Members> team = new ArrayList<>();


    public void createTeam(String teamType, int teamSize, String ageGroup) {
        ArrayList<Members> members = Club.getMembers();
        String ageG = "";
        boolean x = true;
        int i = 0;

        switch (ageGroup) {
            case "j":
                ageG = "Junior";
                break;
            case "s":
                ageG = "Senior";
                break;
        }

        switch (teamType) {
            case "male":

                while (x) {
                    String fName = members.get(i).getFirstName();
                    String lName = members.get(i).getLastName();
                    if (members.get(i).getRole() == Members.Role.Unassigned && members.get(i).getAgeGroup().toString() == ageG && members.get(i).getGender() == Members.Gender.MALE) {
                        Player player = new Player(fName, lName, 'P');
                        team.add(player);
                        i++;
                        if (teamSize == team.size()) {
                            x = false;
                        }
                    } else {
                        i++;
                    }
                }
            case "female":

                while (x) {
                    String fName = members.get(i).getFirstName();
                    String lName = members.get(i).getLastName();
                    if (members.get(i).getRole() == Members.Role.Unassigned && members.get(i).getAgeGroup().toString() == ageG && members.get(i).getGender() == Members.Gender.FEMALE) {
                        Player player = new Player(fName, lName, 'P');
                        team.add(player);
                        i++;
                        if (teamSize == team.size()) {
                            x = false;
                        }
                    } else {
                        i++;
                    }
                }
            case "mixed":

                while (x) {
                    String fName = members.get(i).getFirstName();
                    String lName = members.get(i).getLastName();
                    if (members.get(i).getRole() == Members.Role.Unassigned && members.get(i).getAgeGroup().toString() == ageG) {
                        Player player = new Player(fName, lName, 'P');
                        team.add(player);
                        i++;
                        if (teamSize == team.size()) {
                            x = false;
                        }
                    } else {
                        i++;
                    }
                }
        }
        for (Members m : members) {
            if (m.getRole() == Members.Role.Unassigned && m.ageCalculator(m.getDob()) > 35) {
                String fName = members.get(i).getFirstName();
                String lName = members.get(i).getLastName();
                Coach c = new Coach(fName, lName, 'C');
                team.add(c);
                break;
            }
        }

        System.out.println("Your Team has the following members:");
        for (Members p : team) {
            System.out.println(p.getRole() + ": " + p.getFirstName() + " " + p.getLastName());
        }
    }
}


