package chapter11_collections.task13;

public class GreenhouseControls extends Controller {

    private boolean ventilate = false;
    private boolean light = false;
    private boolean water = false;
    private String thermostat = "День";

    public class VentilateOn extends Event {

        public VentilateOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            ventilate = true;
        }

        public String toString() {
            return "Вентиляция включена";
        }
    }

    public class VentilateOff extends Event {

        public VentilateOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            ventilate = false;
        }

        public String toString() {
            return "Вентиляция отключена";
        }
    }

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = true;
        }

        public String toString() {
            return "Свет включен";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = false;
        }

        public String toString() {
            return "Свет выключен";
        }
    }

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = true;
        }

        public String toString() {
            return "Полив включен";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = false;
        }

        public String toString() {
            return "Полив выключен";
        }
    }

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        public void action() {
            thermostat = "Ночь";
        }

        public String toString() {
            return "Термостат использует ночной режим";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        public void action() {
            thermostat = "День";
        }

        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Бам!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event event : eventList)
                addEvent(event);
        }

        public void action() {
            for (Event event : eventList) {
                event.start();
                addEvent(event);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Перезапуск системы";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Отключение";
        }
    }

}
