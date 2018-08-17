package kardos.engima.paycheckmanager;

public class FractionOfCheck {
    public static int sharedNum = 0;
    private int color, amount, percentage,index;
    private String description;

    public FractionOfCheck(int color, int amount, int percentage, String description){
        this.color = color;
        this.amount = amount;
        this.percentage = percentage;
        this.description = description;
        this.index = sharedNum;
        sharedNum++;
    }

    public FractionOfCheck(){
        color = 0;
        amount = 0;
        percentage = 0;
        description = "";
        this.index = sharedNum;
        sharedNum++;
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

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
