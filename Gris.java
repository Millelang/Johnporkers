
public class Gris {
    
    private String name;
    private int age;
    private double weight;
    private int color;
    private boolean fur;
    private String voice;
    private int bloodsugar;

   
    public Gris(String name, int age, double weight, int color, boolean fur, String voice, int bloodsugar) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.fur = fur;
        this.voice = voice;
        this.bloodsugar = bloodsugar;
    }
    
    public void oink() {
        System.out.println("Oink! Oink! i en" + voice + "ton");
    }

    
     Gris Johnpork = new Gris("Johnpork", 3, 12.5, 1, true, "grisig", 5);
   

    
    public void feed() {
        if (bloodsugar < 5) {
            System.out.println("Grisen " + name + " är hungrig och behöver matas");
        } else {
            System.out.println("Grisen " + name + " är mätt och behöver inte matas");
        }
}
}
