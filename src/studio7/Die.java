package studio7;

public class Die {
    int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (int) (Math.random() * sides) + 1; 
    }

    public String toString() {
        return "Die sides = " + sides;
    }

    public static void main(String[] args) {
        Die d6 = new Die(6);
        System.out.println(d6);
        
        int result = d6.roll();
        System.out.println("Roll result: " + result);
    }
}