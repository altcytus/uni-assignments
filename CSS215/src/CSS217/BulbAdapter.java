package CSS217;

public class BulbAdapter implements SmartDevice {
    LegacyBulb legacyBulb = new LegacyBulb();

    @Override
    public void turnOn() {
        legacyBulb.setBrightness(100);
    }

    @Override
    public void turnOff() {
        legacyBulb.setBrightness(0);
    }

    @Override
    public boolean isOn() {
        return legacyBulb.hasPower();
    }

    @Override
    public int getPowerPercent() {
        int p = legacyBulb.readBrightness();
        return (int) Math.round(((double) p / 255.0) * 100);
    }
}