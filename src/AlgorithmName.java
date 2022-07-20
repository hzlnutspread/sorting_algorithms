public enum AlgorithmName {

    BOGO("bogo"),
    BUBBLE("bubble"),
    INSERTION("insertion"),
    MERGE("merge"),
    QUICK("quick");

    private final String value;

    AlgorithmName(String value) {
        this.value = value;
    }

    public static AlgorithmName fromValue(String value) {
        for (AlgorithmName name : AlgorithmName.values()) {
            if (value.equals(name.value)) {
                return name;
            }
        }
        throw new IllegalArgumentException("Fuck you");
    }

}
