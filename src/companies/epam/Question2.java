package interview.epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Use java streams to filter out the talents with certification and print the skills in sorted order.
 * Question2
 */
public class Question2 {
    static class Talent {
        private String skills;
        private boolean certification;

        public Talent(String skills, boolean certification) {
            this.skills = skills;
            this.certification = certification;
        }

        public String getSkills() {
            return skills;
        }

        public void setSkills(String skills) {
            this.skills = skills;
        }

        public boolean isCertification() {
            return certification;
        }

        public void setCertification(boolean certification) {
            this.certification = certification;
        }
    }

    public static void main() {

        List<Talent> skillList = List.of(
                new Talent("Java", true),
                new Talent("Kafka", false),
                new Talent("Docker", true),
                new Talent("Java", true)
        );

        String talentAvailable = skillList.stream()
                .filter(Talent::isCertification)
                .map(Talent::getSkills)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(talentAvailable);

    }
}
