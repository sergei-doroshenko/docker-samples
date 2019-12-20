package main.java.org.sdoroshenko;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.AreaRendererEndType;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LineChartToPNGEx {

    private static CategoryDataset createDataset() {

        double[][] data = new double[][]{
            {82502, 846, 850, 8621, 85559, 8449, 87672, 88575, 89837, 90701},
            {62502, 646, 650, 6621, 65559, 6449, 67672, 68575, 69837, 60701}
        };

        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
            new String[]{"Oil", "Test"},
            new String[]{"2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013"},
            data
        );

        return dataset;
    }

    private static JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createAreaChart(
            "Oil consumption",
            "Time",
            "Thousands bbl/day",
            dataset,
            PlotOrientation.VERTICAL,
            false,
            true,
            true
        );

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setForegroundAlpha(0.3f);

        AreaRenderer renderer = (AreaRenderer) plot.getRenderer();
        renderer.setEndType(AreaRendererEndType.LEVEL);

        chart.setTitle(
            new TextTitle("Oil consumption", new Font("Serif", java.awt.Font.BOLD, 18))
        );

        return chart;
    }

    public static void main(String[] args) throws IOException {

       /* XYSeries series1 = new XYSeries("2014");
        series1.add(18, 530);
        series1.add(20, 580);
        series1.add(25, 740);
        series1.add(30, 901);
        series1.add(40, 1300);
        series1.add(50, 2219);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);

        JFreeChart chart = ChartFactory.createXYLineChart(
            "Average salary per age",
            "Age",
            "Salary (€)",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );*/

        CategoryDataset dataset = createDataset();

        JFreeChart chart = createChart(dataset);

        ChartUtilities.saveChartAsPNG(new File("line_chart.png"), chart, 450, 400);
    }
}
