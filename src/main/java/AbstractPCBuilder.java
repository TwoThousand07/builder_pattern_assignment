public abstract class AbstractPCBuilder implements  PCBuilder{

    protected String cpuModel;
    protected int cpuTdp;
    protected String gpuModel;
    protected int gpuTdp;
    protected Integer ramGB;
    protected StorageType storageType;
    protected int storageGB;
    protected Integer psuWatt;
    protected CoolerType cooler;
    protected String caseName;

    @Override
    public PCBuilder setCpu(String model, int tdpWatts) {
        this.cpuModel = model;
        this.cpuTdp = tdpWatts;
        return this;
    }

    @Override
    public PCBuilder setGpu(String model, int tdpWatts) {
        this.gpuModel = model;
        this.gpuTdp = tdpWatts;
        return this;
    }

    @Override
    public PCBuilder setRam(int ramGb) {
        this.ramGB = ramGb;
        return this;
    }

    @Override
    public PCBuilder setStorage(StorageType type, int capacityGB) {
        this.storageType = type;
        this.storageGB = capacityGB;
        return this;
    }

    @Override
    public PCBuilder setPsu(int watt) {
        this.psuWatt = watt;
        return this;
    }

    @Override
    public PCBuilder setCooler(CoolerType cooler) {
        this.cooler = cooler;
        return this;
    }

    @Override
    public PCBuilder setCase(String caseName) {
        this.caseName = caseName;
        return this;
    }

    protected abstract String getLabel();
}
