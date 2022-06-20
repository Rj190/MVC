import java.io.IOException;

public class PieChartController {
	private Model model;
	private PieChartView piechartview;
	public PieChartController(Model model,PieChartView piechartview) {
		this.model = model;
		this.piechartview = piechartview;
	}
	public void setBlack(int black){
		model.setBlack(black);
	}
	public void setBlue(int blue){
		model.setBlue(blue);
	}
	public void setGreen(int green){
		model.setGreen(green);
	}
	public void setRed(int red){
		model.setRed(red);
	}
	public void setOthers(int others){
		model.setOthers(others);
	}
	public int getBlack(){
		return model.getBlack();
	}
	public int getBlue(){
		return model.getBlue();
	}
	public int getGreen(){
		return model.getGreen();
	}
	public int getRed(){
		return model.getRed();
	}
	public int getOthers(){
		return model.getOthers();
	}
	public void updateViewPie() throws IOException {
		piechartview.printPieChartView(model.getBlack(),model.getBlue(),model.getGreen(),model.getRed(),model.getOthers());		
	}
}
