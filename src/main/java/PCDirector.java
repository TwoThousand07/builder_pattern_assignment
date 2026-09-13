public class PCDirector {

    public PCBuild buildGamingRig(PCBuilder builder) {
        return builder
                .setCpu("Ryzen 5 7600", 65)
                .setGpu("RTX 4060", 115)
                .setRam(16)
                .build();
    }

    public PCBuild buildOfficePC(PCBuilder builder) {
        return builder
                .setCpu("Core i3-13100", 60)
                .setCase("Slim Desktop")
                .build();
    }
}
