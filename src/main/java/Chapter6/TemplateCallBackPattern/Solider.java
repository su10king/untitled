package Chapter6.TemplateCallBackPattern;


public class Solider {
    void runContext(String weaponSound) {
        System.out.println("battle start");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("battle finished");
    }

    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}

//ex6-39
//ex6-42 return new Strategy()