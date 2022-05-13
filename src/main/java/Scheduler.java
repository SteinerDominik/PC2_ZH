public class Scheduler extends Timetable{
    /**
     * Származtasson egy Scheduler osztályt a Timetable osztályból,
     * melynek setTimestamp metódusával lehessen beállítani
     * a Timetable kurzusainak időpontját.
     */
    public void setTimestamp(String coursename, String newtimestamp){
        if (!super.timetables.contains(coursename)){
            System.out.println("Nincs ilyen kurzus.");
        }
        else {
            timetable newtimetable = new timetable(coursename, newtimestamp);
            int index = super.timetables.indexOf(coursename);
            super.timetables.set(index, newtimetable);
        }
    }
}
