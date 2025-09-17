import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;

class AppointmentScheduler {

    private static final DateTimeFormatter SCHEDULE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, uuuu, 'at' h:mm a.");

    private static final int AFTERNOON_START_HOUR = 12;
    private static final int AFTERNOON_END_HOUR = 18;
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, SCHEDULE_FORMATTER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        
        return hour >= AFTERNOON_START_HOUR  && hour < AFTERNOON_END_HOUR;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return appointmentDate.format(DESCRIPTION_FORMATTER);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
    }
}
