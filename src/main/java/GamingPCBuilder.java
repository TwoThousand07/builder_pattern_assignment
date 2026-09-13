public class GamingPCBuilder extends AbstractPCBuilder{
    private static final int MIN_RAM_GB = 16;
    private static final int PSU_WATT_MIN = 150;

    @Override
    protected String getLabel() {
        return "Gaming PC";
    }

    @Override
    public PCBuild build() {
        if (cpuModel == null) {
            throw new IllegalStateException(getLabel() + "needs a CPU");
        }

        if (gpuModel == null) {
            throw new IllegalStateException(getLabel() + " needs a dedicated GPU");
        }

        if (ramGB == null) {
            ramGB = MIN_RAM_GB;
        }

        if (ramGB < MIN_RAM_GB) {
            throw new IllegalStateException(getLabel() + " needs at least " + MIN_RAM_GB + "GB of RAM");
        }

        int requiredPsu = cpuTdp + gpuTdp + PSU_WATT_MIN;

        if (psuWatt == null) {
            psuWatt = requiredPsu;
        }

        if (psuWatt < requiredPsu) {
            throw new IllegalStateException(getLabel() + " needs a PSU of at least " + requiredPsu + "W");
        }

        if (storageType == null) {
            storageType = StorageType.NVME;
            storageGB = 1000;
        }

        if (cooler == null) {
            cooler = CoolerType.AIR;
        }

        if (caseName == null) {
            caseName = "Mid Tower ATX";
        }

        return new PCBuild(getLabel(), cpuModel, cpuTdp, gpuModel, gpuTdp,
                ramGB, storageType, storageGB, psuWatt, cooler, caseName);
    }
}
