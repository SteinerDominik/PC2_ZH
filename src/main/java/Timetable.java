import java.util.ArrayList;

public class Timetable {
    /**
     * Implementálja a Timetable osztályt, ami kurzusok nevét és időpontjait kezeli
     * (courseName, timestamp). Az osztálynak rendelkeznie kell egy newCourse
     * (új kurzus hozzáadása, csak név), egy removeCourse (adott elem törlése)
     * és egy getCourses (egy String-ben visszaadja az aktuálisan tárolt kurzusok adatait:
     * <kurzusnév> <időpont> formátumban) metódussal.
     */
    protected static class timetable{
        private String courseName;
        private String timestamp;

        public timetable(String courseName, String timestamp){
            this.courseName = courseName;
            this.timestamp = timestamp;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }

    protected ArrayList<timetable> timetables = new ArrayList<>();

    public void newCourse(String newcourse){
        timetables.add(new timetable(newcourse, ""));
    }

    public void removeCourse(String removecourse){
        timetables.remove(new timetable(removecourse,""));
    }

    public void getCourses(){
        for (Timetable.timetable timetable : timetables) {
            System.out.println(timetable);
        }
    }
}
