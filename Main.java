public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("001", "Player 1");
        Player p2 = new Player("002", "Player 2");

        Warrior Eugiene = new Warrior("GS001", "Eugiene_Thor", 4, "Sword", "Chainmail");
        Mage Eva = new Mage("EF001", "Eva_Fairy", 1, "Wind");
        Rogue Naruto = new Rogue("DW001", "Sasuke Lover", 10, 15, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "A spinning attack that can hit several enemies at once");
        Skill dualWielding = new Skill("Dual Wielding",
                "The technique of using two weapons, one in each hand for training or combat");
        Skill frostNova = new Skill("Forst Nova",
                " Hits every enemy in a area around the Caster with a Ice Element frost attack");
        Skill lockpicking = new Skill("Lockpicking", "Used to open mechanical locks on doors and containers");

       Eugiene.setSkill(whirlwindSlash);
       Eugiene.setSkill(dualWielding);
        Eva.setSkill(frostNova);
        Naruto.setSkill(lockpicking);

        p1.setCharacter(Eugiene);
        p1.setCharacter(Eva);
        p2.setCharacter(Naruto);

        System.out.println();
       Eugiene.chargeAttack(Naruto);
        Eva.castElementalSpell("Teleportation");
        Naruto.stab(Naruto);
        Eugiene.shieldBlock();
        Naruto.evade();

        System.out.println();
        System.out.println(Eugiene);
        System.out.println();
        System.out.println(Eva);
        System.out.println();
        System.out.println(Naruto);
    }
}
