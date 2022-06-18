public class Pair {
    private String key;
    private String value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println(key + " " + value);
    }

    public static void main(String[] args) {
        Pair p = new Pair();
        p.setKey("Today is");
        p.setValue(String.valueOf(new java.util.Date()));
        p.print();
    }
}