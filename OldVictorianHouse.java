import java.util.ArrayList;
import java.util.Scanner;

/** A class that builds an old victorian house in which a player can make various decisions.  */
class OldVictorianHouse {

    /** Contains a list of all items picked up by the player */
    public static ArrayList<String> inventory = new ArrayList<String>();
    /** Provides a representation of how well a player is doing, and when it reaches zero the player dies and loses the game.  */
    public static int health = 3;

    /** Constructor */
    public OldVictorianHouse() {
    }
    
    /** Allows player to pick up an object
     * @param object the object to pick up and add to inventory
     */
    public void pickUp(String object) {
        inventory.add(object);
        System.out.println("The " + object + " has been added to your inventory.");
    }

    /** Allows player to use an object
     * @param object the object to use, as long as it is in the inventory
     */
    public void use(String object) {
        if (inventory.contains(object)) {
            System.out.println("You have used the " + object);
        }
        else {
            System.out.println("You cannot use the " + object + " because it is not in your inventory.");
        }
    }

    /** Provides an introduction to the game and its controls */
    private static void gameIntro() {
        System.out.println("Welcome to the Old Victorian House. Your objective in this game is to leave the house alive...good luck!");
        System.out.println("+ the game will present you with a scenario, then pause to let you type a command. Type one in all caps, then press enter, or if you would like to make no choice, simply press enter.");
        System.out.println("+ type OPTIONS for a list of possible commands");
        System.out.println("+ type STOP to end the game");
        System.out.println("You have just entered the house, and the front door slams behind you. Do you think it will open again?");
    }

    /** Decreases a player's health */
    private static void loseHealth(int n) {
        health = health - n;
    }

    /** Lists all possible commands that a player can type into the terminal */
    public static void commandList() {
        System.out.println("Possible commands include: ");
        System.out.println("+ PICK UP to pick up an item");
        System.out.println("+ OPEN to open a door");
        System.out.println("+ FIGHT to fight an opponent");
        System.out.println("+ RUN to run away from an opponent");
        System.out.println("+ JUMP to jump");
        System.out.println("+ USE to use an object in your inventory");
    }

    /** Provides a message when the game is over and the player has won */
    public static void winGame() {
        System.out.println("Congratulations, you have won the game! You survived with a health of " + health);
    }

