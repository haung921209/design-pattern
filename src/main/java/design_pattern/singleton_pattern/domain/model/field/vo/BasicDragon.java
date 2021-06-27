package design_pattern.singleton_pattern.domain.model.field.vo;

import design_pattern.singleton_pattern.domain.model.maincharacter.MainCharacter;
import jdk.jfr.internal.tool.Main;
import lombok.Getter;

@Getter
public class BasicDragon extends BasicEnemy{

    private long healthPoint;
    private long attackPoint;

    public static long ADDITIONAL_ATTACK_POINT = 20;

    public BasicDragon(){
        this.attackPoint = 500;
        this.healthPoint = 200;
    }

    public void fight(){
        MainCharacter mainCharacter = MainCharacter.getInstance();
        mainCharacter.fight(this);
        this.healthPoint -= (mainCharacter.getAttackPower() + ADDITIONAL_ATTACK_POINT);
    }


}
