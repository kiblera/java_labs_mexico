package part_08.Classroom;


import part_08.Classroom.Model.WoodChair;
import part_08.Classroom.Model.WoodTable;

public class ClassroomFactory {

    public static void main(String[] args) {

        // create a wood table
        WoodTable wt = new WoodTable();

        // create a wood chair
        WoodChair wc = new WoodChair();

        // create a classroom demo object
        ClassroomDemo cd = new ClassroomDemo();

        // set the classroom demo chairs to the wood chair we created
        // and do the same thing for table
        cd.setChairs(wc);
        cd.setTables(wt);
    }
}