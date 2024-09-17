public class Main {
    public static void main (String[] args) {
        SchoolManagementApp attendanceAdapter = AdapterFactory.getAdapter ("attendance");
        SchoolManagementApp gradingAdapter = AdapterFactory.getAdapter ("grading");
        SchoolManagementApp libraryAdapter = AdapterFactory.getAdapter ("library");

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
        
    }
}