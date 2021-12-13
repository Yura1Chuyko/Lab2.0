package task1;

public class CustomTextC extends TextC {
    private String backgroundColor;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public CustomTextC(int width, int height, String text, String backgroundColor) {
        super(width, height, text);
        System.out.println("CustomTextC constructor");
        this.backgroundColor = backgroundColor;
    }

    @Override
    public String toString() {
        return "CustomTextC { " +
                "width = " + this.getWidth() +
                ", height = " + this.getHeight() +
                ", text = '" + this.getText() + "'" +
                ", backgroundColor = '" + backgroundColor + "'" +
                " }";
    }

    {
        System.out.println("CustomTextC init block");
    }

    static {
        System.out.println("CustomTextC static block");
    }

}
