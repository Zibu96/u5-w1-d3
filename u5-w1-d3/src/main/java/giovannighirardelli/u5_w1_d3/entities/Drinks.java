package giovannighirardelli.u5_w1_d3.entities;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Drinks extends MenuItem {
    private String drinkName;


    public Drinks(int calorie, double prezzo, String drinkName) {
        super(calorie, prezzo);
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
