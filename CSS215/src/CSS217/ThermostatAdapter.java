package CSS217;

public class ThermostatAdapter  implements SmartDevice{

    LegacyThermostat legacyThermostat =  new LegacyThermostat();
    @Override
    public void turnOn() {
        legacyThermostat.rotateDial("MAX");
    }

    @Override
    public void turnOff() {
        legacyThermostat.rotateDial("IDLE");
    }

    @Override
    public boolean isOn() {
        String s =legacyThermostat.checkDial();
        if(s.equals("IDLE")){
            return false;
        }
        return true;
    }

    @Override
    public int getPowerPercent() {
        String s =legacyThermostat.checkDial();
        if(s.equals("IDLE")){
            return 0;
        } else if (s.equals("LOW")) {
            return 30;
        }else if (s.equals("MEDIUM")) {
            return 70;
        }
        return 100;

    }
}
