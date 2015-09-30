package pitalium;

import com.htmlhifive.pitalium.core.PtlTestBase;
import com.htmlhifive.pitalium.core.model.CompareTarget;
import com.htmlhifive.pitalium.core.model.ScreenArea;
import com.htmlhifive.pitalium.core.model.SelectorType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Pitaliumでスクリーンショット
 */
public class PitaliumTodoTest extends PtlTestBase {


//    /**
//     * TODO DOM比較テスト
//     *
//     * @throws Exception
//     */
//    @Test
//    public void test1() throws Exception {
//
//        // TODOサイトのトップページを開きます
//        driver.get("http://www.htmlhifive.com/ja/tutorial/todo/");
//
//        // 新しくTODO内容を追加します。
//        driver.findElementById("txtTodo").sendKeys("新しくTODO追加");
//        driver.findElementById("btnRegist").click();
//
//        // 3. 比較対象を使用して検証を実行します。
//        assertionView.assertView("ToDoTOP");
//
//    }

//    @Test
//    public void test1() throws Exception {
//        // TODOサイトのトップページを開きます
//        driver.get("http://www.htmlhifive.com/ja/tutorial/todo/");
////        assertionView.assertView("TODO Page");
//
//        assertThat(driver.findElementById("btnRegist").getAttribute("value"), is("登録"));
//
//
////
////        // TODO一覧のid ’list’ 内の trタグの一覧を取得
////        List<WebElement> list = driver
////                .findElementById("list")
////                .findElements(By.tagName("tr"));
////
////        for (WebElement elem : list) {
////
////            // trの要素’data-h5-dyn-vid’が’2’の物を取得（ 1番目のTODO内容）
////            if (elem.getAttribute("data-h5-dyn-vid") != null
////                    && elem.getAttribute("data-h5-dyn-vid").equals("2")) {
////
////                // TODO内容を取得
////                String description = elem.findElement(By.tagName("span")).getText();
////
////                // TODO内容を確認
////                assertThat(description, is("洗濯する"));
////            }
////        }
//    }

//    /**
//     * TODO 登録テスト
//     *
//     * @throws Exception
//     */
//    @Test
//    public void test2() throws Exception {
//
//        // TODOサイトのトップページを開きます
//        driver.get("http://www.htmlhifive.com/ja/tutorial/todo/");
//
//
//        // 新しくTODO内容を追加します。
//        driver.findElementById("txtTodo").sendKeys("新しくTODO追加");
//        driver.findElementById("btnRegist").click();
//
//        // 追加された内容を取得
//        String description = driver
//                .findElement(By.cssSelector("#list tbody tr:last-child"))
//                .getText();
//
//        // TODO内容を確認
//        assertThat(description, is("新しくTODO追加"));
//
//    }
//

//    /**
//     * TODO DOM比較テスト
//     *
//     * @throws Exception
//     */
//    @Test
//    public void test2() throws Exception {
//
//        // TODOサイトのトップページを開きます
//        driver.get("http://www.htmlhifive.com/ja/tutorial/todo/");
//
//        // 比較対象をDOMレベルで指定します。
//        List<CompareTarget> targets = new ArrayList<CompareTarget>();
//        targets.add(new CompareTarget(ScreenArea.of(SelectorType.ID, "list")));
//        targets.add(new CompareTarget(ScreenArea.of(SelectorType.CSS_SELECTOR, "#list tbody tr:last-child")));
//
//        // 比較対象を使用して検証を実行します。
//        assertionView.assertView("ToDo-LastChild", targets);
//    }

    @Test
    public void test3() throws Exception {

        // TODOサイトのトップページを開きます
        driver.get("http://www.htmlhifive.com/ja/tutorial/todo/");

        // DOMレベルで除外指定します。ここでは、最後のTODO項目を除外します。
        ScreenArea[] excludes = {ScreenArea.of(SelectorType.CSS_SELECTOR, "#list tbody tr:last-child")};

        // 比較対象をDOMレベルで指定します。
        List<CompareTarget> targets = new ArrayList<CompareTarget>();
        targets.add(new CompareTarget(ScreenArea.of(SelectorType.ID, "list"), excludes, true));

        // 比較対象を使用して検証を実行します。
        assertionView.assertView("ToDo-excludes", targets);
    }


}
