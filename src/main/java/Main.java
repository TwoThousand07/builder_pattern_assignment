public class Main {
    public static void main(String[] args) {
        PCDirector director = new PCDirector();

        PCBuild gamingRig = director.buildGamingRig(new GamingPCBuilder());
        System.out.println(gamingRig);
        System.out.println();

        PCBuild officePC = director.buildOfficePC(new OfficePCBuilder());
        System.out.println(officePC);
        System.out.println();


        PCBuild customGamingPC = new GamingPCBuilder()
                .setCpu("Core i9-14900K", 125)
                .setGpu("RTX 5090", 400)
                .setRam(32)
                .setStorage(StorageType.NVME, 2000)
                .build();
        System.out.println(customGamingPC);
        System.out.println();

        try {
            new GamingPCBuilder()
                    .setCpu("Ryzen 5 7600", 65)
                    .setRam(16)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Gaming PC rejected: " + e.getMessage());
        }

        try {
            new OfficePCBuilder().setCooler(CoolerType.LIQUID);
        } catch (UnsupportedOperationException e) {
            System.out.println("Office PC Rejected: " + e.getMessage());
        }
    }
}