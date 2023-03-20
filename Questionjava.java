package Lab;

	// Interface for game items
	interface GameItem {
	    void use();
	}

	// Abstract class for game characters
	abstract class GameCharacter {
	    String name;
	    int health;
	    
	    public GameCharacter(String name) {
	        this.name = name;
	        this.health = 100;
	    }
	    
	    public abstract void attack(GameCharacter target);
	    
	    public void takeDamage(int damage) {
	        this.health -= damage;
	        if (this.health <= 0) {
	            System.out.println(this.name + " has been defeated.");
	        }
	    }
	    
	    public void useItem(GameItem item) {
	        item.use();
	    }
	}

	// Concrete class for player character
	class PlayerCharacter extends GameCharacter {
	    int level;
	    
	    public PlayerCharacter(String name) {
	        super(name);
	        this.level = 1;
	    }
	    
	    public void levelUp() {
	        this.level++;
	        System.out.println(this.name + " has reached level " + this.level + "!");
	    }
	    
	    @Override
	    public void attack(GameCharacter target) {
	        System.out.println(this.name + " attacks " + target.name + "!");
	        target.takeDamage(10);
	    }
	}

	// Concrete class for enemy character
	class EnemyCharacter extends GameCharacter {
	    public EnemyCharacter(String name) {
	        super(name);
	    }
	    
	    @Override
	    public void attack(GameCharacter target) {
	        System.out.println(this.name + " attacks " + target.name + "!");
	        target.takeDamage(5);
	    }
	}

	// Concrete class for healing item
	class HealingItem implements GameItem {
	    @Override
	    public void use() {
	        System.out.println("You use a healing item and regain some health.");
	    }
	}

	public class Questionjava {
	    public static void main(String[] args) {
	        PlayerCharacter player = new PlayerCharacter("Player");
	        EnemyCharacter enemy = new EnemyCharacter("Enemy");
	        HealingItem healingItem = new HealingItem();
	        
	        player.attack(enemy);
	        enemy.attack(player);
	        player.useItem(healingItem);
	        player.levelUp();
	    }
	}


