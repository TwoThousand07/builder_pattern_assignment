public class PCBuild {
    private final String label;
    private final String cpuModel;
    private final int cpuTdp;
    private final String gpuModel;
    private final int gpuTdp;
    private final int ramGb;
    private final StorageType storageType;
    private final int storageGb;
    private final int psuWatt;
    private final CoolerType cooler;
    private final String caseName;

    PCBuild(String label, String cpuModel, int cpuTdp, String gpuModel, int gpuTdp,
            int ramGb, StorageType storageType, int storageGb, int psuWatt, CoolerType cooler, String caseName) {
        this.label = label;
        this.cpuModel = cpuModel;
        this.cpuTdp = cpuTdp;
        this.gpuModel = gpuModel;
        this.gpuTdp = gpuTdp;
        this.ramGb = ramGb;
        this.storageType = storageType;
        this.storageGb = storageGb;
        this.psuWatt = psuWatt;
        this.cooler = cooler;
        this.caseName = caseName;
    }

    @Override
    public String toString() {
        String gpuinfo = gpuModel == null ? "integrated graphics" : gpuModel + " (" + gpuTdp + "W)";
        return label + " [" + caseName + "]\n"
                + " CPU: " + cpuModel + " (" + cpuTdp + "W)\n"
                + " GPU: " + gpuinfo + "\n"
                + " RAM: " + ramGb + "GB\n"
                + "Storage: " + storageType + " " + storageGb + "GB\n"
                + " PSU: " + psuWatt + "W\n"
                + " Cooler: " + cooler;
    }
}
