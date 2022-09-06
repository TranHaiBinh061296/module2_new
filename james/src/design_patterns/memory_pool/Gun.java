package design_patterns.memory_pool;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount=1000;

    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for(int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            plist.add(p);
            for(int j=0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if(pp.getPosition() == 10) {
                    pool.freeItem(pp);
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }

    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for(int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            plist.add(p);
            for(int j=0; j < plist.size(); j++) {
                Bullet pp=plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if(pp.getPosition() == 10) {
                    plist.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
