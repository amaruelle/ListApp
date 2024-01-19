package org.leftbrained.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {
    private List<Employee> mEmployees;

    @NonNull
    public EmployeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View employeeView = inflater.inflate(R.layout.employee_view, parent, false);
        return new EmployeeAdapter.ViewHolder(employeeView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView teamTextView;
        public TextView projectsTextView;
        public TextView codeLinesTextView;
        public TextView ratingTextView;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.employeeName);
            teamTextView = (TextView) itemView.findViewById(R.id.team);
            projectsTextView = (TextView) itemView.findViewById(R.id.projects);
            codeLinesTextView = (TextView) itemView.findViewById(R.id.codeLines);
            ratingTextView = (TextView) itemView.findViewById(R.id.rating);
            imageView = (ImageView) itemView.findViewById(R.id.employeeImage);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeAdapter.ViewHolder holder, int position) {
        Employee employee = mEmployees.get(position);
        TextView textView = holder.nameTextView;
        textView.setText(employee.getmName());
        textView = holder.teamTextView;
        textView.setText(employee.getmTeam());
        textView = holder.projectsTextView;
        textView.setText(String.valueOf(employee.getProjects()));
        textView = holder.codeLinesTextView;
        textView.setText(String.valueOf(employee.getCodeLines()));
        textView = holder.ratingTextView;
        textView.setText(String.valueOf(employee.getRating()));
        ImageView imageView = holder.imageView;
        imageView.setImageResource(employee.getImage());
    }

    @Override
    public int getItemCount() {
        return mEmployees.size();
    }

    public EmployeeAdapter(List<Employee> employees) {
        mEmployees = employees;
    }
}
