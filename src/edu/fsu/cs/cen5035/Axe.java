package edu.fsu.cs.cen5035;

/**
 * Created by Allouch on 9/20/2016.
 */
public class Axe extends BasicWeapon implements Weapon {

    public Axe(){super(60);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - armor;
        if (armor > 0 && armor < 20) {
            return DAMAGE;
        }else {
            return damage;
        }
    }
}
