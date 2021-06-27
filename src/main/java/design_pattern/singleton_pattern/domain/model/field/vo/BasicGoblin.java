package design_pattern.singleton_pattern.domain.model.field.vo;

import design_pattern.singleton_pattern.domain.model.maincharacter.MainCharacter;
import lombok.Getter;

@Getter
public class BasicGoblin extends BasicEnemy {

    private long healthPoint;
    private long attackPoint;

    public BasicGoblin(){
        this.healthPoint = 30;
        this.attackPoint = 5;
    }
    public void fight(){
        MainCharacter mainCharacter = MainCharacter.getInstance();
        mainCharacter.fight(this);
        this.healthPoint -= mainCharacter.getAttackPower();
    }

}
