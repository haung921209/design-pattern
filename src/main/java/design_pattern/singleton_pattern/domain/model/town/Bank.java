package design_pattern.singleton_pattern.domain.model.town;

import design_pattern.singleton_pattern.domain.model.maincharacter.MainCharacter;
import lombok.Setter;

public class Bank {
    @Setter
    private long remainders;
    private static Bank bankInstance;

    private Bank(){
        this.remainders = 50l;
    }

    public static Bank getBank() {
        if (bankInstance == null) {
            synchronized (MainCharacter.class) {
                if (bankInstance == null) {
                    bankInstance = new Bank();
                }
            }
        }
        return bankInstance;
    }

}
