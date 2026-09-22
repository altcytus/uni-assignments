package CSS217.LECTURE1;
public class ThermostatAdapter implements SmartDevice {
    private final LegacyThermostat thermostat;

    public ThermostatAdapter(LegacyThermostat thermostat) {
        if (thermostat == null) {
            throw new IllegalArgumentException("LegacyThermostat instance cannot be null");
        }
        this.thermostat = thermostat;
    }

    @Override
    public void turnOn() {
        String state = thermostat.checkDial();
        if ("IDLE".equals(state)) {
            thermostat.rotateDial("LOW");
        }
        // Idempotent for 'LOW', 'MEDIUM', 'MAX'
    }

    @Override
    public void turnOff() {
        thermostat.rotateDial("IDLE");
    }

    @Override
    public boolean isOn() {
        String state = thermostat.checkDial();
        if (state == null) return false; // Fault Scenario B safeguard
        switch (state) {
            case "LOW":
            case "MEDIUM":
            case "MAX":
                return true;
            default:
                return false; // Covers 'STUCK', 'OVERHEAT', '', etc.
        }
    }

    @Override
    public int getPowerPercent() {
        String state = thermostat.checkDial();
        if (state == null) return -1; // Fault Scenario B: null dial state
        switch (state) {
            case "IDLE": return 0;
            case "LOW": return 33;
            case "MEDIUM": return 66;
            case "MAX": return 100;
            default: return -1; // Fault Scenario B: corrupted/illegal string sentinel
        }
    }
}