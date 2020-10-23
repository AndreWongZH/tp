package seedu.duke.ui;

import seedu.duke.common.Messages;
import seedu.duke.model.event.Event;

import java.util.ArrayList;

public class CalendarWeekRendererUtils {
    private final int[] numEventsCounter;

    public CalendarWeekRendererUtils(ArrayList<ArrayList<Event>> weekMasterList) {
        numEventsCounter = new int[7];
        this.numEventsCounter[0] = weekMasterList.get(0).size();
        this.numEventsCounter[1] = weekMasterList.get(1).size();
        this.numEventsCounter[2] = weekMasterList.get(2).size();
        this.numEventsCounter[3] = weekMasterList.get(3).size();
        this.numEventsCounter[4] = weekMasterList.get(4).size();
        this.numEventsCounter[5] = weekMasterList.get(5).size();
        this.numEventsCounter[6] = weekMasterList.get(6).size();
    }

    public void reduceCounter(int counterIndex) {
        numEventsCounter[counterIndex]--;
    }

    public int getCounter(int counterIndex) {
        return numEventsCounter[counterIndex];
    }

    public boolean isThereNothingLeftToPrint() {
        return numEventsCounter[0] == 0 && numEventsCounter[1] == 0 && numEventsCounter[2] == 0
                && numEventsCounter[3] == 0 && numEventsCounter[4] == 0 && numEventsCounter[5] == 0
                && numEventsCounter[6] == 0;
    }

    public String getDayLabel(int num) {
        switch(num) {
        case 0:
            return Messages.MESSAGE_MONDAY_LABEL;
        case 1:
            return Messages.MESSAGE_TUESDAY_LABEL;
        case 2:
            return Messages.MESSAGE_WEDNESDAY_LABEL;
        case 3:
            return Messages.MESSAGE_THURSDAY_LABEL;
        case 4:
            return Messages.MESSAGE_FRIDAY_LABEL;
        case 5:
            return Messages.MESSAGE_SATURDAY_LABEL;
        case 6:
            return Messages.MESSAGE_SUNDAY_LABEL;
        }

        return null;
    }
}
