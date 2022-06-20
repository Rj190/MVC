import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.TableView;

// import javax.xml.stream.events.StartDocument;

public class MVC {
	public static void main(String args[]) throws IOException {
		read();
		
		
		// HistogramChartView viewHist = new HistogramChartView();
		// StickChartView viewStick = new StickChartView();
	
		// HistogramController controllerHisto = new HistogramController(model,viewHist);
		// StickChartController controllerStick = new StickChartController(model,viewStick);
		//, controllerHisto, controllerStick);
		// controller.setOthers(1);
		// controllerCall(controller);//, controllerHisto, controllerStick);
		
	}


private static Model retriveModelFromDatabase() throws IOException {
		Model model = new Model();
		PieChartView viewPie = new PieChartView();
		

		Scanner in = new Scanner( System.in );

			System.out.println("Enter yout values");
		  		System.out.println("set black");
				  int x=in.nextInt();
				  model.setBlack(x);
				  System.out.println("set blue");
				   x=in.nextInt();
				  model.setBlue(x);
				  System.out.println("set green");
				  x=in.nextInt();
				  model.setGreen(x);;
				  System.out.println("set red");
				  x=in.nextInt();
				  model.setRed(x);
				  System.out.println("set others");
				  x=in.nextInt();
				  model.setOthers(x);

				  System.out.println("view is updated");

				PieChartController controller = new PieChartController(model,viewPie);
				  controllerCall(controller);
				 
				  return model;

		 
		
  }
	

  private static void updateView(Model M,int t) throws IOException {
	Model model = M;
	PieChartView viewPie = new PieChartView();
	Scanner in = new Scanner( System.in );
	PieChartController controller = new PieChartController(model,viewPie);

	 if(t==0){

 	 System.out.println("Model is null please enter values");
 	 return;
	}
	 

	for(;;) {
		System.out.println("Select color 1.Black 2.Blue 3.Green 4.Red 5.other 6.Cancle");
		int i= in.nextInt();
		System.out.println("Enter yout values");
		switch(i){
		case 1:	System.out.println("set black");
				  int x=in.nextInt();
				  controller.setBlack(x);
				 controllerCall(controller);
				  return;
		case 2:  System.out.println("set blue");
				   x=in.nextInt();
				  controller.setBlue(x);
				controllerCall(controller);
				  return;

		case 3:  System.out.println("set green");
				  x=in.nextInt();
				  controller.setGreen(x);
				controllerCall(controller);
				  return;

		case 4: System.out.println("set red");
				  x=in.nextInt();
				 controller.setRed(x);
				controllerCall(controller);
				  return;

		case 5:System.out.println("set others");
				  x=in.nextInt();
			controller.setOthers(x);
				controllerCall(controller);
				  return;
		case 6: System.out.println("Cancled");
				return;
		default: System.out.println("Select valid options");
				return;
		}

	}
	

  }
		



private static void read() throws IOException{
	Scanner in = new Scanner( System.in );
	Model model = new Model();
	int r=0;
	
 
	 

	for(;;){
		System.out.println("Select");
		System.out.println("1.Instert a new values");
		System.out.println("2.UpdateView");
		System.out.println("3.Exit");
		int i=in.nextInt();
		  switch(i)
		  {	
			  case 1:model=retriveModelFromDatabase();
			  r=model.getBlack()+model.getBlue()+model.getGreen()+model.getRed()+model.getOthers();
			  vewTable(model.getBlack(),model.getBlue(),model.getGreen(),model.getRed(),model.getOthers(),r);
					  break;
				case 2:updateView(model,r);
					 System.out.println("view is updated");
					 r=model.getBlack()+model.getBlue()+model.getGreen()+model.getRed()+model.getOthers();
					 vewTable(model.getBlack(),model.getBlue(),model.getGreen(),model.getRed(),model.getOthers(),r);
					  break;
				case 3:System.out.println("Logout");
				System.exit(0);	 
				default: System.out.println("Select valid options");
				return; 
		
			}
		
	  }

	 

}



	public static void controllerCall(PieChartController controller) throws IOException{//,HistogramController controllerHisto,StickChartController controllerStick) throws IOException {
		controller.updateViewPie();
		// controllerHisto.updateViewHisto();
		// controllerStick.updateViewStick();
	}


	static void vewTable(int b,int bl ,int g ,int r,int o,int t){

		System.out.println("===========table view========");
		System.out.println("Colors"+"	"+"values");
		System.out.println("Black"+"	"+b);
		System.out.println("Blue"+"	"+bl);
		System.out.println("Green"+"	"+g);
		System.out.println("Red"+"	"+r);
		System.out.println("Other"+"	"+o);
		System.out.println("===============================");
		System.out.println("Ttal"+"		"+t);
		return;
	}
}
