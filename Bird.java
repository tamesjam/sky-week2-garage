public class Bird implements Flyable{
    private String name;
    private String colour;
    private boolean isVicious;

    public Bird(String name, String colour, boolean isVicious) {
        this.name = name;
        this.colour = colour;
        this.isVicious = isVicious;
    }

    public void fly() {
        System.out.println("I am a flying bird!");
    }
}
