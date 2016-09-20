package edu.fsu.cs.cen5035;

/**
 * Created by Allouch on 9/20/2016.
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    public MagicStaff(){super(80);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int armorIgnored = (int) (armor * 0.2);
        int damage = DAMAGE + armorIgnored - armor;

        if(damage < 0)
            damage = 0;

        return damage;
    }
}
