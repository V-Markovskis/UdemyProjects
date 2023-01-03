package academy.learnprogramming;

public class Button {
    private String title;
    private IOnClickListener onClickListenerVariable;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListenerVariable(IOnClickListener onClickListenerVariable) {
        this.onClickListenerVariable = onClickListenerVariable;
    }

    public void onClick() {
        this.onClickListenerVariable.onClick(this.title);
    }

    public interface IOnClickListener {
        public void onClick(String title);
    }
}
