/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        

        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage. ");
        System.out.println("Arrow was able to do " + arrow.hit(armor) +
        " of damage due to an armor with "+ armor+ " points and it ignored 5 armor.");

        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage. ");
        System.out.println("Axe was able to do " + axe.hit(armor) +
                " of damage due to an armor with "+ armor+ " points.");


        Weapon magicStaff = WeaponFactory.getWeapon("magicStaff");
        System.out.println("MagicStaff has " + magicStaff.hit() + " of damage. ");
        System.out.println("MagicStaff was able to do " + magicStaff.hit(armor) +
                " of damage due to an armor with "+ armor+ " points and because it ignored 20% of armor.");

    }
}
