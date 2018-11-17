package update;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import main.MyTasksRecord;

public class MyTasksUpdate implements Initializable{

	@FXML Button btn_open, btn_add, btn_del, btn_back;
	@FXML TextField tf_title, tf_owner, tf_startdate, tf_clsdate, tf_path;
	@FXML CheckBox chk_A, chk_B, chk_C;
	@FXML ComboBox<String> cmb_priority;
	@FXML AnchorPane anchorPane;

	private Stage subStage;
	private MyTasksRecord mtRecord;

	private MyTasksUpdate(Window prarentWindow) {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("sub_register_frm.fxml"));
			loader.setController(this);
			Parent root = loader.load();
			Scene scene = new Scene(root);
			subStage = new Stage();
			subStage.initOwner(prarentWindow);
			subStage.initModality(Modality.WINDOW_MODAL);
			subStage.setTitle("登録画面");
			subStage.setScene(scene);
			subStage.showAndWait();
		}
		catch(IOException ioEx) {
		}

	}

	@Override
	public void initialize(URL paramURL, ResourceBundle paramResourceBundle) {

		/**追加ボタン**/
		btn_add.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				closeAction();
			}
		});

		/**削除ボタン**/
		btn_back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				closeAction();
			}
		});

		/**戻るボタン**/
		btn_back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				closeAction();
			}
		});

		/**開く**/
		btn_open.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			}
		});
	}

	/**MyTasksRecord登録処理**/
	private MyTasksRecord setMyTasksData() {
		return null;
	}

	/**クローズ処理**/
	private void closeAction() {
		subStage.hide();
	}

	/**インスタンス変数をstaticの様に扱う**/
	private MyTasksRecord getResult() {
		return mtRecord;
	}

	/**新規登録モード**/
	public static MyTasksRecord showAndGetMtData(Window parentWindow) {
		MyTasksUpdate hoge = new MyTasksUpdate(parentWindow);
		return hoge.getResult();
	}

	/**データ編集モード**/
	public static MyTasksRecord showAndEditMtData() {
		MyTasksUpdate hoge = new MyTasksUpdate(null);
		return hoge.getResult();
	}

}
