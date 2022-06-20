 
 import java.io.IOException;
 import java.awt.*;

// import org.knowm.xchart.BitmapEncoder;
 import org.knowm.xchart.PieChart;
 import org.knowm.xchart.PieChartBuilder;
 import org.knowm.xchart.SwingWrapper;
// import org.knowm.xchart.BitmapEncoder.BitmapFormat;
//import org.knowm.xchart.style.PieStyler.AnnotationType;
 import org.knowm.xchart.style.Styler.ChartTheme;
// import org.knowm.xchart.style.colors.ChartColor;
 
 public class PieChartView {
     public void printPieChartView(int black,int blue,int green,int red,int others) throws IOException {
         
         // Create Chart
         PieChart chart = new PieChartBuilder().width(800).height(600).title("My Pie Chart").theme(ChartTheme.GGPlot2).build();
         
        
 
         // Customize Chart
         chart.getStyler().setLegendVisible(false);
        //  chart.getStyler().setAnnotationType(AnnotationType.LabelAndPercentage);
        //  chart.getStyler().setAnnotationDistance(1.15);
         chart.getStyler().setPlotContentSize(.7);
         chart.getStyler().setStartAngleInDegrees(90);

         

         

         Color[] seriesColors = new Color[] { new Color(0, 0, 0), new Color(255, 0, 0), new Color(0, 0, 255), new Color(0, 255, 0), new Color(255,255,255) };
 
         chart.getStyler().setSeriesColors(seriesColors);
         // Series
         chart.addSeries("Black", black);
         
         chart.addSeries("Red", red);
         chart.addSeries("Blue", blue);
         chart.addSeries("Green", green);
         chart.addSeries("Others", others);
 
         // Show it
         new SwingWrapper(chart).displayChart();
 
        //  // Save it
        //  BitmapEncoder.saveBitmap(chart, "./Sample_Chart", BitmapFormat.PNG);
 
        //  // or save it in high-res
        //  BitmapEncoder.saveBitmapWithDPI(chart, "./Sample_Chart_300_DPI", BitmapFormat.PNG, 300);
        //  return;
         
         
     }
 
 }
 