public class AdapterFactory {
    public static SchoolManagementApp getAdapter(String systemType) {
            switch (systemType) {
                case "attendance":
                    return new AttendanceSystemAdapter (new AttendanceSystem());
                case "grading":
                    return new GradingSystemAdapter (new GradingSystem());
                case "library":
                    return new LibrarySystemAdapter (new LibrarySystem());
                default: 
                    throw new IllegalArgumentException ("Unknown system type");
            }
    }
}