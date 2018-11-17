package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Window;
import regist.MyTasksRegist;

public class MyTasksController implements Initializable {
	@FXML Button btn_add, btn_del;
	@FXML TableView<MyTasksRecord> tv;
	@FXML TableColumn<MyTasksRecord, String> col_owner, col_priority, col_task, col_clsdate;
	@FXML TableColumn<MyTasksRecord, Integer> col_process;
	@FXML AnchorPane anchorPane;

	private Window window;

	@Override
	public void initialize(URL paramURL, ResourceBundle paramResourceBundle) {

		btn_add.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				MyTasksRecord hoge = MyTasksRegist.showAndGetMtData(anchorPane.getScene().getWindow());
			}
		});

		/**削除ボタン**/
		btn_del.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			}
		});

		//DOUBLE CLICK : tv
		tv.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getButton().equals( MouseButton.PRIMARY) && event.getClickCount() == 2) {
					System.out.println("ダブルクリック");
				}
			}
		});
	}

	private void init() {
	};

}
