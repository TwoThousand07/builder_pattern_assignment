public class OfficePCBuilder extends AbstractPCBuilder{
    private static final int MIN_RAM_GB = 8;
    private static final int PSU_WATT_MIN = 100;

    @Override
    protected String getLabel() {
        return "Office PC";
    }

    @Override
    public PCBuilder setCooler(CoolerType cooler) {
        if (cooler == CoolerType.LIQUID) {
            throw new UnsupportedOperationException(getLabel() + " only supports air cooling");
        }
        return super.setCooler(cooler);
    }

    @Override
    public PCBuild build() {
        if (cpuModel == null) {
            throw new IllegalStateException(getLabel() + " needs a CPU");
        }

        if (ramGB == null) {
            ramGB = MIN_RAM_GB;
        }

        int requiredPsu = cpuTdp + gpuTdp + PSU_WATT_MIN;
        if (psuWatt == null) {
            psuWatt = requiredPsu;
        }

        if (psuWatt < requiredPsu) {
            throw new IllegalStateException(getLabel() + " needs a PSU of at least " + requiredPsu + "W");
        }

        if (storageType == null) {
            storageType = StorageType.SDD;
            storageGB = 500;
        }

        if (cooler == null) {
            cooler = CoolerType.AIR;
        }

        if (caseName == null) {
            caseName = "Compact Micro ATX";
        }

        return new PCBuild(getLabel(), cpuModel, cpuTdp, gpuModel, gpuTdp,
                ramGB, storageType, storageGB, psuWatt, cooler, caseName);
    }
}
