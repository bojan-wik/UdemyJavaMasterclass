package section6.classes;

public class Car {

    private int doors;
    private String model;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("astra")) {
            this.model = validModel;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
