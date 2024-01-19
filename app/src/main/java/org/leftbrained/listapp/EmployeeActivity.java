package org.leftbrained.listapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        RecyclerView rvEmployees = (RecyclerView) findViewById(R.id.rvEmployees);
        ArrayList<Employee> employees = Employee.createEmployeesList(6);
        EmployeeAdapter adapter = new EmployeeAdapter(employees);
        rvEmployees.setAdapter(adapter);
        rvEmployees.setLayoutManager(new LinearLayoutManager(this));
    }
}
