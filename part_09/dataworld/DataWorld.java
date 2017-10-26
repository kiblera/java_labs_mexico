package part_09.dataworld;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataWorld {

    public static void main(String[] args) {

        String file = "/Users/andreamkibler/CodingNomads/java/java_labs_mexico/Data_Science_Students_Group_Sign_Up.csv";
        String line = "";
        String cvsSplitBy = ",";

        ArrayList<YourPojo> resultList = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                YourPojo data = new YourPojo();

                // use comma as separator
                String[] lineArr = line.split(cvsSplitBy);


                data.setWhats_your_first_name(lineArr[0]);
                data.setHey_answer_61205875_nice_to_meet_you_whats_your_last_name(lineArr[1]);
                data.setData_science_tools_and_tutorials(lineArr[2]);



                System.out.println("First name is " + lineArr[0] + ".");
                System.out.println("Last name is " + lineArr[1] + ".");
                System.out.println("I am interested in " + lineArr[2] + ".");


                resultList.add(data);


//                System.out.println("I am interested in " + lineArr[3] + ".");
//                System.out.println("I am interested in " + lineArr[4] + ".");
//                System.out.println("I am interested in " + lineArr[5] + ".");
//                System.out.println("I am interested in " + lineArr[6] + ".");
//                System.out.println("I am interested in " + lineArr[7] + ".");
//                System.out.println("I am interested in " + lineArr[8] + ".");
//                System.out.println("I attend " + lineArr [9]);
//                System.out.println("My major is " + lineArr[10]);
//                System.out.println("My career goals are " + lineArr[11]);


//                String[] hey_answer_61205875_nice_to_meet_you_whats_your_last_name = line.split(cvsSplitBy);
//                System.out.println("Last name is " + hey_answer_61205875_nice_to_meet_you_whats_your_last_name + ".");
//
//                String[] data_science_tools_and_tutorials = line.split(cvsSplitBy);
//                System.out.println("I am interested in " + data_science_tools_and_tutorials + ".");
//
//                String[] machine_learning_and_ai_articles = line.split(cvsSplitBy);
//                System.out.println("I am interested in " + machine_learning_and_ai_articles + ".");
//
//                String[] machine_learning_research_papers = line.split(cvsSplitBy);
//                System.out.println("I am interested in " + machine_learning_research_papers + ".");
//
//                String[] project_ideas = line.split(cvsSplitBy);
//                System.out.println("I am interested in " + project_ideas + ".");
//
//                String[] paid_resource_recommendations_books_courses_etc = line.split(cvsSplitBy);
//                System.out.println("I am interested in " + paid_resource_recommendations_books_courses_etc + ".");
//
//                String[] other = line.split(cvsSplitBy);
//                System.out.println("I am interested in " + other + ".");
//
//                String[] what_university_do_you_attend = line.split(cvsSplitBy);
//                System.out.println("I attend " + what_university_do_you_attend + ".");
//
//                String[] whats_your_major = line.split(cvsSplitBy);
//                System.out.println("My major is " + whats_your_major + ".");
//
//                String[] feel_free_to_share_some_career_goals_with_us = line.split(cvsSplitBy);
//                System.out.println("My career goals are " + feel_free_to_share_some_career_goals_with_us + ".");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (YourPojo output: resultList) {
            System.out.println("My name is " + output.getWhats_your_first_name() + " " +
                    output.getHey_answer_61205875_nice_to_meet_you_whats_your_last_name() + ", and I am interested in "
                    + output.getData_science_tools_and_tutorials() + ".");
        }

    }
}

class YourPojo {
    String whats_your_first_name;
    String hey_answer_61205875_nice_to_meet_you_whats_your_last_name;
    String data_science_tools_and_tutorials;
    String machine_learning_and_ai_articles;
    String machine_learning_research_papers;
    String project_ideas;
    String free_resources_books_courses_etc;
    String paid_resource_recommendations_books_courses_etc;
    String other;
    String what_university_do_you_attend;
    String whats_your_major;
    String feel_free_to_share_some_career_goals_with_us;

    public String getWhats_your_first_name() {
        return whats_your_first_name;
    }

    public void setWhats_your_first_name(String whats_your_first_name) {
        this.whats_your_first_name = whats_your_first_name;
    }

