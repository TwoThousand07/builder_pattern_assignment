public interface PCBuilder {
    PcBuilder setCpu(String model, int tdpWatts);

    PCBuilder setGpu(String model, int tdpWatts);

    PCBuilder setRam(int ramGB);

    PCBuilder setStorage(StorageType type, int capacityGB);

    PCBuilder setPsu(int watt);

    PCBuilder setCooler(CoolerType cooler);

    PCbuilder setCase(String caseName);

    PCBuild build();

}
