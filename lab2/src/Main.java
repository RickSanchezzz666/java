public class Main {
    public static void main(String[] args) {
        var sailingVessel = new SailingVessel();
        var submarine = new Submarine();

        sailingVessel.PrepareToMovement();
        sailingVessel.Move();

        submarine.PrepareToMovement();
        submarine.Move();
    }
}