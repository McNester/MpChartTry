package com.example.mpcharttry;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import com.github.mikephil.charting.charts.*;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.utils.*;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {
    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        //попробую сам( относительно)) )

        barChart = findViewById(R.id.barChart);
        showBarChart();

    }

    private void showBarChart(){
        ArrayList<Double> spendsList=new ArrayList<>();
        ArrayList<BarEntry> entries=new ArrayList<>();

        String title="Your spends";

        //input data
        for(int i = 0; i < 6; i++){
            spendsList.add(i * 100.1);

        }

        //fit the data into bar
        for (int i = 0; i < spendsList.size(); i++) {
            BarEntry barEntry = new BarEntry(i, spendsList.get(i).floatValue());
            entries.add(barEntry);
        }


        BarDataSet barDataSet=new BarDataSet(entries,title);
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);



        BarData data = new BarData(barDataSet);
        barChart.setData(data);

        barChart.animateY(2000);





        YAxis yAxisRight = barChart.getAxisRight();
        YAxis yAxisLeft = barChart.getAxisLeft();
        XAxis xAxis = barChart.getXAxis();
        Legend l = barChart.getLegend();

        yAxisLeft.setTextColor(Color.WHITE);
        yAxisRight.setTextColor(Color.WHITE);
        xAxis.setTextColor(Color.WHITE);
        l.setTextColor(Color.WHITE);

        xAxis.setEnabled(false);

        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setEnabled(false);
        YAxis yAxis2 = barChart.getAxisRight();
        yAxis2.setEnabled(false);



        barChart.getAxisLeft().setDrawLabels(false);
        barChart.getAxisRight().setDrawLabels(false);
        barChart.getXAxis().setDrawLabels(false);

        barChart.getAxisLeft().setDrawGridLines(false);
        barChart.getXAxis().setDrawGridLines(false);
        barChart.getAxisRight().setDrawGridLines(false);
        barChart.getDescription().setEnabled(false);

        l.setEnabled(false);
    }














        /*BarChart barChart=findViewById(R.id.barChart);

        ArrayList<BarEntry> students=new ArrayList<>();
        students.add(new BarEntry(1014,420,"tt111112123123123123123123"));
        students.add(new BarEntry(1015,475,"tt"));
        students.add(new BarEntry(1016,508,"tt"));
        students.add(new BarEntry(1017,660,"tt"));
        students.add(new BarEntry(1018,550,"tt"));
        students.add(new BarEntry(1019,630,"tt"));
        students.add(new BarEntry(1020,470,"tt"));


        BarDataSet barDataSet=new BarDataSet(students,"Students");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextSize(16f);


        BarData barData=new BarData(barDataSet);
        barData.setValueTextColor(Color.WHITE);


        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Work");
        barChart.getDescription().setTextColor(Color.WHITE);
        barChart.animateY(2000);


        YAxis yAxisRight = barChart.getAxisRight();
        YAxis yAxisLeft = barChart.getAxisLeft();
        XAxis xAxis = barChart.getXAxis();
        Legend l = barChart.getLegend();

        yAxisLeft.setTextColor(Color.WHITE);
        yAxisRight.setTextColor(Color.WHITE);
        xAxis.setTextColor(Color.WHITE);
        l.setTextColor(Color.WHITE);*/


}