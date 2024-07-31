// Player class
    class Player
    {
        String name;
        int health;
        int attack;

        Player(String name)
        {
            this.name = name;
            health = 100;
            attack = 20;
        }

        void attack(Enemies enemy)
        {
            enemy.health -= attack;
            System.out.println(name + " attacks " + enemy.name + " for " + attack + " damage.");
        }
    }

    // Enemies class
    class Enemies
    {
        String name;
        int health;
        int attack;

        Enemies(String name)
        {
            this.name = name;
            health = 50;
            attack = 15;
        }

        void attack(Player player)
        {
            player.health -= attack;
            System.out.println(name + " attacks " + player.name + " for " + attack + " damage.");
        }
    }

    // Items class
    class Items
    {
        String name;
        int healthBoost;

        Items(String name, int healthBoost)
        {
            this.name = name;
            this.healthBoost = healthBoost;
        }

        void use(Player player)
        {
            player.health += healthBoost;
            System.out.println(player.name + " uses " + name + " to gain " + healthBoost + " health.");
        }
    }

    // GameWorld class
    class GameWorld
    {
        Player player;
        Enemies enemy;
        Items item;

        GameWorld()
        {
            player = new Player("Hero");
            enemy = new Enemies("Monster");
            item = new Items("Health Potion", 20);
        }

        void startGame()
        {

            while (player.health > 0 && enemy.health > 0)
            {
                System.out.println("Player Health: " + player.health);
                System.out.println("Enemy Health: " + enemy.health);
                System.out.println("1. Attack Enemy");
                System.out.println("2. Use Item");
                System.out.print("Choose an action: ");
                int action = Integer.parseInt(System.console().readLine());
                switch (action)
                {
                    case 1:
                        player.attack(enemy);
                        if (enemy.health > 0)
                        {
                            enemy.attack(player);
                        }
                        break;
                    case 2:
                        item.use(player);
                        break;
                }
            }
            if (player.health > 0)
            {
                System.out.println("Player wins!");
            } else
            {
                System.out.println("Enemy wins!");
            }
        }
    }



