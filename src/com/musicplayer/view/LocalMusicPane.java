package com.musicplayer.view;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class LocalMusicPane extends Application{

	private StackPane StackPane_center;

	private VBox VBox_LocalPage;

	private AnchorPane topLocalTitle;

	private HBox HBox_local;

	private Label Label_localMusic;

	private Label Label_musicNum;

	private Button Button_playAll;

	private TextField TextField_localSearchText;

	private Button Button_localSearch;

	private AnchorPane AnchorPane_localMusicList;

	private HBox HBox_centerMusicListAndScroll;

	private TableView<SongMenu> TableView_musicTable;

	private ObservableList<SongMenu> data;
	private TableColumn<SongMenu, Integer> TableColumn_musicID;//（隐藏）本地音乐的id列

	private TableColumn<SongMenu, String> TableColumn_musicOperate;

	private TableColumn<SongMenu, String> TableColumn_musicTitle;//本地音乐的音乐标题列

	private TableColumn<SongMenu, String> TableColumn_musicSinger;//本地音乐的歌手列

	private TableColumn<SongMenu, String> TableColumn_albumName;//本地音乐的专辑列

	private TableColumn<SongMenu, String> TableColumn_musicTimeLength;//本地音乐的时长列
	private TableColumn<SongMenu, String> TableColumn_musicSize;//本地音乐的大小列
	private void initLayout(){
		StackPane_center = new StackPane();

		VBox_LocalPage = new VBox();

		topLocalTitle = new AnchorPane();

		HBox_local = new HBox();

		Label Label_localMusic = new Label("本地音乐");

		Label Label_musicNum = new Label("共x首歌曲");

		Button Button_playAll = new Button("播放全部");

		TextField TextField_localSearchText = new TextField();

		Button_localSearch = new Button();

		AnchorPane_localMusicList = new AnchorPane();

		HBox_centerMusicListAndScroll = new HBox();

		TableView_musicTable = new TableView<SongMenu>();

		data = FXCollections.observableArrayList(new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"),
				new SongMenu("告白气球", "周杰伦", "周杰伦的床边故事", "03:05","7.5MB"),
				new SongMenu("绿色", "陈雪凝", "绿色", "04:29","6.5MB"),
				new SongMenu("余香", "张小九", "余香", "04:06","6.8MB"));
		TableColumn_musicID = new TableColumn<SongMenu, Integer>();//（隐藏）本地音乐的id列

		TableColumn_musicOperate = new TableColumn<SongMenu, String>("操作");

		TableColumn_musicTitle = new TableColumn<SongMenu, String>("音乐标题");//本地音乐的音乐标题列

		TableColumn_musicSinger = new TableColumn<SongMenu, String>("歌手");//本地音乐的歌手列

		TableColumn_albumName = new TableColumn<SongMenu, String>("专辑");//本地音乐的专辑列

		TableColumn_musicTimeLength = new TableColumn<SongMenu, String>("时长");//本地音乐的时长列
		TableColumn_musicSize = new TableColumn<SongMenu, String>("大小");//本地音乐的大小列

		StackPane_center.getChildren().add(VBox_LocalPage);

		VBox_LocalPage.getChildren().addAll(topLocalTitle,AnchorPane_localMusicList);
		topLocalTitle.setPrefSize(1000, 75);
		HBox_local.setPrefSize(1000, 75);
		AnchorPane_localMusicList.setPrefSize(1000, 650);
		HBox_centerMusicListAndScroll.setPrefSize(1000, 650);

		Label_localMusic.setPrefSize(175, 75);
		Label_localMusic.setFont(Font.font("KaiTi", 36));

		Label_musicNum.setPrefSize(80, 95);
		Label_musicNum.setFont(Font.font("SongTi",14));

		Button_playAll.setPrefSize(100, 30);
//		Button_playAll.setPadding(new Insets(25, 25, 20, 20));
		HBox_local.setMargin(Button_playAll, new Insets(25,0, 0, 5));

		TextField_localSearchText.setPromptText("搜索本地音乐");
		TextField_localSearchText.setPrefSize(200, 15);
//		TextField_localSearchText.setPadding(new Insets(25, 0, 0, 100));
		HBox_local.setMargin(TextField_localSearchText, new Insets(20,0,0,200));

		HBox_local.setMargin(Button_localSearch, new Insets(20,0,0,0));

		topLocalTitle.getChildren().add(HBox_local);
		HBox_local.getChildren().addAll(Label_localMusic,Label_musicNum,
				Button_playAll,TextField_localSearchText,Button_localSearch);
		HBox_local.setSpacing(30);


		// TableView部分

		AnchorPane_localMusicList.getChildren().add(HBox_centerMusicListAndScroll);
		HBox_centerMusicListAndScroll.getChildren().add(TableView_musicTable);

		TableView_musicTable.setItems(data);
		TableView_musicTable.getColumns().addAll(TableColumn_musicID,TableColumn_musicOperate,
				TableColumn_musicTitle,TableColumn_musicSinger,TableColumn_albumName,
				TableColumn_musicTimeLength,TableColumn_musicSize);

		TableColumn_musicID.setMinWidth(50);
//		TableColumn_musicID.setCellValueFactory(new PropertyValueFactory<SongMenu, Integer>("id"));

		TableColumn_musicOperate.setMaxWidth(80);
//		TableColumn_musicOperate.setCellFactory(null);

		TableColumn_musicTitle.setMinWidth(350);


		TableColumn_musicSinger.setMinWidth(150);


		TableColumn_albumName.setMinWidth(150);

		TableColumn_musicTimeLength.setMinWidth(110);

		TableColumn_musicSize.setMinWidth(120);
	}
	@Override
	public void start(Stage primaryStage) {
		initData();
		StackPane_center = getStackPane_center();
		Scene scene = new Scene(StackPane_center,1000,725);
		scene.getStylesheets().add("com/musicplayer/css/localmusicpage/LocalMusicPageCss.css");

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private void setCss(){

		TableView_musicTable.getSelectionModel().setSelectionMode(javafx.scene.control.SelectionMode.MULTIPLE);
//		Button_localSearch.getStyleClass().remove(0);
		topLocalTitle.getStyleClass().add("topLocalTitle");
		Button_localSearch.getStyleClass().add("Button_localSearch");

//		Label_localMusic.getStyleClass().add("lightLabel");
//		Label_musicNum.getStyleClass().add("lightLabel");
//		Button_playAll.getStyleClass().add("lightButton");
//		TextField_localSearchText.getStyleClass().add("ListField");

		TableColumn_musicID.getStyleClass().add("tableColumn");
		TableColumn_musicTitle.getStyleClass().add("tableColumn");
		TableColumn_musicSinger.getStyleClass().add("tableColumn");
		TableColumn_albumName.getStyleClass().add("tableColumn");
		TableColumn_musicTimeLength.getStyleClass().add("tableColumn");


	}

	public void initData() {
		initLayout();
		setCss();
		TableColumn_musicTitle.setCellValueFactory(
				new PropertyValueFactory<SongMenu,String>("title")
		);
		TableColumn_musicSinger.setCellValueFactory(
				new PropertyValueFactory<SongMenu,String>("singer")
		);
		TableColumn_albumName.setCellValueFactory(
				new PropertyValueFactory<SongMenu,String>("album")
		);
		TableColumn_musicTimeLength.setCellValueFactory(
				new PropertyValueFactory<SongMenu,String>("length")
		);
		TableColumn_musicSize.setCellValueFactory(
				new PropertyValueFactory<SongMenu,String>("size")
		);

	}

	public VBox getVBox_LocalPage() {
		return VBox_LocalPage;
	}
	public AnchorPane getTopLocalTitle() {
		return topLocalTitle;
	}
	public HBox getHBox_local() {
		return HBox_local;
	}
	public Label getLabel_localMusic() {
		return Label_localMusic;
	}
	public Label getLabel_musicNum() {
		return Label_musicNum;
	}
	public Button getButton_playAll() {
		return Button_playAll;
	}
	public TextField getTextField_localSearchText() {
		return TextField_localSearchText;
	}
	public Button getButton_localSearch() {
		return Button_localSearch;
	}
	public AnchorPane getAnchorPane_localMusicList() {
		return AnchorPane_localMusicList;
	}
	public HBox getHBox_centerMusicListAndScroll() {
		return HBox_centerMusicListAndScroll;
	}
	public TableView<SongMenu> getTableView_musicTable() {
		return TableView_musicTable;
	}
	public ObservableList<SongMenu> getData() {
		return data;
	}
	public TableColumn<SongMenu, Integer> getTableColumn_musicID() {
		return TableColumn_musicID;
	}
	public TableColumn<SongMenu, String> getTableColumn_musicOperate() {
		return TableColumn_musicOperate;
	}
	public TableColumn<SongMenu, String> getTableColumn_musicTitle() {
		return TableColumn_musicTitle;
	}
	public TableColumn<SongMenu, String> getTableColumn_musicSinger() {
		return TableColumn_musicSinger;
	}
	public TableColumn<SongMenu, String> getTableColumn_albumName() {
		return TableColumn_albumName;
	}
	public TableColumn<SongMenu, String> getTableColumn_musicTimeLength() {
		return TableColumn_musicTimeLength;
	}
	public TableColumn<SongMenu, String> getTableColumn_musicSize() {
		return TableColumn_musicSize;
	}

	public StackPane getStackPane_center() {
		// TODO Auto-generated method stub
		return StackPane_center;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
