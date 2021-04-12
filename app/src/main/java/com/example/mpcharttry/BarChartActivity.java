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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        BarChart barChart=findViewById(R.id.barChart);

        ArrayList<BarEntry> students=new ArrayList<>();
        students.add(new BarEntry(2014,420));
        students.add(new BarEntry(2015,475));
        students.add(new BarEntry(2016,508));
        students.add(new BarEntry(2017,660));
        students.add(new BarEntry(2018,550));
        students.add(new BarEntry(2019,630));
        students.add(new BarEntry(2020,470));

        BarDataSet barDataSet=new BarDataSet(students,"Students");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextSize(16f);


        BarData barData=new BarData(barDataSet);
        barData.setValueTextColor(Color.WHITE);
        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Example");
        barChart.getDescription().setTextColor(Color.WHITE);
        barChart.animateY(1500);


        YAxis yAxisRight = barChart.getAxisRight();
        YAxis yAxisLeft = barChart.getAxisLeft();
        XAxis xAxis = barChart.getXAxis();
        Legend l = barChart.getLegend();

        yAxisLeft.setTextColor(Color.WHITE);
        yAxisRight.setTextColor(Color.WHITE);
        xAxis.setTextColor(Color.WHITE);
        l.setTextColor(Color.WHITE);

    }
}