package design_pattern.singleton_pattern.domain.model.maincharacter;

import design_pattern.singleton_pattern.domain.model.field.vo.BasicEnemy;
import design_pattern.singleton_pattern.domain.model.maincharacter.code.CharacterStatus;
import design_pattern.singleton_pattern.domain.model.town.Bank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainCharacter {

    private String name;
    private long healthPoint;
    private CharacterStatus characterStatus;
    private long attackPower;
    private int money;
    private Bank bank;

    private static MainCharacter mainCharacterInstance;

    private MainCharacter(){
        this.characterStatus = CharacterStatus.CREATING;
    }
    public static MainCharacter getInstance(){
        if(mainCharacterInstance == null) {
            synchronized (MainCharacter.class) {
                if (mainCharacterInstance == null) {
                    mainCharacterInstance = new MainCharacter();
                }
            }
        }
        return mainCharacterInstance;
    }

    public void setBasicStatus(){
        this.healthPoint = 200l;
        this.attackPower = 50;
        this.money = 50;
        this.bank = Bank.getBank();
    }

    public void setAlive(){
        this.characterStatus = CharacterStatus.ALIVE;
    }

    public boolean isAlive(){
        return this.characterStatus == CharacterStatus.ALIVE;
    }

    public void fight(BasicEnemy basicEnemy){
        this.healthPoint -= basicEnemy.getAttackPoint();
        if(healthPoint<=0){
            this.characterStatus = CharacterStatus.DEAD;
            this.healthPoint = 0;
        }

    }

}
