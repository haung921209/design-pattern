package design_pattern.singleton_pattern.domain.model.field;

import design_pattern.singleton_pattern.domain.model.field.vo.BasicDragon;
import design_pattern.singleton_pattern.domain.model.field.vo.BasicEnemy;
import design_pattern.singleton_pattern.domain.model.maincharacter.MainCharacter;
import design_pattern.singleton_pattern.domain.model.field.vo.BasicGoblin;

public class BasicField {

    MainCharacter mainCharacter = MainCharacter.getInstance();

    public BasicField () {

    }

    public void huntGoblin(){
        BasicGoblin basicGoblin = new BasicGoblin();
        huntEnemy(basicGoblin);
    }

    public void huntDragon(){
        BasicDragon basicDragon = new BasicDragon();
        huntEnemy(basicDragon);
    }

    public void huntEnemy(BasicEnemy basicEnemy){
        boolean flag = true;

        while(flag){
            if(!mainCharacter.isAlive()){
                break;
            }
            basicEnemy.fight();
        }
    }
}
