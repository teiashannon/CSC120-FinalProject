import java.util.ArrayList;
import java.util.Scanner;

class OldVictorianHouse {

    public static ArrayList<String> inventory = new ArrayList<String>();
    public static int health = 3;

    public OldVictorianHouse() {
    }
    
    public void pickUp(String object) {
        inventory.add(object);
        System.out.println("The " + object + " has been added to your inventory.");
    }
    public void putDown(String object) {
        if (inventory.contains(object)) {
            inventory.remove(object);
            System.out.println("The " + object + " has been removed from your inventory.");
        }
        else {
            System.out.println("The " + object + " is not in your inventory, so you can't remove it.");
        }
    }
    public void use(String object) {
        if (inventory.contains(object)) {
            System.out.println("You have used the " + object);
        }
        else {
            System.out.println("You cannot use the " + object + " because it is not in your inventory.");
        }
    }
    private static void gameIntro() {
        System.out.println("Welcome to the Old Victorian House. Your objective in this game is to leave the house alive...good luck!");
        System.out.println("+ the game will present you with a scenario, then pause to let you type a command. Type one in all caps, then press enter, or if you would like to make no choice, simply press enter.");
        System.out.println("+ type OPTIONS for a list of possible commands");
        System.out.println("+ type STOP to end the game");
        System.out.println("You have just entered the house, and the front door slams behind you. Do you think it will open again?");
    }
    private static void loseHealth() {
        health = health - 1;
    }
    public static void commandList() {
        System.out.println("Possible commands include: ");
        System.out.println("+ PICK UP to pick up an item");
        System.out.println("+ OPEN to open a door");
        System.out.println("+ FIGHT to fight an opponent");
        System.out.println("+ RUN to run away from an opponent");
    }


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    input.useDelimiter(System.lineSeparator());
    OldVictorianHouse House = new OldVictorianHouse();
    gameIntro();
    String frontDoor = input.next();
    if (frontDoor.equals("OPEN")) {
        System.out.println("You pull on the door, but it's stuck. Or is it locked? The better question is, did you really think it would be that easy to leave? Funny.");
    }
    else if (frontDoor.equals("FIGHT")) {
        System.out.println("Sorry, there's no one to fight right now.");
    }
    else if (frontDoor.equals("RUN")) {
        System.out.println("Sorry, there's no one to run from right now");
    }
    else if (frontDoor.equals("PICK UP")) {
        System.out.println("Sorry, there's nothing to pick up right now.");
    }
    else if (frontDoor.equals("OPTIONS")) {
        commandList();
    }
    else if (frontDoor.equals("STOP")) {
       System.exit(0);
    }
    System.out.println("You continue into the main entryway of the house. In front of you is a circular, wooden table with a vase of long-dead flowers sitting in the middle. There's also a key on a red ribbon sitting next to the vase.");
    String firstKey = input.next();
    if (firstKey.equals("PICK UP")) {
        House.pickUp("flower key");
    }
    System.out.println("Ahead of you is a massive staircase that appears to continue on forever. You begin the long trek up the creaky old staircase. Along the way you notice many old, dusty portraits lining the walls. One of them seems to be looking right at you. The portrait is of a young girl in a white dress. Suddenly, you realise she's not in the frame anymore. She's floating right in front of your face.");
    String firstGhost = input.next();
    if (firstGhost.equals("FIGHT")) {
        System.out.println("Now come on. She's a ghost. How were you planning to win that fight? You swing at her, but your arm goes right through her torso. She laughs, and it echoes off the high ceilings. She looks at you and makes the slightest motion with her hand, and suddenly a force pushes you and you roll down the stairs, landing at the bottom.");
        loseHealth();
    }
            
    else if (firstGhost.equals("RUN")) {
        System.out.println("You definitely don't have the skills to win that fight. You turn and run up the rest of the stairs, arriving at the top to find a thick wooden door.");
        if (inventory.contains("flower key")) {
            System.out.println("You feel the key you picked up from the table downstairs in your pocket.");
            String useKey = input.next();
            if (useKey.equals("USE")) {
                System.out.println("You try the key in the lock, and it turns. You open the door slowly to find a study, covered in dust and cobwebs. The desk light, a lamp with a green glass shade, is on. There appears to be a figure standing by the window, outlined by the green light. You can make out the shape enough to tell that it's a real person this time, not a ghost.");
                String secondGhost = input.next();
                if (secondGhost.equals("FIGHT")) {
                    System.out.println("You have the advantage of coming up on them from behind, so you scan the room for potential self-defense weapons. You see a metal bust of some old man sitting on one of the bookshelves.");
                    String weapon = input.next();
                    if (weapon.equals("PICK UP")) {
                        System.out.println("Picking up the bust as quietly as you can, you sneak up on the figure. Quickly, you hit them over the head with the bust, causing them to fall to the floor immediately. Realising you're not sure how much time you've bought, you glance at the large, hinged window on the wall in front of you. You realise you can fit through it, and it doesn't appear to be too high off the ground.");
                        String window = input.next();
                        if (window.equals("JUMP")) {
                            
                        }
                        
                    }
                }
            }
        }
    }
    else if (frontDoor.equals("PICK UP")) {
        System.out.println("Sorry, there's nothing to pick up right now.");
    }
    else if (frontDoor.equals("OPTIONS")) {
        commandList();
    }
    else if (frontDoor.equals("STOP")) {
        System.exit(0);
    }
    input.close();
}

}

