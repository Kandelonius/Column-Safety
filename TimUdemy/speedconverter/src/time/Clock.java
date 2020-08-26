package time;

class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.minutes < 59) {
            this.minutes += 1;
        } else if (this.hours < 12) {
            this.minutes = 0;
            this.hours += 1;
        } else {
            this.minutes = 0;
            this.hours = 1;
        }
    }
}
