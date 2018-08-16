package kardos.engima.paycheckmanager;

public class FractionOfCheck {
    private int color, amount, percentage;
    private String description;

    public FractionOfCheck(int color, int amount, int percentage, String description){
        this.color = color;
        this.amount = amount;
        this.percentage = percentage;
        this.description = description;
    }

    public FractionOfCheck(){
        color = 0;
        amount = 0;
        percentage = 0;
        description = "";
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
