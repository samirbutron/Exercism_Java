import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Gigasecond {
    private LocalDateTime moment;
    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plusSeconds((long) 1e9); //Debido a la notacion cientifica es necesario hacer una conversion a long o expresarlo integralmente

    }
}
