package giovannighirardelli.u5_w1_d3.entities;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Pizze extends MenuItem {
    private String pizzaName;


    public Pizze(int calorie, double prezzo, String pizzaName) {
        super( calorie, prezzo);
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "pizzaName='" + pizzaName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