    /** Provides a message when the game is over and the player has lost */
    public static void loseGame() {
        System.out.println("You're dead...too bad! You lose.");
    }

/** An interactive video game in which a player must make it out of an old victorian house alive */
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
        System.out.println("There's no one to fight right now.");
    }
    else if (frontDoor.equals("RUN")) {
        System.out.println("There's no one to run from right now");
    }
    else if (frontDoor.equals("PICK UP")) {
        System.out.println("There's nothing to pick up right now.");
    }
    else if (frontDoor.equals("JUMP")) {
        System.out.println("There's nowhere to jump right now.");
    }
    else if (frontDoor.equals("USE")) {
        System.out.println("There's nothing to use right now.");
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
    else if (firstKey.equals("OPEN")) {
        System.out.println("There's no door to open right now.");
    }
    else if (firstKey.equals("FIGHT")) {
        System.out.println("There's no one to fight right now.");
    }
    else if (firstKey.equals("RUN")) {
        System.out.println("There's nowhere to run right now");
    }
    else if (firstKey.equals("PICK UP")) {
        System.out.println("There's nothing to pick up right now.");
    }
    else if (firstKey.equals("JUMP")) {
        System.out.println("There's nowhere to jump right now.");
    }
    else if (firstKey.equals("USE")) {
        System.out.println("There's nothing to use right now.");
    }
    else if (firstKey.equals("OPTIONS")) {
        commandList();
    }
    else if (firstKey.equals("STOP")) {
       System.exit(0);
    }
    System.out.println("Ahead of you is a massive staircase that appears to continue on forever. You begin the long trek up the creaky old staircase. Along the way you notice many old, dusty portraits lining the walls. One of them seems to be looking right at you. The portrait is of a young girl in a white dress. Suddenly, you realise she's not in the frame anymore. She's floating right in front of your face.");
    String firstGhost = input.next();
    if (firstGhost.equals("FIGHT")) {
        System.out.println("Now come on. She's a ghost. How were you planning to win that fight? You swing at her, but your arm goes right through her torso. She laughs, and it echoes off the high ceilings. She looks at you and makes the slightest motion with her hand, and suddenly a force pushes you and you roll down the stairs, landing at the bottom.");
        loseHealth(2);
        System.out.println("You see the ghost laughing at the top of the stairs, then see her begin to come towards you. You struggle to your feet and run down the hallway, finding yourself in the kitchen. She follows you into the kitchen, and you're frozen, determining whether or not you should take her on again or continue running.");
        String firstGhost2 = input.next();
        if (firstGhost2.equals("FIGHT")) {
            System.out.println("You really want to take her on again? She flies towards you and through you, and suddenly everything goes black.");
            loseHealth(1);
            loseGame();
        }
        else if (firstGhost2.equals("RUN")) {
            System.out.println("Smart choice, you don't want to try that again. You turn and run straight, finding a door at the back of the kitchen and running through it, slamming it behind you. You manage to run away from the house.");
            winGame();
        }
        else if (firstGhost2.equals("JUMP")) {
            System.out.println("There's nowhere to jump right now.");
        }
        else if (firstGhost2.equals("OPEN")) {
            System.out.println("There's no door to open right now.");
        }
        else if (firstGhost2.equals("PICK UP")) {
            System.out.println("There's nothing to pick up right now.");
        }
        else if (firstGhost2.equals("USE")) {
            System.out.println("There's nothing to fight right now.");
        }
        else if (firstGhost2.equals("OPTIONS")) {
            commandList();
        }
        else if (firstGhost2.equals("STOP")) {
           System.exit(0);
        }


    }
    else if (firstGhost.equals("RUN")) {
        System.out.println("You definitely don't have the skills to win that fight. You turn and run up the rest of the stairs, arriving at the top to find a thick wooden door. You turn the handle to find that it's locked.");
        if (inventory.contains("flower key")) {
            System.out.println("You feel the key you picked up from the table downstairs in your pocket. Do you think it will work in this door?");
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
                            System.out.println("You open the window and jump out onto the ground below. It hurts your legs but you're able to stand and run away from the house.");
                            loseHealth(1);
                            winGame();
                        }
                        else if (window.equals("RUN")) {
                            System.out.println("You run out of the study and find the door to a balcony. You hear footsteps behind you, the person from the study must be chasing you. You step onto the balcony, realising your only choice is to jump to the ground below.");
                            String balcony1 = input.next();
                            if (balcony1.equals("JUMP")) {
                                System.out.println("You jump onto the ground below, and everything goes black.");
                                loseHealth(3);
                                loseGame();
                            }
                            else if (balcony1.equals("RUN")) {
                                System.out.println("There's nowhere to run right now");
                            }
                            else if (balcony1.equals("FIGHT")) {
                                System.out.println("There's no one to fight right now.");
                            }
                            else if (balcony1.equals("OPEN")) {
                                System.out.println("There's no door to open right now.");
                            }
                            else if (balcony1.equals("PICK UP")) {
                                System.out.println("There's nothing to pick up right now.");
                            }
                            else if (balcony1.equals("USE")) {
                                System.out.println("There's nothing to fight right now.");
                            }
                            else if (balcony1.equals("OPTIONS")) {
                                commandList();
                            }
                            else if (balcony1.equals("STOP")) {
                               System.exit(0);
                            }
                            
                        }
                        else if (window.equals("FIGHT")) {
                            System.out.println("There's no one to fight right now.");
                        }
                        else if (window.equals("OPEN")) {
                            System.out.println("There's no door to open right now.");
                        }
                        else if (window.equals("PICK UP")) {
                            System.out.println("There's nothing to pick up right now.");
                        }
                        else if (window.equals("USE")) {
                            System.out.println("There's nothing to fight right now.");
                        }
                        else if (window.equals("OPTIONS")) {
                            commandList();
                        }
                        else if (window.equals("STOP")) {
                           System.exit(0);
                        }

                        
                    }
                    else if (weapon.equals("FIGHT")) {
                        System.out.println("There's no one to fight right now.");
                    }
                    else if (weapon.equals("OPEN")) {
                        System.out.println("There's no door to open right now.");
                    }
                    else if (weapon.equals("RUN")) {
                        System.out.println("There's nowhere to run right now.");
                    }
                    else if (weapon.equals("JUMP")) {
                        System.out.println("There's nowhere to jump right now.");
                    }
                    else if (weapon.equals("USE")) {
                        System.out.println("There's nothing to fight right now.");
                    }
                    else if (weapon.equals("OPTIONS")) {
                        commandList();
                    }
                    else if (weapon.equals("STOP")) {
                       System.exit(0);
                    }
                    
                }
                else if (secondGhost.equals("PICK UP")) {
                    System.out.println("There's nothing to pick up right now.");
                }
                else if (secondGhost.equals("OPEN")) {
                    System.out.println("There's no door to open right now.");
                }
                else if (secondGhost.equals("RUN")) {
                    System.out.println("There's nowhere to run right now.");
                }
                else if (secondGhost.equals("JUMP")) {
                    System.out.println("There's nowhere to jump right now.");
                }
                else if (secondGhost.equals("USE")) {
                    System.out.println("There's nothing to use right now.");
                }
                else if (secondGhost.equals("OPTIONS")) {
                    commandList();
                }
                else if (secondGhost.equals("STOP")) {
                   System.exit(0);
                }
                
            }
            else if (useKey.equals("PICK UP")) {
                System.out.println("There's nothing to pick up right now.");
            }
            else if (useKey.equals("OPEN")) {
                System.out.println("There's no door to open right now.");
            }
            else if (useKey.equals("RUN")) {
                System.out.println("There's nowhere to run right now.");
            }
            else if (useKey.equals("JUMP")) {
                System.out.println("There's nowhere to jump right now.");
            }
            else if (useKey.equals("FIGHT")) {
                System.out.println("There's no one to fight right now.");
            }
            else if (useKey.equals("OPTIONS")) {
                commandList();
            }
            else if (useKey.equals("STOP")) {
               System.exit(0);
            }
            
        }
        else if (!inventory.contains("flower key")) {
            System.out.println("You don't have the key to this door. You hear footsteps coming towards you from the other side of the door, and hear someone begin to open the door. You find the door to a balcony and step outside, being chased by the person behind you. You realise your only option is to jump to the ground below.");
            String balcony2 = input.next();
            if (balcony2.equals("JUMP")) {
                System.out.println("You jump onto the ground below, and everything goes black.");
                loseHealth(2);
                loseGame();
            }
            else if (balcony2.equals("RUN")) {
                System.out.println("There's nowhere to run right now");
            }
            else if (balcony2.equals("FIGHT")) {
                System.out.println("There's no one to fight right now.");
            }
            else if (balcony2.equals("OPEN")) {
                System.out.println("There's no door to open right now.");
            }
            else if (balcony2.equals("PICK UP")) {
                System.out.println("There's nothing to pick up right now.");
            }
            else if (balcony2.equals("USE")) {
                System.out.println("There's nothing to fight right now.");
            }
            else if (balcony2.equals("OPTIONS")) {
                commandList();
            }
            else if (balcony2.equals("STOP")) {
               System.exit(0);
            }

        }
        }
        else if (firstGhost.equals("PICK UP")) {
            System.out.println("There's nothing to pick up right now.");
        }
        else if (firstGhost.equals("OPEN")) {
            System.out.println("There's no door to open right now.");
        }
        else if (firstGhost.equals("PICK UP")) {
            System.out.println("There's nothing to pick up right now.");
        }
        else if (firstGhost.equals("JUMP")) {
            System.out.println("There's nowhere to jump right now.");
        }
        else if (firstGhost.equals("USE")) {
            System.out.println("There's nothing to use right now.");
        }
        else if (firstGhost.equals("OPTIONS")) {
            commandList();
        }
        else if (firstGhost.equals("STOP")) {
           System.exit(0);
        }
        input.close();
    }
    

}



