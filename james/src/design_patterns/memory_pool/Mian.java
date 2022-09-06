package design_patterns.memory_pool;

public class Mian {
    public static void main(String[] args) {
//        Gun gun=new Gun();
//        System.out.println("Start");
//        gun.fire();
//        System.out.println("Game over");
//        System.out.println("Tocal bullet created: " + Bullet.count);

        Gun gun=new Gun();
        System.out.println("Start");
        gun.fireInPool();
        System.out.println("Game over");
        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}
