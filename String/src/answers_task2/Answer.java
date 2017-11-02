package answers_task2;

import java.util.ListResourceBundle;

public class Answer extends ListResourceBundle {
    private static final Object[][] content = {{"1", "ответ 01"},{"2", "ответ 02"}};
    @Override
    protected Object[][] getContents() {
        return content;
    }
}
