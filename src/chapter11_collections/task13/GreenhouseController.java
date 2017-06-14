package chapter11_collections.task13;

public class GreenhouseController {

    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(9_000_000_000L));

        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(2_000_000_000L),
                gc.new LightOff(4_000_000_000L),
                gc.new VentilateOn(6_000_000_000L),
                gc.new VentilateOff(8_000_000_000L),
                gc.new WaterOn(10_000_000_000L),
                gc.new WaterOff(12_000_000_000L),
                gc.new ThermostatDay(18_000_000_000L),
        };

        gc.addEvent(gc.new Restart(20_000_000_000L, eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));

        gc.run();
    }
}
