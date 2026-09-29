# 1. Verify all 7 files reside in the working directory:
#    Provided: SmartDevice.java, LegacyBulb.java, LegacyThermostat.java, ModernHub.java
#    Authored: BulbAdapter.java, ThermostatAdapter.java, Main.java

# 2. Compile all sources into an output bin directory:
mkdir -p bin
javac -d bin *.java

# 3. Execute the integration test driver:
java -cp bin Main
