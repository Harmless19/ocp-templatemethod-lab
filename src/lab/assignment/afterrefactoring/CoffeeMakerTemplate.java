package lab.assignment.afterrefactoring;

public abstract class CoffeeMakerTemplate {

    public void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();




}
