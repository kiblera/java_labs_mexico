package part_08.Classroom;

import part_08.Classroom.Interf.ChairInterface;
import part_08.Classroom.Interf.TableInterface;

public class ClassroomDemo {

    private ChairInterface chairs;
    private TableInterface tables;

    public ClassroomDemo () {

    }

    public ChairInterface getChairs() {
        return chairs;
    }

    public void setChairs(ChairInterface chairs) {
        this.chairs = chairs;
    }

    public TableInterface getTables() {
        return tables;
    }

    public void setTables(TableInterface tables) {
        this.tables = tables;
    }
}