    public String getHey_answer_61205875_nice_to_meet_you_whats_your_last_name() {
        return hey_answer_61205875_nice_to_meet_you_whats_your_last_name;
    }

    public void setHey_answer_61205875_nice_to_meet_you_whats_your_last_name(String hey_answer_61205875_nice_to_meet_you_whats_your_last_name) {
        this.hey_answer_61205875_nice_to_meet_you_whats_your_last_name = hey_answer_61205875_nice_to_meet_you_whats_your_last_name;
    }

    public String getData_science_tools_and_tutorials() {
        return data_science_tools_and_tutorials;
    }

    public void setData_science_tools_and_tutorials(String data_science_tools_and_tutorials) {
        this.data_science_tools_and_tutorials = data_science_tools_and_tutorials;
    }

    public String getMachine_learning_and_ai_articles() {
        return machine_learning_and_ai_articles;
    }

    public void setMachine_learning_and_ai_articles(String machine_learning_and_ai_articles) {
        this.machine_learning_and_ai_articles = machine_learning_and_ai_articles;
    }

    public String getMachine_learning_research_papers() {
        return machine_learning_research_papers;
    }

    public void setMachine_learning_research_papers(String machine_learning_research_papers) {
        this.machine_learning_research_papers = machine_learning_research_papers;
    }

    public String getProject_ideas() {
        return project_ideas;
    }

    public void setProject_ideas(String project_ideas) {
        this.project_ideas = project_ideas;
    }

    public String getFree_resources_books_courses_etc() {
        return free_resources_books_courses_etc;
    }

    public void setFree_resources_books_courses_etc(String free_resources_books_courses_etc) {
        this.free_resources_books_courses_etc = free_resources_books_courses_etc;
    }

    public String getPaid_resource_recommendations_books_courses_etc() {
        return paid_resource_recommendations_books_courses_etc;
    }

    public void setPaid_resource_recommendations_books_courses_etc(String paid_resource_recommendations_books_courses_etc) {
        this.paid_resource_recommendations_books_courses_etc = paid_resource_recommendations_books_courses_etc;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getWhat_university_do_you_attend() {
        return what_university_do_you_attend;
    }

    public void setWhat_university_do_you_attend(String what_university_do_you_attend) {
        this.what_university_do_you_attend = what_university_do_you_attend;
    }

    public String getWhats_your_major() {
        return whats_your_major;
    }

    public void setWhats_your_major(String whats_your_major) {
        this.whats_your_major = whats_your_major;
    }

    public String getFeel_free_to_share_some_career_goals_with_us() {
        return feel_free_to_share_some_career_goals_with_us;
    }

    public void setFeel_free_to_share_some_career_goals_with_us(String feel_free_to_share_some_career_goals_with_us) {
        this.feel_free_to_share_some_career_goals_with_us = feel_free_to_share_some_career_goals_with_us;
    }
}
// all getters and setters

//class ArrayOutput {
//    ArrayList<YourPojo> resultList = new ArrayList();


//
//// create an arraylist to store your POJO results

// Create and use a FileReader wrapped in a BufferedReader - file argument is for a path to a file
//// the line below is using "try-with-resources to automatically open and close the file"
//    BufferedReader br = new BufferedReader(new FileReader(File)
//        {
//        while((nextLine = br.readLine()) != null) {
//        YourPojo data = new YourPojo();
////        String[] vals = nextLine.split(",");
////        data.setWhats_your_first_name(vals[0]);
////        data.setHey_answer_61205875_nice_to_meet_you_whats_your_last_name(vals[1]);
////        data.setData_science_tools_and_tutorials(vals[2]);
////        data.setMachine_learning_and_ai_articles(vals[3]);
////        data.setMachine_learning_research_papers(vals[4]);
////        data.setProject_ideas(vals[5]);
////        data.setFree_resources_books_courses_etc(vals[6]);
////        data.setPaid_resource_recommendations_books_courses_etc(vals[7]);
////        data.setOther(vals[8]);
////        data.setWhat_university_do_you_attend(vals[9]);
////        data.setWhats_your_major(vals[10]);
////        data.setFeel_free_to_share_some_career_goals_with_us(vals[11]);
////
////        resultList.add(data);
////
//        }
//        } catch (IOException exc); {
//        System.out.println("I/O Error: " + exc);
// }
//}