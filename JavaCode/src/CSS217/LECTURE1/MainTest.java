package CSS217.LECTURE1;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        LegacyBulb rawBulb = new LegacyBulb();

        LegacyBulb legacyBulb = new LegacyBulb();
        LegacyThermostat legacyThermostat = new LegacyThermostat();

        SmartDevice bulbAdapter = new BulbAdapter(legacyBulb);
        SmartDevice thermostatAdapter = new ThermostatAdapter(legacyThermostat);

        List<SmartDevice> deviceList = List.of(bulbAdapter, thermostatAdapter);
        ModernHub hub = new ModernHub(deviceList);

        System.out.println("=== 3. Polymorphic Activation");
        hub.activateAll();
        System.out.println("Bulb isOn: " + bulbAdapter.isOn() + ", Power: " + bulbAdapter.getPowerPercent() + "%");
        System.out.println("Thermostat isOn: " + thermostatAdapter.isOn() + ", Power: " + thermostatAdapter.getPowerPercent() + "%");

        System.out.println("=== 4. Average Power Usage Calculation ===");
        double avgPower = hub.calculateAveragePowerUsage();
        System.out.println("Hub Average Power (with K seed offset): " + avgPower + "%");

        System.out.println("=== 5. Emergency Shutdown Verification ===");
        hub.emergencyShutdown();
        System.out.println("After emergency shutdown -> Bulb isOn: " + bulbAdapter.isOn() +
                ", Power: " + bulbAdapter.getPowerPercent() + "% (Raw brightness: " + legacyBulb.readBrightness() + ")");
        System.out.println("After emergency shutdown -> Thermostat isOn: " + thermostatAdapter.isOn() +
                ", Power: " + thermostatAdapter.getPowerPercent() + "% (Dial state: " + legacyThermostat.checkDial() + ")");

        System.out.println("=== 6. Fault Injection & Defensive Testing ===");
        legacyBulb.breakFilament();
        legacyThermostat.rotateDial("STUCK");
        System.out.println("Broken Bulb -> isOn: " + bulbAdapter.isOn() + ", Power: " + bulbAdapter.getPowerPercent() + "%");
        System.out.println("Corrupted Dial -> isOn: " + thermostatAdapter.isOn() + ", Power: " + thermostatAdapter.getPowerPercent() + "%");
    }
}