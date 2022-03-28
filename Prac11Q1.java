public class Prac11Q1 {
    enum Grade {
        A,
        B,
        C
    }

    float getBonusAmount(Grade g) {
        float bonus;
        switch (g) {
            case A:
                bonus = fullBonus();
                break;
            case B:
                bonus = halfBonus();
                break;
            case C:
                bonus = quarterBonus();
                break;
            default:
                bonus = noBonus();
        }
        return bonus;
    }

    float fullBonus() {
        return 0;
    }

    float halfBonus() {
        return 0;
    }

    float quarterBonus() {
        return 0;
    }

    float noBonus() {
        return 0;
    }
}
