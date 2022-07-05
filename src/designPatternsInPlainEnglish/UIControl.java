package designPatternsInPlainEnglish;

public abstract class UIControl {

    public void enable() {
        System.out.println("enabled");
    }

    public abstract void draw();
}
