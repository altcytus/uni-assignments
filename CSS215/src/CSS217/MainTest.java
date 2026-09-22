package CSS217;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        SmartDevice bulb = new BulbAdapter();
        SmartDevice thermostat = new ThermostatAdapter();

        List<SmartDevice> deviceList = new ArrayList<>();
        deviceList.add(bulb);
        deviceList.add(thermostat);

        ModernHub hub = new ModernHub(deviceList);


        System.out.println("Initial Average Power: " + hub.calculateAveragePowerUsage() + "%");
        System.out.println("Polymorphism");
        hub.activateAll();
        for (SmartDevice device : deviceList) {
            System.out.println(device.getClass().getSimpleName() +
                    " " + device.isOn() +
                    ", Power: " + device.getPowerPercent() + "%");
        }
        System.out.println("Average Power: " + hub.calculateAveragePowerUsage() + "%");


        System.out.println("Testing Hardware Fault");

        ((BulbAdapter) bulb).legacyBulb.breakFilament();
        System.out.println("After filament break: " + bulb.isOn());
        System.out.println("Average Power After Fault: " + hub.calculateAveragePowerUsage() + "%");

        System.out.println("Emergency Shutdown");
        hub.emergencyShutdown();
        for (SmartDevice device : deviceList) {
            System.out.println(device.getClass().getSimpleName() +
                    " " + device.isOn() +
                    ", Power: " + device.getPowerPercent() + "%");
        }
        System.out.println("Average Power After Emergency Shutdown: " + hub.calculateAveragePowerUsage() + "%");
    }
}