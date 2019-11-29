public class LambdaDemo {
    public static void main(String[] args) {

        System.out.println("Imperative way..little old way of coding.");

        Game footBall = new Game() {
            @Override
            public void play() {
                System.out.println("I am playing dumb..");
            }
        };
        footBall.play();

        System.out.println("Functional way..new way of coding.");

        Game soccer = () -> System.out.println("I am playing new dumb..");
        soccer.play();
    }
}
