package task1;

public class TextC extends ViewC {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextC(int width, int height, String text) {
        super(width, height);
        System.out.println("TextC constructor");
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextC {" +
                "width =" + this.getWidth() +
                ", height =" + this.getHeight() +
                "text ='" + text + "'" +
                '}';
    }

    {
        System.out.println("TextC init block");
    }

    static {
        System.out.println("TextC static block");
    }

}
